
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for AddOrUpdateShippingMethodToShoppingCartRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateShippingMethodToShoppingCartRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shippingMethodId" type="{http://www.z2systems.com/schemas/common/}LongTextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateShippingMethodToShoppingCartRequest", propOrder = {
    "shoppingCartId",
    "shippingMethodId"
})
public class AddOrUpdateShippingMethodToShoppingCartRequest
    extends AbstractRequest
{

    protected long shoppingCartId;
    @XmlElement(required = true)
    protected String shippingMethodId;

    /**
     * Gets the value of the shoppingCartId property.
     * 
     */
    public long getShoppingCartId() {
        return shoppingCartId;
    }

    /**
     * Sets the value of the shoppingCartId property.
     * 
     */
    public void setShoppingCartId(long value) {
        this.shoppingCartId = value;
    }

    /**
     * Gets the value of the shippingMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethodId() {
        return shippingMethodId;
    }

    /**
     * Sets the value of the shippingMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethodId(String value) {
        this.shippingMethodId = value;
    }

}
