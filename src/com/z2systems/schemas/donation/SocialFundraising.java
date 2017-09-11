
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialFundraising complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialFundraising"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fundraisersCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="donationCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="donationAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="pledgeCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pledgeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="registrationCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="registrationAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="attendeeCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="grandTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="createFundraiserLink" type="{http://www.z2systems.com/schemas/common/}ExtraLongTextType" minOccurs="0"/&gt;
 *         &lt;element name="campaignFundraiserList" type="{http://www.z2systems.com/schemas/common/}ExtraLongTextType" minOccurs="0"/&gt;
 *         &lt;element name="fundraisingPageContent" type="{http://www.z2systems.com/schemas/common/}TextFieldType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialFundraising", propOrder = {
    "enabled",
    "fundraisersCount",
    "donationCount",
    "donationAmount",
    "pledgeCount",
    "pledgeAmount",
    "registrationCount",
    "registrationAmount",
    "attendeeCount",
    "grandTotal",
    "createFundraiserLink",
    "campaignFundraiserList",
    "fundraisingPageContent"
})
public class SocialFundraising {

    protected Boolean enabled;
    protected Long fundraisersCount;
    protected Long donationCount;
    protected Double donationAmount;
    protected Long pledgeCount;
    protected Double pledgeAmount;
    protected Long registrationCount;
    protected Double registrationAmount;
    protected Long attendeeCount;
    protected Double grandTotal;
    protected String createFundraiserLink;
    protected String campaignFundraiserList;
    protected String fundraisingPageContent;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the fundraisersCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFundraisersCount() {
        return fundraisersCount;
    }

    /**
     * Sets the value of the fundraisersCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFundraisersCount(Long value) {
        this.fundraisersCount = value;
    }

    /**
     * Gets the value of the donationCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDonationCount() {
        return donationCount;
    }

    /**
     * Sets the value of the donationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDonationCount(Long value) {
        this.donationCount = value;
    }

    /**
     * Gets the value of the donationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDonationAmount() {
        return donationAmount;
    }

    /**
     * Sets the value of the donationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDonationAmount(Double value) {
        this.donationAmount = value;
    }

    /**
     * Gets the value of the pledgeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPledgeCount() {
        return pledgeCount;
    }

    /**
     * Sets the value of the pledgeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPledgeCount(Long value) {
        this.pledgeCount = value;
    }

    /**
     * Gets the value of the pledgeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPledgeAmount() {
        return pledgeAmount;
    }

    /**
     * Sets the value of the pledgeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPledgeAmount(Double value) {
        this.pledgeAmount = value;
    }

    /**
     * Gets the value of the registrationCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegistrationCount() {
        return registrationCount;
    }

    /**
     * Sets the value of the registrationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegistrationCount(Long value) {
        this.registrationCount = value;
    }

    /**
     * Gets the value of the registrationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRegistrationAmount() {
        return registrationAmount;
    }

    /**
     * Sets the value of the registrationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRegistrationAmount(Double value) {
        this.registrationAmount = value;
    }

    /**
     * Gets the value of the attendeeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttendeeCount() {
        return attendeeCount;
    }

    /**
     * Sets the value of the attendeeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttendeeCount(Long value) {
        this.attendeeCount = value;
    }

    /**
     * Gets the value of the grandTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrandTotal() {
        return grandTotal;
    }

    /**
     * Sets the value of the grandTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrandTotal(Double value) {
        this.grandTotal = value;
    }

    /**
     * Gets the value of the createFundraiserLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateFundraiserLink() {
        return createFundraiserLink;
    }

    /**
     * Sets the value of the createFundraiserLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateFundraiserLink(String value) {
        this.createFundraiserLink = value;
    }

    /**
     * Gets the value of the campaignFundraiserList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignFundraiserList() {
        return campaignFundraiserList;
    }

    /**
     * Sets the value of the campaignFundraiserList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignFundraiserList(String value) {
        this.campaignFundraiserList = value;
    }

    /**
     * Gets the value of the fundraisingPageContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundraisingPageContent() {
        return fundraisingPageContent;
    }

    /**
     * Sets the value of the fundraisingPageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundraisingPageContent(String value) {
        this.fundraisingPageContent = value;
    }

}
