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

/**
 * PayFrequency
 */

public class PayFrequency {
  @SerializedName("PayFrequencyType")
  private String payFrequencyType = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("LongName")
  private String longName = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public PayFrequency payFrequencyType(String payFrequencyType) {
    this.payFrequencyType = payFrequencyType;
    return this;
  }

   /**
   * Get payFrequencyType
   * @return payFrequencyType
  **/
 
  public String getPayFrequencyType() {
    return payFrequencyType;
  }

  public void setPayFrequencyType(String payFrequencyType) {
    this.payFrequencyType = payFrequencyType;
  }

  public PayFrequency xrefCode(String xrefCode) {
    this.xrefCode = xrefCode;
    return this;
  }

   /**
   * Get xrefCode
   * @return xrefCode
  **/
 
  public String getXrefCode() {
    return xrefCode;
  }

  public void setXrefCode(String xrefCode) {
    this.xrefCode = xrefCode;
  }

  public PayFrequency shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
 
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public PayFrequency longName(String longName) {
    this.longName = longName;
    return this;
  }

   /**
   * Get longName
   * @return longName
  **/
 
  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public PayFrequency lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    PayFrequency payFrequency = (PayFrequency) o;
    return Objects.equals(this.payFrequencyType, payFrequency.payFrequencyType) &&
        Objects.equals(this.xrefCode, payFrequency.xrefCode) &&
        Objects.equals(this.shortName, payFrequency.shortName) &&
        Objects.equals(this.longName, payFrequency.longName) &&
        Objects.equals(this.lastModifiedTimestamp, payFrequency.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payFrequencyType, xrefCode, shortName, longName, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayFrequency {\n");
    
    sb.append("    payFrequencyType: ").append(toIndentedString(payFrequencyType)).append("\n");
    sb.append("    xrefCode: ").append(toIndentedString(xrefCode)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
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

