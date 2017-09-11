
package com.z2systems.schemas.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.CustomFieldDataList;


/**
 * <p>Java class for EventAttendeesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventAttendeesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registrantAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="registrantName" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="registrationStatus" type="{http://www.z2systems.com/schemas/event/}RegistrationStatus" minOccurs="0"/&gt;
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="attendeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="attendeeAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="attendeeFirstName" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="attendeeLastName" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="markedAttended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customFieldDataList" type="{http://www.z2systems.com/schemas/common/}CustomFieldDataList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventAttendeesResult", propOrder = {
    "registrantAccountId",
    "registrantName",
    "registrationStatus",
    "registrationDate",
    "attendeeId",
    "attendeeAccountId",
    "attendeeFirstName",
    "attendeeLastName",
    "markedAttended",
    "customFieldDataList"
})
public class EventAttendeesResult {

    protected Long registrantAccountId;
    protected String registrantName;
    @XmlSchemaType(name = "string")
    protected RegistrationStatus registrationStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    protected Long attendeeId;
    protected Long attendeeAccountId;
    protected String attendeeFirstName;
    protected String attendeeLastName;
    protected Boolean markedAttended;
    protected CustomFieldDataList customFieldDataList;

    /**
     * Gets the value of the registrantAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegistrantAccountId() {
        return registrantAccountId;
    }

    /**
     * Sets the value of the registrantAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegistrantAccountId(Long value) {
        this.registrantAccountId = value;
    }

    /**
     * Gets the value of the registrantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrantName() {
        return registrantName;
    }

    /**
     * Sets the value of the registrantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrantName(String value) {
        this.registrantName = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatus }
     *     
     */
    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatus }
     *     
     */
    public void setRegistrationStatus(RegistrationStatus value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the attendeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttendeeId() {
        return attendeeId;
    }

    /**
     * Sets the value of the attendeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttendeeId(Long value) {
        this.attendeeId = value;
    }

    /**
     * Gets the value of the attendeeAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttendeeAccountId() {
        return attendeeAccountId;
    }

    /**
     * Sets the value of the attendeeAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttendeeAccountId(Long value) {
        this.attendeeAccountId = value;
    }

    /**
     * Gets the value of the attendeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeFirstName() {
        return attendeeFirstName;
    }

    /**
     * Sets the value of the attendeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeFirstName(String value) {
        this.attendeeFirstName = value;
    }

    /**
     * Gets the value of the attendeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeLastName() {
        return attendeeLastName;
    }

    /**
     * Sets the value of the attendeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeLastName(String value) {
        this.attendeeLastName = value;
    }

    /**
     * Gets the value of the markedAttended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkedAttended() {
        return markedAttended;
    }

    /**
     * Sets the value of the markedAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkedAttended(Boolean value) {
        this.markedAttended = value;
    }

    /**
     * Gets the value of the customFieldDataList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldDataList }
     *     
     */
    public CustomFieldDataList getCustomFieldDataList() {
        return customFieldDataList;
    }

    /**
     * Sets the value of the customFieldDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldDataList }
     *     
     */
    public void setCustomFieldDataList(CustomFieldDataList value) {
        this.customFieldDataList = value;
    }

}
