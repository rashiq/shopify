package com.shopify.domain.interactor;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;

public abstract class UseCase<T, Params> {

  private final Scheduler uiThread;
  private final Scheduler ioThread;
  private final CompositeDisposable disposables;

  public UseCase(Scheduler uiThread, Scheduler ioThread) {
    this.uiThread = uiThread;
    this.ioThread = ioThread;
    this.disposables = new CompositeDisposable();
  }

  abstract Observable<T> buildUseCaseObservable(Params params);

  public Observable<T> observable(Params params) {
    return this.buildUseCaseObservable(params);
  }

  public void execute(DisposableObserver<T> observer, Params params) {
    final Observable<T> observable = observable(params)
        .subscribeOn(ioThread)
        .observeOn(uiThread);
    disposables.add(observable.subscribeWith(observer));
  }

  public void dispose() {
    if (!disposables.isDisposed()) {
      disposables.dispose();
    }
  }
}
