
package com.z2systems.schemas.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.TransactionStatus;


/**
 * <p>Java class for MembershipResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/membership/}Membership"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="membershipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="membershipName" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="termDuration" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="termStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="termEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="enrollmentType" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.z2systems.com/schemas/common/}TransactionStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipResult", propOrder = {
    "membershipId",
    "membershipName",
    "termDuration",
    "fee",
    "transactionDate",
    "termStartDate",
    "termEndDate",
    "enrollmentType",
    "status"
})
public class MembershipResult
    extends Membership
{

    protected Long membershipId;
    protected String membershipName;
    protected String termDuration;
    protected Double fee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termEndDate;
    protected String enrollmentType;
    @XmlSchemaType(name = "string")
    protected TransactionStatus status;

    /**
     * Gets the value of the membershipId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMembershipId() {
        return membershipId;
    }

    /**
     * Sets the value of the membershipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMembershipId(Long value) {
        this.membershipId = value;
    }

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
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFee(Double value) {
        this.fee = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the termStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermStartDate() {
        return termStartDate;
    }

    /**
     * Sets the value of the termStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermStartDate(XMLGregorianCalendar value) {
        this.termStartDate = value;
    }

    /**
     * Gets the value of the termEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermEndDate() {
        return termEndDate;
    }

    /**
     * Sets the value of the termEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermEndDate(XMLGregorianCalendar value) {
        this.termEndDate = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setStatus(TransactionStatus value) {
        this.status = value;
    }

}
