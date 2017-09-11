
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;
import com.z2systems.schemas.common.Payment;


/**
 * <p>Java class for CheckoutRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="payment" type="{http://www.z2systems.com/schemas/common/}Payment" minOccurs="0"/&gt;
 *         &lt;element name="sendAcknowledgeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckoutRequest", propOrder = {
    "shoppingCartId",
    "payment",
    "sendAcknowledgeEmail"
})
public class CheckoutRequest
    extends AbstractRequest
{

    protected long shoppingCartId;
    protected Payment payment;
    protected Boolean sendAcknowledgeEmail;

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
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the sendAcknowledgeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAcknowledgeEmail() {
        return sendAcknowledgeEmail;
    }

    /**
     * Sets the value of the sendAcknowledgeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAcknowledgeEmail(Boolean value) {
        this.sendAcknowledgeEmail = value;
    }

}
