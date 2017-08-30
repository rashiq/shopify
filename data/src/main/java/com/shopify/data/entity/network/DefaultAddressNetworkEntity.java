package com.shopify.data.entity.network;

import com.google.gson.annotations.SerializedName;

public class DefaultAddressNetworkEntity {

  @SerializedName("id") private long id;
  @SerializedName("customer_id") private long customerId;
  @SerializedName("first_name") private String firstName;
  @SerializedName("last_name") private String lastName;
  @SerializedName("company") private Object company;
  @SerializedName("address1") private String address1;
  @SerializedName("address2") private Object address2;
  @SerializedName("city") private String city;
  @SerializedName("province") private String province;
  @SerializedName("country") private String country;
  @SerializedName("zip") private String zip;
  @SerializedName("phone") private String phone;
  @SerializedName("name") private String name;
  @SerializedName("province_code") private String provinceCode;
  @SerializedName("country_code") private String countryCode;
  @SerializedName("country_name") private String countryName;
  @SerializedName("default") private boolean _default;

  public long getId() {
    return id;
  }

  public long getCustomerId() {
    return customerId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Object getCompany() {
    return company;
  }

  public String getAddress1() {
    return address1;
  }

  public Object getAddress2() {
    return address2;
  }

  public String getCity() {
    return city;
  }

  public String getProvince() {
    return province;
  }

  public String getCountry() {
    return country;
  }

  public String getZip() {
    return zip;
  }

  public String getPhone() {
    return phone;
  }

  public String getName() {
    return name;
  }

  public String getProvinceCode() {
    return provinceCode;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public String getCountryName() {
    return countryName;
  }

  public boolean isDefault() {
    return _default;
  }
}
