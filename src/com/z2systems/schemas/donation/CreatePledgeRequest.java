
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for CreatePledgeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePledgeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pledge" type="{http://www.z2systems.com/schemas/donation/}Donation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePledgeRequest", propOrder = {
    "pledge"
})
public class CreatePledgeRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected Donation pledge;

    /**
     * Gets the value of the pledge property.
     * 
     * @return
     *     possible object is
     *     {@link Donation }
     *     
     */
    public Donation getPledge() {
        return pledge;
    }

    /**
     * Sets the value of the pledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Donation }
     *     
     */
    public void setPledge(Donation value) {
        this.pledge = value;
    }

}
