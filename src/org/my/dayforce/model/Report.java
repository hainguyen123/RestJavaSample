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


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This class encapsulates the report data generated during the execution of the report.
 */

public class Report {
  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("Rows")
  private List<Map<String, String>> rows = new ArrayList<Map<String, String>>();

  public Report xrefCode(String xrefCode) {
    this.xrefCode = xrefCode;
    return this;
  }

   /**
   * Reference Code for the Report.  This is a unique, human readable, code used to identify the Report.
   * @return xrefCode
  **/
 
  public String getXrefCode() {
    return xrefCode;
  }

  public void setXrefCode(String xrefCode) {
    this.xrefCode = xrefCode;
  }

  public Report rows(List<Map<String, String>> rows) {
    this.rows = rows;
    return this;
  }

  public Report addRowsItem(Map<String, String> rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * An array of Dictionary objects which contain the report data.   Each dictionary object represents a row: the key is column name and the values is the column value for the row.
   * @return rows
  **/
 
  public List<Map<String, String>> getRows() {
    return rows;
  }

  public void setRows(List<Map<String, String>> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.xrefCode, report.xrefCode) &&
        Objects.equals(this.rows, report.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xrefCode, rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    xrefCode: ").append(toIndentedString(xrefCode)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

