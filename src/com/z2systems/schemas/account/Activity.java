
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.CreationLog;
import com.z2systems.schemas.common.CustomFieldDataList;
import com.z2systems.schemas.common.IdNamePair;


/**
 * <p>Java class for Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Activity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}CreationLog"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.z2systems.com/schemas/common/}LongTextType"/&gt;
 *         &lt;element name="note" type="{http://www.z2systems.com/schemas/common/}ExtraLongTextType" minOccurs="0"/&gt;
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="timeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="systemUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="activityStatus" type="{http://www.z2systems.com/schemas/common/}IdNamePair"/&gt;
 *         &lt;element name="activityPriority" type="{http://www.z2systems.com/schemas/account/}PriorityType"/&gt;
 *         &lt;element name="encryptedIosCalendarKey" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="customFieldDataList" type="{http://www.z2systems.com/schemas/common/}CustomFieldDataList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity", propOrder = {
    "activityId",
    "subject",
    "note",
    "startDateTime",
    "endDateTime",
    "timeZoneOffset",
    "clientId",
    "systemUserId",
    "activityStatus",
    "activityPriority",
    "encryptedIosCalendarKey",
    "customFieldDataList"
})
public class Activity
    extends CreationLog
{

    protected Long activityId;
    @XmlElement(required = true)
    protected String subject;
    protected String note;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    protected Long timeZoneOffset;
    protected Long clientId;
    protected Long systemUserId;
    @XmlElement(required = true)
    protected IdNamePair activityStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PriorityType activityPriority;
    protected String encryptedIosCalendarKey;
    protected CustomFieldDataList customFieldDataList;

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivityId(Long value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the timeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Sets the value of the timeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeZoneOffset(Long value) {
        this.timeZoneOffset = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientId(Long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the systemUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSystemUserId() {
        return systemUserId;
    }

    /**
     * Sets the value of the systemUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSystemUserId(Long value) {
        this.systemUserId = value;
    }

    /**
     * Gets the value of the activityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getActivityStatus() {
        return activityStatus;
    }

    /**
     * Sets the value of the activityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setActivityStatus(IdNamePair value) {
        this.activityStatus = value;
    }

    /**
     * Gets the value of the activityPriority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getActivityPriority() {
        return activityPriority;
    }

    /**
     * Sets the value of the activityPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setActivityPriority(PriorityType value) {
        this.activityPriority = value;
    }

    /**
     * Gets the value of the encryptedIosCalendarKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedIosCalendarKey() {
        return encryptedIosCalendarKey;
    }

    /**
     * Sets the value of the encryptedIosCalendarKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedIosCalendarKey(String value) {
        this.encryptedIosCalendarKey = value;
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
