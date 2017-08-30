package com.shopify.orders.view.orders;

import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.shopify.orders.R;
import com.shopify.orders.di.components.ApplicationComponent;
import com.shopify.orders.di.modules.OrdersViewModule;
import com.shopify.orders.view.BaseActivity;
import javax.inject.Inject;

public class OrdersActivity extends BaseActivity implements OrdersViewCallback {

  @Inject OrdersPresenter presenter;

  @BindView(R.id.spent_by_customer) TextView spentByCustomer;
  @BindView(R.id.count_of_items_sold) TextView countOfItemsSold;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_orders);
    ButterKnife.bind(this);
  }

  @Override protected void setupDagger(ApplicationComponent appComponent) {
    appComponent.plus(new OrdersViewModule(this)).inject(this);
  }

  @Override public void attachPresenter() {
    attachPresenter(presenter);
    presenter.init();
  }

  @Override public void showLoading() {

  }

  @Override public void hideLoading() {

  }

  @Override public void showError(String message) {

  }

  @Override public void setSpentByCustomer(Double totalAmount) {
    spentByCustomer.setText(String.valueOf(totalAmount));
  }

  @Override public void setCountOfItemsSold(Long count) {
    countOfItemsSold.setText(String.valueOf(count));
  }

  public interface Injector {
    void inject(OrdersActivity ordersActivity);
  }
}
