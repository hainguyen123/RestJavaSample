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

/**
 * EmployeeUnionMembership
 */

public class EmployeeUnionMembership {
  @SerializedName("UnionMembershipDate")
  private DateTime unionMembershipDate = null;

  @SerializedName("EffectiveStart")
  private DateTime effectiveStart = null;

  @SerializedName("Union")
  private DFUnion union = null;

  @SerializedName("EffectiveEnd")
  private DateTime effectiveEnd = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmployeeUnionMembership unionMembershipDate(DateTime unionMembershipDate) {
    this.unionMembershipDate = unionMembershipDate;
    return this;
  }

   /**
   * Get unionMembershipDate
   * @return unionMembershipDate
  **/
 
  public DateTime getUnionMembershipDate() {
    return unionMembershipDate;
  }

  public void setUnionMembershipDate(DateTime unionMembershipDate) {
    this.unionMembershipDate = unionMembershipDate;
  }

  public EmployeeUnionMembership effectiveStart(DateTime effectiveStart) {
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

  public EmployeeUnionMembership union(DFUnion union) {
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

  public EmployeeUnionMembership effectiveEnd(DateTime effectiveEnd) {
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

  public EmployeeUnionMembership lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EmployeeUnionMembership employeeUnionMembership = (EmployeeUnionMembership) o;
    return Objects.equals(this.unionMembershipDate, employeeUnionMembership.unionMembershipDate) &&
        Objects.equals(this.effectiveStart, employeeUnionMembership.effectiveStart) &&
        Objects.equals(this.union, employeeUnionMembership.union) &&
        Objects.equals(this.effectiveEnd, employeeUnionMembership.effectiveEnd) &&
        Objects.equals(this.lastModifiedTimestamp, employeeUnionMembership.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unionMembershipDate, effectiveStart, union, effectiveEnd, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeUnionMembership {\n");
    
    sb.append("    unionMembershipDate: ").append(toIndentedString(unionMembershipDate)).append("\n");
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    union: ").append(toIndentedString(union)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
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

