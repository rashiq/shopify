package com.shopify.orders.view.orders;

import com.shopify.domain.interactor.GetCountOfItemsSold;
import com.shopify.domain.interactor.GetSpentByCustomer;
import com.shopify.orders.di.PerActivity;
import com.shopify.orders.view.Presenter;
import io.reactivex.observers.DisposableObserver;
import javax.inject.Inject;

@PerActivity
public class OrdersPresenter extends Presenter {

  private OrdersViewCallback callback;
  private final GetSpentByCustomer getSpentByCustomer;
  private final GetCountOfItemsSold getCountOfItemsSold;

  @Inject
  public OrdersPresenter(OrdersViewCallback callback,
      GetSpentByCustomer getSpentByCustomer,
      GetCountOfItemsSold getCountOfItemsSold) {
    this.callback = callback;
    this.getSpentByCustomer = getSpentByCustomer;
    this.getCountOfItemsSold = getCountOfItemsSold;
  }

  public void init() {
    getSpentByCustomer.execute(
        new SpentByCustomerObserver(),
        new GetSpentByCustomer.Params("Napoleon", "Batz")
    );

    getCountOfItemsSold.execute(
        new CountOfItemsSoldObserver(),
        new GetCountOfItemsSold.Params("Awesome Bronze Bag")
    );
  }

  @Override public void onResume() {
    super.onResume();
  }

  @Override public void onPause() {
    super.onPause();
  }

  @Override public void onDestroy() {
    super.onDestroy();
    getSpentByCustomer.dispose();
    getCountOfItemsSold.dispose();
  }

  private final class SpentByCustomerObserver extends DisposableObserver<Double> {
    @Override public void onNext(Double totalAmount) {
      callback.setSpentByCustomer(totalAmount);
    }

    @Override public void onError(Throwable e) {
      callback.showError(e.getMessage());
    }

    @Override public void onComplete() {
      callback.hideLoading();
    }
  }

  private final class CountOfItemsSoldObserver extends DisposableObserver<Long> {
    @Override public void onNext(Long count) {
      callback.setCountOfItemsSold(count);
    }

    @Override public void onError(Throwable e) {
      callback.showError(e.getMessage());
    }

    @Override public void onComplete() {
      callback.hideLoading();
    }
  }
}
