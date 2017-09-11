
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecurringDonorSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringDonorSearchCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="setupDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="setupDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="nextRecurringDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="nextRucurringDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="cardExpirationDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="cardExpirationDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.z2systems.com/schemas/donation/}RecurringDonationStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringDonorSearchCriteria", propOrder = {
    "setupDateFrom",
    "setupDateTo",
    "nextRecurringDateFrom",
    "nextRucurringDateTo",
    "cardExpirationDateFrom",
    "cardExpirationDateTo",
    "status"
})
public class RecurringDonorSearchCriteria {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar setupDateFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar setupDateTo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextRecurringDateFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextRucurringDateTo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardExpirationDateFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardExpirationDateTo;
    @XmlSchemaType(name = "string")
    protected RecurringDonationStatus status;

    /**
     * Gets the value of the setupDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSetupDateFrom() {
        return setupDateFrom;
    }

    /**
     * Sets the value of the setupDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSetupDateFrom(XMLGregorianCalendar value) {
        this.setupDateFrom = value;
    }

    /**
     * Gets the value of the setupDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSetupDateTo() {
        return setupDateTo;
    }

    /**
     * Sets the value of the setupDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSetupDateTo(XMLGregorianCalendar value) {
        this.setupDateTo = value;
    }

    /**
     * Gets the value of the nextRecurringDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRecurringDateFrom() {
        return nextRecurringDateFrom;
    }

    /**
     * Sets the value of the nextRecurringDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRecurringDateFrom(XMLGregorianCalendar value) {
        this.nextRecurringDateFrom = value;
    }

    /**
     * Gets the value of the nextRucurringDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRucurringDateTo() {
        return nextRucurringDateTo;
    }

    /**
     * Sets the value of the nextRucurringDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRucurringDateTo(XMLGregorianCalendar value) {
        this.nextRucurringDateTo = value;
    }

    /**
     * Gets the value of the cardExpirationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardExpirationDateFrom() {
        return cardExpirationDateFrom;
    }

    /**
     * Sets the value of the cardExpirationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardExpirationDateFrom(XMLGregorianCalendar value) {
        this.cardExpirationDateFrom = value;
    }

    /**
     * Gets the value of the cardExpirationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardExpirationDateTo() {
        return cardExpirationDateTo;
    }

    /**
     * Sets the value of the cardExpirationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardExpirationDateTo(XMLGregorianCalendar value) {
        this.cardExpirationDateTo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringDonationStatus }
     *     
     */
    public RecurringDonationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringDonationStatus }
     *     
     */
    public void setStatus(RecurringDonationStatus value) {
        this.status = value;
    }

}
