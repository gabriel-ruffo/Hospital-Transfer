
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCreditCardTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCreditCardTypesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditCardTypes" type="{http://www.z2systems.com/schemas/common/}CreditCardTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListCreditCardTypesResponse", propOrder = {
    "creditCardTypes"
})
public class ListCreditCardTypesResponse
    extends AbstractResponse
{

    protected CreditCardTypeList creditCardTypes;

    /**
     * Gets the value of the creditCardTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTypeList }
     *     
     */
    public CreditCardTypeList getCreditCardTypes() {
        return creditCardTypes;
    }

    /**
     * Sets the value of the creditCardTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTypeList }
     *     
     */
    public void setCreditCardTypes(CreditCardTypeList value) {
        this.creditCardTypes = value;
    }

}
