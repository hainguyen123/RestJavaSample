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


import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.my.dayforce.model.LaborMetrics;
import org.my.dayforce.model.MealBreaks;
import org.my.dayforce.model.Transfers;

/**
 * EmployeePunch
 */

public class EmployeePunch {
  @SerializedName("PunchXRefCode")
  private String punchXRefCode = null;

  @SerializedName("EmployeeXRefCode")
  private String employeeXRefCode = null;

  @SerializedName("PunchStatus")
  private String punchStatus = null;

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

  @SerializedName("LocationXRefCode")
  private String locationXRefCode = null;

  @SerializedName("PositionXRefCode")
  private String positionXRefCode = null;

  @SerializedName("DepartmentXRefCode")
  private String departmentXRefCode = null;

  @SerializedName("JobXRefCode")
  private String jobXRefCode = null;

  @SerializedName("DocketXRefCode")
  private String docketXRefCode = null;

  @SerializedName("DocketQuantity")
  private Double docketQuantity = null;

  @SerializedName("ProjectXRefCode")
  private String projectXRefCode = null;

  @SerializedName("PayAdjustmentXRefCode")
  private String payAdjustmentXRefCode = null;

  @SerializedName("StartExceptionCode")
  private String startExceptionCode = null;

  @SerializedName("EndExceptionCode")
  private String endExceptionCode = null;

  @SerializedName("EmployeeComment")
  private String employeeComment = null;

  @SerializedName("ManagerComment")
  private String managerComment = null;

  @SerializedName("BusinessDate")
  private DateTime businessDate = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  @SerializedName("IsOnCall")
  private Boolean isOnCall = null;

  @SerializedName("FuturePunch")
  private Boolean futurePunch = null;

  @SerializedName("AssumedTimeStart")
  private DateTime assumedTimeStart = null;

  @SerializedName("AssumedTimeEnd")
  private DateTime assumedTimeEnd = null;

  @SerializedName("LastModifiedTimestampUtc")
  private DateTime lastModifiedTimestampUtc = null;

  @SerializedName("MealBreaks")
  private List<MealBreaks> mealBreaks = new ArrayList<MealBreaks>();

  @SerializedName("Transfers")
  private List<Transfers> transfers = new ArrayList<Transfers>();

  @SerializedName("LaborMetrics")
  private List<LaborMetrics> laborMetrics = new ArrayList<LaborMetrics>();

  public EmployeePunch punchXRefCode(String punchXRefCode) {
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

  public EmployeePunch employeeXRefCode(String employeeXRefCode) {
    this.employeeXRefCode = employeeXRefCode;
    return this;
  }

   /**
   * Get employeeXRefCode
   * @return employeeXRefCode
  **/
 
  public String getEmployeeXRefCode() {
    return employeeXRefCode;
  }

  public void setEmployeeXRefCode(String employeeXRefCode) {
    this.employeeXRefCode = employeeXRefCode;
  }

  public EmployeePunch punchStatus(String punchStatus) {
    this.punchStatus = punchStatus;
    return this;
  }

   /**
   * Get punchStatus
   * @return punchStatus
  **/
 
  public String getPunchStatus() {
    return punchStatus;
  }

  public void setPunchStatus(String punchStatus) {
    this.punchStatus = punchStatus;
  }

  public EmployeePunch timeStart(DateTime timeStart) {
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

  public EmployeePunch timeEnd(DateTime timeEnd) {
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

  public EmployeePunch timeStartRaw(DateTime timeStartRaw) {
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

  public EmployeePunch timeEndRaw(DateTime timeEndRaw) {
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

  public EmployeePunch netHours(Double netHours) {
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

  public EmployeePunch locationXRefCode(String locationXRefCode) {
    this.locationXRefCode = locationXRefCode;
    return this;
  }

   /**
   * Get locationXRefCode
   * @return locationXRefCode
  **/
 
  public String getLocationXRefCode() {
    return locationXRefCode;
  }

  public void setLocationXRefCode(String locationXRefCode) {
    this.locationXRefCode = locationXRefCode;
  }

  public EmployeePunch positionXRefCode(String positionXRefCode) {
    this.positionXRefCode = positionXRefCode;
    return this;
  }

   /**
   * Get positionXRefCode
   * @return positionXRefCode
  **/
 
  public String getPositionXRefCode() {
    return positionXRefCode;
  }

  public void setPositionXRefCode(String positionXRefCode) {
    this.positionXRefCode = positionXRefCode;
  }

  public EmployeePunch departmentXRefCode(String departmentXRefCode) {
    this.departmentXRefCode = departmentXRefCode;
    return this;
  }

   /**
   * Get departmentXRefCode
   * @return departmentXRefCode
  **/
 
  public String getDepartmentXRefCode() {
    return departmentXRefCode;
  }

  public void setDepartmentXRefCode(String departmentXRefCode) {
    this.departmentXRefCode = departmentXRefCode;
  }

  public EmployeePunch jobXRefCode(String jobXRefCode) {
    this.jobXRefCode = jobXRefCode;
    return this;
  }

   /**
   * Get jobXRefCode
   * @return jobXRefCode
  **/
 
  public String getJobXRefCode() {
    return jobXRefCode;
  }

  public void setJobXRefCode(String jobXRefCode) {
    this.jobXRefCode = jobXRefCode;
  }

  public EmployeePunch docketXRefCode(String docketXRefCode) {
    this.docketXRefCode = docketXRefCode;
    return this;
  }

   /**
   * Get docketXRefCode
   * @return docketXRefCode
  **/
 
  public String getDocketXRefCode() {
    return docketXRefCode;
  }

  public void setDocketXRefCode(String docketXRefCode) {
    this.docketXRefCode = docketXRefCode;
  }

  public EmployeePunch docketQuantity(Double docketQuantity) {
    this.docketQuantity = docketQuantity;
    return this;
  }

   /**
   * Get docketQuantity
   * @return docketQuantity
  **/
 
  public Double getDocketQuantity() {
    return docketQuantity;
  }

  public void setDocketQuantity(Double docketQuantity) {
    this.docketQuantity = docketQuantity;
  }

  public EmployeePunch projectXRefCode(String projectXRefCode) {
    this.projectXRefCode = projectXRefCode;
    return this;
  }

   /**
   * Get projectXRefCode
   * @return projectXRefCode
  **/
 
  public String getProjectXRefCode() {
    return projectXRefCode;
  }

  public void setProjectXRefCode(String projectXRefCode) {
    this.projectXRefCode = projectXRefCode;
  }

  public EmployeePunch payAdjustmentXRefCode(String payAdjustmentXRefCode) {
    this.payAdjustmentXRefCode = payAdjustmentXRefCode;
    return this;
  }

   /**
   * Get payAdjustmentXRefCode
   * @return payAdjustmentXRefCode
  **/
 
  public String getPayAdjustmentXRefCode() {
    return payAdjustmentXRefCode;
  }

  public void setPayAdjustmentXRefCode(String payAdjustmentXRefCode) {
    this.payAdjustmentXRefCode = payAdjustmentXRefCode;
  }

  public EmployeePunch startExceptionCode(String startExceptionCode) {
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

  public EmployeePunch endExceptionCode(String endExceptionCode) {
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

  public EmployeePunch employeeComment(String employeeComment) {
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

  public EmployeePunch managerComment(String managerComment) {
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

  public EmployeePunch businessDate(DateTime businessDate) {
    this.businessDate = businessDate;
    return this;
  }

   /**
   * Get businessDate
   * @return businessDate
  **/
 
  public DateTime getBusinessDate() {
    return businessDate;
  }

  public void setBusinessDate(DateTime businessDate) {
    this.businessDate = businessDate;
  }

  public EmployeePunch isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
 
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public EmployeePunch isOnCall(Boolean isOnCall) {
    this.isOnCall = isOnCall;
    return this;
  }

   /**
   * Get isOnCall
   * @return isOnCall
  **/
 
  public Boolean getIsOnCall() {
    return isOnCall;
  }

  public void setIsOnCall(Boolean isOnCall) {
    this.isOnCall = isOnCall;
  }

  public EmployeePunch futurePunch(Boolean futurePunch) {
    this.futurePunch = futurePunch;
    return this;
  }

   /**
   * Get futurePunch
   * @return futurePunch
  **/
 
  public Boolean getFuturePunch() {
    return futurePunch;
  }

  public void setFuturePunch(Boolean futurePunch) {
    this.futurePunch = futurePunch;
  }

  public EmployeePunch assumedTimeStart(DateTime assumedTimeStart) {
    this.assumedTimeStart = assumedTimeStart;
    return this;
  }

   /**
   * Get assumedTimeStart
   * @return assumedTimeStart
  **/
 
  public DateTime getAssumedTimeStart() {
    return assumedTimeStart;
  }

  public void setAssumedTimeStart(DateTime assumedTimeStart) {
    this.assumedTimeStart = assumedTimeStart;
  }

  public EmployeePunch assumedTimeEnd(DateTime assumedTimeEnd) {
    this.assumedTimeEnd = assumedTimeEnd;
    return this;
  }

   /**
   * Get assumedTimeEnd
   * @return assumedTimeEnd
  **/
 
  public DateTime getAssumedTimeEnd() {
    return assumedTimeEnd;
  }

  public void setAssumedTimeEnd(DateTime assumedTimeEnd) {
    this.assumedTimeEnd = assumedTimeEnd;
  }

  public EmployeePunch lastModifiedTimestampUtc(DateTime lastModifiedTimestampUtc) {
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

  public EmployeePunch mealBreaks(List<MealBreaks> mealBreaks) {
    this.mealBreaks = mealBreaks;
    return this;
  }

  public EmployeePunch addMealBreaksItem(MealBreaks mealBreaksItem) {
    this.mealBreaks.add(mealBreaksItem);
    return this;
  }

   /**
   * Get mealBreaks
   * @return mealBreaks
  **/
 
  public List<MealBreaks> getMealBreaks() {
    return mealBreaks;
  }

  public void setMealBreaks(List<MealBreaks> mealBreaks) {
    this.mealBreaks = mealBreaks;
  }

  public EmployeePunch transfers(List<Transfers> transfers) {
    this.transfers = transfers;
    return this;
  }

  public EmployeePunch addTransfersItem(Transfers transfersItem) {
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
 
  public List<Transfers> getTransfers() {
    return transfers;
  }

  public void setTransfers(List<Transfers> transfers) {
    this.transfers = transfers;
  }

  public EmployeePunch laborMetrics(List<LaborMetrics> laborMetrics) {
    this.laborMetrics = laborMetrics;
    return this;
  }

  public EmployeePunch addLaborMetricsItem(LaborMetrics laborMetricsItem) {
    this.laborMetrics.add(laborMetricsItem);
    return this;
  }

   /**
   * Get laborMetrics
   * @return laborMetrics
  **/
 
  public List<LaborMetrics> getLaborMetrics() {
    return laborMetrics;
  }

  public void setLaborMetrics(List<LaborMetrics> laborMetrics) {
    this.laborMetrics = laborMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePunch employeePunch = (EmployeePunch) o;
    return Objects.equals(this.punchXRefCode, employeePunch.punchXRefCode) &&
        Objects.equals(this.employeeXRefCode, employeePunch.employeeXRefCode) &&
        Objects.equals(this.punchStatus, employeePunch.punchStatus) &&
        Objects.equals(this.timeStart, employeePunch.timeStart) &&
        Objects.equals(this.timeEnd, employeePunch.timeEnd) &&
        Objects.equals(this.timeStartRaw, employeePunch.timeStartRaw) &&
        Objects.equals(this.timeEndRaw, employeePunch.timeEndRaw) &&
        Objects.equals(this.netHours, employeePunch.netHours) &&
        Objects.equals(this.locationXRefCode, employeePunch.locationXRefCode) &&
        Objects.equals(this.positionXRefCode, employeePunch.positionXRefCode) &&
        Objects.equals(this.departmentXRefCode, employeePunch.departmentXRefCode) &&
        Objects.equals(this.jobXRefCode, employeePunch.jobXRefCode) &&
        Objects.equals(this.docketXRefCode, employeePunch.docketXRefCode) &&
        Objects.equals(this.docketQuantity, employeePunch.docketQuantity) &&
        Objects.equals(this.projectXRefCode, employeePunch.projectXRefCode) &&
        Objects.equals(this.payAdjustmentXRefCode, employeePunch.payAdjustmentXRefCode) &&
        Objects.equals(this.startExceptionCode, employeePunch.startExceptionCode) &&
        Objects.equals(this.endExceptionCode, employeePunch.endExceptionCode) &&
        Objects.equals(this.employeeComment, employeePunch.employeeComment) &&
        Objects.equals(this.managerComment, employeePunch.managerComment) &&
        Objects.equals(this.businessDate, employeePunch.businessDate) &&
        Objects.equals(this.isDeleted, employeePunch.isDeleted) &&
        Objects.equals(this.isOnCall, employeePunch.isOnCall) &&
        Objects.equals(this.futurePunch, employeePunch.futurePunch) &&
        Objects.equals(this.assumedTimeStart, employeePunch.assumedTimeStart) &&
        Objects.equals(this.assumedTimeEnd, employeePunch.assumedTimeEnd) &&
        Objects.equals(this.lastModifiedTimestampUtc, employeePunch.lastModifiedTimestampUtc) &&
        Objects.equals(this.mealBreaks, employeePunch.mealBreaks) &&
        Objects.equals(this.transfers, employeePunch.transfers) &&
        Objects.equals(this.laborMetrics, employeePunch.laborMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(punchXRefCode, employeeXRefCode, punchStatus, timeStart, timeEnd, timeStartRaw, timeEndRaw, netHours, locationXRefCode, positionXRefCode, departmentXRefCode, jobXRefCode, docketXRefCode, docketQuantity, projectXRefCode, payAdjustmentXRefCode, startExceptionCode, endExceptionCode, employeeComment, managerComment, businessDate, isDeleted, isOnCall, futurePunch, assumedTimeStart, assumedTimeEnd, lastModifiedTimestampUtc, mealBreaks, transfers, laborMetrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePunch {\n");
    
    sb.append("    punchXRefCode: ").append(toIndentedString(punchXRefCode)).append("\n");
    sb.append("    employeeXRefCode: ").append(toIndentedString(employeeXRefCode)).append("\n");
    sb.append("    punchStatus: ").append(toIndentedString(punchStatus)).append("\n");
    sb.append("    timeStart: ").append(toIndentedString(timeStart)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    timeStartRaw: ").append(toIndentedString(timeStartRaw)).append("\n");
    sb.append("    timeEndRaw: ").append(toIndentedString(timeEndRaw)).append("\n");
    sb.append("    netHours: ").append(toIndentedString(netHours)).append("\n");
    sb.append("    locationXRefCode: ").append(toIndentedString(locationXRefCode)).append("\n");
    sb.append("    positionXRefCode: ").append(toIndentedString(positionXRefCode)).append("\n");
    sb.append("    departmentXRefCode: ").append(toIndentedString(departmentXRefCode)).append("\n");
    sb.append("    jobXRefCode: ").append(toIndentedString(jobXRefCode)).append("\n");
    sb.append("    docketXRefCode: ").append(toIndentedString(docketXRefCode)).append("\n");
    sb.append("    docketQuantity: ").append(toIndentedString(docketQuantity)).append("\n");
    sb.append("    projectXRefCode: ").append(toIndentedString(projectXRefCode)).append("\n");
    sb.append("    payAdjustmentXRefCode: ").append(toIndentedString(payAdjustmentXRefCode)).append("\n");
    sb.append("    startExceptionCode: ").append(toIndentedString(startExceptionCode)).append("\n");
    sb.append("    endExceptionCode: ").append(toIndentedString(endExceptionCode)).append("\n");
    sb.append("    employeeComment: ").append(toIndentedString(employeeComment)).append("\n");
    sb.append("    managerComment: ").append(toIndentedString(managerComment)).append("\n");
    sb.append("    businessDate: ").append(toIndentedString(businessDate)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isOnCall: ").append(toIndentedString(isOnCall)).append("\n");
    sb.append("    futurePunch: ").append(toIndentedString(futurePunch)).append("\n");
    sb.append("    assumedTimeStart: ").append(toIndentedString(assumedTimeStart)).append("\n");
    sb.append("    assumedTimeEnd: ").append(toIndentedString(assumedTimeEnd)).append("\n");
    sb.append("    lastModifiedTimestampUtc: ").append(toIndentedString(lastModifiedTimestampUtc)).append("\n");
    sb.append("    mealBreaks: ").append(toIndentedString(mealBreaks)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
    sb.append("    laborMetrics: ").append(toIndentedString(laborMetrics)).append("\n");
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
