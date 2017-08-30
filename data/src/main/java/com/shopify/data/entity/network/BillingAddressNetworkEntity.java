package com.shopify.data.entity.network;

import com.google.gson.annotations.SerializedName;

public class BillingAddressNetworkEntity {

  @SerializedName("first_name") private String firstName;
  @SerializedName("address1") private String address1;
  @SerializedName("phone") private String phone;
  @SerializedName("city") private String city;
  @SerializedName("zip") private String zip;
  @SerializedName("province") private String province;
  @SerializedName("country") private String country;
  @SerializedName("last_name") private String lastName;
  @SerializedName("address2") private Object address2;
  @SerializedName("company") private Object company;
  @SerializedName("latitude") private double latitude;
  @SerializedName("longitude") private double longitude;
  @SerializedName("name") private String name;
  @SerializedName("country_code") private String countryCode;
  @SerializedName("province_code") private String provinceCode;

  public String getFirstName() {
    return firstName;
  }

  public String getAddress1() {
    return address1;
  }

  public String getPhone() {
    return phone;
  }

  public String getCity() {
    return city;
  }

  public String getZip() {
    return zip;
  }

  public String getProvince() {
    return province;
  }

  public String getCountry() {
    return country;
  }

  public String getLastName() {
    return lastName;
  }

  public Object getAddress2() {
    return address2;
  }

  public Object getCompany() {
    return company;
  }

  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public String getName() {
    return name;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public String getProvinceCode() {
    return provinceCode;
  }
}
