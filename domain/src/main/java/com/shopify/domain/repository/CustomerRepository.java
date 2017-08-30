package com.shopify.domain.repository;

import com.shopify.domain.model.Customer;
import io.reactivex.Single;

public interface CustomerRepository {

  Single<Customer> customerByName(final String firstName, final String lastName);

  Single<Double> spentByCustomer(final String firstName, final String lastName);
}
