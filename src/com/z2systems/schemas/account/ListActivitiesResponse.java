
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractSearchResponse;


/**
 * <p>Java class for ListActivitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListActivitiesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractSearchResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activities" type="{http://www.z2systems.com/schemas/account/}ActivityList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListActivitiesResponse", propOrder = {
    "activities"
})
public class ListActivitiesResponse
    extends AbstractSearchResponse
{

    protected ActivityList activities;

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

}
