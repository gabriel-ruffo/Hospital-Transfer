
package com.z2systems.schemas.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EventRegistrationStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventRegistrationStats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAmountPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfEventRegistrations" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="firstEventRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lastEventRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventRegistrationStats", propOrder = {
    "totalAmountPaid",
    "numberOfEventRegistrations",
    "firstEventRegistrationDate",
    "lastEventRegistrationDate"
})
public class EventRegistrationStats {

    protected Double totalAmountPaid;
    protected Long numberOfEventRegistrations;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstEventRegistrationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastEventRegistrationDate;

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
     * Gets the value of the numberOfEventRegistrations property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfEventRegistrations() {
        return numberOfEventRegistrations;
    }

    /**
     * Sets the value of the numberOfEventRegistrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfEventRegistrations(Long value) {
        this.numberOfEventRegistrations = value;
    }

    /**
     * Gets the value of the firstEventRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstEventRegistrationDate() {
        return firstEventRegistrationDate;
    }

    /**
     * Sets the value of the firstEventRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstEventRegistrationDate(XMLGregorianCalendar value) {
        this.firstEventRegistrationDate = value;
    }

    /**
     * Gets the value of the lastEventRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastEventRegistrationDate() {
        return lastEventRegistrationDate;
    }

    /**
     * Sets the value of the lastEventRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastEventRegistrationDate(XMLGregorianCalendar value) {
        this.lastEventRegistrationDate = value;
    }

}
