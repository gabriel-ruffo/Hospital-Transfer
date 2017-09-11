
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for CreateRecurringDonationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRecurringDonationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurringDonationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRecurringDonationResponse", propOrder = {
    "recurringDonationId"
})
public class CreateRecurringDonationResponse
    extends AbstractResponse
{

    protected Long recurringDonationId;

    /**
     * Gets the value of the recurringDonationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurringDonationId() {
        return recurringDonationId;
    }

    /**
     * Sets the value of the recurringDonationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurringDonationId(Long value) {
        this.recurringDonationId = value;
    }

}
