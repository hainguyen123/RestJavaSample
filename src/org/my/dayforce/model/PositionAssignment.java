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
import org.my.dayforce.model.Location;

/**
 * PositionAssignment
 */

public class PositionAssignment {
  @SerializedName("Location")
  private Location location = null;

  @SerializedName("BudgetedHeadCount")
  private Double budgetedHeadCount = null;

  @SerializedName("EffectiveEnd")
  private DateTime effectiveEnd = null;

  @SerializedName("EffectiveStart")
  private DateTime effectiveStart = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("LongName")
  private String longName = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public PositionAssignment location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
 
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public PositionAssignment budgetedHeadCount(Double budgetedHeadCount) {
    this.budgetedHeadCount = budgetedHeadCount;
    return this;
  }

   /**
   * Get budgetedHeadCount
   * @return budgetedHeadCount
  **/
 
  public Double getBudgetedHeadCount() {
    return budgetedHeadCount;
  }

  public void setBudgetedHeadCount(Double budgetedHeadCount) {
    this.budgetedHeadCount = budgetedHeadCount;
  }

  public PositionAssignment effectiveEnd(DateTime effectiveEnd) {
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

  public PositionAssignment effectiveStart(DateTime effectiveStart) {
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

  public PositionAssignment xrefCode(String xrefCode) {
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

  public PositionAssignment shortName(String shortName) {
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

  public PositionAssignment longName(String longName) {
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

  public PositionAssignment lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    PositionAssignment positionAssignment = (PositionAssignment) o;
    return Objects.equals(this.location, positionAssignment.location) &&
        Objects.equals(this.budgetedHeadCount, positionAssignment.budgetedHeadCount) &&
        Objects.equals(this.effectiveEnd, positionAssignment.effectiveEnd) &&
        Objects.equals(this.effectiveStart, positionAssignment.effectiveStart) &&
        Objects.equals(this.xrefCode, positionAssignment.xrefCode) &&
        Objects.equals(this.shortName, positionAssignment.shortName) &&
        Objects.equals(this.longName, positionAssignment.longName) &&
        Objects.equals(this.lastModifiedTimestamp, positionAssignment.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, budgetedHeadCount, effectiveEnd, effectiveStart, xrefCode, shortName, longName, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionAssignment {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    budgetedHeadCount: ").append(toIndentedString(budgetedHeadCount)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
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

