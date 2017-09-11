
package com.z2systems.schemas.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;
import com.z2systems.schemas.common.Payment;


/**
 * <p>Java class for AddMembershipToAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMembershipToAccountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="membership" type="{http://www.z2systems.com/schemas/membership/}Membership"/&gt;
 *         &lt;element name="payment" type="{http://www.z2systems.com/schemas/common/}Payment"/&gt;
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
@XmlType(name = "AddMembershipToAccountRequest", propOrder = {
    "membership",
    "payment",
    "sendAcknowledgeEmail"
})
public class AddMembershipToAccountRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected Membership membership;
    @XmlElement(required = true)
    protected Payment payment;
    protected Boolean sendAcknowledgeEmail;

    /**
     * Gets the value of the membership property.
     * 
     * @return
     *     possible object is
     *     {@link Membership }
     *     
     */
    public Membership getMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Membership }
     *     
     */
    public void setMembership(Membership value) {
        this.membership = value;
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
