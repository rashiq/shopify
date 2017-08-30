package com.shopify.data.entity.mapper;

import com.shopify.data.entity.network.CustomerNetworkEntity;
import com.shopify.domain.model.Customer;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CustomerEntityMapper {

  @Inject
  public CustomerEntityMapper() {
  }

  public Customer transform(CustomerNetworkEntity entity) {
    Customer customer = new Customer();
    customer.setId(entity.getId());
    customer.setFirstName(entity.getFirstName());
    customer.setLastName(entity.getLastName());
    customer.setEmail(entity.getEmail());
    return customer;
  }
}
