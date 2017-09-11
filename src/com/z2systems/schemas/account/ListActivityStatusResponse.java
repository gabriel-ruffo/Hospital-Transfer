
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListActivityStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListActivityStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activityStatusList" type="{http://www.z2systems.com/schemas/account/}ActivityStatusList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListActivityStatusResponse", propOrder = {
    "activityStatusList"
})
public class ListActivityStatusResponse
    extends AbstractResponse
{

    protected ActivityStatusList activityStatusList;

    /**
     * Gets the value of the activityStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityStatusList }
     *     
     */
    public ActivityStatusList getActivityStatusList() {
        return activityStatusList;
    }

    /**
     * Sets the value of the activityStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityStatusList }
     *     
     */
    public void setActivityStatusList(ActivityStatusList value) {
        this.activityStatusList = value;
    }

}
