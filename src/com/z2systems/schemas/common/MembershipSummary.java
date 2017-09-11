
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MembershipSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="membershipName" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="membershipTerm" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="termDuration" type="{http://www.z2systems.com/schemas/common/}MediumTextType"/&gt;
 *         &lt;element name="enrollmentType" type="{http://www.z2systems.com/schemas/common/}MediumTextType"/&gt;
 *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipSummary", propOrder = {
    "membershipName",
    "membershipTerm",
    "amount",
    "termDuration",
    "enrollmentType",
    "enrollmentDate",
    "startDate",
    "endDate",
    "status"
})
public class MembershipSummary {

    protected String membershipName;
    protected IdNamePair membershipTerm;
    protected double amount;
    @XmlElement(required = true)
    protected String termDuration;
    @XmlElement(required = true)
    protected String enrollmentType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enrollmentDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected String status;

    /**
     * Gets the value of the membershipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipName() {
        return membershipName;
    }

    /**
     * Sets the value of the membershipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipName(String value) {
        this.membershipName = value;
    }

    /**
     * Gets the value of the membershipTerm property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getMembershipTerm() {
        return membershipTerm;
    }

    /**
     * Sets the value of the membershipTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setMembershipTerm(IdNamePair value) {
        this.membershipTerm = value;
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
     * Gets the value of the termDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermDuration() {
        return termDuration;
    }

    /**
     * Sets the value of the termDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermDuration(String value) {
        this.termDuration = value;
    }

    /**
     * Gets the value of the enrollmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentType() {
        return enrollmentType;
    }

    /**
     * Sets the value of the enrollmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentType(String value) {
        this.enrollmentType = value;
    }

    /**
     * Gets the value of the enrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * Sets the value of the enrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollmentDate(XMLGregorianCalendar value) {
        this.enrollmentDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
