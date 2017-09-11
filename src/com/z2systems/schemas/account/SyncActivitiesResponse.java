
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for SyncActivitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncActivitiesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activities" type="{http://www.z2systems.com/schemas/account/}ActivityList" minOccurs="0"/&gt;
 *         &lt;element name="page" type="{http://www.z2systems.com/schemas/common/}Page" minOccurs="0"/&gt;
 *         &lt;element name="deletedActivityIdList" type="{http://www.z2systems.com/schemas/account/}ActivityIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncActivitiesResponse", propOrder = {
    "activities",
    "page",
    "deletedActivityIdList"
})
public class SyncActivitiesResponse
    extends AbstractResponse
{

    protected ActivityList activities;
    protected Page page;
    protected ActivityIdList deletedActivityIdList;

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityList }
     *     
     */
    public ActivityList getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityList }
     *     
     */
    public void setActivities(ActivityList value) {
        this.activities = value;
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
     * Gets the value of the deletedActivityIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityIdList }
     *     
     */
    public ActivityIdList getDeletedActivityIdList() {
        return deletedActivityIdList;
    }

    /**
     * Sets the value of the deletedActivityIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityIdList }
     *     
     */
    public void setDeletedActivityIdList(ActivityIdList value) {
        this.deletedActivityIdList = value;
    }

}
