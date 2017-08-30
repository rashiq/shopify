package com.shopify.domain.repository;

import io.reactivex.Single;

public interface ItemRepository {

  Single<Long> quantityOfItemSold(final String itemName);

}
