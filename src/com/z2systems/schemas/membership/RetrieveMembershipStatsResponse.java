
package com.z2systems.schemas.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for RetrieveMembershipStatsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMembershipStatsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="membershipStats" type="{http://www.z2systems.com/schemas/membership/}MembershipStats" minOccurs="0"/&gt;
 *         &lt;element name="currentMembership" type="{http://www.z2systems.com/schemas/membership/}MembershipResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMembershipStatsResponse", propOrder = {
    "membershipStats",
    "currentMembership"
})
public class RetrieveMembershipStatsResponse
    extends AbstractResponse
{

    protected MembershipStats membershipStats;
    protected MembershipResult currentMembership;

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
     * Gets the value of the currentMembership property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipResult }
     *     
     */
    public MembershipResult getCurrentMembership() {
        return currentMembership;
    }

    /**
     * Sets the value of the currentMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipResult }
     *     
     */
    public void setCurrentMembership(MembershipResult value) {
        this.currentMembership = value;
    }

}
