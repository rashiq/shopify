package com.shopify.data.entity.network;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class OrderNetworkEntity {

  @SerializedName("id") private long id;
  @SerializedName("email") private String email;
  @SerializedName("closed_at") private Object closedAt;
  @SerializedName("created_at") private String createdAt;
  @SerializedName("updated_at") private String updatedAt;
  @SerializedName("number") private int number;
  @SerializedName("note") private Object note;
  @SerializedName("token") private String token;
  @SerializedName("gateway") private String gateway;
  @SerializedName("test") private boolean test;
  @SerializedName("total_price") private String totalPrice;
  @SerializedName("subtotal_price") private String subtotalPrice;
  @SerializedName("total_weight") private int totalWeight;
  @SerializedName("total_tax") private String totalTax;
  @SerializedName("taxes_included") private boolean taxesIncluded;
  @SerializedName("currency") private String currency;
  @SerializedName("financial_status") private String financialStatus;
  @SerializedName("confirmed") private boolean confirmed;
  @SerializedName("total_discounts") private String totalDiscounts;
  @SerializedName("total_line_items_price") private String totalLineItemsPrice;
  @SerializedName("cart_token") private Object cartToken;
  @SerializedName("buyer_accepts_marketing") private boolean buyerAcceptsMarketing;
  @SerializedName("name") private String name;
  @SerializedName("referring_site") private Object referringSite;
  @SerializedName("landing_site") private Object landingSite;
  @SerializedName("cancelled_at") private Object cancelledAt;
  @SerializedName("cancel_reason") private Object cancelReason;
  @SerializedName("total_price_usd") private String totalPriceUsd;
  @SerializedName("checkout_token") private Object checkoutToken;
  @SerializedName("reference") private Object reference;
  @SerializedName("user_id") private long userId;
  @SerializedName("location_id") private Object locationId;
  @SerializedName("source_identifier") private Object sourceIdentifier;
  @SerializedName("source_url") private Object sourceUrl;
  @SerializedName("processed_at") private String processedAt;
  @SerializedName("device_id") private Object deviceId;
  @SerializedName("phone") private Object phone;
  @SerializedName("customer_locale") private Object customerLocale;
  @SerializedName("app_id") private long appId;
  @SerializedName("browser_ip") private Object browserIp;
  @SerializedName("landing_site_ref") private Object landingSiteRef;
  @SerializedName("order_number") private int orderNumber;
  @SerializedName("discount_codes") private List<Object> discountCodes = null;
  @SerializedName("note_attributes") private List<Object> noteAttributes = null;
  @SerializedName("payment_gateway_names") private List<String> paymentGatewayNames = null;
  @SerializedName("processing_method") private String processingMethod;
  @SerializedName("checkout_id") private Object checkoutId;
  @SerializedName("source_name") private String sourceName;
  @SerializedName("fulfillment_status") private Object fulfillmentStatus;
  @SerializedName("tax_lines") private List<Object> taxLines = null;
  @SerializedName("tags") private String tags;
  @SerializedName("contact_email") private String contactEmail;
  @SerializedName("order_status_url") private Object orderStatusUrl;
  @SerializedName("line_items") private List<LineItemNetworkEntity> lineItems = null;
  @SerializedName("shipping_lines") private List<Object> shippingLines = null;
  @SerializedName("billing_address") private BillingAddressNetworkEntity billingAddress;
  @SerializedName("shipping_address") private ShippingAddressNetworkEntity shippingAddress;
  @SerializedName("fulfillments") private List<Object> fulfillments = null;
  @SerializedName("refunds") private List<Object> refunds = null;
  @SerializedName("customer") private CustomerNetworkEntity customer;

  public long getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public Object getClosedAt() {
    return closedAt;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public int getNumber() {
    return number;
  }

  public Object getNote() {
    return note;
  }

  public String getToken() {
    return token;
  }

  public String getGateway() {
    return gateway;
  }

  public boolean isTest() {
    return test;
  }

  public String getTotalPrice() {
    return totalPrice;
  }

  public String getSubtotalPrice() {
    return subtotalPrice;
  }

  public int getTotalWeight() {
    return totalWeight;
  }

  public String getTotalTax() {
    return totalTax;
  }

  public boolean isTaxesIncluded() {
    return taxesIncluded;
  }

  public String getCurrency() {
    return currency;
  }

  public String getFinancialStatus() {
    return financialStatus;
  }

  public boolean isConfirmed() {
    return confirmed;
  }

  public String getTotalDiscounts() {
    return totalDiscounts;
  }

  public String getTotalLineItemsPrice() {
    return totalLineItemsPrice;
  }

  public Object getCartToken() {
    return cartToken;
  }

  public boolean isBuyerAcceptsMarketing() {
    return buyerAcceptsMarketing;
  }

  public String getName() {
    return name;
  }

  public Object getReferringSite() {
    return referringSite;
  }

  public Object getLandingSite() {
    return landingSite;
  }

  public Object getCancelledAt() {
    return cancelledAt;
  }

  public Object getCancelReason() {
    return cancelReason;
  }

  public String getTotalPriceUsd() {
    return totalPriceUsd;
  }

  public Object getCheckoutToken() {
    return checkoutToken;
  }

  public Object getReference() {
    return reference;
  }

  public long agetUserId() {
    return userId;
  }

  public Object getLocationId() {
    return locationId;
  }

  public Object getSourceIdentifier() {
    return sourceIdentifier;
  }

  public Object getSourceUrl() {
    return sourceUrl;
  }

  public String getProcessedAt() {
    return processedAt;
  }

  public Object getDeviceId() {
    return deviceId;
  }

  public Object getPhone() {
    return phone;
  }

  public Object getCustomerLocale() {
    return customerLocale;
  }

  public long getAppId() {
    return appId;
  }

  public Object getBrowserIp() {
    return browserIp;
  }

  public Object getLandingSiteRef() {
    return landingSiteRef;
  }

  public int getOrderNumber() {
    return orderNumber;
  }

  public List<Object> getDiscountCodes() {
    return discountCodes;
  }

  public List<Object> getNoteAttributes() {
    return noteAttributes;
  }

  public List<String> getPaymentGatewayNames() {
    return paymentGatewayNames;
  }

  public String getProcessingMethod() {
    return processingMethod;
  }

  public Object getCheckoutId() {
    return checkoutId;
  }

  public String getSourceName() {
    return sourceName;
  }

  public Object getFulfillmentStatus() {
    return fulfillmentStatus;
  }

  public List<Object> getTaxLines() {
    return taxLines;
  }

  public String getTags() {
    return tags;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public Object getOrderStatusUrl() {
    return orderStatusUrl;
  }

  public List<LineItemNetworkEntity> getLineItems() {
    return lineItems;
  }

  public List<Object> getShippingLines() {
    return shippingLines;
  }

  public BillingAddressNetworkEntity getBillingAddress() {
    return billingAddress;
  }

  public ShippingAddressNetworkEntity getShippingAddress() {
    return shippingAddress;
  }

  public List<Object> getFulfillments() {
    return fulfillments;
  }

  public List<Object> getRefunds() {
    return refunds;
  }

  public CustomerNetworkEntity getCustomer() {
    return customer;
  }
}