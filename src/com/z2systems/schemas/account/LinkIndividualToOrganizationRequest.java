
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.AbstractRequest;
import com.z2systems.schemas.common.Address;


/**
 * <p>Java class for LinkIndividualToOrganizationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkIndividualToOrganizationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualContactId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="organizationAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="isPrimaryContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCurrentEmployee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.z2systems.com/schemas/common/}Address" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="organizationEmail" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkIndividualToOrganizationRequest", propOrder = {
    "individualContactId",
    "organizationAccountId",
    "isPrimaryContact",
    "isCurrentEmployee",
    "startDate",
    "endDate",
    "address",
    "department",
    "title",
    "organizationEmail"
})
public class LinkIndividualToOrganizationRequest
    extends AbstractRequest
{

    protected long individualContactId;
    protected long organizationAccountId;
    protected Boolean isPrimaryContact;
    protected Boolean isCurrentEmployee;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected Address address;
    protected String department;
    protected String title;
    protected String organizationEmail;

    /**
     * Gets the value of the individualContactId property.
     * 
     */
    public long getIndividualContactId() {
        return individualContactId;
    }

    /**
     * Sets the value of the individualContactId property.
     * 
     */
    public void setIndividualContactId(long value) {
        this.individualContactId = value;
    }

    /**
     * Gets the value of the organizationAccountId property.
     * 
     */
    public long getOrganizationAccountId() {
        return organizationAccountId;
    }

    /**
     * Sets the value of the organizationAccountId property.
     * 
     */
    public void setOrganizationAccountId(long value) {
        this.organizationAccountId = value;
    }

    /**
     * Gets the value of the isPrimaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryContact() {
        return isPrimaryContact;
    }

    /**
     * Sets the value of the isPrimaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryContact(Boolean value) {
        this.isPrimaryContact = value;
    }

    /**
     * Gets the value of the isCurrentEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCurrentEmployee() {
        return isCurrentEmployee;
    }

    /**
     * Sets the value of the isCurrentEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCurrentEmployee(Boolean value) {
        this.isCurrentEmployee = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the organizationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationEmail() {
        return organizationEmail;
    }

    /**
     * Sets the value of the organizationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationEmail(String value) {
        this.organizationEmail = value;
    }

}
