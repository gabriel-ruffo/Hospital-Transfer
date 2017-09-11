
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.CreationLog;
import com.z2systems.schemas.common.CustomFieldDataList;
import com.z2systems.schemas.common.IdNamePair;
import com.z2systems.schemas.common.Login;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}CreationLog"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="primaryContact" type="{http://www.z2systems.com/schemas/account/}Contact" minOccurs="0"/&gt;
 *         &lt;element name="noSolicitation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="login" type="{http://www.z2systems.com/schemas/common/}Login" minOccurs="0"/&gt;
 *         &lt;element name="customFieldDataList" type="{http://www.z2systems.com/schemas/common/}CustomFieldDataList" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountId",
    "primaryContact",
    "noSolicitation",
    "url",
    "login",
    "customFieldDataList",
    "source"
})
@XmlSeeAlso({
    IndividualAccount.class,
    OrganizationAccount.class
})
public class Account
    extends CreationLog
{

    protected Long accountId;
    protected Contact primaryContact;
    protected Boolean noSolicitation;
    protected String url;
    protected Login login;
    protected CustomFieldDataList customFieldDataList;
    protected IdNamePair source;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setPrimaryContact(Contact value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the noSolicitation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoSolicitation() {
        return noSolicitation;
    }

    /**
     * Sets the value of the noSolicitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoSolicitation(Boolean value) {
        this.noSolicitation = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link Login }
     *     
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link Login }
     *     
     */
    public void setLogin(Login value) {
        this.login = value;
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

}
