package com.shopify.orders.di.components;

import com.shopify.orders.di.PerActivity;
import com.shopify.orders.di.modules.OrdersViewModule;
import com.shopify.orders.view.orders.OrdersActivity;
import dagger.Subcomponent;

@PerActivity @Subcomponent(modules = { OrdersViewModule.class })
public interface OrdersViewComponent extends OrdersActivity.Injector {
}
