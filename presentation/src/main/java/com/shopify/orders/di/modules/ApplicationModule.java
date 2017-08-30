package com.shopify.orders.di.modules;

import android.content.Context;
import com.shopify.data.repository.CustomerDataRepository;
import com.shopify.data.repository.ItemDataRepository;
import com.shopify.domain.repository.CustomerRepository;
import com.shopify.domain.repository.ItemRepository;
import com.shopify.orders.OrdersApplication;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public class ApplicationModule {
  private final OrdersApplication application;

  public ApplicationModule(OrdersApplication application) {
    this.application = application;
  }

  @Provides @Singleton Context provideApplicationContext() {
    return this.application;
  }

  @Provides @Singleton CustomerRepository provideCustomerRepository(
      CustomerDataRepository repository) {
    return repository;
  }

  @Provides @Singleton ItemRepository provideItemRepository(
      ItemDataRepository repository) {
    return repository;
  }
}
