package com.shopify.orders.view.orders;

import com.shopify.orders.view.ViewCallback;

public interface OrdersViewCallback extends ViewCallback {
  void setSpentByCustomer(Double totalAmount);

  void setCountOfItemsSold(Long count);
}
