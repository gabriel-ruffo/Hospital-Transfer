
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.CustomFieldDataList;
import com.z2systems.schemas.common.IdNamePair;


/**
 * <p>Java class for Donation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Donation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/donation/}AbstractDonation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="donorName" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="acknowledgee" type="{http://www.z2systems.com/schemas/donation/}Acknowledgee" minOccurs="0"/&gt;
 *         &lt;element name="honorMemory" type="{http://www.z2systems.com/schemas/donation/}HonorMemory" minOccurs="0"/&gt;
 *         &lt;element name="customFieldDataList" type="{http://www.z2systems.com/schemas/common/}CustomFieldDataList" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="solicitation" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="sendAcknowledgeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="anonymousType" type="{http://www.z2systems.com/schemas/donation/}AnonymousType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Donation", propOrder = {
    "donorName",
    "date",
    "acknowledgee",
    "honorMemory",
    "customFieldDataList",
    "source",
    "solicitation",
    "sendAcknowledgeEmail",
    "anonymousType"
})
public class Donation
    extends AbstractDonation
{

    protected String donorName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    protected Acknowledgee acknowledgee;
    protected HonorMemory honorMemory;
    protected CustomFieldDataList customFieldDataList;
    protected IdNamePair source;
    protected IdNamePair solicitation;
    protected Boolean sendAcknowledgeEmail;
    @XmlSchemaType(name = "string")
    protected AnonymousType anonymousType;

    /**
     * Gets the value of the donorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonorName() {
        return donorName;
    }

    /**
     * Sets the value of the donorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonorName(String value) {
        this.donorName = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the acknowledgee property.
     * 
     * @return
     *     possible object is
     *     {@link Acknowledgee }
     *     
     */
    public Acknowledgee getAcknowledgee() {
        return acknowledgee;
    }

    /**
     * Sets the value of the acknowledgee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acknowledgee }
     *     
     */
    public void setAcknowledgee(Acknowledgee value) {
        this.acknowledgee = value;
    }

    /**
     * Gets the value of the honorMemory property.
     * 
     * @return
     *     possible object is
     *     {@link HonorMemory }
     *     
     */
    public HonorMemory getHonorMemory() {
        return honorMemory;
    }

    /**
     * Sets the value of the honorMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link HonorMemory }
     *     
     */
    public void setHonorMemory(HonorMemory value) {
        this.honorMemory = value;
    }

    /**
     * Gets the value of the customFieldDataList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldDataList }
     *     
     */
    public CustomFieldDataList getCustomFieldDataList() {
        return customFieldDataList;
    }

    /**
     * Sets the value of the customFieldDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldDataList }
     *     
     */
    public void setCustomFieldDataList(CustomFieldDataList value) {
        this.customFieldDataList = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setSource(IdNamePair value) {
        this.source = value;
    }

    /**
     * Gets the value of the solicitation property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getSolicitation() {
        return solicitation;
    }

    /**
     * Sets the value of the solicitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setSolicitation(IdNamePair value) {
        this.solicitation = value;
    }

    /**
     * Gets the value of the sendAcknowledgeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAcknowledgeEmail() {
        return sendAcknowledgeEmail;
    }

    /**
     * Sets the value of the sendAcknowledgeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAcknowledgeEmail(Boolean value) {
        this.sendAcknowledgeEmail = value;
    }

    /**
     * Gets the value of the anonymousType property.
     * 
     * @return
     *     possible object is
     *     {@link AnonymousType }
     *     
     */
    public AnonymousType getAnonymousType() {
        return anonymousType;
    }

    /**
     * Sets the value of the anonymousType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnonymousType }
     *     
     */
    public void setAnonymousType(AnonymousType value) {
        this.anonymousType = value;
    }

}
