
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for UpdateHouseHoldRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateHouseHoldRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="houseHold" type="{http://www.z2systems.com/schemas/account/}HouseHold"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHouseHoldRequest", propOrder = {
    "houseHold"
})
public class UpdateHouseHoldRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected HouseHold houseHold;

    /**
     * Gets the value of the houseHold property.
     * 
     * @return
     *     possible object is
     *     {@link HouseHold }
     *     
     */
    public HouseHold getHouseHold() {
        return houseHold;
    }

    /**
     * Sets the value of the houseHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseHold }
     *     
     */
    public void setHouseHold(HouseHold value) {
        this.houseHold = value;
    }

}
