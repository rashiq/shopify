package com.shopify.data.repository;

import com.shopify.data.entity.mapper.CustomerEntityMapper;
import com.shopify.data.entity.network.CustomerNetworkEntity;
import com.shopify.data.entity.network.OrderNetworkEntity;
import com.shopify.data.network.ShopifyService;
import com.shopify.data.network.ShopifyServiceUtil;
import com.shopify.domain.model.Customer;
import com.shopify.domain.repository.CustomerRepository;
import io.reactivex.Observable;
import io.reactivex.Single;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CustomerDataRepository implements CustomerRepository {

  private final ShopifyService service;
  private ShopifyServiceUtil serviceUtil;
  private CustomerEntityMapper customerEntityMapper;

  @Inject
  public CustomerDataRepository(ShopifyService service,
      ShopifyServiceUtil serviceUtil,
      CustomerEntityMapper customerEntityMapper) {
    this.service = service;
    this.serviceUtil = serviceUtil;
    this.customerEntityMapper = customerEntityMapper;
  }

  @Override
  public Single<Customer> customerByName(String firstName, String lastName) {
    return service.getOrders(1)
        .flatMap(orderResponse -> Observable.fromIterable(orderResponse.getOrders()))
        .filter(order -> {
          CustomerNetworkEntity customer = order.getCustomer();
          return customer.getFirstName().equals(firstName)
              && customer.getLastName().equals(lastName);
        })
        .map(orderNetworkEntity -> customerEntityMapper.transform(orderNetworkEntity.getCustomer()))
        .singleOrError();
  }

  @Override public Single<Double> spentByCustomer(String firstName, String lastName) {
    return serviceUtil.loadAllPages()
        .flatMap(response -> Observable.fromIterable(response.getOrders()))
        .filter(order -> order.getCustomer() != null)
        .filter(order -> {
          CustomerNetworkEntity customer = order.getCustomer();
          return customer.getFirstName().equals(firstName)
              && customer.getLastName().equals(lastName);
        })
        .map(OrderNetworkEntity::getTotalPrice)
        .map(Double::valueOf)
        .reduce(0.0, (price1, price2) -> price1 + price2);
  }
}
