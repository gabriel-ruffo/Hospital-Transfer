
package com.z2systems.schemas.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListMembershipHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListMembershipHistoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="membershipResults" type="{http://www.z2systems.com/schemas/membership/}MembershipResultList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListMembershipHistoryResponse", propOrder = {
    "membershipResults"
})
public class ListMembershipHistoryResponse
    extends AbstractResponse
{

    protected MembershipResultList membershipResults;

    /**
     * Gets the value of the membershipResults property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipResultList }
     *     
     */
    public MembershipResultList getMembershipResults() {
        return membershipResults;
    }

    /**
     * Sets the value of the membershipResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipResultList }
     *     
     */
    public void setMembershipResults(MembershipResultList value) {
        this.membershipResults = value;
    }

}
