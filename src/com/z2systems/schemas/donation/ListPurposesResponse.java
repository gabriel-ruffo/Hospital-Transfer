
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListPurposesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListPurposesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="purposes" type="{http://www.z2systems.com/schemas/donation/}PurposeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListPurposesResponse", propOrder = {
    "purposes"
})
public class ListPurposesResponse
    extends AbstractResponse
{

    protected PurposeList purposes;

    /**
     * Gets the value of the purposes property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeList }
     *     
     */
    public PurposeList getPurposes() {
        return purposes;
    }

    /**
     * Sets the value of the purposes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeList }
     *     
     */
    public void setPurposes(PurposeList value) {
        this.purposes = value;
    }

}
