
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for AddOrUpdateCustomerToShoppingCartRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateCustomerToShoppingCartRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateCustomerToShoppingCartRequest", propOrder = {
    "accountId",
    "shoppingCartId"
})
public class AddOrUpdateCustomerToShoppingCartRequest
    extends AbstractRequest
{

    protected long accountId;
    protected long shoppingCartId;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

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

}
