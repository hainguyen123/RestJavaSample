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
import org.my.dayforce.model.LaborCostTotalResult;

/**
 * LaborCostTimeInterval
 */

public class LaborCostTimeInterval {
  @SerializedName("IntervalStartTime")
  private DateTime intervalStartTime = null;

  @SerializedName("IntervalEndTime")
  private DateTime intervalEndTime = null;

  @SerializedName("Totals")
  private LaborCostTotalResult totals = null;

  public LaborCostTimeInterval intervalStartTime(DateTime intervalStartTime) {
    this.intervalStartTime = intervalStartTime;
    return this;
  }

   /**
   * Get intervalStartTime
   * @return intervalStartTime
  **/
 
  public DateTime getIntervalStartTime() {
    return intervalStartTime;
  }

  public void setIntervalStartTime(DateTime intervalStartTime) {
    this.intervalStartTime = intervalStartTime;
  }

  public LaborCostTimeInterval intervalEndTime(DateTime intervalEndTime) {
    this.intervalEndTime = intervalEndTime;
    return this;
  }

   /**
   * Get intervalEndTime
   * @return intervalEndTime
  **/
 
  public DateTime getIntervalEndTime() {
    return intervalEndTime;
  }

  public void setIntervalEndTime(DateTime intervalEndTime) {
    this.intervalEndTime = intervalEndTime;
  }

  public LaborCostTimeInterval totals(LaborCostTotalResult totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
 
  public LaborCostTotalResult getTotals() {
    return totals;
  }

  public void setTotals(LaborCostTotalResult totals) {
    this.totals = totals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaborCostTimeInterval laborCostTimeInterval = (LaborCostTimeInterval) o;
    return Objects.equals(this.intervalStartTime, laborCostTimeInterval.intervalStartTime) &&
        Objects.equals(this.intervalEndTime, laborCostTimeInterval.intervalEndTime) &&
        Objects.equals(this.totals, laborCostTimeInterval.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalStartTime, intervalEndTime, totals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaborCostTimeInterval {\n");
    
    sb.append("    intervalStartTime: ").append(toIndentedString(intervalStartTime)).append("\n");
    sb.append("    intervalEndTime: ").append(toIndentedString(intervalEndTime)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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
