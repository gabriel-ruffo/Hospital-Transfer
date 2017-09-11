
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for EditIndividualAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditIndividualAccountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualAccount" type="{http://www.z2systems.com/schemas/account/}IndividualAccount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditIndividualAccountRequest", propOrder = {
    "individualAccount"
})
public class EditIndividualAccountRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected IndividualAccount individualAccount;

    /**
     * Gets the value of the individualAccount property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAccount }
     *     
     */
    public IndividualAccount getIndividualAccount() {
        return individualAccount;
    }

    /**
     * Sets the value of the individualAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAccount }
     *     
     */
    public void setIndividualAccount(IndividualAccount value) {
        this.individualAccount = value;
    }

}
