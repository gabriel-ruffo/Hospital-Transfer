
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for SyncAccountsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncAccountsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualAccounts" type="{http://www.z2systems.com/schemas/account/}IndividualAccountList" minOccurs="0"/&gt;
 *         &lt;element name="organizationAccounts" type="{http://www.z2systems.com/schemas/account/}OrganizationAccountList" minOccurs="0"/&gt;
 *         &lt;element name="deletedAccountList" type="{http://www.z2systems.com/schemas/account/}AccountIdList" minOccurs="0"/&gt;
 *         &lt;element name="page" type="{http://www.z2systems.com/schemas/common/}Page" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncAccountsResponse", propOrder = {
    "individualAccounts",
    "organizationAccounts",
    "deletedAccountList",
    "page"
})
public class SyncAccountsResponse
    extends AbstractResponse
{

    protected IndividualAccountList individualAccounts;
    protected OrganizationAccountList organizationAccounts;
    protected AccountIdList deletedAccountList;
    protected Page page;

    /**
     * Gets the value of the individualAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAccountList }
     *     
     */
    public IndividualAccountList getIndividualAccounts() {
        return individualAccounts;
    }

    /**
     * Sets the value of the individualAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAccountList }
     *     
     */
    public void setIndividualAccounts(IndividualAccountList value) {
        this.individualAccounts = value;
    }

    /**
     * Gets the value of the organizationAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAccountList }
     *     
     */
    public OrganizationAccountList getOrganizationAccounts() {
        return organizationAccounts;
    }

    /**
     * Sets the value of the organizationAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAccountList }
     *     
     */
    public void setOrganizationAccounts(OrganizationAccountList value) {
        this.organizationAccounts = value;
    }

    /**
     * Gets the value of the deletedAccountList property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdList }
     *     
     */
    public AccountIdList getDeletedAccountList() {
        return deletedAccountList;
    }

    /**
     * Sets the value of the deletedAccountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdList }
     *     
     */
    public void setDeletedAccountList(AccountIdList value) {
        this.deletedAccountList = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Page }
     *     
     */
    public Page getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Page }
     *     
     */
    public void setPage(Page value) {
        this.page = value;
    }

}
