
package com.z2systems.schemas.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.CustomFieldDataList;
import com.z2systems.schemas.common.IdNamePair;


/**
 * <p>Java class for Membership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Membership"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="membershipTerm" type="{http://www.z2systems.com/schemas/membership/}MembershipTerm" minOccurs="0"/&gt;
 *         &lt;element name="autoRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="customFieldDataList" type="{http://www.z2systems.com/schemas/common/}CustomFieldDataList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Membership", propOrder = {
    "accountId",
    "membershipTerm",
    "autoRenewal",
    "source",
    "customFieldDataList"
})
@XmlSeeAlso({
    MembershipResult.class
})
public class Membership {

    protected Long accountId;
    protected MembershipTerm membershipTerm;
    protected Boolean autoRenewal;
    protected IdNamePair source;
    protected CustomFieldDataList customFieldDataList;

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
     * Gets the value of the membershipTerm property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipTerm }
     *     
     */
    public MembershipTerm getMembershipTerm() {
        return membershipTerm;
    }

    /**
     * Sets the value of the membershipTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipTerm }
     *     
     */
    public void setMembershipTerm(MembershipTerm value) {
        this.membershipTerm = value;
    }

    /**
     * Gets the value of the autoRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRenewal() {
        return autoRenewal;
    }

    /**
     * Sets the value of the autoRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRenewal(Boolean value) {
        this.autoRenewal = value;
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

}
