
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;
import com.z2systems.schemas.common.Payment;


/**
 * <p>Java class for CreateRecurringDonationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRecurringDonationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurringDonation" type="{http://www.z2systems.com/schemas/donation/}RecurringDonation"/&gt;
 *         &lt;element name="payment" type="{http://www.z2systems.com/schemas/common/}Payment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRecurringDonationRequest", propOrder = {
    "recurringDonation",
    "payment"
})
public class CreateRecurringDonationRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected RecurringDonation recurringDonation;
    @XmlElement(required = true)
    protected Payment payment;

    /**
     * Gets the value of the recurringDonation property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringDonation }
     *     
     */
    public RecurringDonation getRecurringDonation() {
        return recurringDonation;
    }

    /**
     * Sets the value of the recurringDonation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringDonation }
     *     
     */
    public void setRecurringDonation(RecurringDonation value) {
        this.recurringDonation = value;
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

}
