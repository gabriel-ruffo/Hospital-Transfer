
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/account/}Account"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primaryContactAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="organizationName" type="{http://www.z2systems.com/schemas/common/}LongTextType"/&gt;
 *         &lt;element name="organizationTypes" type="{http://www.z2systems.com/schemas/account/}OrganizationTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationAccount", propOrder = {
    "primaryContactAccountId",
    "organizationName",
    "organizationTypes"
})
public class OrganizationAccount
    extends Account
{

    protected Long primaryContactAccountId;
    @XmlElement(required = true)
    protected String organizationName;
    protected OrganizationTypeList organizationTypes;

    /**
     * Gets the value of the primaryContactAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryContactAccountId() {
        return primaryContactAccountId;
    }

    /**
     * Sets the value of the primaryContactAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryContactAccountId(Long value) {
        this.primaryContactAccountId = value;
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
     * Gets the value of the organizationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationTypeList }
     *     
     */
    public OrganizationTypeList getOrganizationTypes() {
        return organizationTypes;
    }

    /**
     * Sets the value of the organizationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationTypeList }
     *     
     */
    public void setOrganizationTypes(OrganizationTypeList value) {
        this.organizationTypes = value;
    }

}
