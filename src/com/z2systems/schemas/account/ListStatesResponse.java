
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListStatesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListStatesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="states" type="{http://www.z2systems.com/schemas/account/}StateList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListStatesResponse", propOrder = {
    "states"
})
public class ListStatesResponse
    extends AbstractResponse
{

    protected StateList states;

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link StateList }
     *     
     */
    public StateList getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateList }
     *     
     */
    public void setStates(StateList value) {
        this.states = value;
    }

}
