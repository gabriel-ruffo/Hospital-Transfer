
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.donation.Donation;
import com.z2systems.schemas.membership.MembershipResult;


/**
 * <p>Java class for ShoppingCartItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="itemType" type="{http://www.z2systems.com/schemas/store/}ShoppingCartItemType"/&gt;
 *         &lt;element name="donation" type="{http://www.z2systems.com/schemas/donation/}Donation" minOccurs="0"/&gt;
 *         &lt;element name="membership" type="{http://www.z2systems.com/schemas/membership/}MembershipResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartItemInfo", propOrder = {
    "unitPrice",
    "itemType",
    "donation",
    "membership"
})
public class ShoppingCartItemInfo {

    protected Double unitPrice;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ShoppingCartItemType itemType;
    protected Donation donation;
    protected MembershipResult membership;

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPrice(Double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartItemType }
     *     
     */
    public ShoppingCartItemType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartItemType }
     *     
     */
    public void setItemType(ShoppingCartItemType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the donation property.
     * 
     * @return
     *     possible object is
     *     {@link Donation }
     *     
     */
    public Donation getDonation() {
        return donation;
    }

    /**
     * Sets the value of the donation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Donation }
     *     
     */
    public void setDonation(Donation value) {
        this.donation = value;
    }

    /**
     * Gets the value of the membership property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipResult }
     *     
     */
    public MembershipResult getMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipResult }
     *     
     */
    public void setMembership(MembershipResult value) {
        this.membership = value;
    }

}
