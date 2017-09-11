
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListIndividualTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListIndividualTypesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualTypes" type="{http://www.z2systems.com/schemas/account/}IndividualTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListIndividualTypesResponse", propOrder = {
    "individualTypes"
})
public class ListIndividualTypesResponse
    extends AbstractResponse
{

    protected IndividualTypeList individualTypes;

    /**
     * Gets the value of the individualTypes property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualTypeList }
     *     
     */
    public IndividualTypeList getIndividualTypes() {
        return individualTypes;
    }

    /**
     * Sets the value of the individualTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualTypeList }
     *     
     */
    public void setIndividualTypes(IndividualTypeList value) {
        this.individualTypes = value;
    }

}
