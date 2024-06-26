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
import org.my.dayforce.model.Paging;
import org.my.dayforce.model.ProcessResult;
import org.my.dayforce.model.Report;

/**
 * PaginatedPayloadReport
 */

public class PaginatedPayloadReport {
  @SerializedName("Data")
  private Report data = null;

  @SerializedName("ProcessResults")
  private List<ProcessResult> processResults = new ArrayList<ProcessResult>();

  @SerializedName("Paging")
  private Paging paging = null;

  public PaginatedPayloadReport data(Report data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
 
  public Report getData() {
    return data;
  }

  public void setData(Report data) {
    this.data = data;
  }

  public PaginatedPayloadReport processResults(List<ProcessResult> processResults) {
    this.processResults = processResults;
    return this;
  }

  public PaginatedPayloadReport addProcessResultsItem(ProcessResult processResultsItem) {
    this.processResults.add(processResultsItem);
    return this;
  }

   /**
   * Get processResults
   * @return processResults
  **/
 
  public List<ProcessResult> getProcessResults() {
    return processResults;
  }

  public void setProcessResults(List<ProcessResult> processResults) {
    this.processResults = processResults;
  }

  public PaginatedPayloadReport paging(Paging paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
 
  public Paging getPaging() {
    return paging;
  }

  public void setPaging(Paging paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedPayloadReport paginatedPayloadReport = (PaginatedPayloadReport) o;
    return Objects.equals(this.data, paginatedPayloadReport.data) &&
        Objects.equals(this.processResults, paginatedPayloadReport.processResults) &&
        Objects.equals(this.paging, paginatedPayloadReport.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, processResults, paging);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedPayloadReport {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    processResults: ").append(toIndentedString(processResults)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

