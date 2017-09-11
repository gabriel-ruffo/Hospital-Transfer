
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for AddItemToShoppingCartRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemToShoppingCartRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shoppingCartItem" type="{http://www.z2systems.com/schemas/store/}ShoppingCartItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemToShoppingCartRequest", propOrder = {
    "shoppingCartId",
    "shoppingCartItem"
})
public class AddItemToShoppingCartRequest
    extends AbstractRequest
{

    protected long shoppingCartId;
    @XmlElement(required = true)
    protected ShoppingCartItem shoppingCartItem;

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
     * Gets the value of the shoppingCartItem property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartItem }
     *     
     */
    public ShoppingCartItem getShoppingCartItem() {
        return shoppingCartItem;
    }

    /**
     * Sets the value of the shoppingCartItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartItem }
     *     
     */
    public void setShoppingCartItem(ShoppingCartItem value) {
        this.shoppingCartItem = value;
    }

}
