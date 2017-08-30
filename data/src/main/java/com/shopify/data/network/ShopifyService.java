package com.shopify.data.network;

import com.shopify.data.entity.network.OrderResponseNetworkEntity;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShopifyService {
  String API_TOKEN = "c32313df0d0ef512ca64d5b336a0d7c6";

  @GET("/admin/orders.json?access_token=" + API_TOKEN) Observable<OrderResponseNetworkEntity> getOrders(
      @Query("page") int page
  );
}
