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
import org.my.dayforce.model.Department;
import org.my.dayforce.model.Job;
import org.my.dayforce.model.Location;
import org.my.dayforce.model.OrgLocationType;
import org.my.dayforce.model.WorkPatternShiftType;

/**
 * EmployeeWorkPattern
 */

public class EmployeeWorkPattern {
  @SerializedName("NetHours")
  private Double netHours = null;

  @SerializedName("ShiftTimeBegin")
  private DateTime shiftTimeBegin = null;

  @SerializedName("ShiftTimeEnd")
  private DateTime shiftTimeEnd = null;

  @SerializedName("WorkPatternDayIndex")
  private Integer workPatternDayIndex = null;

  @SerializedName("Deparment")
  private Department deparment = null;

  @SerializedName("Job")
  private Job job = null;

  @SerializedName("ShiftType")
  private WorkPatternShiftType shiftType = null;

  @SerializedName("Location")
  private Location location = null;

  @SerializedName("OrgLocationType")
  private OrgLocationType orgLocationType = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmployeeWorkPattern netHours(Double netHours) {
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

  public EmployeeWorkPattern shiftTimeBegin(DateTime shiftTimeBegin) {
    this.shiftTimeBegin = shiftTimeBegin;
    return this;
  }

   /**
   * Get shiftTimeBegin
   * @return shiftTimeBegin
  **/
 
  public DateTime getShiftTimeBegin() {
    return shiftTimeBegin;
  }

  public void setShiftTimeBegin(DateTime shiftTimeBegin) {
    this.shiftTimeBegin = shiftTimeBegin;
  }

  public EmployeeWorkPattern shiftTimeEnd(DateTime shiftTimeEnd) {
    this.shiftTimeEnd = shiftTimeEnd;
    return this;
  }

   /**
   * Get shiftTimeEnd
   * @return shiftTimeEnd
  **/
 
  public DateTime getShiftTimeEnd() {
    return shiftTimeEnd;
  }

  public void setShiftTimeEnd(DateTime shiftTimeEnd) {
    this.shiftTimeEnd = shiftTimeEnd;
  }

  public EmployeeWorkPattern workPatternDayIndex(Integer workPatternDayIndex) {
    this.workPatternDayIndex = workPatternDayIndex;
    return this;
  }

   /**
   * Get workPatternDayIndex
   * @return workPatternDayIndex
  **/
 
  public Integer getWorkPatternDayIndex() {
    return workPatternDayIndex;
  }

  public void setWorkPatternDayIndex(Integer workPatternDayIndex) {
    this.workPatternDayIndex = workPatternDayIndex;
  }

  public EmployeeWorkPattern deparment(Department deparment) {
    this.deparment = deparment;
    return this;
  }

   /**
   * Get deparment
   * @return deparment
  **/
 
  public Department getDeparment() {
    return deparment;
  }

  public void setDeparment(Department deparment) {
    this.deparment = deparment;
  }

  public EmployeeWorkPattern job(Job job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
 
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  public EmployeeWorkPattern shiftType(WorkPatternShiftType shiftType) {
    this.shiftType = shiftType;
    return this;
  }

   /**
   * Get shiftType
   * @return shiftType
  **/
 
  public WorkPatternShiftType getShiftType() {
    return shiftType;
  }

  public void setShiftType(WorkPatternShiftType shiftType) {
    this.shiftType = shiftType;
  }

  public EmployeeWorkPattern location(Location location) {
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

  public EmployeeWorkPattern orgLocationType(OrgLocationType orgLocationType) {
    this.orgLocationType = orgLocationType;
    return this;
  }

   /**
   * Get orgLocationType
   * @return orgLocationType
  **/
 
  public OrgLocationType getOrgLocationType() {
    return orgLocationType;
  }

  public void setOrgLocationType(OrgLocationType orgLocationType) {
    this.orgLocationType = orgLocationType;
  }

  public EmployeeWorkPattern lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EmployeeWorkPattern employeeWorkPattern = (EmployeeWorkPattern) o;
    return Objects.equals(this.netHours, employeeWorkPattern.netHours) &&
        Objects.equals(this.shiftTimeBegin, employeeWorkPattern.shiftTimeBegin) &&
        Objects.equals(this.shiftTimeEnd, employeeWorkPattern.shiftTimeEnd) &&
        Objects.equals(this.workPatternDayIndex, employeeWorkPattern.workPatternDayIndex) &&
        Objects.equals(this.deparment, employeeWorkPattern.deparment) &&
        Objects.equals(this.job, employeeWorkPattern.job) &&
        Objects.equals(this.shiftType, employeeWorkPattern.shiftType) &&
        Objects.equals(this.location, employeeWorkPattern.location) &&
        Objects.equals(this.orgLocationType, employeeWorkPattern.orgLocationType) &&
        Objects.equals(this.lastModifiedTimestamp, employeeWorkPattern.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netHours, shiftTimeBegin, shiftTimeEnd, workPatternDayIndex, deparment, job, shiftType, location, orgLocationType, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeWorkPattern {\n");
    
    sb.append("    netHours: ").append(toIndentedString(netHours)).append("\n");
    sb.append("    shiftTimeBegin: ").append(toIndentedString(shiftTimeBegin)).append("\n");
    sb.append("    shiftTimeEnd: ").append(toIndentedString(shiftTimeEnd)).append("\n");
    sb.append("    workPatternDayIndex: ").append(toIndentedString(workPatternDayIndex)).append("\n");
    sb.append("    deparment: ").append(toIndentedString(deparment)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    shiftType: ").append(toIndentedString(shiftType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    orgLocationType: ").append(toIndentedString(orgLocationType)).append("\n");
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

