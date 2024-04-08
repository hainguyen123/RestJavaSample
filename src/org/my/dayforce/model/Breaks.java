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
 * Breaks
 */

public class Breaks {
  @SerializedName("TimeStart")
  private DateTime timeStart = null;

  @SerializedName("TimeEnd")
  private DateTime timeEnd = null;

  @SerializedName("NetHours")
  private Double netHours = null;

  @SerializedName("Type")
  private String type = null;

  public Breaks timeStart(DateTime timeStart) {
    this.timeStart = timeStart;
    return this;
  }

   /**
   * Get timeStart
   * @return timeStart
  **/
 
  public DateTime getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(DateTime timeStart) {
    this.timeStart = timeStart;
  }

  public Breaks timeEnd(DateTime timeEnd) {
    this.timeEnd = timeEnd;
    return this;
  }

   /**
   * Get timeEnd
   * @return timeEnd
  **/
 
  public DateTime getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(DateTime timeEnd) {
    this.timeEnd = timeEnd;
  }

  public Breaks netHours(Double netHours) {
    this.netHours = netHours;
    return this;
  }

   /**
   * Get netHours
   * @return netHours
  **/
 
  public Double getNetHours() {
    return netHours;
  }

  public void setNetHours(Double netHours) {
    this.netHours = netHours;
  }

  public Breaks type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Breaks breaks = (Breaks) o;
    return Objects.equals(this.timeStart, breaks.timeStart) &&
        Objects.equals(this.timeEnd, breaks.timeEnd) &&
        Objects.equals(this.netHours, breaks.netHours) &&
        Objects.equals(this.type, breaks.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeStart, timeEnd, netHours, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Breaks {\n");
    
    sb.append("    timeStart: ").append(toIndentedString(timeStart)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    netHours: ").append(toIndentedString(netHours)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
