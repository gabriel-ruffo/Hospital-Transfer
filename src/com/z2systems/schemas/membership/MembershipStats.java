
package com.z2systems.schemas.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MembershipStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipStats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAmountPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfMemberships" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="firstEnrollmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lastEnrollmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipStats", propOrder = {
    "totalAmountPaid",
    "numberOfMemberships",
    "firstEnrollmentDate",
    "lastEnrollmentDate"
})
public class MembershipStats {

    protected Double totalAmountPaid;
    protected Long numberOfMemberships;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstEnrollmentDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastEnrollmentDate;

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
     * Gets the value of the numberOfMemberships property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfMemberships() {
        return numberOfMemberships;
    }

    /**
     * Sets the value of the numberOfMemberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfMemberships(Long value) {
        this.numberOfMemberships = value;
    }

    /**
     * Gets the value of the firstEnrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstEnrollmentDate() {
        return firstEnrollmentDate;
    }

    /**
     * Sets the value of the firstEnrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstEnrollmentDate(XMLGregorianCalendar value) {
        this.firstEnrollmentDate = value;
    }

    /**
     * Gets the value of the lastEnrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastEnrollmentDate() {
        return lastEnrollmentDate;
    }

    /**
     * Sets the value of the lastEnrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastEnrollmentDate(XMLGregorianCalendar value) {
        this.lastEnrollmentDate = value;
    }

}
