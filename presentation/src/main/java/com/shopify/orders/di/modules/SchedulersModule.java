package com.shopify.orders.di.modules;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Named;
import javax.inject.Singleton;

@Module public class SchedulersModule {
  @Provides @Named("UIThread") @Singleton  Scheduler provideMainThreadScheduler() {
    return AndroidSchedulers.mainThread();
  }

  @Provides @Named("IOThread") @Singleton  Scheduler provideIoScheduler() {
    return Schedulers.io();
  }
}