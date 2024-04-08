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
 * JobFeed
 */

public class JobFeed {
  @SerializedName("Title")
  private String title = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ClientSiteName")
  private String clientSiteName = null;

  @SerializedName("ClientSiteXRefCode")
  private String clientSiteXRefCode = null;

  @SerializedName("CompanyName")
  private String companyName = null;

  @SerializedName("ParentCompanyName")
  private String parentCompanyName = null;

  @SerializedName("JobDetailsUrl")
  private String jobDetailsUrl = null;

  @SerializedName("ApplyUrl")
  private String applyUrl = null;

  @SerializedName("AddressLine1")
  private String addressLine1 = null;

  @SerializedName("AddressLine2")
  private String addressLine2 = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("State")
  private String state = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("Education")
  private String education = null;

  @SerializedName("JobFamily")
  private String jobFamily = null;

  @SerializedName("JobFunction")
  private String jobFunction = null;

  @SerializedName("EmploymentIndicator")
  private String employmentIndicator = null;

  @SerializedName("Qualifications")
  private String qualifications = null;

  @SerializedName("DatePosted")
  private DateTime datePosted = null;

  @SerializedName("LastUpdated")
  private DateTime lastUpdated = null;

  @SerializedName("ReferenceNumber")
  private Integer referenceNumber = null;

  @SerializedName("JobReferenceNumber")
  private String jobReferenceNumber = null;

  @SerializedName("CandidatesUrl")
  private String candidatesUrl = null;

  @SerializedName("CultureCode")
  private String cultureCode = null;

  @SerializedName("ParentRequisitionCode")
  private Integer parentRequisitionCode = null;

  @SerializedName("MinHiringRate")
  private Double minHiringRate = null;

  @SerializedName("MaxHiringRate")
  private Double maxHiringRate = null;

  @SerializedName("HiringRate")
  private Double hiringRate = null;

  @SerializedName("JobType")
  private Integer jobType = null;

  @SerializedName("TravelPercentage")
  private Double travelPercentage = null;

  @SerializedName("TravelRequired")
  private Integer travelRequired = null;

  @SerializedName("TelecommutePercentage")
  private Double telecommutePercentage = null;

  public JobFeed title(String title) {
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

  public JobFeed description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JobFeed clientSiteName(String clientSiteName) {
    this.clientSiteName = clientSiteName;
    return this;
  }

   /**
   * Get clientSiteName
   * @return clientSiteName
  **/
 
  public String getClientSiteName() {
    return clientSiteName;
  }

  public void setClientSiteName(String clientSiteName) {
    this.clientSiteName = clientSiteName;
  }

  public JobFeed clientSiteXRefCode(String clientSiteXRefCode) {
    this.clientSiteXRefCode = clientSiteXRefCode;
    return this;
  }

   /**
   * Get clientSiteXRefCode
   * @return clientSiteXRefCode
  **/
 
  public String getClientSiteXRefCode() {
    return clientSiteXRefCode;
  }

  public void setClientSiteXRefCode(String clientSiteXRefCode) {
    this.clientSiteXRefCode = clientSiteXRefCode;
  }

  public JobFeed companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
 
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public JobFeed parentCompanyName(String parentCompanyName) {
    this.parentCompanyName = parentCompanyName;
    return this;
  }

   /**
   * Get parentCompanyName
   * @return parentCompanyName
  **/
 
  public String getParentCompanyName() {
    return parentCompanyName;
  }

  public void setParentCompanyName(String parentCompanyName) {
    this.parentCompanyName = parentCompanyName;
  }

  public JobFeed jobDetailsUrl(String jobDetailsUrl) {
    this.jobDetailsUrl = jobDetailsUrl;
    return this;
  }

   /**
   * Get jobDetailsUrl
   * @return jobDetailsUrl
  **/
 
  public String getJobDetailsUrl() {
    return jobDetailsUrl;
  }

  public void setJobDetailsUrl(String jobDetailsUrl) {
    this.jobDetailsUrl = jobDetailsUrl;
  }

  public JobFeed applyUrl(String applyUrl) {
    this.applyUrl = applyUrl;
    return this;
  }

   /**
   * Get applyUrl
   * @return applyUrl
  **/
 
  public String getApplyUrl() {
    return applyUrl;
  }

  public void setApplyUrl(String applyUrl) {
    this.applyUrl = applyUrl;
  }

  public JobFeed addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
 
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public JobFeed addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
 
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public JobFeed city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public JobFeed state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
 
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public JobFeed country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public JobFeed postalCode(String postalCode) {
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

  public JobFeed education(String education) {
    this.education = education;
    return this;
  }

   /**
   * Get education
   * @return education
  **/
 
  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }

  public JobFeed jobFamily(String jobFamily) {
    this.jobFamily = jobFamily;
    return this;
  }

   /**
   * Get jobFamily
   * @return jobFamily
  **/
 
  public String getJobFamily() {
    return jobFamily;
  }

  public void setJobFamily(String jobFamily) {
    this.jobFamily = jobFamily;
  }

  public JobFeed jobFunction(String jobFunction) {
    this.jobFunction = jobFunction;
    return this;
  }

   /**
   * Get jobFunction
   * @return jobFunction
  **/
 
  public String getJobFunction() {
    return jobFunction;
  }

  public void setJobFunction(String jobFunction) {
    this.jobFunction = jobFunction;
  }

  public JobFeed employmentIndicator(String employmentIndicator) {
    this.employmentIndicator = employmentIndicator;
    return this;
  }

   /**
   * Get employmentIndicator
   * @return employmentIndicator
  **/
 
  public String getEmploymentIndicator() {
    return employmentIndicator;
  }

  public void setEmploymentIndicator(String employmentIndicator) {
    this.employmentIndicator = employmentIndicator;
  }

  public JobFeed qualifications(String qualifications) {
    this.qualifications = qualifications;
    return this;
  }

   /**
   * Get qualifications
   * @return qualifications
  **/
 
  public String getQualifications() {
    return qualifications;
  }

  public void setQualifications(String qualifications) {
    this.qualifications = qualifications;
  }

  public JobFeed datePosted(DateTime datePosted) {
    this.datePosted = datePosted;
    return this;
  }

   /**
   * Get datePosted
   * @return datePosted
  **/
 
  public DateTime getDatePosted() {
    return datePosted;
  }

  public void setDatePosted(DateTime datePosted) {
    this.datePosted = datePosted;
  }

  public JobFeed lastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
 
  public DateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public JobFeed referenceNumber(Integer referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
 
  public Integer getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(Integer referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public JobFeed jobReferenceNumber(String jobReferenceNumber) {
    this.jobReferenceNumber = jobReferenceNumber;
    return this;
  }

   /**
   * Get jobReferenceNumber
   * @return jobReferenceNumber
  **/
 
  public String getJobReferenceNumber() {
    return jobReferenceNumber;
  }

  public void setJobReferenceNumber(String jobReferenceNumber) {
    this.jobReferenceNumber = jobReferenceNumber;
  }

  public JobFeed candidatesUrl(String candidatesUrl) {
    this.candidatesUrl = candidatesUrl;
    return this;
  }

   /**
   * Get candidatesUrl
   * @return candidatesUrl
  **/
 
  public String getCandidatesUrl() {
    return candidatesUrl;
  }

  public void setCandidatesUrl(String candidatesUrl) {
    this.candidatesUrl = candidatesUrl;
  }

  public JobFeed cultureCode(String cultureCode) {
    this.cultureCode = cultureCode;
    return this;
  }

   /**
   * Get cultureCode
   * @return cultureCode
  **/
 
  public String getCultureCode() {
    return cultureCode;
  }

  public void setCultureCode(String cultureCode) {
    this.cultureCode = cultureCode;
  }

  public JobFeed parentRequisitionCode(Integer parentRequisitionCode) {
    this.parentRequisitionCode = parentRequisitionCode;
    return this;
  }

   /**
   * Get parentRequisitionCode
   * @return parentRequisitionCode
  **/
 
  public Integer getParentRequisitionCode() {
    return parentRequisitionCode;
  }

  public void setParentRequisitionCode(Integer parentRequisitionCode) {
    this.parentRequisitionCode = parentRequisitionCode;
  }

  public JobFeed minHiringRate(Double minHiringRate) {
    this.minHiringRate = minHiringRate;
    return this;
  }

   /**
   * Get minHiringRate
   * @return minHiringRate
  **/
 
  public Double getMinHiringRate() {
    return minHiringRate;
  }

  public void setMinHiringRate(Double minHiringRate) {
    this.minHiringRate = minHiringRate;
  }

  public JobFeed maxHiringRate(Double maxHiringRate) {
    this.maxHiringRate = maxHiringRate;
    return this;
  }

   /**
   * Get maxHiringRate
   * @return maxHiringRate
  **/
 
  public Double getMaxHiringRate() {
    return maxHiringRate;
  }

  public void setMaxHiringRate(Double maxHiringRate) {
    this.maxHiringRate = maxHiringRate;
  }

  public JobFeed hiringRate(Double hiringRate) {
    this.hiringRate = hiringRate;
    return this;
  }

   /**
   * Get hiringRate
   * @return hiringRate
  **/
 
  public Double getHiringRate() {
    return hiringRate;
  }

  public void setHiringRate(Double hiringRate) {
    this.hiringRate = hiringRate;
  }

  public JobFeed jobType(Integer jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
 
  public Integer getJobType() {
    return jobType;
  }

  public void setJobType(Integer jobType) {
    this.jobType = jobType;
  }

  public JobFeed travelPercentage(Double travelPercentage) {
    this.travelPercentage = travelPercentage;
    return this;
  }

   /**
   * Get travelPercentage
   * @return travelPercentage
  **/
 
  public Double getTravelPercentage() {
    return travelPercentage;
  }

  public void setTravelPercentage(Double travelPercentage) {
    this.travelPercentage = travelPercentage;
  }

  public JobFeed travelRequired(Integer travelRequired) {
    this.travelRequired = travelRequired;
    return this;
  }

   /**
   * Get travelRequired
   * @return travelRequired
  **/
 
  public Integer getTravelRequired() {
    return travelRequired;
  }

  public void setTravelRequired(Integer travelRequired) {
    this.travelRequired = travelRequired;
  }

  public JobFeed telecommutePercentage(Double telecommutePercentage) {
    this.telecommutePercentage = telecommutePercentage;
    return this;
  }

   /**
   * Get telecommutePercentage
   * @return telecommutePercentage
  **/
 
  public Double getTelecommutePercentage() {
    return telecommutePercentage;
  }

  public void setTelecommutePercentage(Double telecommutePercentage) {
    this.telecommutePercentage = telecommutePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobFeed jobFeed = (JobFeed) o;
    return Objects.equals(this.title, jobFeed.title) &&
        Objects.equals(this.description, jobFeed.description) &&
        Objects.equals(this.clientSiteName, jobFeed.clientSiteName) &&
        Objects.equals(this.clientSiteXRefCode, jobFeed.clientSiteXRefCode) &&
        Objects.equals(this.companyName, jobFeed.companyName) &&
        Objects.equals(this.parentCompanyName, jobFeed.parentCompanyName) &&
        Objects.equals(this.jobDetailsUrl, jobFeed.jobDetailsUrl) &&
        Objects.equals(this.applyUrl, jobFeed.applyUrl) &&
        Objects.equals(this.addressLine1, jobFeed.addressLine1) &&
        Objects.equals(this.addressLine2, jobFeed.addressLine2) &&
        Objects.equals(this.city, jobFeed.city) &&
        Objects.equals(this.state, jobFeed.state) &&
        Objects.equals(this.country, jobFeed.country) &&
        Objects.equals(this.postalCode, jobFeed.postalCode) &&
        Objects.equals(this.education, jobFeed.education) &&
        Objects.equals(this.jobFamily, jobFeed.jobFamily) &&
        Objects.equals(this.jobFunction, jobFeed.jobFunction) &&
        Objects.equals(this.employmentIndicator, jobFeed.employmentIndicator) &&
        Objects.equals(this.qualifications, jobFeed.qualifications) &&
        Objects.equals(this.datePosted, jobFeed.datePosted) &&
        Objects.equals(this.lastUpdated, jobFeed.lastUpdated) &&
        Objects.equals(this.referenceNumber, jobFeed.referenceNumber) &&
        Objects.equals(this.jobReferenceNumber, jobFeed.jobReferenceNumber) &&
        Objects.equals(this.candidatesUrl, jobFeed.candidatesUrl) &&
        Objects.equals(this.cultureCode, jobFeed.cultureCode) &&
        Objects.equals(this.parentRequisitionCode, jobFeed.parentRequisitionCode) &&
        Objects.equals(this.minHiringRate, jobFeed.minHiringRate) &&
        Objects.equals(this.maxHiringRate, jobFeed.maxHiringRate) &&
        Objects.equals(this.hiringRate, jobFeed.hiringRate) &&
        Objects.equals(this.jobType, jobFeed.jobType) &&
        Objects.equals(this.travelPercentage, jobFeed.travelPercentage) &&
        Objects.equals(this.travelRequired, jobFeed.travelRequired) &&
        Objects.equals(this.telecommutePercentage, jobFeed.telecommutePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, clientSiteName, clientSiteXRefCode, companyName, parentCompanyName, jobDetailsUrl, applyUrl, addressLine1, addressLine2, city, state, country, postalCode, education, jobFamily, jobFunction, employmentIndicator, qualifications, datePosted, lastUpdated, referenceNumber, jobReferenceNumber, candidatesUrl, cultureCode, parentRequisitionCode, minHiringRate, maxHiringRate, hiringRate, jobType, travelPercentage, travelRequired, telecommutePercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobFeed {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    clientSiteName: ").append(toIndentedString(clientSiteName)).append("\n");
    sb.append("    clientSiteXRefCode: ").append(toIndentedString(clientSiteXRefCode)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    parentCompanyName: ").append(toIndentedString(parentCompanyName)).append("\n");
    sb.append("    jobDetailsUrl: ").append(toIndentedString(jobDetailsUrl)).append("\n");
    sb.append("    applyUrl: ").append(toIndentedString(applyUrl)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    jobFamily: ").append(toIndentedString(jobFamily)).append("\n");
    sb.append("    jobFunction: ").append(toIndentedString(jobFunction)).append("\n");
    sb.append("    employmentIndicator: ").append(toIndentedString(employmentIndicator)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
    sb.append("    datePosted: ").append(toIndentedString(datePosted)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    jobReferenceNumber: ").append(toIndentedString(jobReferenceNumber)).append("\n");
    sb.append("    candidatesUrl: ").append(toIndentedString(candidatesUrl)).append("\n");
    sb.append("    cultureCode: ").append(toIndentedString(cultureCode)).append("\n");
    sb.append("    parentRequisitionCode: ").append(toIndentedString(parentRequisitionCode)).append("\n");
    sb.append("    minHiringRate: ").append(toIndentedString(minHiringRate)).append("\n");
    sb.append("    maxHiringRate: ").append(toIndentedString(maxHiringRate)).append("\n");
    sb.append("    hiringRate: ").append(toIndentedString(hiringRate)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    travelPercentage: ").append(toIndentedString(travelPercentage)).append("\n");
    sb.append("    travelRequired: ").append(toIndentedString(travelRequired)).append("\n");
    sb.append("    telecommutePercentage: ").append(toIndentedString(telecommutePercentage)).append("\n");
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

