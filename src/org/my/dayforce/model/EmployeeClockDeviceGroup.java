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
import org.my.dayforce.model.ClockDeviceGroup;

/**
 * EmployeeClockDeviceGroup
 */

public class EmployeeClockDeviceGroup {
  @SerializedName("ClockDeviceGroup")
  private ClockDeviceGroup clockDeviceGroup = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public EmployeeClockDeviceGroup clockDeviceGroup(ClockDeviceGroup clockDeviceGroup) {
    this.clockDeviceGroup = clockDeviceGroup;
    return this;
  }

   /**
   * Get clockDeviceGroup
   * @return clockDeviceGroup
  **/
 
  public ClockDeviceGroup getClockDeviceGroup() {
    return clockDeviceGroup;
  }

  public void setClockDeviceGroup(ClockDeviceGroup clockDeviceGroup) {
    this.clockDeviceGroup = clockDeviceGroup;
  }

  public EmployeeClockDeviceGroup lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    EmployeeClockDeviceGroup employeeClockDeviceGroup = (EmployeeClockDeviceGroup) o;
    return Objects.equals(this.clockDeviceGroup, employeeClockDeviceGroup.clockDeviceGroup) &&
        Objects.equals(this.lastModifiedTimestamp, employeeClockDeviceGroup.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clockDeviceGroup, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeClockDeviceGroup {\n");
    
    sb.append("    clockDeviceGroup: ").append(toIndentedString(clockDeviceGroup)).append("\n");
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

