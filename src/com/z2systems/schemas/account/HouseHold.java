
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseHold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseHold"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="houseHoldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="salutation" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="houseHoldContacts" type="{http://www.z2systems.com/schemas/account/}HouseHoldContactList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseHold", propOrder = {
    "houseHoldId",
    "name",
    "salutation",
    "houseHoldContacts"
})
public class HouseHold {

    protected Long houseHoldId;
    protected String name;
    protected String salutation;
    protected HouseHoldContactList houseHoldContacts;

    /**
     * Gets the value of the houseHoldId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseHoldId() {
        return houseHoldId;
    }

    /**
     * Sets the value of the houseHoldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseHoldId(Long value) {
        this.houseHoldId = value;
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
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the houseHoldContacts property.
     * 
     * @return
     *     possible object is
     *     {@link HouseHoldContactList }
     *     
     */
    public HouseHoldContactList getHouseHoldContacts() {
        return houseHoldContacts;
    }

    /**
     * Sets the value of the houseHoldContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseHoldContactList }
     *     
     */
    public void setHouseHoldContacts(HouseHoldContactList value) {
        this.houseHoldContacts = value;
    }

}
