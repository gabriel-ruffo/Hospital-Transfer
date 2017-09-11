
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListAddressTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListAddressTypesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressTypes" type="{http://www.z2systems.com/schemas/account/}AddressTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListAddressTypesResponse", propOrder = {
    "addressTypes"
})
public class ListAddressTypesResponse
    extends AbstractResponse
{

    protected AddressTypeList addressTypes;

    /**
     * Gets the value of the addressTypes property.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeList }
     *     
     */
    public AddressTypeList getAddressTypes() {
        return addressTypes;
    }

    /**
     * Sets the value of the addressTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeList }
     *     
     */
    public void setAddressTypes(AddressTypeList value) {
        this.addressTypes = value;
    }

}
