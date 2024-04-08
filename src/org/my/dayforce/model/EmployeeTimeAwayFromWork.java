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
 * EmployeeTimeAwayFromWork
 */

public class EmployeeTimeAwayFromWork {
  @SerializedName("DateOfRequest")
  private DateTime dateOfRequest = null;

  @SerializedName("TimeStart")
  private DateTime timeStart = null;

  @SerializedName("TimeEnd")
  private DateTime timeEnd = null;

  @SerializedName("NetHours")
  private Double netHours = null;

  @SerializedName("ManagerComment")
  private String managerComment = null;

  @SerializedName("EmployeeComment")
  private String employeeComment = null;

  @SerializedName("ReasonName")
  private String reasonName = null;

  @SerializedName("AllDay")
  private Boolean allDay = null;

  @SerializedName("HalfDay")
  private Boolean halfDay = null;

  @SerializedName("DailyElapsedHours")
  private Double dailyElapsedHours = null;

  public EmployeeTimeAwayFromWork dateOfRequest(DateTime dateOfRequest) {
    this.dateOfRequest = dateOfRequest;
    return this;
  }

   /**
   * Get dateOfRequest
   * @return dateOfRequest
  **/
 
  public DateTime getDateOfRequest() {
    return dateOfRequest;
  }

  public void setDateOfRequest(DateTime dateOfRequest) {
    this.dateOfRequest = dateOfRequest;
  }

  public EmployeeTimeAwayFromWork timeStart(DateTime timeStart) {
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

  public EmployeeTimeAwayFromWork timeEnd(DateTime timeEnd) {
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

  public EmployeeTimeAwayFromWork netHours(Double netHours) {
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

  public EmployeeTimeAwayFromWork managerComment(String managerComment) {
    this.managerComment = managerComment;
    return this;
  }

   /**
   * Get managerComment
   * @return managerComment
  **/
 
  public String getManagerComment() {
    return managerComment;
  }

  public void setManagerComment(String managerComment) {
    this.managerComment = managerComment;
  }

  public EmployeeTimeAwayFromWork employeeComment(String employeeComment) {
    this.employeeComment = employeeComment;
    return this;
  }

   /**
   * Get employeeComment
   * @return employeeComment
  **/
 
  public String getEmployeeComment() {
    return employeeComment;
  }

  public void setEmployeeComment(String employeeComment) {
    this.employeeComment = employeeComment;
  }

  public EmployeeTimeAwayFromWork reasonName(String reasonName) {
    this.reasonName = reasonName;
    return this;
  }

   /**
   * Get reasonName
   * @return reasonName
  **/
 
  public String getReasonName() {
    return reasonName;
  }

  public void setReasonName(String reasonName) {
    this.reasonName = reasonName;
  }

  public EmployeeTimeAwayFromWork allDay(Boolean allDay) {
    this.allDay = allDay;
    return this;
  }

   /**
   * Get allDay
   * @return allDay
  **/
 
  public Boolean getAllDay() {
    return allDay;
  }

  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }

  public EmployeeTimeAwayFromWork halfDay(Boolean halfDay) {
    this.halfDay = halfDay;
    return this;
  }

   /**
   * Get halfDay
   * @return halfDay
  **/
 
  public Boolean getHalfDay() {
    return halfDay;
  }

  public void setHalfDay(Boolean halfDay) {
    this.halfDay = halfDay;
  }

  public EmployeeTimeAwayFromWork dailyElapsedHours(Double dailyElapsedHours) {
    this.dailyElapsedHours = dailyElapsedHours;
    return this;
  }

   /**
   * Get dailyElapsedHours
   * @return dailyElapsedHours
  **/
 
  public Double getDailyElapsedHours() {
    return dailyElapsedHours;
  }

  public void setDailyElapsedHours(Double dailyElapsedHours) {
    this.dailyElapsedHours = dailyElapsedHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTimeAwayFromWork employeeTimeAwayFromWork = (EmployeeTimeAwayFromWork) o;
    return Objects.equals(this.dateOfRequest, employeeTimeAwayFromWork.dateOfRequest) &&
        Objects.equals(this.timeStart, employeeTimeAwayFromWork.timeStart) &&
        Objects.equals(this.timeEnd, employeeTimeAwayFromWork.timeEnd) &&
        Objects.equals(this.netHours, employeeTimeAwayFromWork.netHours) &&
        Objects.equals(this.managerComment, employeeTimeAwayFromWork.managerComment) &&
        Objects.equals(this.employeeComment, employeeTimeAwayFromWork.employeeComment) &&
        Objects.equals(this.reasonName, employeeTimeAwayFromWork.reasonName) &&
        Objects.equals(this.allDay, employeeTimeAwayFromWork.allDay) &&
        Objects.equals(this.halfDay, employeeTimeAwayFromWork.halfDay) &&
        Objects.equals(this.dailyElapsedHours, employeeTimeAwayFromWork.dailyElapsedHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfRequest, timeStart, timeEnd, netHours, managerComment, employeeComment, reasonName, allDay, halfDay, dailyElapsedHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTimeAwayFromWork {\n");
    
    sb.append("    dateOfRequest: ").append(toIndentedString(dateOfRequest)).append("\n");
    sb.append("    timeStart: ").append(toIndentedString(timeStart)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    netHours: ").append(toIndentedString(netHours)).append("\n");
    sb.append("    managerComment: ").append(toIndentedString(managerComment)).append("\n");
    sb.append("    employeeComment: ").append(toIndentedString(employeeComment)).append("\n");
    sb.append("    reasonName: ").append(toIndentedString(reasonName)).append("\n");
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    halfDay: ").append(toIndentedString(halfDay)).append("\n");
    sb.append("    dailyElapsedHours: ").append(toIndentedString(dailyElapsedHours)).append("\n");
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
