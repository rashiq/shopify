package com.shopify.data.network;

import com.shopify.data.entity.network.OrderResponseNetworkEntity;
import io.reactivex.Observable;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ShopifyServiceUtil {

  private ShopifyService service;

  @Inject
  public ShopifyServiceUtil(ShopifyService service) {
    this.service = service;
  }

  public Observable<OrderResponseNetworkEntity> loadAllPages() {
    return loadAllPages(1);
  }

  private Observable<OrderResponseNetworkEntity> loadAllPages(int page) {
    return service.getOrders(page)
        .concatMap(response -> {
          if (response.getOrders().isEmpty()) { return Observable.just(response); }
          return Observable.just(response).concatWith(loadAllPages(page + 1));
        });
  }
}
