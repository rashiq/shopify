package com.shopify.orders.view;

public interface ViewCallback {
  void showLoading();

  void hideLoading();

  void showError(String message);
}
