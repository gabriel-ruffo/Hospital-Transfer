
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for RetrieveOrganizationAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveOrganizationAccountResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organizationAccount" type="{http://www.z2systems.com/schemas/account/}OrganizationAccount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOrganizationAccountResponse", propOrder = {
    "organizationAccount"
})
public class RetrieveOrganizationAccountResponse
    extends AbstractResponse
{

    protected OrganizationAccount organizationAccount;

    /**
     * Gets the value of the organizationAccount property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAccount }
     *     
     */
    public OrganizationAccount getOrganizationAccount() {
        return organizationAccount;
    }

    /**
     * Sets the value of the organizationAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAccount }
     *     
     */
    public void setOrganizationAccount(OrganizationAccount value) {
        this.organizationAccount = value;
    }

}
