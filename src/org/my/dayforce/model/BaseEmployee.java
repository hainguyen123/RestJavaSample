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
 * BaseEmployee
 */

public class BaseEmployee {
  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("NewXRefCode")
  private String newXRefCode = null;

  @SerializedName("CommonName")
  private String commonName = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("Initials")
  private String initials = null;

  @SerializedName("MaidenName")
  private String maidenName = null;

  @SerializedName("MiddleName")
  private String middleName = null;

  @SerializedName("PreferredLastName")
  private String preferredLastName = null;

  @SerializedName("SecondLastName")
  private String secondLastName = null;

  @SerializedName("Suffix")
  private String suffix = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public BaseEmployee xrefCode(String xrefCode) {
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

  public BaseEmployee newXRefCode(String newXRefCode) {
    this.newXRefCode = newXRefCode;
    return this;
  }

   /**
   * Get newXRefCode
   * @return newXRefCode
  **/
 
  public String getNewXRefCode() {
    return newXRefCode;
  }

  public void setNewXRefCode(String newXRefCode) {
    this.newXRefCode = newXRefCode;
  }

  public BaseEmployee commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

   /**
   * Get commonName
   * @return commonName
  **/
 
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public BaseEmployee displayName(String displayName) {
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

  public BaseEmployee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BaseEmployee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BaseEmployee initials(String initials) {
    this.initials = initials;
    return this;
  }

   /**
   * Get initials
   * @return initials
  **/
 
  public String getInitials() {
    return initials;
  }

  public void setInitials(String initials) {
    this.initials = initials;
  }

  public BaseEmployee maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

   /**
   * Get maidenName
   * @return maidenName
  **/
 
  public String getMaidenName() {
    return maidenName;
  }

  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }

  public BaseEmployee middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
 
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public BaseEmployee preferredLastName(String preferredLastName) {
    this.preferredLastName = preferredLastName;
    return this;
  }

   /**
   * Get preferredLastName
   * @return preferredLastName
  **/
 
  public String getPreferredLastName() {
    return preferredLastName;
  }

  public void setPreferredLastName(String preferredLastName) {
    this.preferredLastName = preferredLastName;
  }

  public BaseEmployee secondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
    return this;
  }

   /**
   * Get secondLastName
   * @return secondLastName
  **/
 
  public String getSecondLastName() {
    return secondLastName;
  }

  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }

  public BaseEmployee suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
 
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public BaseEmployee title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BaseEmployee lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    BaseEmployee baseEmployee = (BaseEmployee) o;
    return Objects.equals(this.xrefCode, baseEmployee.xrefCode) &&
        Objects.equals(this.newXRefCode, baseEmployee.newXRefCode) &&
        Objects.equals(this.commonName, baseEmployee.commonName) &&
        Objects.equals(this.displayName, baseEmployee.displayName) &&
        Objects.equals(this.firstName, baseEmployee.firstName) &&
        Objects.equals(this.lastName, baseEmployee.lastName) &&
        Objects.equals(this.initials, baseEmployee.initials) &&
        Objects.equals(this.maidenName, baseEmployee.maidenName) &&
        Objects.equals(this.middleName, baseEmployee.middleName) &&
        Objects.equals(this.preferredLastName, baseEmployee.preferredLastName) &&
        Objects.equals(this.secondLastName, baseEmployee.secondLastName) &&
        Objects.equals(this.suffix, baseEmployee.suffix) &&
        Objects.equals(this.title, baseEmployee.title) &&
        Objects.equals(this.lastModifiedTimestamp, baseEmployee.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xrefCode, newXRefCode, commonName, displayName, firstName, lastName, initials, maidenName, middleName, preferredLastName, secondLastName, suffix, title, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseEmployee {\n");
    
    sb.append("    xrefCode: ").append(toIndentedString(xrefCode)).append("\n");
    sb.append("    newXRefCode: ").append(toIndentedString(newXRefCode)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    initials: ").append(toIndentedString(initials)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    preferredLastName: ").append(toIndentedString(preferredLastName)).append("\n");
    sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

