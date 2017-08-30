package com.shopify.data.entity.network;

import com.google.gson.annotations.SerializedName;

public class CustomerNetworkEntity {

  @SerializedName("id") private long id;
  @SerializedName("email") private String email;
  @SerializedName("accepts_marketing") private boolean acceptsMarketing;
  @SerializedName("created_at") private String createdAt;
  @SerializedName("updated_at") private String updatedAt;
  @SerializedName("first_name") private String firstName;
  @SerializedName("last_name") private String lastName;
  @SerializedName("orders_count") private int ordersCount;
  @SerializedName("state") private String state;
  @SerializedName("total_spent") private String totalSpent;
  @SerializedName("last_order_id") private long lastOrderId;
  @SerializedName("note") private Object note;
  @SerializedName("verified_email") private boolean verifiedEmail;
  @SerializedName("multipass_identifier") private Object multipassIdentifier;
  @SerializedName("tax_exempt") private boolean taxExempt;
  @SerializedName("phone") private Object phone;
  @SerializedName("tags") private String tags;
  @SerializedName("last_order_name") private String lastOrderName;
  @SerializedName("default_address") private DefaultAddressNetworkEntity defaultAddress;

  public long getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public boolean isAcceptsMarketing() {
    return acceptsMarketing;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getOrdersCount() {
    return ordersCount;
  }

  public String getState() {
    return state;
  }

  public String getTotalSpent() {
    return totalSpent;
  }

  public long getLastOrderId() {
    return lastOrderId;
  }

  public Object getNote() {
    return note;
  }

  public boolean isVerifiedEmail() {
    return verifiedEmail;
  }

  public Object getMultipassIdentifier() {
    return multipassIdentifier;
  }

  public boolean isTaxExempt() {
    return taxExempt;
  }

  public Object getPhone() {
    return phone;
  }

  public String getTags() {
    return tags;
  }

  public String getLastOrderName() {
    return lastOrderName;
  }

  public DefaultAddressNetworkEntity getDefaultAddress() {
    return defaultAddress;
  }
}
