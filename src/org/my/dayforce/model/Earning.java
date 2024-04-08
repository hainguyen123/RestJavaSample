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
import org.my.dayforce.model.CalculationType;
import org.my.dayforce.model.EarningCode;

/**
 * Earning
 */

public class Earning {
  @SerializedName("CalculationType")
  private CalculationType calculationType = null;

  @SerializedName("CreditJournalNumber")
  private String creditJournalNumber = null;

  @SerializedName("DebitJournalNumber")
  private String debitJournalNumber = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("EarningCode")
  private EarningCode earningCode = null;

  @SerializedName("IsDecliningBalance")
  private Boolean isDecliningBalance = null;

  @SerializedName("IsGenerated")
  private Boolean isGenerated = null;

  @SerializedName("XRefCode")
  private String xrefCode = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("LongName")
  private String longName = null;

  @SerializedName("LastModifiedTimestamp")
  private DateTime lastModifiedTimestamp = null;

  public Earning calculationType(CalculationType calculationType) {
    this.calculationType = calculationType;
    return this;
  }

   /**
   * Get calculationType
   * @return calculationType
  **/
 
  public CalculationType getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(CalculationType calculationType) {
    this.calculationType = calculationType;
  }

  public Earning creditJournalNumber(String creditJournalNumber) {
    this.creditJournalNumber = creditJournalNumber;
    return this;
  }

   /**
   * Get creditJournalNumber
   * @return creditJournalNumber
  **/
 
  public String getCreditJournalNumber() {
    return creditJournalNumber;
  }

  public void setCreditJournalNumber(String creditJournalNumber) {
    this.creditJournalNumber = creditJournalNumber;
  }

  public Earning debitJournalNumber(String debitJournalNumber) {
    this.debitJournalNumber = debitJournalNumber;
    return this;
  }

   /**
   * Get debitJournalNumber
   * @return debitJournalNumber
  **/
 
  public String getDebitJournalNumber() {
    return debitJournalNumber;
  }

  public void setDebitJournalNumber(String debitJournalNumber) {
    this.debitJournalNumber = debitJournalNumber;
  }

  public Earning displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
 
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Earning earningCode(EarningCode earningCode) {
    this.earningCode = earningCode;
    return this;
  }

   /**
   * Get earningCode
   * @return earningCode
  **/
 
  public EarningCode getEarningCode() {
    return earningCode;
  }

  public void setEarningCode(EarningCode earningCode) {
    this.earningCode = earningCode;
  }

  public Earning isDecliningBalance(Boolean isDecliningBalance) {
    this.isDecliningBalance = isDecliningBalance;
    return this;
  }

   /**
   * Get isDecliningBalance
   * @return isDecliningBalance
  **/
 
  public Boolean getIsDecliningBalance() {
    return isDecliningBalance;
  }

  public void setIsDecliningBalance(Boolean isDecliningBalance) {
    this.isDecliningBalance = isDecliningBalance;
  }

  public Earning isGenerated(Boolean isGenerated) {
    this.isGenerated = isGenerated;
    return this;
  }

   /**
   * Get isGenerated
   * @return isGenerated
  **/
 
  public Boolean getIsGenerated() {
    return isGenerated;
  }

  public void setIsGenerated(Boolean isGenerated) {
    this.isGenerated = isGenerated;
  }

  public Earning xrefCode(String xrefCode) {
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

  public Earning shortName(String shortName) {
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

  public Earning longName(String longName) {
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

  public Earning lastModifiedTimestamp(DateTime lastModifiedTimestamp) {
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
    Earning earning = (Earning) o;
    return Objects.equals(this.calculationType, earning.calculationType) &&
        Objects.equals(this.creditJournalNumber, earning.creditJournalNumber) &&
        Objects.equals(this.debitJournalNumber, earning.debitJournalNumber) &&
        Objects.equals(this.displayName, earning.displayName) &&
        Objects.equals(this.earningCode, earning.earningCode) &&
        Objects.equals(this.isDecliningBalance, earning.isDecliningBalance) &&
        Objects.equals(this.isGenerated, earning.isGenerated) &&
        Objects.equals(this.xrefCode, earning.xrefCode) &&
        Objects.equals(this.shortName, earning.shortName) &&
        Objects.equals(this.longName, earning.longName) &&
        Objects.equals(this.lastModifiedTimestamp, earning.lastModifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationType, creditJournalNumber, debitJournalNumber, displayName, earningCode, isDecliningBalance, isGenerated, xrefCode, shortName, longName, lastModifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Earning {\n");
    
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    creditJournalNumber: ").append(toIndentedString(creditJournalNumber)).append("\n");
    sb.append("    debitJournalNumber: ").append(toIndentedString(debitJournalNumber)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    earningCode: ").append(toIndentedString(earningCode)).append("\n");
    sb.append("    isDecliningBalance: ").append(toIndentedString(isDecliningBalance)).append("\n");
    sb.append("    isGenerated: ").append(toIndentedString(isGenerated)).append("\n");
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
