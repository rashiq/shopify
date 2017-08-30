package com.shopify.data.repository;

import com.shopify.data.network.ShopifyServiceUtil;
import com.shopify.domain.repository.ItemRepository;
import io.reactivex.Observable;
import io.reactivex.Single;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ItemDataRepository implements ItemRepository {

  private ShopifyServiceUtil serviceUtil;

  @Inject
  public ItemDataRepository(ShopifyServiceUtil serviceUtil) {
    this.serviceUtil = serviceUtil;
  }

  @Override public Single<Long> quantityOfItemSold(String itemName) {
    return serviceUtil.loadAllPages()
        .flatMap(response -> Observable.fromIterable(response.getOrders()))
        .flatMap(order -> Observable.fromIterable(order.getLineItems()))
        .filter(lineItem -> lineItem.getTitle().equals(itemName))
        .count();
  }
}
