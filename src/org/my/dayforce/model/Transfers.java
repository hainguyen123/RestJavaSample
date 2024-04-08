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

/**
 * Transfers
 */

public class Transfers {
  @SerializedName("TimeStart")
  private DateTime timeStart = null;

  @SerializedName("TimeStartRaw")
  private DateTime timeStartRaw = null;

  @SerializedName("LocationXRefCode")
  private String locationXRefCode = null;

  @SerializedName("PositionXRefCode")
  private String positionXRefCode = null;

  @SerializedName("ProjectXRefCode")
  private String projectXRefCode = null;

  @SerializedName("DocketXRefCode")
  private String docketXRefCode = null;

  @SerializedName("DocketQuantity")
  private Double docketQuantity = null;

  @SerializedName("PayAdjustmentXRefCode")
  private String payAdjustmentXRefCode = null;

  @SerializedName("EmployeeComment")
  private String employeeComment = null;

  @SerializedName("ManagerComment")
  private String managerComment = null;

  @SerializedName("LaborMetrics")
  private List<LaborMetrics> laborMetrics = new ArrayList<LaborMetrics>();

  public Transfers timeStart(DateTime timeStart) {
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

  public Transfers timeStartRaw(DateTime timeStartRaw) {
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

  public Transfers locationXRefCode(String locationXRefCode) {
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

  public Transfers positionXRefCode(String positionXRefCode) {
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

  public Transfers projectXRefCode(String projectXRefCode) {
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

  public Transfers docketXRefCode(String docketXRefCode) {
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

  public Transfers docketQuantity(Double docketQuantity) {
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

  public Transfers payAdjustmentXRefCode(String payAdjustmentXRefCode) {
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

  public Transfers employeeComment(String employeeComment) {
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

  public Transfers managerComment(String managerComment) {
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

  public Transfers laborMetrics(List<LaborMetrics> laborMetrics) {
    this.laborMetrics = laborMetrics;
    return this;
  }

  public Transfers addLaborMetricsItem(LaborMetrics laborMetricsItem) {
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
    Transfers transfers = (Transfers) o;
    return Objects.equals(this.timeStart, transfers.timeStart) &&
        Objects.equals(this.timeStartRaw, transfers.timeStartRaw) &&
        Objects.equals(this.locationXRefCode, transfers.locationXRefCode) &&
        Objects.equals(this.positionXRefCode, transfers.positionXRefCode) &&
        Objects.equals(this.projectXRefCode, transfers.projectXRefCode) &&
        Objects.equals(this.docketXRefCode, transfers.docketXRefCode) &&
        Objects.equals(this.docketQuantity, transfers.docketQuantity) &&
        Objects.equals(this.payAdjustmentXRefCode, transfers.payAdjustmentXRefCode) &&
        Objects.equals(this.employeeComment, transfers.employeeComment) &&
        Objects.equals(this.managerComment, transfers.managerComment) &&
        Objects.equals(this.laborMetrics, transfers.laborMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeStart, timeStartRaw, locationXRefCode, positionXRefCode, projectXRefCode, docketXRefCode, docketQuantity, payAdjustmentXRefCode, employeeComment, managerComment, laborMetrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfers {\n");
    
    sb.append("    timeStart: ").append(toIndentedString(timeStart)).append("\n");
    sb.append("    timeStartRaw: ").append(toIndentedString(timeStartRaw)).append("\n");
    sb.append("    locationXRefCode: ").append(toIndentedString(locationXRefCode)).append("\n");
    sb.append("    positionXRefCode: ").append(toIndentedString(positionXRefCode)).append("\n");
    sb.append("    projectXRefCode: ").append(toIndentedString(projectXRefCode)).append("\n");
    sb.append("    docketXRefCode: ").append(toIndentedString(docketXRefCode)).append("\n");
    sb.append("    docketQuantity: ").append(toIndentedString(docketQuantity)).append("\n");
    sb.append("    payAdjustmentXRefCode: ").append(toIndentedString(payAdjustmentXRefCode)).append("\n");
    sb.append("    employeeComment: ").append(toIndentedString(employeeComment)).append("\n");
    sb.append("    managerComment: ").append(toIndentedString(managerComment)).append("\n");
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
