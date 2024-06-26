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
import org.my.dayforce.model.LegalEntity;

/**
 * EmployeeCANEmploymentInsuranceRate
 */

public class EmployeeCANEmploymentInsuranceRate {
  @SerializedName("EffectiveStart")
  private DateTime effectiveStart = null;

  @SerializedName("EffectiveEnd")
  private DateTime effectiveEnd = null;

  @SerializedName("LegalEntity")
  private LegalEntity legalEntity = null;

  @SerializedName("RateGroup")
  private String rateGroup = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmployeeCANEmploymentInsuranceRate effectiveStart(DateTime effectiveStart) {
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

  public EmployeeCANEmploymentInsuranceRate effectiveEnd(DateTime effectiveEnd) {
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

  public EmployeeCANEmploymentInsuranceRate legalEntity(LegalEntity legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

   /**
   * Get legalEntity
   * @return legalEntity
  **/
 
  public LegalEntity getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(LegalEntity legalEntity) {
    this.legalEntity = legalEntity;
  }

  public EmployeeCANEmploymentInsuranceRate rateGroup(String rateGroup) {
    this.rateGroup = rateGroup;
    return this;
  }

   /**
   * Get rateGroup
   * @return rateGroup
  **/
 
  public String getRateGroup() {
    return rateGroup;
  }

  public void setRateGroup(String rateGroup) {
    this.rateGroup = rateGroup;
  }

  public EmployeeCANEmploymentInsuranceRate lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EmployeeCANEmploymentInsuranceRate employeeCANEmploymentInsuranceRate = (EmployeeCANEmploymentInsuranceRate) o;
    return Objects.equals(this.effectiveStart, employeeCANEmploymentInsuranceRate.effectiveStart) &&
        Objects.equals(this.effectiveEnd, employeeCANEmploymentInsuranceRate.effectiveEnd) &&
        Objects.equals(this.legalEntity, employeeCANEmploymentInsuranceRate.legalEntity) &&
        Objects.equals(this.rateGroup, employeeCANEmploymentInsuranceRate.rateGroup) &&
        Objects.equals(this.lastModifiedTimestamp, employeeCANEmploymentInsuranceRate.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveStart, effectiveEnd, legalEntity, rateGroup, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCANEmploymentInsuranceRate {\n");
    
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    rateGroup: ").append(toIndentedString(rateGroup)).append("\n");
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

