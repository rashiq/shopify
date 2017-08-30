package com.shopify.data.entity.network;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LineItemNetworkEntity {

  @SerializedName("id") private long id;
  @SerializedName("variant_id") private long variantId;
  @SerializedName("title") private String title;
  @SerializedName("quantity") private int quantity;
  @SerializedName("price") private String price;
  @SerializedName("grams") private int grams;
  @SerializedName("sku") private String sku;
  @SerializedName("variant_title") private String variantTitle;
  @SerializedName("vendor") private String vendor;
  @SerializedName("fulfillment_service") private String fulfillmentService;
  @SerializedName("product_id") private long productId;
  @SerializedName("requires_shipping") private boolean requiresShipping;
  @SerializedName("taxable") private boolean taxable;
  @SerializedName("gift_card") private boolean giftCard;
  @SerializedName("name") private String name;
  @SerializedName("variant_inventory_management") private Object variantInventoryManagement;
  @SerializedName("properties") private List<Object> properties = null;
  @SerializedName("product_exists") private boolean productExists;
  @SerializedName("fulfillable_quantity") private int fulfillableQuantity;
  @SerializedName("total_discount") private String totalDiscount;
  @SerializedName("fulfillment_status") private Object fulfillmentStatus;
  @SerializedName("tax_lines") private List<Object> taxLines = null;

  public long getId() {
    return id;
  }

  public long getVariantId() {
    return variantId;
  }

  public String getTitle() {
    return title;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getPrice() {
    return price;
  }

  public int getGrams() {
    return grams;
  }

  public String getSku() {
    return sku;
  }

  public String getVariantTitle() {
    return variantTitle;
  }

  public String getVendor() {
    return vendor;
  }

  public String getFulfillmentService() {
    return fulfillmentService;
  }

  public long getProductId() {
    return productId;
  }

  public boolean isRequiresShipping() {
    return requiresShipping;
  }

  public boolean isTaxable() {
    return taxable;
  }

  public boolean isGiftCard() {
    return giftCard;
  }

  public String getName() {
    return name;
  }

  public Object getVariantInventoryManagement() {
    return variantInventoryManagement;
  }

  public List<Object> getProperties() {
    return properties;
  }

  public boolean isProductExists() {
    return productExists;
  }

  public int getFulfillableQuantity() {
    return fulfillableQuantity;
  }

  public String getTotalDiscount() {
    return totalDiscount;
  }

  public Object getFulfillmentStatus() {
    return fulfillmentStatus;
  }

  public List<Object> getTaxLines() {
    return taxLines;
  }
}
