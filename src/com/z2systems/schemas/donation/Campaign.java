
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.IdNamePair;
import com.z2systems.schemas.common.RecordStatus;


/**
 * <p>Java class for Campaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Campaign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.z2systems.com/schemas/common/}ShortTextType" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fund" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="purpose" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="parentCampaign" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="pageContent" type="{http://www.z2systems.com/schemas/common/}TextFieldType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.z2systems.com/schemas/common/}RecordStatus" minOccurs="0"/&gt;
 *         &lt;element name="donationCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="donationAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="pledgeCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pledgeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="registrationCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="registrationAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="attendeeCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="grandTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="goal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="campaignPageLink" type="{http://www.z2systems.com/schemas/common/}ExtraLongTextType" minOccurs="0"/&gt;
 *         &lt;element name="donationFormLink" type="{http://www.z2systems.com/schemas/common/}ExtraLongTextType" minOccurs="0"/&gt;
 *         &lt;element name="socialFundraising" type="{http://www.z2systems.com/schemas/donation/}SocialFundraising" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Campaign", propOrder = {
    "id",
    "name",
    "code",
    "startDate",
    "endDate",
    "fund",
    "purpose",
    "parentCampaign",
    "pageContent",
    "status",
    "donationCount",
    "donationAmount",
    "pledgeCount",
    "pledgeAmount",
    "registrationCount",
    "registrationAmount",
    "attendeeCount",
    "grandTotal",
    "goal",
    "campaignPageLink",
    "donationFormLink",
    "socialFundraising"
})
public class Campaign {

    protected Long id;
    protected String name;
    protected String code;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected IdNamePair fund;
    protected IdNamePair purpose;
    protected IdNamePair parentCampaign;
    protected String pageContent;
    @XmlSchemaType(name = "string")
    protected RecordStatus status;
    protected Long donationCount;
    protected Double donationAmount;
    protected Long pledgeCount;
    protected Double pledgeAmount;
    protected Long registrationCount;
    protected Double registrationAmount;
    protected Long attendeeCount;
    protected Double grandTotal;
    protected Double goal;
    protected String campaignPageLink;
    protected String donationFormLink;
    protected SocialFundraising socialFundraising;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the fund property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getFund() {
        return fund;
    }

    /**
     * Sets the value of the fund property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setFund(IdNamePair value) {
        this.fund = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setPurpose(IdNamePair value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the parentCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getParentCampaign() {
        return parentCampaign;
    }

    /**
     * Sets the value of the parentCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setParentCampaign(IdNamePair value) {
        this.parentCampaign = value;
    }

    /**
     * Gets the value of the pageContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageContent() {
        return pageContent;
    }

    /**
     * Sets the value of the pageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageContent(String value) {
        this.pageContent = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RecordStatus }
     *     
     */
    public RecordStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatus }
     *     
     */
    public void setStatus(RecordStatus value) {
        this.status = value;
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
     * Gets the value of the goal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGoal() {
        return goal;
    }

    /**
     * Sets the value of the goal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGoal(Double value) {
        this.goal = value;
    }

    /**
     * Gets the value of the campaignPageLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignPageLink() {
        return campaignPageLink;
    }

    /**
     * Sets the value of the campaignPageLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignPageLink(String value) {
        this.campaignPageLink = value;
    }

    /**
     * Gets the value of the donationFormLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonationFormLink() {
        return donationFormLink;
    }

    /**
     * Sets the value of the donationFormLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonationFormLink(String value) {
        this.donationFormLink = value;
    }

    /**
     * Gets the value of the socialFundraising property.
     * 
     * @return
     *     possible object is
     *     {@link SocialFundraising }
     *     
     */
    public SocialFundraising getSocialFundraising() {
        return socialFundraising;
    }

    /**
     * Sets the value of the socialFundraising property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialFundraising }
     *     
     */
    public void setSocialFundraising(SocialFundraising value) {
        this.socialFundraising = value;
    }

}
