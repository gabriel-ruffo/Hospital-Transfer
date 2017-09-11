
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.AbstractRequest;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for SyncActivitiesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncActivitiesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activityIds" type="{http://www.z2systems.com/schemas/account/}ActivityIdList" minOccurs="0"/&gt;
 *         &lt;element name="syncActivityTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="syncActivityTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="page" type="{http://www.z2systems.com/schemas/common/}Page" minOccurs="0"/&gt;
 *         &lt;element name="ignoreDeletedIdList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncActivitiesRequest", propOrder = {
    "activityIds",
    "syncActivityTimeFrom",
    "syncActivityTimeTo",
    "page",
    "ignoreDeletedIdList"
})
public class SyncActivitiesRequest
    extends AbstractRequest
{

    protected ActivityIdList activityIds;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar syncActivityTimeFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar syncActivityTimeTo;
    protected Page page;
    protected Boolean ignoreDeletedIdList;

    /**
     * Gets the value of the activityIds property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityIdList }
     *     
     */
    public ActivityIdList getActivityIds() {
        return activityIds;
    }

    /**
     * Sets the value of the activityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityIdList }
     *     
     */
    public void setActivityIds(ActivityIdList value) {
        this.activityIds = value;
    }

    /**
     * Gets the value of the syncActivityTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSyncActivityTimeFrom() {
        return syncActivityTimeFrom;
    }

    /**
     * Sets the value of the syncActivityTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSyncActivityTimeFrom(XMLGregorianCalendar value) {
        this.syncActivityTimeFrom = value;
    }

    /**
     * Gets the value of the syncActivityTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSyncActivityTimeTo() {
        return syncActivityTimeTo;
    }

    /**
     * Sets the value of the syncActivityTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSyncActivityTimeTo(XMLGregorianCalendar value) {
        this.syncActivityTimeTo = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Page }
     *     
     */
    public Page getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Page }
     *     
     */
    public void setPage(Page value) {
        this.page = value;
    }

    /**
     * Gets the value of the ignoreDeletedIdList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDeletedIdList() {
        return ignoreDeletedIdList;
    }

    /**
     * Sets the value of the ignoreDeletedIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDeletedIdList(Boolean value) {
        this.ignoreDeletedIdList = value;
    }

}
