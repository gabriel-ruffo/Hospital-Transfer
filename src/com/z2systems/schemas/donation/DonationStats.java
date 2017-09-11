
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DonationStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DonationStats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAmountPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfDonations" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="yearToDateAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="firstDonationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lastDonationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DonationStats", propOrder = {
    "totalAmountPaid",
    "numberOfDonations",
    "yearToDateAmount",
    "firstDonationDate",
    "lastDonationDate"
})
public class DonationStats {

    protected Double totalAmountPaid;
    protected Long numberOfDonations;
    protected Double yearToDateAmount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDonationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDonationDate;

    /**
     * Gets the value of the totalAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmountPaid() {
        return totalAmountPaid;
    }

    /**
     * Sets the value of the totalAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmountPaid(Double value) {
        this.totalAmountPaid = value;
    }

    /**
     * Gets the value of the numberOfDonations property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfDonations() {
        return numberOfDonations;
    }

    /**
     * Sets the value of the numberOfDonations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfDonations(Long value) {
        this.numberOfDonations = value;
    }

    /**
     * Gets the value of the yearToDateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYearToDateAmount() {
        return yearToDateAmount;
    }

    /**
     * Sets the value of the yearToDateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYearToDateAmount(Double value) {
        this.yearToDateAmount = value;
    }

    /**
     * Gets the value of the firstDonationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDonationDate() {
        return firstDonationDate;
    }

    /**
     * Sets the value of the firstDonationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDonationDate(XMLGregorianCalendar value) {
        this.firstDonationDate = value;
    }

    /**
     * Gets the value of the lastDonationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDonationDate() {
        return lastDonationDate;
    }

    /**
     * Sets the value of the lastDonationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDonationDate(XMLGregorianCalendar value) {
        this.lastDonationDate = value;
    }

}
