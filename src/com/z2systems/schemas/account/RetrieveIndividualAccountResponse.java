
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for RetrieveIndividualAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveIndividualAccountResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndividualAccount" type="{http://www.z2systems.com/schemas/account/}IndividualAccount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveIndividualAccountResponse", propOrder = {
    "individualAccount"
})
public class RetrieveIndividualAccountResponse
    extends AbstractResponse
{

    @XmlElement(name = "IndividualAccount")
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
