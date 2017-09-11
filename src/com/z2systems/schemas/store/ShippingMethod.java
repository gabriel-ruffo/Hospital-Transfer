
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shippingMethodId" type="{http://www.z2systems.com/schemas/common/}LongTextType"/&gt;
 *         &lt;element name="shippingMethodName" type="{http://www.z2systems.com/schemas/common/}LongTextType"/&gt;
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingMethod", propOrder = {
    "shippingMethodId",
    "shippingMethodName",
    "fee"
})
public class ShippingMethod {

    @XmlElement(required = true)
    protected String shippingMethodId;
    @XmlElement(required = true)
    protected String shippingMethodName;
    protected double fee;

    /**
     * Gets the value of the shippingMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethodId() {
        return shippingMethodId;
    }

    /**
     * Sets the value of the shippingMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethodId(String value) {
        this.shippingMethodId = value;
    }

    /**
     * Gets the value of the shippingMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethodName() {
        return shippingMethodName;
    }

    /**
     * Sets the value of the shippingMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethodName(String value) {
        this.shippingMethodName = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     */
    public double getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     */
    public void setFee(double value) {
        this.fee = value;
    }

}
