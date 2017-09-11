
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractSearchRequest;


/**
 * <p>Java class for ListActivitiesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListActivitiesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractSearchRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activitySearchCriteria" type="{http://www.z2systems.com/schemas/account/}ActivitySearchCriteria" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListActivitiesRequest", propOrder = {
    "activitySearchCriteria"
})
public class ListActivitiesRequest
    extends AbstractSearchRequest
{

    protected ActivitySearchCriteria activitySearchCriteria;

    /**
     * Gets the value of the activitySearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ActivitySearchCriteria }
     *     
     */
    public ActivitySearchCriteria getActivitySearchCriteria() {
        return activitySearchCriteria;
    }

    /**
     * Sets the value of the activitySearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitySearchCriteria }
     *     
     */
    public void setActivitySearchCriteria(ActivitySearchCriteria value) {
        this.activitySearchCriteria = value;
    }

}
