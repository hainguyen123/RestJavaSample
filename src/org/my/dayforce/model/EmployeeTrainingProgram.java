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
import org.my.dayforce.model.TrainingProgram;

/**
 * EmployeeTrainingProgram
 */

public class EmployeeTrainingProgram {
  @SerializedName("TrainingProgram")
  private TrainingProgram trainingProgram = null;

  @SerializedName("EnrollmentDate")
  private DateTime enrollmentDate = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmployeeTrainingProgram trainingProgram(TrainingProgram trainingProgram) {
    this.trainingProgram = trainingProgram;
    return this;
  }

   /**
   * Get trainingProgram
   * @return trainingProgram
  **/
 
  public TrainingProgram getTrainingProgram() {
    return trainingProgram;
  }

  public void setTrainingProgram(TrainingProgram trainingProgram) {
    this.trainingProgram = trainingProgram;
  }

  public EmployeeTrainingProgram enrollmentDate(DateTime enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
    return this;
  }

   /**
   * Get enrollmentDate
   * @return enrollmentDate
  **/
 
  public DateTime getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(DateTime enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }

  public EmployeeTrainingProgram lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EmployeeTrainingProgram employeeTrainingProgram = (EmployeeTrainingProgram) o;
    return Objects.equals(this.trainingProgram, employeeTrainingProgram.trainingProgram) &&
        Objects.equals(this.enrollmentDate, employeeTrainingProgram.enrollmentDate) &&
        Objects.equals(this.lastModifiedTimestamp, employeeTrainingProgram.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainingProgram, enrollmentDate, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTrainingProgram {\n");
    
    sb.append("    trainingProgram: ").append(toIndentedString(trainingProgram)).append("\n");
    sb.append("    enrollmentDate: ").append(toIndentedString(enrollmentDate)).append("\n");
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

