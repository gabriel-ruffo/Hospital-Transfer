
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListTendersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListTendersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tenders" type="{http://www.z2systems.com/schemas/common/}TenderList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListTendersResponse", propOrder = {
    "tenders"
})
public class ListTendersResponse
    extends AbstractResponse
{

    protected TenderList tenders;

    /**
     * Gets the value of the tenders property.
     * 
     * @return
     *     possible object is
     *     {@link TenderList }
     *     
     */
    public TenderList getTenders() {
        return tenders;
    }

    /**
     * Sets the value of the tenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderList }
     *     
     */
    public void setTenders(TenderList value) {
        this.tenders = value;
    }

}
