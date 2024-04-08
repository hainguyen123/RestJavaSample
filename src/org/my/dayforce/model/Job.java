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
import org.my.dayforce.model.DFUnion;
import org.my.dayforce.model.EmployeeEEO;
import org.my.dayforce.model.FLSAStatus;
import org.my.dayforce.model.JobClassification;
import org.my.dayforce.model.JobFamily;
import org.my.dayforce.model.JobFunction;
import org.my.dayforce.model.PayGrade;

/**
 * Job
 */

public class Job {
  @SerializedName("EmployeeEEO")
  private EmployeeEEO employeeEEO = null;

  @SerializedName("IsUnionJob")
  private Boolean isUnionJob = null;

  @SerializedName("JobQualifications")
  private String jobQualifications = null;

  @SerializedName("JobRank")
  private Integer jobRank = null;

  @SerializedName("JobUDFString1")
  private String jobUDFString1 = null;

  @SerializedName("JobUDFString2")
  private String jobUDFString2 = null;

  @SerializedName("JobUDFString3")
  private String jobUDFString3 = null;

  @SerializedName("LedgerCode")
  private String ledgerCode = null;

  @SerializedName("NOC")
  private String NOC = null;

  @SerializedName("JobClassification")
  private JobClassification jobClassification = null;

  @SerializedName("JobFunction")
  private JobFunction jobFunction = null;

  @SerializedName("PayGrade")
  private PayGrade payGrade = null;

  @SerializedName("Union")
  private DFUnion union = null;

  @SerializedName("EffectiveEnd")
  private DateTime effectiveEnd = null;

  @SerializedName("EffectiveStart")
  private DateTime effectiveStart = null;

  @SerializedName("FLSAStatus")
  private FLSAStatus flSAStatus = null;

  @SerializedName("JobFamily")
  private JobFamily jobFamily = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("LongName")
  private String longName = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public Job employeeEEO(EmployeeEEO employeeEEO) {
    this.employeeEEO = employeeEEO;
    return this;
  }

   /**
   * Get employeeEEO
   * @return employeeEEO
  **/
 
  public EmployeeEEO getEmployeeEEO() {
    return employeeEEO;
  }

  public void setEmployeeEEO(EmployeeEEO employeeEEO) {
    this.employeeEEO = employeeEEO;
  }

  public Job isUnionJob(Boolean isUnionJob) {
    this.isUnionJob = isUnionJob;
    return this;
  }

   /**
   * Get isUnionJob
   * @return isUnionJob
  **/
 
  public Boolean getIsUnionJob() {
    return isUnionJob;
  }

  public void setIsUnionJob(Boolean isUnionJob) {
    this.isUnionJob = isUnionJob;
  }

  public Job jobQualifications(String jobQualifications) {
    this.jobQualifications = jobQualifications;
    return this;
  }

   /**
   * Get jobQualifications
   * @return jobQualifications
  **/
 
  public String getJobQualifications() {
    return jobQualifications;
  }

  public void setJobQualifications(String jobQualifications) {
    this.jobQualifications = jobQualifications;
  }

  public Job jobRank(Integer jobRank) {
    this.jobRank = jobRank;
    return this;
  }

   /**
   * Get jobRank
   * @return jobRank
  **/
 
  public Integer getJobRank() {
    return jobRank;
  }

  public void setJobRank(Integer jobRank) {
    this.jobRank = jobRank;
  }

  public Job jobUDFString1(String jobUDFString1) {
    this.jobUDFString1 = jobUDFString1;
    return this;
  }

   /**
   * Get jobUDFString1
   * @return jobUDFString1
  **/
 
  public String getJobUDFString1() {
    return jobUDFString1;
  }

  public void setJobUDFString1(String jobUDFString1) {
    this.jobUDFString1 = jobUDFString1;
  }

  public Job jobUDFString2(String jobUDFString2) {
    this.jobUDFString2 = jobUDFString2;
    return this;
  }

   /**
   * Get jobUDFString2
   * @return jobUDFString2
  **/
 
  public String getJobUDFString2() {
    return jobUDFString2;
  }

  public void setJobUDFString2(String jobUDFString2) {
    this.jobUDFString2 = jobUDFString2;
  }

  public Job jobUDFString3(String jobUDFString3) {
    this.jobUDFString3 = jobUDFString3;
    return this;
  }

   /**
   * Get jobUDFString3
   * @return jobUDFString3
  **/
 
  public String getJobUDFString3() {
    return jobUDFString3;
  }

  public void setJobUDFString3(String jobUDFString3) {
    this.jobUDFString3 = jobUDFString3;
  }

  public Job ledgerCode(String ledgerCode) {
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

  public Job NOC(String NOC) {
    this.NOC = NOC;
    return this;
  }

   /**
   * Get NOC
   * @return NOC
  **/
 
  public String getNOC() {
    return NOC;
  }

  public void setNOC(String NOC) {
    this.NOC = NOC;
  }

  public Job jobClassification(JobClassification jobClassification) {
    this.jobClassification = jobClassification;
    return this;
  }

   /**
   * Get jobClassification
   * @return jobClassification
  **/
 
  public JobClassification getJobClassification() {
    return jobClassification;
  }

  public void setJobClassification(JobClassification jobClassification) {
    this.jobClassification = jobClassification;
  }

  public Job jobFunction(JobFunction jobFunction) {
    this.jobFunction = jobFunction;
    return this;
  }

   /**
   * Get jobFunction
   * @return jobFunction
  **/
 
  public JobFunction getJobFunction() {
    return jobFunction;
  }

  public void setJobFunction(JobFunction jobFunction) {
    this.jobFunction = jobFunction;
  }

  public Job payGrade(PayGrade payGrade) {
    this.payGrade = payGrade;
    return this;
  }

   /**
   * Get payGrade
   * @return payGrade
  **/
 
  public PayGrade getPayGrade() {
    return payGrade;
  }

  public void setPayGrade(PayGrade payGrade) {
    this.payGrade = payGrade;
  }

  public Job union(DFUnion union) {
    this.union = union;
    return this;
  }

   /**
   * Get union
   * @return union
  **/
 
  public DFUnion getUnion() {
    return union;
  }

  public void setUnion(DFUnion union) {
    this.union = union;
  }

  public Job effectiveEnd(DateTime effectiveEnd) {
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

  public Job effectiveStart(DateTime effectiveStart) {
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

  public Job flSAStatus(FLSAStatus flSAStatus) {
    this.flSAStatus = flSAStatus;
    return this;
  }

   /**
   * Get flSAStatus
   * @return flSAStatus
  **/
 
  public FLSAStatus getFlSAStatus() {
    return flSAStatus;
  }

  public void setFlSAStatus(FLSAStatus flSAStatus) {
    this.flSAStatus = flSAStatus;
  }

  public Job jobFamily(JobFamily jobFamily) {
    this.jobFamily = jobFamily;
    return this;
  }

   /**
   * Get jobFamily
   * @return jobFamily
  **/
 
  public JobFamily getJobFamily() {
    return jobFamily;
  }

  public void setJobFamily(JobFamily jobFamily) {
    this.jobFamily = jobFamily;
  }

  public Job xrefCode(String xrefCode) {
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

  public Job shortName(String shortName) {
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

  public Job longName(String longName) {
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

  public Job lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    Job job = (Job) o;
    return Objects.equals(this.employeeEEO, job.employeeEEO) &&
        Objects.equals(this.isUnionJob, job.isUnionJob) &&
        Objects.equals(this.jobQualifications, job.jobQualifications) &&
        Objects.equals(this.jobRank, job.jobRank) &&
        Objects.equals(this.jobUDFString1, job.jobUDFString1) &&
        Objects.equals(this.jobUDFString2, job.jobUDFString2) &&
        Objects.equals(this.jobUDFString3, job.jobUDFString3) &&
        Objects.equals(this.ledgerCode, job.ledgerCode) &&
        Objects.equals(this.NOC, job.NOC) &&
        Objects.equals(this.jobClassification, job.jobClassification) &&
        Objects.equals(this.jobFunction, job.jobFunction) &&
        Objects.equals(this.payGrade, job.payGrade) &&
        Objects.equals(this.union, job.union) &&
        Objects.equals(this.effectiveEnd, job.effectiveEnd) &&
        Objects.equals(this.effectiveStart, job.effectiveStart) &&
        Objects.equals(this.flSAStatus, job.flSAStatus) &&
        Objects.equals(this.jobFamily, job.jobFamily) &&
        Objects.equals(this.xrefCode, job.xrefCode) &&
        Objects.equals(this.shortName, job.shortName) &&
        Objects.equals(this.longName, job.longName) &&
        Objects.equals(this.lastModifiedTimestamp, job.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeEEO, isUnionJob, jobQualifications, jobRank, jobUDFString1, jobUDFString2, jobUDFString3, ledgerCode, NOC, jobClassification, jobFunction, payGrade, union, effectiveEnd, effectiveStart, flSAStatus, jobFamily, xrefCode, shortName, longName, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    employeeEEO: ").append(toIndentedString(employeeEEO)).append("\n");
    sb.append("    isUnionJob: ").append(toIndentedString(isUnionJob)).append("\n");
    sb.append("    jobQualifications: ").append(toIndentedString(jobQualifications)).append("\n");
    sb.append("    jobRank: ").append(toIndentedString(jobRank)).append("\n");
    sb.append("    jobUDFString1: ").append(toIndentedString(jobUDFString1)).append("\n");
    sb.append("    jobUDFString2: ").append(toIndentedString(jobUDFString2)).append("\n");
    sb.append("    jobUDFString3: ").append(toIndentedString(jobUDFString3)).append("\n");
    sb.append("    ledgerCode: ").append(toIndentedString(ledgerCode)).append("\n");
    sb.append("    NOC: ").append(toIndentedString(NOC)).append("\n");
    sb.append("    jobClassification: ").append(toIndentedString(jobClassification)).append("\n");
    sb.append("    jobFunction: ").append(toIndentedString(jobFunction)).append("\n");
    sb.append("    payGrade: ").append(toIndentedString(payGrade)).append("\n");
    sb.append("    union: ").append(toIndentedString(union)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    flSAStatus: ").append(toIndentedString(flSAStatus)).append("\n");
    sb.append("    jobFamily: ").append(toIndentedString(jobFamily)).append("\n");
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
