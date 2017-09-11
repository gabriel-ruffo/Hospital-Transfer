
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imageSequenceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="imageUrl" type="{http://www.z2systems.com/schemas/common/}TextFieldType"/&gt;
 *         &lt;element name="imageLabel" type="{http://www.z2systems.com/schemas/common/}MediumTextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductImage", propOrder = {
    "imageSequenceId",
    "imageUrl",
    "imageLabel"
})
public class ProductImage {

    protected long imageSequenceId;
    @XmlElement(required = true)
    protected String imageUrl;
    @XmlElement(required = true)
    protected String imageLabel;

    /**
     * Gets the value of the imageSequenceId property.
     * 
     */
    public long getImageSequenceId() {
        return imageSequenceId;
    }

    /**
     * Sets the value of the imageSequenceId property.
     * 
     */
    public void setImageSequenceId(long value) {
        this.imageSequenceId = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the imageLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageLabel() {
        return imageLabel;
    }

    /**
     * Sets the value of the imageLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageLabel(String value) {
        this.imageLabel = value;
    }

}
