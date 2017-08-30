package com.shopify.domain.interactor;

import com.shopify.domain.repository.ItemRepository;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import javax.inject.Inject;
import javax.inject.Named;

public class GetCountOfItemsSold extends UseCase<Long, GetCountOfItemsSold.Params> {

  private final ItemRepository repository;

  @Inject
  public GetCountOfItemsSold(
      @Named("UIThread") Scheduler uiThread,
      @Named("IOThread") Scheduler ioThread,
      ItemRepository repository) {
    super(uiThread, ioThread);
    this.repository = repository;
  }

  @Override Observable<Long> buildUseCaseObservable(Params params) {
    return repository.quantityOfItemSold(params.itemName).toObservable();
  }

  public static final class Params {
    final String itemName;

    public Params(String itemName) {
      this.itemName = itemName;
    }
  }
}
