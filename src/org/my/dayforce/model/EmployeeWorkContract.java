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
import org.my.dayforce.model.EmployeeWorkPatternCollection;
import org.my.dayforce.model.WorkContract;

/**
 * EmployeeWorkContract
 */

public class EmployeeWorkContract {
  @SerializedName("AverageNumOfDays")
  private Double averageNumOfDays = null;

  @SerializedName("BaseHours")
  private Double baseHours = null;

  @SerializedName("BaseComplementaryHours")
  private Double baseComplementaryHours = null;

  @SerializedName("ContractWorkPercent")
  private Double contractWorkPercent = null;

  @SerializedName("CreateShiftOnHolidays")
  private Boolean createShiftOnHolidays = null;

  @SerializedName("EndDate")
  private DateTime endDate = null;

  @SerializedName("FullTimeHours")
  private Double fullTimeHours = null;

  @SerializedName("StartDate")
  private DateTime startDate = null;

  @SerializedName("WorkContract")
  private WorkContract workContract = null;

  @SerializedName("WorkPatternLengthDays")
  private Integer workPatternLengthDays = null;

  @SerializedName("WorkPatterns")
  private EmployeeWorkPatternCollection workPatterns = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmployeeWorkContract averageNumOfDays(Double averageNumOfDays) {
    this.averageNumOfDays = averageNumOfDays;
    return this;
  }

   /**
   * Get averageNumOfDays
   * @return averageNumOfDays
  **/
 
  public Double getAverageNumOfDays() {
    return averageNumOfDays;
  }

  public void setAverageNumOfDays(Double averageNumOfDays) {
    this.averageNumOfDays = averageNumOfDays;
  }

  public EmployeeWorkContract baseHours(Double baseHours) {
    this.baseHours = baseHours;
    return this;
  }

   /**
   * Get baseHours
   * @return baseHours
  **/
 
  public Double getBaseHours() {
    return baseHours;
  }

  public void setBaseHours(Double baseHours) {
    this.baseHours = baseHours;
  }

  public EmployeeWorkContract baseComplementaryHours(Double baseComplementaryHours) {
    this.baseComplementaryHours = baseComplementaryHours;
    return this;
  }

   /**
   * Get baseComplementaryHours
   * @return baseComplementaryHours
  **/
 
  public Double getBaseComplementaryHours() {
    return baseComplementaryHours;
  }

  public void setBaseComplementaryHours(Double baseComplementaryHours) {
    this.baseComplementaryHours = baseComplementaryHours;
  }

  public EmployeeWorkContract contractWorkPercent(Double contractWorkPercent) {
    this.contractWorkPercent = contractWorkPercent;
    return this;
  }

   /**
   * Get contractWorkPercent
   * @return contractWorkPercent
  **/
 
  public Double getContractWorkPercent() {
    return contractWorkPercent;
  }

  public void setContractWorkPercent(Double contractWorkPercent) {
    this.contractWorkPercent = contractWorkPercent;
  }

  public EmployeeWorkContract createShiftOnHolidays(Boolean createShiftOnHolidays) {
    this.createShiftOnHolidays = createShiftOnHolidays;
    return this;
  }

   /**
   * Get createShiftOnHolidays
   * @return createShiftOnHolidays
  **/
 
  public Boolean getCreateShiftOnHolidays() {
    return createShiftOnHolidays;
  }

  public void setCreateShiftOnHolidays(Boolean createShiftOnHolidays) {
    this.createShiftOnHolidays = createShiftOnHolidays;
  }

  public EmployeeWorkContract endDate(DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
 
  public DateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(DateTime endDate) {
    this.endDate = endDate;
  }

  public EmployeeWorkContract fullTimeHours(Double fullTimeHours) {
    this.fullTimeHours = fullTimeHours;
    return this;
  }

   /**
   * Get fullTimeHours
   * @return fullTimeHours
  **/
 
  public Double getFullTimeHours() {
    return fullTimeHours;
  }

  public void setFullTimeHours(Double fullTimeHours) {
    this.fullTimeHours = fullTimeHours;
  }

  public EmployeeWorkContract startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
 
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public EmployeeWorkContract workContract(WorkContract workContract) {
    this.workContract = workContract;
    return this;
  }

   /**
   * Get workContract
   * @return workContract
  **/
 
  public WorkContract getWorkContract() {
    return workContract;
  }

  public void setWorkContract(WorkContract workContract) {
    this.workContract = workContract;
  }

  public EmployeeWorkContract workPatternLengthDays(Integer workPatternLengthDays) {
    this.workPatternLengthDays = workPatternLengthDays;
    return this;
  }

   /**
   * Get workPatternLengthDays
   * @return workPatternLengthDays
  **/
 
  public Integer getWorkPatternLengthDays() {
    return workPatternLengthDays;
  }

  public void setWorkPatternLengthDays(Integer workPatternLengthDays) {
    this.workPatternLengthDays = workPatternLengthDays;
  }

  public EmployeeWorkContract workPatterns(EmployeeWorkPatternCollection workPatterns) {
    this.workPatterns = workPatterns;
    return this;
  }

   /**
   * Get workPatterns
   * @return workPatterns
  **/
 
  public EmployeeWorkPatternCollection getWorkPatterns() {
    return workPatterns;
  }

  public void setWorkPatterns(EmployeeWorkPatternCollection workPatterns) {
    this.workPatterns = workPatterns;
  }

  public EmployeeWorkContract lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EmployeeWorkContract employeeWorkContract = (EmployeeWorkContract) o;
    return Objects.equals(this.averageNumOfDays, employeeWorkContract.averageNumOfDays) &&
        Objects.equals(this.baseHours, employeeWorkContract.baseHours) &&
        Objects.equals(this.baseComplementaryHours, employeeWorkContract.baseComplementaryHours) &&
        Objects.equals(this.contractWorkPercent, employeeWorkContract.contractWorkPercent) &&
        Objects.equals(this.createShiftOnHolidays, employeeWorkContract.createShiftOnHolidays) &&
        Objects.equals(this.endDate, employeeWorkContract.endDate) &&
        Objects.equals(this.fullTimeHours, employeeWorkContract.fullTimeHours) &&
        Objects.equals(this.startDate, employeeWorkContract.startDate) &&
        Objects.equals(this.workContract, employeeWorkContract.workContract) &&
        Objects.equals(this.workPatternLengthDays, employeeWorkContract.workPatternLengthDays) &&
        Objects.equals(this.workPatterns, employeeWorkContract.workPatterns) &&
        Objects.equals(this.lastModifiedTimestamp, employeeWorkContract.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageNumOfDays, baseHours, baseComplementaryHours, contractWorkPercent, createShiftOnHolidays, endDate, fullTimeHours, startDate, workContract, workPatternLengthDays, workPatterns, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeWorkContract {\n");
    
    sb.append("    averageNumOfDays: ").append(toIndentedString(averageNumOfDays)).append("\n");
    sb.append("    baseHours: ").append(toIndentedString(baseHours)).append("\n");
    sb.append("    baseComplementaryHours: ").append(toIndentedString(baseComplementaryHours)).append("\n");
    sb.append("    contractWorkPercent: ").append(toIndentedString(contractWorkPercent)).append("\n");
    sb.append("    createShiftOnHolidays: ").append(toIndentedString(createShiftOnHolidays)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fullTimeHours: ").append(toIndentedString(fullTimeHours)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    workContract: ").append(toIndentedString(workContract)).append("\n");
    sb.append("    workPatternLengthDays: ").append(toIndentedString(workPatternLengthDays)).append("\n");
    sb.append("    workPatterns: ").append(toIndentedString(workPatterns)).append("\n");
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
