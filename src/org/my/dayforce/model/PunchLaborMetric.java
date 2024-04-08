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



/**
 * PunchLaborMetric
 */

public class PunchLaborMetric {
  @SerializedName("TypeXRefCode")
  private String typeXRefCode = null;

  @SerializedName("CodeXRefCode")
  private String codeXRefCode = null;

  @SerializedName("TypeClockTransferCode")
  private String typeClockTransferCode = null;

  @SerializedName("CodeClockTransferCode")
  private String codeClockTransferCode = null;

  public PunchLaborMetric typeXRefCode(String typeXRefCode) {
    this.typeXRefCode = typeXRefCode;
    return this;
  }

   /**
   * Get typeXRefCode
   * @return typeXRefCode
  **/
 
  public String getTypeXRefCode() {
    return typeXRefCode;
  }

  public void setTypeXRefCode(String typeXRefCode) {
    this.typeXRefCode = typeXRefCode;
  }

  public PunchLaborMetric codeXRefCode(String codeXRefCode) {
    this.codeXRefCode = codeXRefCode;
    return this;
  }

   /**
   * Get codeXRefCode
   * @return codeXRefCode
  **/
 
  public String getCodeXRefCode() {
    return codeXRefCode;
  }

  public void setCodeXRefCode(String codeXRefCode) {
    this.codeXRefCode = codeXRefCode;
  }

  public PunchLaborMetric typeClockTransferCode(String typeClockTransferCode) {
    this.typeClockTransferCode = typeClockTransferCode;
    return this;
  }

   /**
   * Get typeClockTransferCode
   * @return typeClockTransferCode
  **/
 
  public String getTypeClockTransferCode() {
    return typeClockTransferCode;
  }

  public void setTypeClockTransferCode(String typeClockTransferCode) {
    this.typeClockTransferCode = typeClockTransferCode;
  }

  public PunchLaborMetric codeClockTransferCode(String codeClockTransferCode) {
    this.codeClockTransferCode = codeClockTransferCode;
    return this;
  }

   /**
   * Get codeClockTransferCode
   * @return codeClockTransferCode
  **/
 
  public String getCodeClockTransferCode() {
    return codeClockTransferCode;
  }

  public void setCodeClockTransferCode(String codeClockTransferCode) {
    this.codeClockTransferCode = codeClockTransferCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PunchLaborMetric punchLaborMetric = (PunchLaborMetric) o;
    return Objects.equals(this.typeXRefCode, punchLaborMetric.typeXRefCode) &&
        Objects.equals(this.codeXRefCode, punchLaborMetric.codeXRefCode) &&
        Objects.equals(this.typeClockTransferCode, punchLaborMetric.typeClockTransferCode) &&
        Objects.equals(this.codeClockTransferCode, punchLaborMetric.codeClockTransferCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeXRefCode, codeXRefCode, typeClockTransferCode, codeClockTransferCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PunchLaborMetric {\n");
    
    sb.append("    typeXRefCode: ").append(toIndentedString(typeXRefCode)).append("\n");
    sb.append("    codeXRefCode: ").append(toIndentedString(codeXRefCode)).append("\n");
    sb.append("    typeClockTransferCode: ").append(toIndentedString(typeClockTransferCode)).append("\n");
    sb.append("    codeClockTransferCode: ").append(toIndentedString(codeClockTransferCode)).append("\n");
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
