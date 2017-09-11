
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fairMarketValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentStatus" type="{http://www.z2systems.com/schemas/common/}TransactionStatus" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.z2systems.com/schemas/common/}TextFieldType" minOccurs="0"/&gt;
 *         &lt;element name="tenderType" type="{http://www.z2systems.com/schemas/common/}IdNamePair"/&gt;
 *         &lt;element name="creditCardOnlinePayment" type="{http://www.z2systems.com/schemas/common/}CreditCardOnlinePayment" minOccurs="0"/&gt;
 *         &lt;element name="creditCardOfflinePayment" type="{http://www.z2systems.com/schemas/common/}CreditCardOfflinePayment" minOccurs="0"/&gt;
 *         &lt;element name="echeckPayment" type="{http://www.z2systems.com/schemas/common/}ECheckPayment" minOccurs="0"/&gt;
 *         &lt;element name="checkPayment" type="{http://www.z2systems.com/schemas/common/}CheckPayment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "paymentId",
    "amount",
    "fairMarketValue",
    "paymentStatus",
    "note",
    "tenderType",
    "creditCardOnlinePayment",
    "creditCardOfflinePayment",
    "echeckPayment",
    "checkPayment"
})
public class Payment {

    protected Long paymentId;
    protected double amount;
    protected double fairMarketValue;
    @XmlSchemaType(name = "string")
    protected TransactionStatus paymentStatus;
    protected String note;
    @XmlElement(required = true)
    protected IdNamePair tenderType;
    protected CreditCardOnlinePayment creditCardOnlinePayment;
    protected CreditCardOfflinePayment creditCardOfflinePayment;
    protected ECheckPayment echeckPayment;
    protected CheckPayment checkPayment;

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentId(Long value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the fairMarketValue property.
     * 
     */
    public double getFairMarketValue() {
        return fairMarketValue;
    }

    /**
     * Sets the value of the fairMarketValue property.
     * 
     */
    public void setFairMarketValue(double value) {
        this.fairMarketValue = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setPaymentStatus(TransactionStatus value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the tenderType property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getTenderType() {
        return tenderType;
    }

    /**
     * Sets the value of the tenderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setTenderType(IdNamePair value) {
        this.tenderType = value;
    }

    /**
     * Gets the value of the creditCardOnlinePayment property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardOnlinePayment }
     *     
     */
    public CreditCardOnlinePayment getCreditCardOnlinePayment() {
        return creditCardOnlinePayment;
    }

    /**
     * Sets the value of the creditCardOnlinePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardOnlinePayment }
     *     
     */
    public void setCreditCardOnlinePayment(CreditCardOnlinePayment value) {
        this.creditCardOnlinePayment = value;
    }

    /**
     * Gets the value of the creditCardOfflinePayment property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardOfflinePayment }
     *     
     */
    public CreditCardOfflinePayment getCreditCardOfflinePayment() {
        return creditCardOfflinePayment;
    }

    /**
     * Sets the value of the creditCardOfflinePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardOfflinePayment }
     *     
     */
    public void setCreditCardOfflinePayment(CreditCardOfflinePayment value) {
        this.creditCardOfflinePayment = value;
    }

    /**
     * Gets the value of the echeckPayment property.
     * 
     * @return
     *     possible object is
     *     {@link ECheckPayment }
     *     
     */
    public ECheckPayment getEcheckPayment() {
        return echeckPayment;
    }

    /**
     * Sets the value of the echeckPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECheckPayment }
     *     
     */
    public void setEcheckPayment(ECheckPayment value) {
        this.echeckPayment = value;
    }

    /**
     * Gets the value of the checkPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPayment }
     *     
     */
    public CheckPayment getCheckPayment() {
        return checkPayment;
    }

    /**
     * Sets the value of the checkPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPayment }
     *     
     */
    public void setCheckPayment(CheckPayment value) {
        this.checkPayment = value;
    }

}
