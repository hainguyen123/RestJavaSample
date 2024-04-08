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
import org.my.dayforce.model.ChildLocationCollection;
import org.my.dayforce.model.City;
import org.my.dayforce.model.Department;
import org.my.dayforce.model.HRConfigurationEntity;
import org.my.dayforce.model.LegalEntity;
import org.my.dayforce.model.OrgLevel;
import org.my.dayforce.model.OrgUnitLegalEntityCollection;
import org.my.dayforce.model.OrgUnitParentCollection;
import org.my.dayforce.model.TimeZone;
import org.my.dayforce.model.Zone;

/**
 * Location
 */

public class Location {
  @SerializedName("OrgLevel")
  private OrgLevel orgLevel = null;

  @SerializedName("PhysicalLocation")
  private Boolean physicalLocation = null;

  @SerializedName("BusinessPhone")
  private String businessPhone = null;

  @SerializedName("ContactBusinessPhone")
  private String contactBusinessPhone = null;

  @SerializedName("ContactCellPhone")
  private String contactCellPhone = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("OpeningDate")
  private DateTime openingDate = null;

  @SerializedName("ClosingDate")
  private DateTime closingDate = null;

  @SerializedName("ComparableLocation")
  private HRConfigurationEntity comparableLocation = null;

  @SerializedName("Department")
  private Department department = null;

  @SerializedName("Zone")
  private Zone zone = null;

  @SerializedName("StartDayOfWeek")
  private Integer startDayOfWeek = null;

  @SerializedName("GeoCity")
  private City geoCity = null;

  @SerializedName("Timezone")
  private TimeZone timezone = null;

  @SerializedName("County")
  private String county = null;

  @SerializedName("IsOrgManaged")
  private Boolean isOrgManaged = null;

  @SerializedName("IsMobileOrg")
  private Boolean isMobileOrg = null;

  @SerializedName("PublicName")
  private String publicName = null;

  @SerializedName("ClockTransferCode")
  private String clockTransferCode = null;

  @SerializedName("ContactEmail")
  private String contactEmail = null;

  @SerializedName("ContactName")
  private String contactName = null;

  @SerializedName("LedgerCode")
  private String ledgerCode = null;

  @SerializedName("StateCode")
  private String stateCode = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("Address2")
  private String address2 = null;

  @SerializedName("LegalEntity")
  private LegalEntity legalEntity = null;

  @SerializedName("OrgUnitLegalEntities")
  private OrgUnitLegalEntityCollection orgUnitLegalEntities = null;

  @SerializedName("OrgUnitParents")
  private OrgUnitParentCollection orgUnitParents = null;

  @SerializedName("ChildOrgUnits")
  private ChildLocationCollection childOrgUnits = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("LongName")
  private String longName = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public Location orgLevel(OrgLevel orgLevel) {
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

  public Location physicalLocation(Boolean physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }

   /**
   * Get physicalLocation
   * @return physicalLocation
  **/
 
  public Boolean getPhysicalLocation() {
    return physicalLocation;
  }

  public void setPhysicalLocation(Boolean physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  public Location businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Get businessPhone
   * @return businessPhone
  **/
 
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Location contactBusinessPhone(String contactBusinessPhone) {
    this.contactBusinessPhone = contactBusinessPhone;
    return this;
  }

   /**
   * Get contactBusinessPhone
   * @return contactBusinessPhone
  **/
 
  public String getContactBusinessPhone() {
    return contactBusinessPhone;
  }

  public void setContactBusinessPhone(String contactBusinessPhone) {
    this.contactBusinessPhone = contactBusinessPhone;
  }

  public Location contactCellPhone(String contactCellPhone) {
    this.contactCellPhone = contactCellPhone;
    return this;
  }

   /**
   * Get contactCellPhone
   * @return contactCellPhone
  **/
 
  public String getContactCellPhone() {
    return contactCellPhone;
  }

  public void setContactCellPhone(String contactCellPhone) {
    this.contactCellPhone = contactCellPhone;
  }

  public Location postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
 
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Location countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
 
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Location openingDate(DateTime openingDate) {
    this.openingDate = openingDate;
    return this;
  }

   /**
   * Get openingDate
   * @return openingDate
  **/
 
  public DateTime getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(DateTime openingDate) {
    this.openingDate = openingDate;
  }

  public Location closingDate(DateTime closingDate) {
    this.closingDate = closingDate;
    return this;
  }

   /**
   * Get closingDate
   * @return closingDate
  **/
 
  public DateTime getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(DateTime closingDate) {
    this.closingDate = closingDate;
  }

  public Location comparableLocation(HRConfigurationEntity comparableLocation) {
    this.comparableLocation = comparableLocation;
    return this;
  }

   /**
   * Get comparableLocation
   * @return comparableLocation
  **/
 
  public HRConfigurationEntity getComparableLocation() {
    return comparableLocation;
  }

  public void setComparableLocation(HRConfigurationEntity comparableLocation) {
    this.comparableLocation = comparableLocation;
  }

  public Location department(Department department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
 
  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Location zone(Zone zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
 
  public Zone getZone() {
    return zone;
  }

  public void setZone(Zone zone) {
    this.zone = zone;
  }

  public Location startDayOfWeek(Integer startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
    return this;
  }

   /**
   * Get startDayOfWeek
   * @return startDayOfWeek
  **/
 
  public Integer getStartDayOfWeek() {
    return startDayOfWeek;
  }

  public void setStartDayOfWeek(Integer startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
  }

  public Location geoCity(City geoCity) {
    this.geoCity = geoCity;
    return this;
  }

   /**
   * Get geoCity
   * @return geoCity
  **/
 
  public City getGeoCity() {
    return geoCity;
  }

  public void setGeoCity(City geoCity) {
    this.geoCity = geoCity;
  }

  public Location timezone(TimeZone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
 
  public TimeZone getTimezone() {
    return timezone;
  }

  public void setTimezone(TimeZone timezone) {
    this.timezone = timezone;
  }

  public Location county(String county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
 
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public Location isOrgManaged(Boolean isOrgManaged) {
    this.isOrgManaged = isOrgManaged;
    return this;
  }

   /**
   * Get isOrgManaged
   * @return isOrgManaged
  **/
 
  public Boolean getIsOrgManaged() {
    return isOrgManaged;
  }

  public void setIsOrgManaged(Boolean isOrgManaged) {
    this.isOrgManaged = isOrgManaged;
  }

  public Location isMobileOrg(Boolean isMobileOrg) {
    this.isMobileOrg = isMobileOrg;
    return this;
  }

   /**
   * Get isMobileOrg
   * @return isMobileOrg
  **/
 
  public Boolean getIsMobileOrg() {
    return isMobileOrg;
  }

  public void setIsMobileOrg(Boolean isMobileOrg) {
    this.isMobileOrg = isMobileOrg;
  }

  public Location publicName(String publicName) {
    this.publicName = publicName;
    return this;
  }

   /**
   * Get publicName
   * @return publicName
  **/
 
  public String getPublicName() {
    return publicName;
  }

  public void setPublicName(String publicName) {
    this.publicName = publicName;
  }

  public Location clockTransferCode(String clockTransferCode) {
    this.clockTransferCode = clockTransferCode;
    return this;
  }

   /**
   * Get clockTransferCode
   * @return clockTransferCode
  **/
 
  public String getClockTransferCode() {
    return clockTransferCode;
  }

  public void setClockTransferCode(String clockTransferCode) {
    this.clockTransferCode = clockTransferCode;
  }

  public Location contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
 
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public Location contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
 
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Location ledgerCode(String ledgerCode) {
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

  public Location stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
 
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public Location address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
 
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Location address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
 
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Location legalEntity(LegalEntity legalEntity) {
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

  public Location orgUnitLegalEntities(OrgUnitLegalEntityCollection orgUnitLegalEntities) {
    this.orgUnitLegalEntities = orgUnitLegalEntities;
    return this;
  }

   /**
   * Get orgUnitLegalEntities
   * @return orgUnitLegalEntities
  **/
 
  public OrgUnitLegalEntityCollection getOrgUnitLegalEntities() {
    return orgUnitLegalEntities;
  }

  public void setOrgUnitLegalEntities(OrgUnitLegalEntityCollection orgUnitLegalEntities) {
    this.orgUnitLegalEntities = orgUnitLegalEntities;
  }

  public Location orgUnitParents(OrgUnitParentCollection orgUnitParents) {
    this.orgUnitParents = orgUnitParents;
    return this;
  }

   /**
   * Get orgUnitParents
   * @return orgUnitParents
  **/
 
  public OrgUnitParentCollection getOrgUnitParents() {
    return orgUnitParents;
  }

  public void setOrgUnitParents(OrgUnitParentCollection orgUnitParents) {
    this.orgUnitParents = orgUnitParents;
  }

  public Location childOrgUnits(ChildLocationCollection childOrgUnits) {
    this.childOrgUnits = childOrgUnits;
    return this;
  }

   /**
   * Get childOrgUnits
   * @return childOrgUnits
  **/
 
  public ChildLocationCollection getChildOrgUnits() {
    return childOrgUnits;
  }

  public void setChildOrgUnits(ChildLocationCollection childOrgUnits) {
    this.childOrgUnits = childOrgUnits;
  }

  public Location xrefCode(String xrefCode) {
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

  public Location shortName(String shortName) {
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

  public Location longName(String longName) {
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

  public Location lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    Location location = (Location) o;
    return Objects.equals(this.orgLevel, location.orgLevel) &&
        Objects.equals(this.physicalLocation, location.physicalLocation) &&
        Objects.equals(this.businessPhone, location.businessPhone) &&
        Objects.equals(this.contactBusinessPhone, location.contactBusinessPhone) &&
        Objects.equals(this.contactCellPhone, location.contactCellPhone) &&
        Objects.equals(this.postalCode, location.postalCode) &&
        Objects.equals(this.countryCode, location.countryCode) &&
        Objects.equals(this.openingDate, location.openingDate) &&
        Objects.equals(this.closingDate, location.closingDate) &&
        Objects.equals(this.comparableLocation, location.comparableLocation) &&
        Objects.equals(this.department, location.department) &&
        Objects.equals(this.zone, location.zone) &&
        Objects.equals(this.startDayOfWeek, location.startDayOfWeek) &&
        Objects.equals(this.geoCity, location.geoCity) &&
        Objects.equals(this.timezone, location.timezone) &&
        Objects.equals(this.county, location.county) &&
        Objects.equals(this.isOrgManaged, location.isOrgManaged) &&
        Objects.equals(this.isMobileOrg, location.isMobileOrg) &&
        Objects.equals(this.publicName, location.publicName) &&
        Objects.equals(this.clockTransferCode, location.clockTransferCode) &&
        Objects.equals(this.contactEmail, location.contactEmail) &&
        Objects.equals(this.contactName, location.contactName) &&
        Objects.equals(this.ledgerCode, location.ledgerCode) &&
        Objects.equals(this.stateCode, location.stateCode) &&
        Objects.equals(this.address, location.address) &&
        Objects.equals(this.address2, location.address2) &&
        Objects.equals(this.legalEntity, location.legalEntity) &&
        Objects.equals(this.orgUnitLegalEntities, location.orgUnitLegalEntities) &&
        Objects.equals(this.orgUnitParents, location.orgUnitParents) &&
        Objects.equals(this.childOrgUnits, location.childOrgUnits) &&
        Objects.equals(this.xrefCode, location.xrefCode) &&
        Objects.equals(this.shortName, location.shortName) &&
        Objects.equals(this.longName, location.longName) &&
        Objects.equals(this.lastModifiedTimestamp, location.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgLevel, physicalLocation, businessPhone, contactBusinessPhone, contactCellPhone, postalCode, countryCode, openingDate, closingDate, comparableLocation, department, zone, startDayOfWeek, geoCity, timezone, county, isOrgManaged, isMobileOrg, publicName, clockTransferCode, contactEmail, contactName, ledgerCode, stateCode, address, address2, legalEntity, orgUnitLegalEntities, orgUnitParents, childOrgUnits, xrefCode, shortName, longName, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    orgLevel: ").append(toIndentedString(orgLevel)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    contactBusinessPhone: ").append(toIndentedString(contactBusinessPhone)).append("\n");
    sb.append("    contactCellPhone: ").append(toIndentedString(contactCellPhone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    comparableLocation: ").append(toIndentedString(comparableLocation)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    startDayOfWeek: ").append(toIndentedString(startDayOfWeek)).append("\n");
    sb.append("    geoCity: ").append(toIndentedString(geoCity)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    isOrgManaged: ").append(toIndentedString(isOrgManaged)).append("\n");
    sb.append("    isMobileOrg: ").append(toIndentedString(isMobileOrg)).append("\n");
    sb.append("    publicName: ").append(toIndentedString(publicName)).append("\n");
    sb.append("    clockTransferCode: ").append(toIndentedString(clockTransferCode)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    ledgerCode: ").append(toIndentedString(ledgerCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    orgUnitLegalEntities: ").append(toIndentedString(orgUnitLegalEntities)).append("\n");
    sb.append("    orgUnitParents: ").append(toIndentedString(orgUnitParents)).append("\n");
    sb.append("    childOrgUnits: ").append(toIndentedString(childOrgUnits)).append("\n");
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
