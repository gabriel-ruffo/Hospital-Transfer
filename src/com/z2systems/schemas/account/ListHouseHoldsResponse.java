
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListHouseHoldsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListHouseHoldsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="houseHolds" type="{http://www.z2systems.com/schemas/account/}HouseHoldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListHouseHoldsResponse", propOrder = {
    "houseHolds"
})
public class ListHouseHoldsResponse
    extends AbstractResponse
{

    protected HouseHoldList houseHolds;

    /**
     * Gets the value of the houseHolds property.
     * 
     * @return
     *     possible object is
     *     {@link HouseHoldList }
     *     
     */
    public HouseHoldList getHouseHolds() {
        return houseHolds;
    }

    /**
     * Sets the value of the houseHolds property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseHoldList }
     *     
     */
    public void setHouseHolds(HouseHoldList value) {
        this.houseHolds = value;
    }

}
