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
import org.my.dayforce.model.Address;
import org.my.dayforce.model.OrgLevel;

/**
 * OrgUnitDetailConfiguration
 */

public class OrgUnitDetailConfiguration {
  @SerializedName("EffectiveStart")
  private DateTime effectiveStart = null;

  @SerializedName("EffectiveEnd")
  private DateTime effectiveEnd = null;

  @SerializedName("Address")
  private Address address = null;

  @SerializedName("ChildSortOrder")
  private Integer childSortOrder = null;

  @SerializedName("IsPhysicalLocation")
  private Boolean isPhysicalLocation = null;

  @SerializedName("IsPrimary")
  private Boolean isPrimary = null;

  @SerializedName("LedgerCode")
  private String ledgerCode = null;

  @SerializedName("ParentSortOrder")
  private Integer parentSortOrder = null;

  @SerializedName("OrgLevel")
  private OrgLevel orgLevel = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("LongName")
  private String longName = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public OrgUnitDetailConfiguration effectiveStart(DateTime effectiveStart) {
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

  public OrgUnitDetailConfiguration effectiveEnd(DateTime effectiveEnd) {
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

  public OrgUnitDetailConfiguration address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
 
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public OrgUnitDetailConfiguration childSortOrder(Integer childSortOrder) {
    this.childSortOrder = childSortOrder;
    return this;
  }

   /**
   * Get childSortOrder
   * @return childSortOrder
  **/
 
  public Integer getChildSortOrder() {
    return childSortOrder;
  }

  public void setChildSortOrder(Integer childSortOrder) {
    this.childSortOrder = childSortOrder;
  }

  public OrgUnitDetailConfiguration isPhysicalLocation(Boolean isPhysicalLocation) {
    this.isPhysicalLocation = isPhysicalLocation;
    return this;
  }

   /**
   * Get isPhysicalLocation
   * @return isPhysicalLocation
  **/
 
  public Boolean getIsPhysicalLocation() {
    return isPhysicalLocation;
  }

  public void setIsPhysicalLocation(Boolean isPhysicalLocation) {
    this.isPhysicalLocation = isPhysicalLocation;
  }

  public OrgUnitDetailConfiguration isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
 
  public Boolean getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  public OrgUnitDetailConfiguration ledgerCode(String ledgerCode) {
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

  public OrgUnitDetailConfiguration parentSortOrder(Integer parentSortOrder) {
    this.parentSortOrder = parentSortOrder;
    return this;
  }

   /**
   * Get parentSortOrder
   * @return parentSortOrder
  **/
 
  public Integer getParentSortOrder() {
    return parentSortOrder;
  }

  public void setParentSortOrder(Integer parentSortOrder) {
    this.parentSortOrder = parentSortOrder;
  }

  public OrgUnitDetailConfiguration orgLevel(OrgLevel orgLevel) {
    this.orgLevel = orgLevel;
    return this;
  }

   /**
   * Get orgLevel
   * @return orgLevel
  **/
 
  public OrgLevel getOrgLevel() {
    return orgLevel;
  }

  public void setOrgLevel(OrgLevel orgLevel) {
    this.orgLevel = orgLevel;
  }

  public OrgUnitDetailConfiguration xrefCode(String xrefCode) {
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

  public OrgUnitDetailConfiguration shortName(String shortName) {
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

  public OrgUnitDetailConfiguration longName(String longName) {
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

  public OrgUnitDetailConfiguration lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    OrgUnitDetailConfiguration orgUnitDetailConfiguration = (OrgUnitDetailConfiguration) o;
    return Objects.equals(this.effectiveStart, orgUnitDetailConfiguration.effectiveStart) &&
        Objects.equals(this.effectiveEnd, orgUnitDetailConfiguration.effectiveEnd) &&
        Objects.equals(this.address, orgUnitDetailConfiguration.address) &&
        Objects.equals(this.childSortOrder, orgUnitDetailConfiguration.childSortOrder) &&
        Objects.equals(this.isPhysicalLocation, orgUnitDetailConfiguration.isPhysicalLocation) &&
        Objects.equals(this.isPrimary, orgUnitDetailConfiguration.isPrimary) &&
        Objects.equals(this.ledgerCode, orgUnitDetailConfiguration.ledgerCode) &&
        Objects.equals(this.parentSortOrder, orgUnitDetailConfiguration.parentSortOrder) &&
        Objects.equals(this.orgLevel, orgUnitDetailConfiguration.orgLevel) &&
        Objects.equals(this.xrefCode, orgUnitDetailConfiguration.xrefCode) &&
        Objects.equals(this.shortName, orgUnitDetailConfiguration.shortName) &&
        Objects.equals(this.longName, orgUnitDetailConfiguration.longName) &&
        Objects.equals(this.lastModifiedTimestamp, orgUnitDetailConfiguration.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveStart, effectiveEnd, address, childSortOrder, isPhysicalLocation, isPrimary, ledgerCode, parentSortOrder, orgLevel, xrefCode, shortName, longName, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgUnitDetailConfiguration {\n");
    
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    effectiveEnd: ").append(toIndentedString(effectiveEnd)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    childSortOrder: ").append(toIndentedString(childSortOrder)).append("\n");
    sb.append("    isPhysicalLocation: ").append(toIndentedString(isPhysicalLocation)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    ledgerCode: ").append(toIndentedString(ledgerCode)).append("\n");
    sb.append("    parentSortOrder: ").append(toIndentedString(parentSortOrder)).append("\n");
    sb.append("    orgLevel: ").append(toIndentedString(orgLevel)).append("\n");
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

