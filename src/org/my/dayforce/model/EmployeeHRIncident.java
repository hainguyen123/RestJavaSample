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
import org.my.dayforce.model.EmployeeHRIncidentNoteCollection;
import org.my.dayforce.model.HRIncidentAction;
import org.my.dayforce.model.HRIncidentBodyPart;
import org.my.dayforce.model.HRIncidentInjury;
import org.my.dayforce.model.HRIncidentType;
import org.my.dayforce.model.OrgUnitDetailConfiguration;
import org.my.dayforce.model.SafetyHealthType;

/**
 * EmployeeHRIncident
 */

public class EmployeeHRIncident {
  @SerializedName("HRIncidentNotes")
  private EmployeeHRIncidentNoteCollection hrIncidentNotes = null;

  @SerializedName("OrgUnit")
  private OrgUnitDetailConfiguration orgUnit = null;

  @SerializedName("HRIncidentState")
  private String hrIncidentState = null;

  @SerializedName("OpenDate")
  private DateTime openDate = null;

  @SerializedName("HRIncidentAction")
  private HRIncidentAction hrIncidentAction = null;

  @SerializedName("HRIncidentType")
  private HRIncidentType hrIncidentType = null;

  @SerializedName("ClosedDate")
  private DateTime closedDate = null;

  @SerializedName("HRIncidentDate")
  private DateTime hrIncidentDate = null;

  @SerializedName("HRIncidentBeganWork")
  private DateTime hrIncidentBeganWork = null;

  @SerializedName("HRIncidentEventTime")
  private DateTime hrIncidentEventTime = null;

  @SerializedName("SafetyHealthType")
  private SafetyHealthType safetyHealthType = null;

  @SerializedName("HRIncidentInjury")
  private HRIncidentInjury hrIncidentInjury = null;

  @SerializedName("HRIncidentBodyPart")
  private HRIncidentBodyPart hrIncidentBodyPart = null;

  @SerializedName("Died")
  private Boolean died = null;

  @SerializedName("HRIncidentArea")
  private String hrIncidentArea = null;

  @SerializedName("TaskBeingPerformed")
  private String taskBeingPerformed = null;

  @SerializedName("CausedObject")
  private String causedObject = null;

  @SerializedName("CausedAction")
  private String causedAction = null;

  @SerializedName("PrivacyCase")
  private Boolean privacyCase = null;

  @SerializedName("DoctorName")
  private String doctorName = null;

  @SerializedName("EmergencyRoom")
  private Boolean emergencyRoom = null;

  @SerializedName("HospitalOvernight")
  private Boolean hospitalOvernight = null;

  @SerializedName("Hospital")
  private String hospital = null;

  @SerializedName("HospitalStreet")
  private String hospitalStreet = null;

  @SerializedName("HospitalCity")
  private String hospitalCity = null;

  @SerializedName("HospitalStateCode")
  private String hospitalStateCode = null;

  @SerializedName("HospitalZip")
  private String hospitalZip = null;

  @SerializedName("DateReturnToWork")
  private DateTime dateReturnToWork = null;

  @SerializedName("DaysLost")
  private Double daysLost = null;

  @SerializedName("DaysRestricted")
  private Double daysRestricted = null;

  @SerializedName("DateDied")
  private DateTime dateDied = null;

  @SerializedName("QuestionableClaim")
  private Boolean questionableClaim = null;

  @SerializedName("IsDaysLost")
  private Boolean isDaysLost = null;

  @SerializedName("WCBCaseNumber")
  private String wcBCaseNumber = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmployeeHRIncident hrIncidentNotes(EmployeeHRIncidentNoteCollection hrIncidentNotes) {
    this.hrIncidentNotes = hrIncidentNotes;
    return this;
  }

   /**
   * Get hrIncidentNotes
   * @return hrIncidentNotes
  **/
 
  public EmployeeHRIncidentNoteCollection getHrIncidentNotes() {
    return hrIncidentNotes;
  }

  public void setHrIncidentNotes(EmployeeHRIncidentNoteCollection hrIncidentNotes) {
    this.hrIncidentNotes = hrIncidentNotes;
  }

  public EmployeeHRIncident orgUnit(OrgUnitDetailConfiguration orgUnit) {
    this.orgUnit = orgUnit;
    return this;
  }

   /**
   * Get orgUnit
   * @return orgUnit
  **/
 
  public OrgUnitDetailConfiguration getOrgUnit() {
    return orgUnit;
  }

  public void setOrgUnit(OrgUnitDetailConfiguration orgUnit) {
    this.orgUnit = orgUnit;
  }

  public EmployeeHRIncident hrIncidentState(String hrIncidentState) {
    this.hrIncidentState = hrIncidentState;
    return this;
  }

   /**
   * Get hrIncidentState
   * @return hrIncidentState
  **/
 
  public String getHrIncidentState() {
    return hrIncidentState;
  }

  public void setHrIncidentState(String hrIncidentState) {
    this.hrIncidentState = hrIncidentState;
  }

  public EmployeeHRIncident openDate(DateTime openDate) {
    this.openDate = openDate;
    return this;
  }

   /**
   * Get openDate
   * @return openDate
  **/
 
  public DateTime getOpenDate() {
    return openDate;
  }

  public void setOpenDate(DateTime openDate) {
    this.openDate = openDate;
  }

  public EmployeeHRIncident hrIncidentAction(HRIncidentAction hrIncidentAction) {
    this.hrIncidentAction = hrIncidentAction;
    return this;
  }

   /**
   * Get hrIncidentAction
   * @return hrIncidentAction
  **/
 
  public HRIncidentAction getHrIncidentAction() {
    return hrIncidentAction;
  }

  public void setHrIncidentAction(HRIncidentAction hrIncidentAction) {
    this.hrIncidentAction = hrIncidentAction;
  }

  public EmployeeHRIncident hrIncidentType(HRIncidentType hrIncidentType) {
    this.hrIncidentType = hrIncidentType;
    return this;
  }

   /**
   * Get hrIncidentType
   * @return hrIncidentType
  **/
 
  public HRIncidentType getHrIncidentType() {
    return hrIncidentType;
  }

  public void setHrIncidentType(HRIncidentType hrIncidentType) {
    this.hrIncidentType = hrIncidentType;
  }

  public EmployeeHRIncident closedDate(DateTime closedDate) {
    this.closedDate = closedDate;
    return this;
  }

   /**
   * Get closedDate
   * @return closedDate
  **/
 
  public DateTime getClosedDate() {
    return closedDate;
  }

  public void setClosedDate(DateTime closedDate) {
    this.closedDate = closedDate;
  }

  public EmployeeHRIncident hrIncidentDate(DateTime hrIncidentDate) {
    this.hrIncidentDate = hrIncidentDate;
    return this;
  }

   /**
   * Get hrIncidentDate
   * @return hrIncidentDate
  **/
 
  public DateTime getHrIncidentDate() {
    return hrIncidentDate;
  }

  public void setHrIncidentDate(DateTime hrIncidentDate) {
    this.hrIncidentDate = hrIncidentDate;
  }

  public EmployeeHRIncident hrIncidentBeganWork(DateTime hrIncidentBeganWork) {
    this.hrIncidentBeganWork = hrIncidentBeganWork;
    return this;
  }

   /**
   * Get hrIncidentBeganWork
   * @return hrIncidentBeganWork
  **/
 
  public DateTime getHrIncidentBeganWork() {
    return hrIncidentBeganWork;
  }

  public void setHrIncidentBeganWork(DateTime hrIncidentBeganWork) {
    this.hrIncidentBeganWork = hrIncidentBeganWork;
  }

  public EmployeeHRIncident hrIncidentEventTime(DateTime hrIncidentEventTime) {
    this.hrIncidentEventTime = hrIncidentEventTime;
    return this;
  }

   /**
   * Get hrIncidentEventTime
   * @return hrIncidentEventTime
  **/
 
  public DateTime getHrIncidentEventTime() {
    return hrIncidentEventTime;
  }

  public void setHrIncidentEventTime(DateTime hrIncidentEventTime) {
    this.hrIncidentEventTime = hrIncidentEventTime;
  }

  public EmployeeHRIncident safetyHealthType(SafetyHealthType safetyHealthType) {
    this.safetyHealthType = safetyHealthType;
    return this;
  }

   /**
   * Get safetyHealthType
   * @return safetyHealthType
  **/
 
  public SafetyHealthType getSafetyHealthType() {
    return safetyHealthType;
  }

  public void setSafetyHealthType(SafetyHealthType safetyHealthType) {
    this.safetyHealthType = safetyHealthType;
  }

  public EmployeeHRIncident hrIncidentInjury(HRIncidentInjury hrIncidentInjury) {
    this.hrIncidentInjury = hrIncidentInjury;
    return this;
  }

   /**
   * Get hrIncidentInjury
   * @return hrIncidentInjury
  **/
 
  public HRIncidentInjury getHrIncidentInjury() {
    return hrIncidentInjury;
  }

  public void setHrIncidentInjury(HRIncidentInjury hrIncidentInjury) {
    this.hrIncidentInjury = hrIncidentInjury;
  }

  public EmployeeHRIncident hrIncidentBodyPart(HRIncidentBodyPart hrIncidentBodyPart) {
    this.hrIncidentBodyPart = hrIncidentBodyPart;
    return this;
  }

   /**
   * Get hrIncidentBodyPart
   * @return hrIncidentBodyPart
  **/
 
  public HRIncidentBodyPart getHrIncidentBodyPart() {
    return hrIncidentBodyPart;
  }

  public void setHrIncidentBodyPart(HRIncidentBodyPart hrIncidentBodyPart) {
    this.hrIncidentBodyPart = hrIncidentBodyPart;
  }

  public EmployeeHRIncident died(Boolean died) {
    this.died = died;
    return this;
  }

   /**
   * Get died
   * @return died
  **/
 
  public Boolean getDied() {
    return died;
  }

  public void setDied(Boolean died) {
    this.died = died;
  }

  public EmployeeHRIncident hrIncidentArea(String hrIncidentArea) {
    this.hrIncidentArea = hrIncidentArea;
    return this;
  }

   /**
   * Get hrIncidentArea
   * @return hrIncidentArea
  **/
 
  public String getHrIncidentArea() {
    return hrIncidentArea;
  }

  public void setHrIncidentArea(String hrIncidentArea) {
    this.hrIncidentArea = hrIncidentArea;
  }

  public EmployeeHRIncident taskBeingPerformed(String taskBeingPerformed) {
    this.taskBeingPerformed = taskBeingPerformed;
    return this;
  }

   /**
   * Get taskBeingPerformed
   * @return taskBeingPerformed
  **/
 
  public String getTaskBeingPerformed() {
    return taskBeingPerformed;
  }

  public void setTaskBeingPerformed(String taskBeingPerformed) {
    this.taskBeingPerformed = taskBeingPerformed;
  }

  public EmployeeHRIncident causedObject(String causedObject) {
    this.causedObject = causedObject;
    return this;
  }

   /**
   * Get causedObject
   * @return causedObject
  **/
 
  public String getCausedObject() {
    return causedObject;
  }

  public void setCausedObject(String causedObject) {
    this.causedObject = causedObject;
  }

  public EmployeeHRIncident causedAction(String causedAction) {
    this.causedAction = causedAction;
    return this;
  }

   /**
   * Get causedAction
   * @return causedAction
  **/
 
  public String getCausedAction() {
    return causedAction;
  }

  public void setCausedAction(String causedAction) {
    this.causedAction = causedAction;
  }

  public EmployeeHRIncident privacyCase(Boolean privacyCase) {
    this.privacyCase = privacyCase;
    return this;
  }

   /**
   * Get privacyCase
   * @return privacyCase
  **/
 
  public Boolean getPrivacyCase() {
    return privacyCase;
  }

  public void setPrivacyCase(Boolean privacyCase) {
    this.privacyCase = privacyCase;
  }

  public EmployeeHRIncident doctorName(String doctorName) {
    this.doctorName = doctorName;
    return this;
  }

   /**
   * Get doctorName
   * @return doctorName
  **/
 
  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }

  public EmployeeHRIncident emergencyRoom(Boolean emergencyRoom) {
    this.emergencyRoom = emergencyRoom;
    return this;
  }

   /**
   * Get emergencyRoom
   * @return emergencyRoom
  **/
 
  public Boolean getEmergencyRoom() {
    return emergencyRoom;
  }

  public void setEmergencyRoom(Boolean emergencyRoom) {
    this.emergencyRoom = emergencyRoom;
  }

  public EmployeeHRIncident hospitalOvernight(Boolean hospitalOvernight) {
    this.hospitalOvernight = hospitalOvernight;
    return this;
  }

   /**
   * Get hospitalOvernight
   * @return hospitalOvernight
  **/
 
  public Boolean getHospitalOvernight() {
    return hospitalOvernight;
  }

  public void setHospitalOvernight(Boolean hospitalOvernight) {
    this.hospitalOvernight = hospitalOvernight;
  }

  public EmployeeHRIncident hospital(String hospital) {
    this.hospital = hospital;
    return this;
  }

   /**
   * Get hospital
   * @return hospital
  **/
 
  public String getHospital() {
    return hospital;
  }

  public void setHospital(String hospital) {
    this.hospital = hospital;
  }

  public EmployeeHRIncident hospitalStreet(String hospitalStreet) {
    this.hospitalStreet = hospitalStreet;
    return this;
  }

   /**
   * Get hospitalStreet
   * @return hospitalStreet
  **/
 
  public String getHospitalStreet() {
    return hospitalStreet;
  }

  public void setHospitalStreet(String hospitalStreet) {
    this.hospitalStreet = hospitalStreet;
  }

  public EmployeeHRIncident hospitalCity(String hospitalCity) {
    this.hospitalCity = hospitalCity;
    return this;
  }

   /**
   * Get hospitalCity
   * @return hospitalCity
  **/
 
  public String getHospitalCity() {
    return hospitalCity;
  }

  public void setHospitalCity(String hospitalCity) {
    this.hospitalCity = hospitalCity;
  }

  public EmployeeHRIncident hospitalStateCode(String hospitalStateCode) {
    this.hospitalStateCode = hospitalStateCode;
    return this;
  }

   /**
   * Get hospitalStateCode
   * @return hospitalStateCode
  **/
 
  public String getHospitalStateCode() {
    return hospitalStateCode;
  }

  public void setHospitalStateCode(String hospitalStateCode) {
    this.hospitalStateCode = hospitalStateCode;
  }

  public EmployeeHRIncident hospitalZip(String hospitalZip) {
    this.hospitalZip = hospitalZip;
    return this;
  }

   /**
   * Get hospitalZip
   * @return hospitalZip
  **/
 
  public String getHospitalZip() {
    return hospitalZip;
  }

  public void setHospitalZip(String hospitalZip) {
    this.hospitalZip = hospitalZip;
  }

  public EmployeeHRIncident dateReturnToWork(DateTime dateReturnToWork) {
    this.dateReturnToWork = dateReturnToWork;
    return this;
  }

   /**
   * Get dateReturnToWork
   * @return dateReturnToWork
  **/
 
  public DateTime getDateReturnToWork() {
    return dateReturnToWork;
  }

  public void setDateReturnToWork(DateTime dateReturnToWork) {
    this.dateReturnToWork = dateReturnToWork;
  }

  public EmployeeHRIncident daysLost(Double daysLost) {
    this.daysLost = daysLost;
    return this;
  }

   /**
   * Get daysLost
   * @return daysLost
  **/
 
  public Double getDaysLost() {
    return daysLost;
  }

  public void setDaysLost(Double daysLost) {
    this.daysLost = daysLost;
  }

  public EmployeeHRIncident daysRestricted(Double daysRestricted) {
    this.daysRestricted = daysRestricted;
    return this;
  }

   /**
   * Get daysRestricted
   * @return daysRestricted
  **/
 
  public Double getDaysRestricted() {
    return daysRestricted;
  }

  public void setDaysRestricted(Double daysRestricted) {
    this.daysRestricted = daysRestricted;
  }

  public EmployeeHRIncident dateDied(DateTime dateDied) {
    this.dateDied = dateDied;
    return this;
  }

   /**
   * Get dateDied
   * @return dateDied
  **/
 
  public DateTime getDateDied() {
    return dateDied;
  }

  public void setDateDied(DateTime dateDied) {
    this.dateDied = dateDied;
  }

  public EmployeeHRIncident questionableClaim(Boolean questionableClaim) {
    this.questionableClaim = questionableClaim;
    return this;
  }

   /**
   * Get questionableClaim
   * @return questionableClaim
  **/
 
  public Boolean getQuestionableClaim() {
    return questionableClaim;
  }

  public void setQuestionableClaim(Boolean questionableClaim) {
    this.questionableClaim = questionableClaim;
  }

  public EmployeeHRIncident isDaysLost(Boolean isDaysLost) {
    this.isDaysLost = isDaysLost;
    return this;
  }

   /**
   * Get isDaysLost
   * @return isDaysLost
  **/
 
  public Boolean getIsDaysLost() {
    return isDaysLost;
  }

  public void setIsDaysLost(Boolean isDaysLost) {
    this.isDaysLost = isDaysLost;
  }

  public EmployeeHRIncident wcBCaseNumber(String wcBCaseNumber) {
    this.wcBCaseNumber = wcBCaseNumber;
    return this;
  }

   /**
   * Get wcBCaseNumber
   * @return wcBCaseNumber
  **/
 
  public String getWcBCaseNumber() {
    return wcBCaseNumber;
  }

  public void setWcBCaseNumber(String wcBCaseNumber) {
    this.wcBCaseNumber = wcBCaseNumber;
  }

  public EmployeeHRIncident lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EmployeeHRIncident employeeHRIncident = (EmployeeHRIncident) o;
    return Objects.equals(this.hrIncidentNotes, employeeHRIncident.hrIncidentNotes) &&
        Objects.equals(this.orgUnit, employeeHRIncident.orgUnit) &&
        Objects.equals(this.hrIncidentState, employeeHRIncident.hrIncidentState) &&
        Objects.equals(this.openDate, employeeHRIncident.openDate) &&
        Objects.equals(this.hrIncidentAction, employeeHRIncident.hrIncidentAction) &&
        Objects.equals(this.hrIncidentType, employeeHRIncident.hrIncidentType) &&
        Objects.equals(this.closedDate, employeeHRIncident.closedDate) &&
        Objects.equals(this.hrIncidentDate, employeeHRIncident.hrIncidentDate) &&
        Objects.equals(this.hrIncidentBeganWork, employeeHRIncident.hrIncidentBeganWork) &&
        Objects.equals(this.hrIncidentEventTime, employeeHRIncident.hrIncidentEventTime) &&
        Objects.equals(this.safetyHealthType, employeeHRIncident.safetyHealthType) &&
        Objects.equals(this.hrIncidentInjury, employeeHRIncident.hrIncidentInjury) &&
        Objects.equals(this.hrIncidentBodyPart, employeeHRIncident.hrIncidentBodyPart) &&
        Objects.equals(this.died, employeeHRIncident.died) &&
        Objects.equals(this.hrIncidentArea, employeeHRIncident.hrIncidentArea) &&
        Objects.equals(this.taskBeingPerformed, employeeHRIncident.taskBeingPerformed) &&
        Objects.equals(this.causedObject, employeeHRIncident.causedObject) &&
        Objects.equals(this.causedAction, employeeHRIncident.causedAction) &&
        Objects.equals(this.privacyCase, employeeHRIncident.privacyCase) &&
        Objects.equals(this.doctorName, employeeHRIncident.doctorName) &&
        Objects.equals(this.emergencyRoom, employeeHRIncident.emergencyRoom) &&
        Objects.equals(this.hospitalOvernight, employeeHRIncident.hospitalOvernight) &&
        Objects.equals(this.hospital, employeeHRIncident.hospital) &&
        Objects.equals(this.hospitalStreet, employeeHRIncident.hospitalStreet) &&
        Objects.equals(this.hospitalCity, employeeHRIncident.hospitalCity) &&
        Objects.equals(this.hospitalStateCode, employeeHRIncident.hospitalStateCode) &&
        Objects.equals(this.hospitalZip, employeeHRIncident.hospitalZip) &&
        Objects.equals(this.dateReturnToWork, employeeHRIncident.dateReturnToWork) &&
        Objects.equals(this.daysLost, employeeHRIncident.daysLost) &&
        Objects.equals(this.daysRestricted, employeeHRIncident.daysRestricted) &&
        Objects.equals(this.dateDied, employeeHRIncident.dateDied) &&
        Objects.equals(this.questionableClaim, employeeHRIncident.questionableClaim) &&
        Objects.equals(this.isDaysLost, employeeHRIncident.isDaysLost) &&
        Objects.equals(this.wcBCaseNumber, employeeHRIncident.wcBCaseNumber) &&
        Objects.equals(this.lastModifiedTimestamp, employeeHRIncident.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hrIncidentNotes, orgUnit, hrIncidentState, openDate, hrIncidentAction, hrIncidentType, closedDate, hrIncidentDate, hrIncidentBeganWork, hrIncidentEventTime, safetyHealthType, hrIncidentInjury, hrIncidentBodyPart, died, hrIncidentArea, taskBeingPerformed, causedObject, causedAction, privacyCase, doctorName, emergencyRoom, hospitalOvernight, hospital, hospitalStreet, hospitalCity, hospitalStateCode, hospitalZip, dateReturnToWork, daysLost, daysRestricted, dateDied, questionableClaim, isDaysLost, wcBCaseNumber, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeHRIncident {\n");
    
    sb.append("    hrIncidentNotes: ").append(toIndentedString(hrIncidentNotes)).append("\n");
    sb.append("    orgUnit: ").append(toIndentedString(orgUnit)).append("\n");
    sb.append("    hrIncidentState: ").append(toIndentedString(hrIncidentState)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    hrIncidentAction: ").append(toIndentedString(hrIncidentAction)).append("\n");
    sb.append("    hrIncidentType: ").append(toIndentedString(hrIncidentType)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    hrIncidentDate: ").append(toIndentedString(hrIncidentDate)).append("\n");
    sb.append("    hrIncidentBeganWork: ").append(toIndentedString(hrIncidentBeganWork)).append("\n");
    sb.append("    hrIncidentEventTime: ").append(toIndentedString(hrIncidentEventTime)).append("\n");
    sb.append("    safetyHealthType: ").append(toIndentedString(safetyHealthType)).append("\n");
    sb.append("    hrIncidentInjury: ").append(toIndentedString(hrIncidentInjury)).append("\n");
    sb.append("    hrIncidentBodyPart: ").append(toIndentedString(hrIncidentBodyPart)).append("\n");
    sb.append("    died: ").append(toIndentedString(died)).append("\n");
    sb.append("    hrIncidentArea: ").append(toIndentedString(hrIncidentArea)).append("\n");
    sb.append("    taskBeingPerformed: ").append(toIndentedString(taskBeingPerformed)).append("\n");
    sb.append("    causedObject: ").append(toIndentedString(causedObject)).append("\n");
    sb.append("    causedAction: ").append(toIndentedString(causedAction)).append("\n");
    sb.append("    privacyCase: ").append(toIndentedString(privacyCase)).append("\n");
    sb.append("    doctorName: ").append(toIndentedString(doctorName)).append("\n");
    sb.append("    emergencyRoom: ").append(toIndentedString(emergencyRoom)).append("\n");
    sb.append("    hospitalOvernight: ").append(toIndentedString(hospitalOvernight)).append("\n");
    sb.append("    hospital: ").append(toIndentedString(hospital)).append("\n");
    sb.append("    hospitalStreet: ").append(toIndentedString(hospitalStreet)).append("\n");
    sb.append("    hospitalCity: ").append(toIndentedString(hospitalCity)).append("\n");
    sb.append("    hospitalStateCode: ").append(toIndentedString(hospitalStateCode)).append("\n");
    sb.append("    hospitalZip: ").append(toIndentedString(hospitalZip)).append("\n");
    sb.append("    dateReturnToWork: ").append(toIndentedString(dateReturnToWork)).append("\n");
    sb.append("    daysLost: ").append(toIndentedString(daysLost)).append("\n");
    sb.append("    daysRestricted: ").append(toIndentedString(daysRestricted)).append("\n");
    sb.append("    dateDied: ").append(toIndentedString(dateDied)).append("\n");
    sb.append("    questionableClaim: ").append(toIndentedString(questionableClaim)).append("\n");
    sb.append("    isDaysLost: ").append(toIndentedString(isDaysLost)).append("\n");
    sb.append("    wcBCaseNumber: ").append(toIndentedString(wcBCaseNumber)).append("\n");
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

