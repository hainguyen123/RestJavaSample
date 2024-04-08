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
import org.my.dayforce.model.EmergencyContactPersonAddress;

/**
 * EmergencyContactPersonAddressCollection
 */

public class EmergencyContactPersonAddressCollection {
  @SerializedName("Items")
  private List<EmergencyContactPersonAddress> items = new ArrayList<EmergencyContactPersonAddress>();

  public EmergencyContactPersonAddressCollection items(List<EmergencyContactPersonAddress> items) {
    this.items = items;
    return this;
  }

  public EmergencyContactPersonAddressCollection addItemsItem(EmergencyContactPersonAddress itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
 
  public List<EmergencyContactPersonAddress> getItems() {
    return items;
  }

  public void setItems(List<EmergencyContactPersonAddress> items) {
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
    EmergencyContactPersonAddressCollection emergencyContactPersonAddressCollection = (EmergencyContactPersonAddressCollection) o;
    return Objects.equals(this.items, emergencyContactPersonAddressCollection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencyContactPersonAddressCollection {\n");
    
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

