package com.shopify.data.entity.network;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class OrderResponseNetworkEntity {

  @SerializedName("orders") private List<OrderNetworkEntity> orders = null;

  public List<OrderNetworkEntity> getOrders() {
    return orders;
  }
}
