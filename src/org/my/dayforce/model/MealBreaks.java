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
 * MealBreaks
 */

public class MealBreaks {
  @SerializedName("PunchXRefCode")
  private String punchXRefCode = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("TimeStart")
  private DateTime timeStart = null;

  @SerializedName("TimeEnd")
  private DateTime timeEnd = null;

  @SerializedName("TimeStartRaw")
  private DateTime timeStartRaw = null;

  @SerializedName("TimeEndRaw")
  private DateTime timeEndRaw = null;

  @SerializedName("NetHours")
  private Double netHours = null;

  @SerializedName("StartExceptionCode")
  private String startExceptionCode = null;

  @SerializedName("EndExceptionCode")
  private String endExceptionCode = null;

  @SerializedName("IsAutoInjected")
  private Boolean isAutoInjected = null;

  @SerializedName("LastModifiedTimestampUtc")
  private DateTime lastModifiedTimestampUtc = null;

  public MealBreaks punchXRefCode(String punchXRefCode) {
    this.punchXRefCode = punchXRefCode;
    return this;
  }

   /**
   * Get punchXRefCode
   * @return punchXRefCode
  **/
 
  public String getPunchXRefCode() {
    return punchXRefCode;
  }

  public void setPunchXRefCode(String punchXRefCode) {
    this.punchXRefCode = punchXRefCode;
  }

  public MealBreaks type(String type) {
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

  public MealBreaks timeStart(DateTime timeStart) {
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

  public MealBreaks timeEnd(DateTime timeEnd) {
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

  public MealBreaks timeStartRaw(DateTime timeStartRaw) {
    this.timeStartRaw = timeStartRaw;
    return this;
  }

   /**
   * Get timeStartRaw
   * @return timeStartRaw
  **/
 
  public DateTime getTimeStartRaw() {
    return timeStartRaw;
  }

  public void setTimeStartRaw(DateTime timeStartRaw) {
    this.timeStartRaw = timeStartRaw;
  }

  public MealBreaks timeEndRaw(DateTime timeEndRaw) {
    this.timeEndRaw = timeEndRaw;
    return this;
  }

   /**
   * Get timeEndRaw
   * @return timeEndRaw
  **/
 
  public DateTime getTimeEndRaw() {
    return timeEndRaw;
  }

  public void setTimeEndRaw(DateTime timeEndRaw) {
    this.timeEndRaw = timeEndRaw;
  }

  public MealBreaks netHours(Double netHours) {
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

  public MealBreaks startExceptionCode(String startExceptionCode) {
    this.startExceptionCode = startExceptionCode;
    return this;
  }

   /**
   * Get startExceptionCode
   * @return startExceptionCode
  **/
 
  public String getStartExceptionCode() {
    return startExceptionCode;
  }

  public void setStartExceptionCode(String startExceptionCode) {
    this.startExceptionCode = startExceptionCode;
  }

  public MealBreaks endExceptionCode(String endExceptionCode) {
    this.endExceptionCode = endExceptionCode;
    return this;
  }

   /**
   * Get endExceptionCode
   * @return endExceptionCode
  **/
 
  public String getEndExceptionCode() {
    return endExceptionCode;
  }

  public void setEndExceptionCode(String endExceptionCode) {
    this.endExceptionCode = endExceptionCode;
  }

  public MealBreaks isAutoInjected(Boolean isAutoInjected) {
    this.isAutoInjected = isAutoInjected;
    return this;
  }

   /**
   * Get isAutoInjected
   * @return isAutoInjected
  **/
 
  public Boolean getIsAutoInjected() {
    return isAutoInjected;
  }

  public void setIsAutoInjected(Boolean isAutoInjected) {
    this.isAutoInjected = isAutoInjected;
  }

  public MealBreaks lastModifiedTimestampUtc(DateTime lastModifiedTimestampUtc) {
    this.lastModifiedTimestampUtc = lastModifiedTimestampUtc;
    return this;
  }

   /**
   * Get lastModifiedTimestampUtc
   * @return lastModifiedTimestampUtc
  **/
 
  public DateTime getLastModifiedTimestampUtc() {
    return lastModifiedTimestampUtc;
  }

  public void setLastModifiedTimestampUtc(DateTime lastModifiedTimestampUtc) {
    this.lastModifiedTimestampUtc = lastModifiedTimestampUtc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MealBreaks mealBreaks = (MealBreaks) o;
    return Objects.equals(this.punchXRefCode, mealBreaks.punchXRefCode) &&
        Objects.equals(this.type, mealBreaks.type) &&
        Objects.equals(this.timeStart, mealBreaks.timeStart) &&
        Objects.equals(this.timeEnd, mealBreaks.timeEnd) &&
        Objects.equals(this.timeStartRaw, mealBreaks.timeStartRaw) &&
        Objects.equals(this.timeEndRaw, mealBreaks.timeEndRaw) &&
        Objects.equals(this.netHours, mealBreaks.netHours) &&
        Objects.equals(this.startExceptionCode, mealBreaks.startExceptionCode) &&
        Objects.equals(this.endExceptionCode, mealBreaks.endExceptionCode) &&
        Objects.equals(this.isAutoInjected, mealBreaks.isAutoInjected) &&
        Objects.equals(this.lastModifiedTimestampUtc, mealBreaks.lastModifiedTimestampUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(punchXRefCode, type, timeStart, timeEnd, timeStartRaw, timeEndRaw, netHours, startExceptionCode, endExceptionCode, isAutoInjected, lastModifiedTimestampUtc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MealBreaks {\n");
    
    sb.append("    punchXRefCode: ").append(toIndentedString(punchXRefCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeStart: ").append(toIndentedString(timeStart)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    timeStartRaw: ").append(toIndentedString(timeStartRaw)).append("\n");
    sb.append("    timeEndRaw: ").append(toIndentedString(timeEndRaw)).append("\n");
    sb.append("    netHours: ").append(toIndentedString(netHours)).append("\n");
    sb.append("    startExceptionCode: ").append(toIndentedString(startExceptionCode)).append("\n");
    sb.append("    endExceptionCode: ").append(toIndentedString(endExceptionCode)).append("\n");
    sb.append("    isAutoInjected: ").append(toIndentedString(isAutoInjected)).append("\n");
    sb.append("    lastModifiedTimestampUtc: ").append(toIndentedString(lastModifiedTimestampUtc)).append("\n");
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

