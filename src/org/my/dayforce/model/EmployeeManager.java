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
 * EmployeeManager
 */

public class EmployeeManager {
  @SerializedName("EffectiveStart")
  private DateTime effectiveStart = null;

  @SerializedName("EffectiveEnd")
  private DateTime effectiveEnd = null;

  @SerializedName("ManagerXRefCode")
  private String managerXRefCode = null;

  @SerializedName("ManagerFirstName")
  private String managerFirstName = null;

  @SerializedName("ManagerMiddleName")
  private String managerMiddleName = null;

  @SerializedName("ManagerLastName")
  private String managerLastName = null;

  @SerializedName("DerivationMethod")
  private Integer derivationMethod = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmployeeManager effectiveStart(DateTime effectiveStart) {
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

  public EmployeeManager effectiveEnd(DateTime effectiveEnd) {
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

  public EmployeeManager managerXRefCode(String managerXRefCode) {
    this.managerXRefCode = managerXRefCode;
    return this;
  }

   /**
   * Get managerXRefCode
   * @return managerXRefCode
  **/
 
  public String getManagerXRefCode() {
    return managerXRefCode;
  }

  public void setManagerXRefCode(String managerXRefCode) {
    this.managerXRefCode = managerXRefCode;
  }

  public EmployeeManager managerFirstName(String managerFirstName) {
    this.managerFirstName = managerFirstName;
    return this;
  }

   /**
   * Get managerFirstName
   * @return managerFirstName
  **/
 
  public String getManagerFirstName() {
    return managerFirstName;
  }

  public void setManagerFirstName(String managerFirstName) {
    this.managerFirstName = managerFirstName;
  }

  public EmployeeManager managerMiddleName(String managerMiddleName) {
    this.managerMiddleName = managerMiddleName;
    return this;
  }

   /**
   * Get managerMiddleName
   * @return managerMiddleName
  **/
 
  public String getManagerMiddleName() {
    return managerMiddleName;
  }

  public void setManagerMiddleName(String managerMiddleName) {
    this.managerMiddleName = managerMiddleName;
  }

  public EmployeeManager managerLastName(String managerLastName) {
    this.managerLastName = managerLastName;
    return this;
  }

   /**
   * Get managerLastName
   * @return managerLastName
  **/
 
  public String getManagerLastName() {
    return managerLastName;
  }

  public void setManagerLastName(String managerLastName) {
    this.managerLastName = managerLastName;
  }

  public EmployeeManager derivationMethod(Integer derivationMethod) {
    this.derivationMethod = derivationMethod;
    return this;
  }

   /**
   * Get derivationMethod
   * @return derivationMethod
  **/
 
  public Integer getDerivationMethod() {
    return derivationMethod;
  }

  public void setDerivationMethod(Integer derivationMethod) {
    this.derivationMethod = derivationMethod;
  }

  public EmployeeManager lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EmployeeManager employeeManager = (EmployeeManager) o;
    return Objects.equals(this.effectiveStart, employeeManager.effectiveStart) &&
        Objects.equals(this.effectiveEnd, employeeManager.effectiveEnd) &&
        Objects.equals(this.managerXRefCode, employeeManager.managerXRefCode) &&
        Objects.equals(this.managerFirstName, employeeManager.managerFirstName) &&
        Objects.equals(this.managerMiddleName, employeeManager.managerMiddleName) &&
        Objects.equals(this.managerLastName, employeeManager.managerLastName) &&
        Objects.equals(this.derivationMethod, employeeManager.derivationMethod) &&
        Objects.equals(this.lastModifiedTimestamp, employeeManager.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveStart, effectiveEnd, managerXRefCode, managerFirstName, managerMiddleName, managerLastName, derivationMethod, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeManager {\n");
    
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
    sb.append("    managerXRefCode: ").append(toIndentedString(managerXRefCode)).append("\n");
    sb.append("    managerFirstName: ").append(toIndentedString(managerFirstName)).append("\n");
    sb.append("    managerMiddleName: ").append(toIndentedString(managerMiddleName)).append("\n");
    sb.append("    managerLastName: ").append(toIndentedString(managerLastName)).append("\n");
    sb.append("    derivationMethod: ").append(toIndentedString(derivationMethod)).append("\n");
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

