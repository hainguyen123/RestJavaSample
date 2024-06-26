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
 * TaxProperty
 */

public class TaxProperty {
  @SerializedName("PropertyCodeName")
  private String propertyCodeName = null;

  @SerializedName("PropertyValue")
  private String propertyValue = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public TaxProperty propertyCodeName(String propertyCodeName) {
    this.propertyCodeName = propertyCodeName;
    return this;
  }

   /**
   * Get propertyCodeName
   * @return propertyCodeName
  **/
 
  public String getPropertyCodeName() {
    return propertyCodeName;
  }

  public void setPropertyCodeName(String propertyCodeName) {
    this.propertyCodeName = propertyCodeName;
  }

  public TaxProperty propertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

   /**
   * Get propertyValue
   * @return propertyValue
  **/
 
  public String getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }

  public TaxProperty lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    TaxProperty taxProperty = (TaxProperty) o;
    return Objects.equals(this.propertyCodeName, taxProperty.propertyCodeName) &&
        Objects.equals(this.propertyValue, taxProperty.propertyValue) &&
        Objects.equals(this.lastModifiedTimestamp, taxProperty.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyCodeName, propertyValue, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxProperty {\n");
    
    sb.append("    propertyCodeName: ").append(toIndentedString(propertyCodeName)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
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

