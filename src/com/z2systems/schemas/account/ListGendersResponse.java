
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListGendersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListGendersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genders" type="{http://www.z2systems.com/schemas/account/}GenderList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListGendersResponse", propOrder = {
    "genders"
})
public class ListGendersResponse
    extends AbstractResponse
{

    protected GenderList genders;

    /**
     * Gets the value of the genders property.
     * 
     * @return
     *     possible object is
     *     {@link GenderList }
     *     
     */
    public GenderList getGenders() {
        return genders;
    }

    /**
     * Sets the value of the genders property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderList }
     *     
     */
    public void setGenders(GenderList value) {
        this.genders = value;
    }

}
