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
 * UploadedBy
 */

public class UploadedBy {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("LoginId")
  private String loginId = null;

  public UploadedBy displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
 
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UploadedBy xrefCode(String xrefCode) {
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

  public UploadedBy loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

   /**
   * Get loginId
   * @return loginId
  **/
 
  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedBy uploadedBy = (UploadedBy) o;
    return Objects.equals(this.displayName, uploadedBy.displayName) &&
        Objects.equals(this.xrefCode, uploadedBy.xrefCode) &&
        Objects.equals(this.loginId, uploadedBy.loginId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, xrefCode, loginId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedBy {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    xrefCode: ").append(toIndentedString(xrefCode)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
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

