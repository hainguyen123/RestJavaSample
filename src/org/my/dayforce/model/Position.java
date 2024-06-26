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
import org.my.dayforce.model.EmploymentIndicator;
import org.my.dayforce.model.Job;
import org.my.dayforce.model.PayClass;
import org.my.dayforce.model.PayGroup;
import org.my.dayforce.model.PayType;
import org.my.dayforce.model.PositionAssignmentCollection;
import org.my.dayforce.model.PositionTerm;

/**
 * Position
 */

public class Position {
  @SerializedName("AverageDailyHours")
  private Double averageDailyHours = null;

  @SerializedName("ClockTransferCode")
  private String clockTransferCode = null;

  @SerializedName("Department")
  private Department department = null;

  @SerializedName("Job")
  private Job job = null;

  @SerializedName("EffectiveStart")
  private DateTime effectiveStart = null;

  @SerializedName("EffectiveEnd")
  private DateTime effectiveEnd = null;

  @SerializedName("EmploymentIndicator")
  private EmploymentIndicator employmentIndicator = null;

  @SerializedName("Executive")
  private Boolean executive = null;

  @SerializedName("FTE")
  private Double FTE = null;

  @SerializedName("IsNonService")
  private Boolean isNonService = null;

  @SerializedName("IsWCBExempt")
  private Boolean isWCBExempt = null;

  @SerializedName("LedgerCode")
  private String ledgerCode = null;

  @SerializedName("Officer")
  private Boolean officer = null;

  @SerializedName("PayClass")
  private PayClass payClass = null;

  @SerializedName("PayGroup")
  private PayGroup payGroup = null;

  @SerializedName("PayType")
  private PayType payType = null;

  @SerializedName("PositionTerm")
  private PositionTerm positionTerm = null;

  @SerializedName("PPACAFullTime")
  private Boolean ppACAFullTime = null;

  @SerializedName("SemiMonthlyBottomHours")
  private Double semiMonthlyBottomHours = null;

  @SerializedName("SemiMonthlyTopHours")
  private Double semiMonthlyTopHours = null;

  @SerializedName("StandardCostRate")
  private Double standardCostRate = null;

  @SerializedName("WeeklyHours")
  private Double weeklyHours = null;

  @SerializedName("DefaultTargetBonus")
  private Double defaultTargetBonus = null;

  @SerializedName("PositionAssignments")
  private PositionAssignmentCollection positionAssignments = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("LongName")
  private String longName = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public Position averageDailyHours(Double averageDailyHours) {
    this.averageDailyHours = averageDailyHours;
    return this;
  }

   /**
   * Get averageDailyHours
   * @return averageDailyHours
  **/
 
  public Double getAverageDailyHours() {
    return averageDailyHours;
  }

  public void setAverageDailyHours(Double averageDailyHours) {
    this.averageDailyHours = averageDailyHours;
  }

  public Position clockTransferCode(String clockTransferCode) {
    this.clockTransferCode = clockTransferCode;
    return this;
  }

   /**
   * Get clockTransferCode
   * @return clockTransferCode
  **/
 
  public String getClockTransferCode() {
    return clockTransferCode;
  }

  public void setClockTransferCode(String clockTransferCode) {
    this.clockTransferCode = clockTransferCode;
  }

  public Position department(Department department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
 
  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Position job(Job job) {
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

  public Position effectiveStart(DateTime effectiveStart) {
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

  public Position effectiveEnd(DateTime effectiveEnd) {
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

  public Position employmentIndicator(EmploymentIndicator employmentIndicator) {
    this.employmentIndicator = employmentIndicator;
    return this;
  }

   /**
   * Get employmentIndicator
   * @return employmentIndicator
  **/
 
  public EmploymentIndicator getEmploymentIndicator() {
    return employmentIndicator;
  }

  public void setEmploymentIndicator(EmploymentIndicator employmentIndicator) {
    this.employmentIndicator = employmentIndicator;
  }

  public Position executive(Boolean executive) {
    this.executive = executive;
    return this;
  }

   /**
   * Get executive
   * @return executive
  **/
 
  public Boolean getExecutive() {
    return executive;
  }

  public void setExecutive(Boolean executive) {
    this.executive = executive;
  }

  public Position FTE(Double FTE) {
    this.FTE = FTE;
    return this;
  }

   /**
   * Get FTE
   * @return FTE
  **/
 
  public Double getFTE() {
    return FTE;
  }

  public void setFTE(Double FTE) {
    this.FTE = FTE;
  }

  public Position isNonService(Boolean isNonService) {
    this.isNonService = isNonService;
    return this;
  }

   /**
   * Get isNonService
   * @return isNonService
  **/
 
  public Boolean getIsNonService() {
    return isNonService;
  }

  public void setIsNonService(Boolean isNonService) {
    this.isNonService = isNonService;
  }

  public Position isWCBExempt(Boolean isWCBExempt) {
    this.isWCBExempt = isWCBExempt;
    return this;
  }

   /**
   * Get isWCBExempt
   * @return isWCBExempt
  **/
 
  public Boolean getIsWCBExempt() {
    return isWCBExempt;
  }

  public void setIsWCBExempt(Boolean isWCBExempt) {
    this.isWCBExempt = isWCBExempt;
  }

  public Position ledgerCode(String ledgerCode) {
    this.ledgerCode = ledgerCode;
    return this;
  }

   /**
   * Get ledgerCode
   * @return ledgerCode
  **/
 
  public String getLedgerCode() {
    return ledgerCode;
  }

  public void setLedgerCode(String ledgerCode) {
    this.ledgerCode = ledgerCode;
  }

  public Position officer(Boolean officer) {
    this.officer = officer;
    return this;
  }

   /**
   * Get officer
   * @return officer
  **/
 
  public Boolean getOfficer() {
    return officer;
  }

  public void setOfficer(Boolean officer) {
    this.officer = officer;
  }

  public Position payClass(PayClass payClass) {
    this.payClass = payClass;
    return this;
  }

   /**
   * Get payClass
   * @return payClass
  **/
 
  public PayClass getPayClass() {
    return payClass;
  }

  public void setPayClass(PayClass payClass) {
    this.payClass = payClass;
  }

  public Position payGroup(PayGroup payGroup) {
    this.payGroup = payGroup;
    return this;
  }

   /**
   * Get payGroup
   * @return payGroup
  **/
 
  public PayGroup getPayGroup() {
    return payGroup;
  }

  public void setPayGroup(PayGroup payGroup) {
    this.payGroup = payGroup;
  }

  public Position payType(PayType payType) {
    this.payType = payType;
    return this;
  }

   /**
   * Get payType
   * @return payType
  **/
 
  public PayType getPayType() {
    return payType;
  }

  public void setPayType(PayType payType) {
    this.payType = payType;
  }

  public Position positionTerm(PositionTerm positionTerm) {
    this.positionTerm = positionTerm;
    return this;
  }

   /**
   * Get positionTerm
   * @return positionTerm
  **/
 
  public PositionTerm getPositionTerm() {
    return positionTerm;
  }

  public void setPositionTerm(PositionTerm positionTerm) {
    this.positionTerm = positionTerm;
  }

  public Position ppACAFullTime(Boolean ppACAFullTime) {
    this.ppACAFullTime = ppACAFullTime;
    return this;
  }

   /**
   * Get ppACAFullTime
   * @return ppACAFullTime
  **/
 
  public Boolean getPpACAFullTime() {
    return ppACAFullTime;
  }

  public void setPpACAFullTime(Boolean ppACAFullTime) {
    this.ppACAFullTime = ppACAFullTime;
  }

  public Position semiMonthlyBottomHours(Double semiMonthlyBottomHours) {
    this.semiMonthlyBottomHours = semiMonthlyBottomHours;
    return this;
  }

   /**
   * Get semiMonthlyBottomHours
   * @return semiMonthlyBottomHours
  **/
 
  public Double getSemiMonthlyBottomHours() {
    return semiMonthlyBottomHours;
  }

  public void setSemiMonthlyBottomHours(Double semiMonthlyBottomHours) {
    this.semiMonthlyBottomHours = semiMonthlyBottomHours;
  }

  public Position semiMonthlyTopHours(Double semiMonthlyTopHours) {
    this.semiMonthlyTopHours = semiMonthlyTopHours;
    return this;
  }

   /**
   * Get semiMonthlyTopHours
   * @return semiMonthlyTopHours
  **/
 
  public Double getSemiMonthlyTopHours() {
    return semiMonthlyTopHours;
  }

  public void setSemiMonthlyTopHours(Double semiMonthlyTopHours) {
    this.semiMonthlyTopHours = semiMonthlyTopHours;
  }

  public Position standardCostRate(Double standardCostRate) {
    this.standardCostRate = standardCostRate;
    return this;
  }

   /**
   * Get standardCostRate
   * @return standardCostRate
  **/
 
  public Double getStandardCostRate() {
    return standardCostRate;
  }

  public void setStandardCostRate(Double standardCostRate) {
    this.standardCostRate = standardCostRate;
  }

  public Position weeklyHours(Double weeklyHours) {
    this.weeklyHours = weeklyHours;
    return this;
  }

   /**
   * Get weeklyHours
   * @return weeklyHours
  **/
 
  public Double getWeeklyHours() {
    return weeklyHours;
  }

  public void setWeeklyHours(Double weeklyHours) {
    this.weeklyHours = weeklyHours;
  }

  public Position defaultTargetBonus(Double defaultTargetBonus) {
    this.defaultTargetBonus = defaultTargetBonus;
    return this;
  }

   /**
   * Get defaultTargetBonus
   * @return defaultTargetBonus
  **/
 
  public Double getDefaultTargetBonus() {
    return defaultTargetBonus;
  }

  public void setDefaultTargetBonus(Double defaultTargetBonus) {
    this.defaultTargetBonus = defaultTargetBonus;
  }

  public Position positionAssignments(PositionAssignmentCollection positionAssignments) {
    this.positionAssignments = positionAssignments;
    return this;
  }

   /**
   * Get positionAssignments
   * @return positionAssignments
  **/
 
  public PositionAssignmentCollection getPositionAssignments() {
    return positionAssignments;
  }

  public void setPositionAssignments(PositionAssignmentCollection positionAssignments) {
    this.positionAssignments = positionAssignments;
  }

  public Position xrefCode(String xrefCode) {
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

  public Position shortName(String shortName) {
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

  public Position longName(String longName) {
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

  public Position lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    Position position = (Position) o;
    return Objects.equals(this.averageDailyHours, position.averageDailyHours) &&
        Objects.equals(this.clockTransferCode, position.clockTransferCode) &&
        Objects.equals(this.department, position.department) &&
        Objects.equals(this.job, position.job) &&
        Objects.equals(this.effectiveStart, position.effectiveStart) &&
        Objects.equals(this.effectiveEnd, position.effectiveEnd) &&
        Objects.equals(this.employmentIndicator, position.employmentIndicator) &&
        Objects.equals(this.executive, position.executive) &&
        Objects.equals(this.FTE, position.FTE) &&
        Objects.equals(this.isNonService, position.isNonService) &&
        Objects.equals(this.isWCBExempt, position.isWCBExempt) &&
        Objects.equals(this.ledgerCode, position.ledgerCode) &&
        Objects.equals(this.officer, position.officer) &&
        Objects.equals(this.payClass, position.payClass) &&
        Objects.equals(this.payGroup, position.payGroup) &&
        Objects.equals(this.payType, position.payType) &&
        Objects.equals(this.positionTerm, position.positionTerm) &&
        Objects.equals(this.ppACAFullTime, position.ppACAFullTime) &&
        Objects.equals(this.semiMonthlyBottomHours, position.semiMonthlyBottomHours) &&
        Objects.equals(this.semiMonthlyTopHours, position.semiMonthlyTopHours) &&
        Objects.equals(this.standardCostRate, position.standardCostRate) &&
        Objects.equals(this.weeklyHours, position.weeklyHours) &&
        Objects.equals(this.defaultTargetBonus, position.defaultTargetBonus) &&
        Objects.equals(this.positionAssignments, position.positionAssignments) &&
        Objects.equals(this.xrefCode, position.xrefCode) &&
        Objects.equals(this.shortName, position.shortName) &&
        Objects.equals(this.longName, position.longName) &&
        Objects.equals(this.lastModifiedTimestamp, position.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageDailyHours, clockTransferCode, department, job, effectiveStart, effectiveEnd, employmentIndicator, executive, FTE, isNonService, isWCBExempt, ledgerCode, officer, payClass, payGroup, payType, positionTerm, ppACAFullTime, semiMonthlyBottomHours, semiMonthlyTopHours, standardCostRate, weeklyHours, defaultTargetBonus, positionAssignments, xrefCode, shortName, longName, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    averageDailyHours: ").append(toIndentedString(averageDailyHours)).append("\n");
    sb.append("    clockTransferCode: ").append(toIndentedString(clockTransferCode)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
    sb.append("    employmentIndicator: ").append(toIndentedString(employmentIndicator)).append("\n");
    sb.append("    executive: ").append(toIndentedString(executive)).append("\n");
    sb.append("    FTE: ").append(toIndentedString(FTE)).append("\n");
    sb.append("    isNonService: ").append(toIndentedString(isNonService)).append("\n");
    sb.append("    isWCBExempt: ").append(toIndentedString(isWCBExempt)).append("\n");
    sb.append("    ledgerCode: ").append(toIndentedString(ledgerCode)).append("\n");
    sb.append("    officer: ").append(toIndentedString(officer)).append("\n");
    sb.append("    payClass: ").append(toIndentedString(payClass)).append("\n");
    sb.append("    payGroup: ").append(toIndentedString(payGroup)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    positionTerm: ").append(toIndentedString(positionTerm)).append("\n");
    sb.append("    ppACAFullTime: ").append(toIndentedString(ppACAFullTime)).append("\n");
    sb.append("    semiMonthlyBottomHours: ").append(toIndentedString(semiMonthlyBottomHours)).append("\n");
    sb.append("    semiMonthlyTopHours: ").append(toIndentedString(semiMonthlyTopHours)).append("\n");
    sb.append("    standardCostRate: ").append(toIndentedString(standardCostRate)).append("\n");
    sb.append("    weeklyHours: ").append(toIndentedString(weeklyHours)).append("\n");
    sb.append("    defaultTargetBonus: ").append(toIndentedString(defaultTargetBonus)).append("\n");
    sb.append("    positionAssignments: ").append(toIndentedString(positionAssignments)).append("\n");
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

