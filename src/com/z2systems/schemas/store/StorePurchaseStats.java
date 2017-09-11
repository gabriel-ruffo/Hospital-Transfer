
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StorePurchaseStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorePurchaseStats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAmountPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfStorePurchases" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="firstStorePurchaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lastStorePurchaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorePurchaseStats", propOrder = {
    "totalAmountPaid",
    "numberOfStorePurchases",
    "firstStorePurchaseDate",
    "lastStorePurchaseDate"
})
public class StorePurchaseStats {

    protected Double totalAmountPaid;
    protected Long numberOfStorePurchases;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstStorePurchaseDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastStorePurchaseDate;

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
     * Gets the value of the numberOfStorePurchases property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfStorePurchases() {
        return numberOfStorePurchases;
    }

    /**
     * Sets the value of the numberOfStorePurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfStorePurchases(Long value) {
        this.numberOfStorePurchases = value;
    }

    /**
     * Gets the value of the firstStorePurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstStorePurchaseDate() {
        return firstStorePurchaseDate;
    }

    /**
     * Sets the value of the firstStorePurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstStorePurchaseDate(XMLGregorianCalendar value) {
        this.firstStorePurchaseDate = value;
    }

    /**
     * Gets the value of the lastStorePurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastStorePurchaseDate() {
        return lastStorePurchaseDate;
    }

    /**
     * Sets the value of the lastStorePurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastStorePurchaseDate(XMLGregorianCalendar value) {
        this.lastStorePurchaseDate = value;
    }

}
