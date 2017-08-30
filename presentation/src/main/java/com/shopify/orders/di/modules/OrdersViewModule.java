package com.shopify.orders.di.modules;

import com.shopify.orders.view.orders.OrdersViewCallback;
import dagger.Module;
import dagger.Provides;

@Module public class OrdersViewModule {
  private final OrdersViewCallback ordersViewCallback;

  public OrdersViewModule(OrdersViewCallback ordersViewCallback) {
    this.ordersViewCallback = ordersViewCallback;
  }

  @Provides public OrdersViewCallback getOrdersViewCallback() {
    return ordersViewCallback;
  }
}
