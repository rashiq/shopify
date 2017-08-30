package com.shopify.domain.interactor;

import com.shopify.domain.model.Customer;
import com.shopify.domain.repository.CustomerRepository;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import javax.inject.Inject;
import javax.inject.Named;

public class GetCustomerByName extends UseCase<Customer, GetCustomerByName.Params> {

  private final CustomerRepository repository;

  @Inject
  public GetCustomerByName(
      @Named("UIThread") Scheduler uiThread,
      @Named("IOThread") Scheduler ioThread,
      CustomerRepository repository) {
    super(uiThread, ioThread);
    this.repository = repository;
  }

  @Override Observable<Customer> buildUseCaseObservable(Params params) {
    return repository.customerByName(params.firstName, params.lastName).toObservable();
  }

  public static final class Params {
    final String firstName;
    final String lastName;

    public Params(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }
  }
}
