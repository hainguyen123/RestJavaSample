/*
 * Dayforce API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.my.dayforce.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


import org.joda.time.DateTime;
import org.my.dayforce.model.ContactInformationType;
import org.my.dayforce.model.Country;
import org.my.dayforce.model.State;

/**
 * EmergencyContactPersonAddress
 */

public class EmergencyContactPersonAddress {
  @SerializedName("Address1")
  private String address1 = null;

  @SerializedName("Address2")
  private String address2 = null;

  @SerializedName("Address3")
  private String address3 = null;

  @SerializedName("Address4")
  private String address4 = null;

  @SerializedName("Address5")
  private String address5 = null;

  @SerializedName("Address6")
  private String address6 = null;

  @SerializedName("County")
  private String county = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("Country")
  private Country country = null;

  @SerializedName("State")
  private State state = null;

  @SerializedName("EffectiveStart")
  private DateTime effectiveStart = null;

  @SerializedName("EffectiveEnd")
  private DateTime effectiveEnd = null;

  @SerializedName("ContactInformationType")
  private ContactInformationType contactInformationType = null;

  @SerializedName("IsPayrollMailing")
  private Boolean isPayrollMailing = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmergencyContactPersonAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
 
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public EmergencyContactPersonAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
 
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public EmergencyContactPersonAddress address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Get address3
   * @return address3
  **/
 
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public EmergencyContactPersonAddress address4(String address4) {
    this.address4 = address4;
    return this;
  }

   /**
   * Get address4
   * @return address4
  **/
 
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public EmergencyContactPersonAddress address5(String address5) {
    this.address5 = address5;
    return this;
  }

   /**
   * Get address5
   * @return address5
  **/
 
  public String getAddress5() {
    return address5;
  }

  public void setAddress5(String address5) {
    this.address5 = address5;
  }

  public EmergencyContactPersonAddress address6(String address6) {
    this.address6 = address6;
    return this;
  }

   /**
   * Get address6
   * @return address6
  **/
 
  public String getAddress6() {
    return address6;
  }

  public void setAddress6(String address6) {
    this.address6 = address6;
  }

  public EmergencyContactPersonAddress county(String county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
 
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public EmergencyContactPersonAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public EmergencyContactPersonAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
 
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public EmergencyContactPersonAddress country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
 
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public EmergencyContactPersonAddress state(State state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
 
  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public EmergencyContactPersonAddress effectiveStart(DateTime effectiveStart) {
    this.effectiveStart = effectiveStart;
    return this;
  }

   /**
   * Get effectiveStart
   * @return effectiveStart
  **/
 
  public DateTime getEffectiveStart() {
    return effectiveStart;
  }

  public void setEffectiveStart(DateTime effectiveStart) {
    this.effectiveStart = effectiveStart;
  }

  public EmergencyContactPersonAddress effectiveEnd(DateTime effectiveEnd) {
    this.effectiveEnd = effectiveEnd;
    return this;
  }

   /**
   * Get effectiveEnd
   * @return effectiveEnd
  **/
 
  public DateTime getEffectiveEnd() {
    return effectiveEnd;
  }

  public void setEffectiveEnd(DateTime effectiveEnd) {
    this.effectiveEnd = effectiveEnd;
  }

  public EmergencyContactPersonAddress contactInformationType(ContactInformationType contactInformationType) {
    this.contactInformationType = contactInformationType;
    return this;
  }

   /**
   * Get contactInformationType
   * @return contactInformationType
  **/
 
  public ContactInformationType getContactInformationType() {
    return contactInformationType;
  }

  public void setContactInformationType(ContactInformationType contactInformationType) {
    this.contactInformationType = contactInformationType;
  }

  public EmergencyContactPersonAddress isPayrollMailing(Boolean isPayrollMailing) {
    this.isPayrollMailing = isPayrollMailing;
    return this;
  }

   /**
   * Get isPayrollMailing
   * @return isPayrollMailing
  **/
 
  public Boolean getIsPayrollMailing() {
    return isPayrollMailing;
  }

  public void setIsPayrollMailing(Boolean isPayrollMailing) {
    this.isPayrollMailing = isPayrollMailing;
  }

  public EmergencyContactPersonAddress lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
    this.lastModifiedTimestamp = lastModifiedTimestamp;
    return this;
  }

   /**
   * Get lastModifiedTimestamp
   * @return lastModifiedTimestamp
  **/
 
  public DateTime getLastModifiedTimestamp() {
    return lastModifiedTimestamp;
  }

  public void setLastModifiedTimestamp(DateTime lastModifiedTimestamp) {
    this.lastModifiedTimestamp = lastModifiedTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmergencyContactPersonAddress emergencyContactPersonAddress = (EmergencyContactPersonAddress) o;
    return Objects.equals(this.address1, emergencyContactPersonAddress.address1) &&
        Objects.equals(this.address2, emergencyContactPersonAddress.address2) &&
        Objects.equals(this.address3, emergencyContactPersonAddress.address3) &&
        Objects.equals(this.address4, emergencyContactPersonAddress.address4) &&
        Objects.equals(this.address5, emergencyContactPersonAddress.address5) &&
        Objects.equals(this.address6, emergencyContactPersonAddress.address6) &&
        Objects.equals(this.county, emergencyContactPersonAddress.county) &&
        Objects.equals(this.city, emergencyContactPersonAddress.city) &&
        Objects.equals(this.postalCode, emergencyContactPersonAddress.postalCode) &&
        Objects.equals(this.country, emergencyContactPersonAddress.country) &&
        Objects.equals(this.state, emergencyContactPersonAddress.state) &&
        Objects.equals(this.effectiveStart, emergencyContactPersonAddress.effectiveStart) &&
        Objects.equals(this.effectiveEnd, emergencyContactPersonAddress.effectiveEnd) &&
        Objects.equals(this.contactInformationType, emergencyContactPersonAddress.contactInformationType) &&
        Objects.equals(this.isPayrollMailing, emergencyContactPersonAddress.isPayrollMailing) &&
        Objects.equals(this.lastModifiedTimestamp, emergencyContactPersonAddress.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, address4, address5, address6, county, city, postalCode, country, state, effectiveStart, effectiveEnd, contactInformationType, isPayrollMailing, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencyContactPersonAddress {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    address5: ").append(toIndentedString(address5)).append("\n");
    sb.append("    address6: ").append(toIndentedString(address6)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
    sb.append("    contactInformationType: ").append(toIndentedString(contactInformationType)).append("\n");
    sb.append("    isPayrollMailing: ").append(toIndentedString(isPayrollMailing)).append("\n");
    sb.append("    lastModifiedTimestamp: ").append(toIndentedString(lastModifiedTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

