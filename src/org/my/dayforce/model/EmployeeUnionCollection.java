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
import org.my.dayforce.model.EmployeeUnionMembership;

/**
 * EmployeeUnionCollection
 */

public class EmployeeUnionCollection {
  @SerializedName("Items")
  private List<EmployeeUnionMembership> items = new ArrayList<EmployeeUnionMembership>();

  public EmployeeUnionCollection items(List<EmployeeUnionMembership> items) {
    this.items = items;
    return this;
  }

  public EmployeeUnionCollection addItemsItem(EmployeeUnionMembership itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
 
  public List<EmployeeUnionMembership> getItems() {
    return items;
  }

  public void setItems(List<EmployeeUnionMembership> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeUnionCollection employeeUnionCollection = (EmployeeUnionCollection) o;
    return Objects.equals(this.items, employeeUnionCollection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeUnionCollection {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

