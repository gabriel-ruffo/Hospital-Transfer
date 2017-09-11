
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListShippingMethodsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListShippingMethodsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shippingMethods" type="{http://www.z2systems.com/schemas/store/}ShippingMethodList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListShippingMethodsResponse", propOrder = {
    "shippingMethods"
})
public class ListShippingMethodsResponse
    extends AbstractResponse
{

    protected ShippingMethodList shippingMethods;

    /**
     * Gets the value of the shippingMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingMethodList }
     *     
     */
    public ShippingMethodList getShippingMethods() {
        return shippingMethods;
    }

    /**
     * Sets the value of the shippingMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingMethodList }
     *     
     */
    public void setShippingMethods(ShippingMethodList value) {
        this.shippingMethods = value;
    }

}
