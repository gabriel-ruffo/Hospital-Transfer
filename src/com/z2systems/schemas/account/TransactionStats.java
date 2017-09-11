
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.donation.DonationStats;
import com.z2systems.schemas.event.EventRegistrationStats;
import com.z2systems.schemas.membership.MembershipResult;
import com.z2systems.schemas.membership.MembershipStats;
import com.z2systems.schemas.store.StorePurchaseStats;


/**
 * <p>Java class for TransactionStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionStats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="donationStats" type="{http://www.z2systems.com/schemas/donation/}DonationStats" minOccurs="0"/&gt;
 *         &lt;element name="membershipStats" type="{http://www.z2systems.com/schemas/membership/}MembershipStats" minOccurs="0"/&gt;
 *         &lt;element name="membershipResult" type="{http://www.z2systems.com/schemas/membership/}MembershipResult" minOccurs="0"/&gt;
 *         &lt;element name="eventRegistrationStats" type="{http://www.z2systems.com/schemas/event/}EventRegistrationStats" minOccurs="0"/&gt;
 *         &lt;element name="storePurchaseStats" type="{http://www.z2systems.com/schemas/store/}StorePurchaseStats" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStats", propOrder = {
    "donationStats",
    "membershipStats",
    "membershipResult",
    "eventRegistrationStats",
    "storePurchaseStats"
})
public class TransactionStats {

    protected DonationStats donationStats;
    protected MembershipStats membershipStats;
    protected MembershipResult membershipResult;
    protected EventRegistrationStats eventRegistrationStats;
    protected StorePurchaseStats storePurchaseStats;

    /**
     * Gets the value of the donationStats property.
     * 
     * @return
     *     possible object is
     *     {@link DonationStats }
     *     
     */
    public DonationStats getDonationStats() {
        return donationStats;
    }

    /**
     * Sets the value of the donationStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonationStats }
     *     
     */
    public void setDonationStats(DonationStats value) {
        this.donationStats = value;
    }

    /**
     * Gets the value of the membershipStats property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipStats }
     *     
     */
    public MembershipStats getMembershipStats() {
        return membershipStats;
    }

    /**
     * Sets the value of the membershipStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipStats }
     *     
     */
    public void setMembershipStats(MembershipStats value) {
        this.membershipStats = value;
    }

    /**
     * Gets the value of the membershipResult property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipResult }
     *     
     */
    public MembershipResult getMembershipResult() {
        return membershipResult;
    }

    /**
     * Sets the value of the membershipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipResult }
     *     
     */
    public void setMembershipResult(MembershipResult value) {
        this.membershipResult = value;
    }

    /**
     * Gets the value of the eventRegistrationStats property.
     * 
     * @return
     *     possible object is
     *     {@link EventRegistrationStats }
     *     
     */
    public EventRegistrationStats getEventRegistrationStats() {
        return eventRegistrationStats;
    }

    /**
     * Sets the value of the eventRegistrationStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventRegistrationStats }
     *     
     */
    public void setEventRegistrationStats(EventRegistrationStats value) {
        this.eventRegistrationStats = value;
    }

    /**
     * Gets the value of the storePurchaseStats property.
     * 
     * @return
     *     possible object is
     *     {@link StorePurchaseStats }
     *     
     */
    public StorePurchaseStats getStorePurchaseStats() {
        return storePurchaseStats;
    }

    /**
     * Sets the value of the storePurchaseStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorePurchaseStats }
     *     
     */
    public void setStorePurchaseStats(StorePurchaseStats value) {
        this.storePurchaseStats = value;
    }

}
