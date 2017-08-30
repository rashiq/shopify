package com.shopify.orders.di.components;

import com.shopify.orders.di.modules.ApplicationModule;
import com.shopify.orders.di.modules.NetworkModule;
import com.shopify.orders.di.modules.OrdersViewModule;
import com.shopify.orders.di.modules.SchedulersModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {
    ApplicationModule.class,
    NetworkModule.class,
    SchedulersModule.class,
})
public interface ApplicationComponent {
  OrdersViewComponent plus(OrdersViewModule ordersViewModule);
}
