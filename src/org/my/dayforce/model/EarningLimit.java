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
import org.my.dayforce.model.AccumulationType;
import org.my.dayforce.model.LimitAccessType;
import org.my.dayforce.model.LimitType;

/**
 * EarningLimit
 */

public class EarningLimit {
  @SerializedName("LimitAccessType")
  private LimitAccessType limitAccessType = null;

  @SerializedName("AccumulationType")
  private AccumulationType accumulationType = null;

  @SerializedName("LimitType")
  private LimitType limitType = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("LongName")
  private String longName = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EarningLimit limitAccessType(LimitAccessType limitAccessType) {
    this.limitAccessType = limitAccessType;
    return this;
  }

   /**
   * Get limitAccessType
   * @return limitAccessType
  **/
 
  public LimitAccessType getLimitAccessType() {
    return limitAccessType;
  }

  public void setLimitAccessType(LimitAccessType limitAccessType) {
    this.limitAccessType = limitAccessType;
  }

  public EarningLimit accumulationType(AccumulationType accumulationType) {
    this.accumulationType = accumulationType;
    return this;
  }

   /**
   * Get accumulationType
   * @return accumulationType
  **/
 
  public AccumulationType getAccumulationType() {
    return accumulationType;
  }

  public void setAccumulationType(AccumulationType accumulationType) {
    this.accumulationType = accumulationType;
  }

  public EarningLimit limitType(LimitType limitType) {
    this.limitType = limitType;
    return this;
  }

   /**
   * Get limitType
   * @return limitType
  **/
 
  public LimitType getLimitType() {
    return limitType;
  }

  public void setLimitType(LimitType limitType) {
    this.limitType = limitType;
  }

  public EarningLimit xrefCode(String xrefCode) {
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

  public EarningLimit shortName(String shortName) {
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

  public EarningLimit longName(String longName) {
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

  public EarningLimit lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EarningLimit earningLimit = (EarningLimit) o;
    return Objects.equals(this.limitAccessType, earningLimit.limitAccessType) &&
        Objects.equals(this.accumulationType, earningLimit.accumulationType) &&
        Objects.equals(this.limitType, earningLimit.limitType) &&
        Objects.equals(this.xrefCode, earningLimit.xrefCode) &&
        Objects.equals(this.shortName, earningLimit.shortName) &&
        Objects.equals(this.longName, earningLimit.longName) &&
        Objects.equals(this.lastModifiedTimestamp, earningLimit.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitAccessType, accumulationType, limitType, xrefCode, shortName, longName, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningLimit {\n");
    
    sb.append("    limitAccessType: ").append(toIndentedString(limitAccessType)).append("\n");
    sb.append("    accumulationType: ").append(toIndentedString(accumulationType)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
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

