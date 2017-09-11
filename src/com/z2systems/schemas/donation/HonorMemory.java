
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HonorMemory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HonorMemory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="hmType" type="{http://www.z2systems.com/schemas/donation/}HonorMemoryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HonorMemory", propOrder = {
    "name",
    "hmType"
})
public class HonorMemory {

    protected String name;
    @XmlSchemaType(name = "string")
    protected HonorMemoryType hmType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hmType property.
     * 
     * @return
     *     possible object is
     *     {@link HonorMemoryType }
     *     
     */
    public HonorMemoryType getHmType() {
        return hmType;
    }

    /**
     * Sets the value of the hmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HonorMemoryType }
     *     
     */
    public void setHmType(HonorMemoryType value) {
        this.hmType = value;
    }

}
