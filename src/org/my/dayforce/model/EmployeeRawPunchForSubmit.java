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
import org.my.dayforce.model.PunchLaborMetric;

/**
 * EmployeeRawPunchForSubmit
 */

public class EmployeeRawPunchForSubmit {
  @SerializedName("EmployeeBadge")
  private String employeeBadge = null;

  @SerializedName("RawPunchTime")
  private String rawPunchTime = null;

  @SerializedName("PunchType")
  private String punchType = null;

  @SerializedName("PunchDevice")
  private String punchDevice = null;

  @SerializedName("SupervisorBadge")
  private String supervisorBadge = null;

  @SerializedName("LocationXRefCode")
  private String locationXRefCode = null;

  @SerializedName("LocationClockTransferCode")
  private String locationClockTransferCode = null;

  @SerializedName("PositionXRefCode")
  private String positionXRefCode = null;

  @SerializedName("PositionClockTransferCode")
  private String positionClockTransferCode = null;

  @SerializedName("DocketXRefCode")
  private String docketXRefCode = null;

  @SerializedName("DocketClockTransferCode")
  private String docketClockTransferCode = null;

  @SerializedName("ProjectXRefCode")
  private String projectXRefCode = null;

  @SerializedName("ProjectClockTransferCode")
  private String projectClockTransferCode = null;

  @SerializedName("LaborMetrics")
  private List<PunchLaborMetric> laborMetrics = new ArrayList<PunchLaborMetric>();

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("MealWaiver")
  private String mealWaiver = null;

  @SerializedName("BreakAttestation")
  private Boolean breakAttestation = null;

  public EmployeeRawPunchForSubmit employeeBadge(String employeeBadge) {
    this.employeeBadge = employeeBadge;
    return this;
  }

   /**
   * Get employeeBadge
   * @return employeeBadge
  **/
 
  public String getEmployeeBadge() {
    return employeeBadge;
  }

  public void setEmployeeBadge(String employeeBadge) {
    this.employeeBadge = employeeBadge;
  }

  public EmployeeRawPunchForSubmit rawPunchTime(String rawPunchTime) {
    this.rawPunchTime = rawPunchTime;
    return this;
  }

   /**
   * Get rawPunchTime
   * @return rawPunchTime
  **/
 
  public String getRawPunchTime() {
    return rawPunchTime;
  }

  public void setRawPunchTime(String rawPunchTime) {
    this.rawPunchTime = rawPunchTime;
  }

  public EmployeeRawPunchForSubmit punchType(String punchType) {
    this.punchType = punchType;
    return this;
  }

   /**
   * Get punchType
   * @return punchType
  **/
 
  public String getPunchType() {
    return punchType;
  }

  public void setPunchType(String punchType) {
    this.punchType = punchType;
  }

  public EmployeeRawPunchForSubmit punchDevice(String punchDevice) {
    this.punchDevice = punchDevice;
    return this;
  }

   /**
   * Get punchDevice
   * @return punchDevice
  **/
 
  public String getPunchDevice() {
    return punchDevice;
  }

  public void setPunchDevice(String punchDevice) {
    this.punchDevice = punchDevice;
  }

  public EmployeeRawPunchForSubmit supervisorBadge(String supervisorBadge) {
    this.supervisorBadge = supervisorBadge;
    return this;
  }

   /**
   * Get supervisorBadge
   * @return supervisorBadge
  **/
 
  public String getSupervisorBadge() {
    return supervisorBadge;
  }

  public void setSupervisorBadge(String supervisorBadge) {
    this.supervisorBadge = supervisorBadge;
  }

  public EmployeeRawPunchForSubmit locationXRefCode(String locationXRefCode) {
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

  public EmployeeRawPunchForSubmit locationClockTransferCode(String locationClockTransferCode) {
    this.locationClockTransferCode = locationClockTransferCode;
    return this;
  }

   /**
   * Get locationClockTransferCode
   * @return locationClockTransferCode
  **/
 
  public String getLocationClockTransferCode() {
    return locationClockTransferCode;
  }

  public void setLocationClockTransferCode(String locationClockTransferCode) {
    this.locationClockTransferCode = locationClockTransferCode;
  }

  public EmployeeRawPunchForSubmit positionXRefCode(String positionXRefCode) {
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

  public EmployeeRawPunchForSubmit positionClockTransferCode(String positionClockTransferCode) {
    this.positionClockTransferCode = positionClockTransferCode;
    return this;
  }

   /**
   * Get positionClockTransferCode
   * @return positionClockTransferCode
  **/
 
  public String getPositionClockTransferCode() {
    return positionClockTransferCode;
  }

  public void setPositionClockTransferCode(String positionClockTransferCode) {
    this.positionClockTransferCode = positionClockTransferCode;
  }

  public EmployeeRawPunchForSubmit docketXRefCode(String docketXRefCode) {
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

  public EmployeeRawPunchForSubmit docketClockTransferCode(String docketClockTransferCode) {
    this.docketClockTransferCode = docketClockTransferCode;
    return this;
  }

   /**
   * Get docketClockTransferCode
   * @return docketClockTransferCode
  **/
 
  public String getDocketClockTransferCode() {
    return docketClockTransferCode;
  }

  public void setDocketClockTransferCode(String docketClockTransferCode) {
    this.docketClockTransferCode = docketClockTransferCode;
  }

  public EmployeeRawPunchForSubmit projectXRefCode(String projectXRefCode) {
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

  public EmployeeRawPunchForSubmit projectClockTransferCode(String projectClockTransferCode) {
    this.projectClockTransferCode = projectClockTransferCode;
    return this;
  }

   /**
   * Get projectClockTransferCode
   * @return projectClockTransferCode
  **/
 
  public String getProjectClockTransferCode() {
    return projectClockTransferCode;
  }

  public void setProjectClockTransferCode(String projectClockTransferCode) {
    this.projectClockTransferCode = projectClockTransferCode;
  }

  public EmployeeRawPunchForSubmit laborMetrics(List<PunchLaborMetric> laborMetrics) {
    this.laborMetrics = laborMetrics;
    return this;
  }

  public EmployeeRawPunchForSubmit addLaborMetricsItem(PunchLaborMetric laborMetricsItem) {
    this.laborMetrics.add(laborMetricsItem);
    return this;
  }

   /**
   * Get laborMetrics
   * @return laborMetrics
  **/
 
  public List<PunchLaborMetric> getLaborMetrics() {
    return laborMetrics;
  }

  public void setLaborMetrics(List<PunchLaborMetric> laborMetrics) {
    this.laborMetrics = laborMetrics;
  }

  public EmployeeRawPunchForSubmit quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
 
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public EmployeeRawPunchForSubmit mealWaiver(String mealWaiver) {
    this.mealWaiver = mealWaiver;
    return this;
  }

   /**
   * Get mealWaiver
   * @return mealWaiver
  **/
 
  public String getMealWaiver() {
    return mealWaiver;
  }

  public void setMealWaiver(String mealWaiver) {
    this.mealWaiver = mealWaiver;
  }

  public EmployeeRawPunchForSubmit breakAttestation(Boolean breakAttestation) {
    this.breakAttestation = breakAttestation;
    return this;
  }

   /**
   * Get breakAttestation
   * @return breakAttestation
  **/
 
  public Boolean getBreakAttestation() {
    return breakAttestation;
  }

  public void setBreakAttestation(Boolean breakAttestation) {
    this.breakAttestation = breakAttestation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeRawPunchForSubmit employeeRawPunchForSubmit = (EmployeeRawPunchForSubmit) o;
    return Objects.equals(this.employeeBadge, employeeRawPunchForSubmit.employeeBadge) &&
        Objects.equals(this.rawPunchTime, employeeRawPunchForSubmit.rawPunchTime) &&
        Objects.equals(this.punchType, employeeRawPunchForSubmit.punchType) &&
        Objects.equals(this.punchDevice, employeeRawPunchForSubmit.punchDevice) &&
        Objects.equals(this.supervisorBadge, employeeRawPunchForSubmit.supervisorBadge) &&
        Objects.equals(this.locationXRefCode, employeeRawPunchForSubmit.locationXRefCode) &&
        Objects.equals(this.locationClockTransferCode, employeeRawPunchForSubmit.locationClockTransferCode) &&
        Objects.equals(this.positionXRefCode, employeeRawPunchForSubmit.positionXRefCode) &&
        Objects.equals(this.positionClockTransferCode, employeeRawPunchForSubmit.positionClockTransferCode) &&
        Objects.equals(this.docketXRefCode, employeeRawPunchForSubmit.docketXRefCode) &&
        Objects.equals(this.docketClockTransferCode, employeeRawPunchForSubmit.docketClockTransferCode) &&
        Objects.equals(this.projectXRefCode, employeeRawPunchForSubmit.projectXRefCode) &&
        Objects.equals(this.projectClockTransferCode, employeeRawPunchForSubmit.projectClockTransferCode) &&
        Objects.equals(this.laborMetrics, employeeRawPunchForSubmit.laborMetrics) &&
        Objects.equals(this.quantity, employeeRawPunchForSubmit.quantity) &&
        Objects.equals(this.mealWaiver, employeeRawPunchForSubmit.mealWaiver) &&
        Objects.equals(this.breakAttestation, employeeRawPunchForSubmit.breakAttestation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeBadge, rawPunchTime, punchType, punchDevice, supervisorBadge, locationXRefCode, locationClockTransferCode, positionXRefCode, positionClockTransferCode, docketXRefCode, docketClockTransferCode, projectXRefCode, projectClockTransferCode, laborMetrics, quantity, mealWaiver, breakAttestation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeRawPunchForSubmit {\n");
    
    sb.append("    employeeBadge: ").append(toIndentedString(employeeBadge)).append("\n");
    sb.append("    rawPunchTime: ").append(toIndentedString(rawPunchTime)).append("\n");
    sb.append("    punchType: ").append(toIndentedString(punchType)).append("\n");
    sb.append("    punchDevice: ").append(toIndentedString(punchDevice)).append("\n");
    sb.append("    supervisorBadge: ").append(toIndentedString(supervisorBadge)).append("\n");
    sb.append("    locationXRefCode: ").append(toIndentedString(locationXRefCode)).append("\n");
    sb.append("    locationClockTransferCode: ").append(toIndentedString(locationClockTransferCode)).append("\n");
    sb.append("    positionXRefCode: ").append(toIndentedString(positionXRefCode)).append("\n");
    sb.append("    positionClockTransferCode: ").append(toIndentedString(positionClockTransferCode)).append("\n");
    sb.append("    docketXRefCode: ").append(toIndentedString(docketXRefCode)).append("\n");
    sb.append("    docketClockTransferCode: ").append(toIndentedString(docketClockTransferCode)).append("\n");
    sb.append("    projectXRefCode: ").append(toIndentedString(projectXRefCode)).append("\n");
    sb.append("    projectClockTransferCode: ").append(toIndentedString(projectClockTransferCode)).append("\n");
    sb.append("    laborMetrics: ").append(toIndentedString(laborMetrics)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    mealWaiver: ").append(toIndentedString(mealWaiver)).append("\n");
    sb.append("    breakAttestation: ").append(toIndentedString(breakAttestation)).append("\n");
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
