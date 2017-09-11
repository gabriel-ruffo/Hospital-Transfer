
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="optionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.z2systems.com/schemas/common/}MediumTextType"/&gt;
 *         &lt;element name="optionValues" type="{http://www.z2systems.com/schemas/store/}ProductOptionValueList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOption", propOrder = {
    "optionId",
    "name",
    "optionValues"
})
public class ProductOption {

    protected Long optionId;
    @XmlElement(required = true)
    protected String name;
    protected ProductOptionValueList optionValues;

    /**
     * Gets the value of the optionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptionId() {
        return optionId;
    }

    /**
     * Sets the value of the optionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptionId(Long value) {
        this.optionId = value;
    }

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
     * Gets the value of the optionValues property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOptionValueList }
     *     
     */
    public ProductOptionValueList getOptionValues() {
        return optionValues;
    }

    /**
     * Sets the value of the optionValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOptionValueList }
     *     
     */
    public void setOptionValues(ProductOptionValueList value) {
        this.optionValues = value;
    }

}
