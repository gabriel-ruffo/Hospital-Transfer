
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardOnlinePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardOnlinePayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNumber" type="{http://www.z2systems.com/schemas/common/}LongTextType"/&gt;
 *         &lt;element name="expirationMonth" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="expirationYear" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cardType" type="{http://www.z2systems.com/schemas/common/}CodeNamePair" minOccurs="0"/&gt;
 *         &lt;element name="CVV2" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="cardHolder" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="billingAddressLine1" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="billingAddressLine2" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.z2systems.com/schemas/common/}ShortTextType" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.z2systems.com/schemas/common/}CodeNamePair" minOccurs="0"/&gt;
 *         &lt;element name="province" type="{http://www.z2systems.com/schemas/common/}ShortTextType" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.z2systems.com/schemas/common/}ShortTextType" minOccurs="0"/&gt;
 *         &lt;element name="zipCodeSuffix" type="{http://www.z2systems.com/schemas/common/}ShortTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardOnlinePayment", propOrder = {
    "cardNumber",
    "expirationMonth",
    "expirationYear",
    "cardType",
    "cvv2",
    "cardHolder",
    "billingAddressLine1",
    "billingAddressLine2",
    "city",
    "state",
    "province",
    "country",
    "zipCode",
    "zipCodeSuffix"
})
public class CreditCardOnlinePayment {

    @XmlElement(required = true)
    protected String cardNumber;
    protected long expirationMonth;
    protected long expirationYear;
    protected CodeNamePair cardType;
    @XmlElement(name = "CVV2")
    protected String cvv2;
    protected String cardHolder;
    protected String billingAddressLine1;
    protected String billingAddressLine2;
    protected String city;
    protected CodeNamePair state;
    protected String province;
    protected IdNamePair country;
    protected String zipCode;
    protected String zipCodeSuffix;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     */
    public long getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     */
    public void setExpirationMonth(long value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     */
    public long getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     */
    public void setExpirationYear(long value) {
        this.expirationYear = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePair }
     *     
     */
    public CodeNamePair getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePair }
     *     
     */
    public void setCardType(CodeNamePair value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV2() {
        return cvv2;
    }

    /**
     * Sets the value of the cvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV2(String value) {
        this.cvv2 = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the billingAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressLine1() {
        return billingAddressLine1;
    }

    /**
     * Sets the value of the billingAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressLine1(String value) {
        this.billingAddressLine1 = value;
    }

    /**
     * Gets the value of the billingAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressLine2() {
        return billingAddressLine2;
    }

    /**
     * Sets the value of the billingAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressLine2(String value) {
        this.billingAddressLine2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePair }
     *     
     */
    public CodeNamePair getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePair }
     *     
     */
    public void setState(CodeNamePair value) {
        this.state = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setCountry(IdNamePair value) {
        this.country = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zipCodeSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCodeSuffix() {
        return zipCodeSuffix;
    }

    /**
     * Sets the value of the zipCodeSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCodeSuffix(String value) {
        this.zipCodeSuffix = value;
    }

}
