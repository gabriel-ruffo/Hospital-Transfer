
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/account/}Account"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="existingOrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="organizationName" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="facebookPage" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="twitterPage" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="individualTypes" type="{http://www.z2systems.com/schemas/account/}IndividualTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualAccount", propOrder = {
    "existingOrganizationId",
    "organizationName",
    "facebookPage",
    "twitterPage",
    "individualTypes"
})
public class IndividualAccount
    extends Account
{

    protected Long existingOrganizationId;
    protected String organizationName;
    protected String facebookPage;
    protected String twitterPage;
    protected IndividualTypeList individualTypes;

    /**
     * Gets the value of the existingOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExistingOrganizationId() {
        return existingOrganizationId;
    }

    /**
     * Sets the value of the existingOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExistingOrganizationId(Long value) {
        this.existingOrganizationId = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the facebookPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookPage() {
        return facebookPage;
    }

    /**
     * Sets the value of the facebookPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookPage(String value) {
        this.facebookPage = value;
    }

    /**
     * Gets the value of the twitterPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterPage() {
        return twitterPage;
    }

    /**
     * Sets the value of the twitterPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterPage(String value) {
        this.twitterPage = value;
    }

    /**
     * Gets the value of the individualTypes property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualTypeList }
     *     
     */
    public IndividualTypeList getIndividualTypes() {
        return individualTypes;
    }

    /**
     * Sets the value of the individualTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualTypeList }
     *     
     */
    public void setIndividualTypes(IndividualTypeList value) {
        this.individualTypes = value;
    }

}
