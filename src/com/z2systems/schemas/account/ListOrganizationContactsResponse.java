
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListOrganizationContactsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOrganizationContactsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organizationContacts" type="{http://www.z2systems.com/schemas/account/}OrganizationContactList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOrganizationContactsResponse", propOrder = {
    "organizationContacts"
})
public class ListOrganizationContactsResponse
    extends AbstractResponse
{

    protected OrganizationContactList organizationContacts;

    /**
     * Gets the value of the organizationContacts property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationContactList }
     *     
     */
    public OrganizationContactList getOrganizationContacts() {
        return organizationContacts;
    }

    /**
     * Sets the value of the organizationContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationContactList }
     *     
     */
    public void setOrganizationContacts(OrganizationContactList value) {
        this.organizationContacts = value;
    }

}
