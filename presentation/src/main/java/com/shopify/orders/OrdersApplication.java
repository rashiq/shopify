package com.shopify.orders;

import android.app.Application;
import com.shopify.orders.di.components.ApplicationComponent;
import com.shopify.orders.di.components.DaggerApplicationComponent;
import com.shopify.orders.di.modules.ApplicationModule;

public class OrdersApplication extends Application {
  private static OrdersApplication application;
  private ApplicationComponent applicationComponent;

  public static OrdersApplication getInstance() {
    return application;
  }

  @Override public void onCreate() {
    super.onCreate();
    application = this;
    initializeInjector();
  }

  private void initializeInjector() {
    this.applicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))
        .build();
  }

  public ApplicationComponent getApplicationComponent() {
    return this.applicationComponent;
  }
}
