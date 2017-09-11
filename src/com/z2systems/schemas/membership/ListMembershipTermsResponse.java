
package com.z2systems.schemas.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListMembershipTermsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListMembershipTermsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="membershipTerms" type="{http://www.z2systems.com/schemas/membership/}MembershipTermList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListMembershipTermsResponse", propOrder = {
    "membershipTerms"
})
public class ListMembershipTermsResponse
    extends AbstractResponse
{

    protected MembershipTermList membershipTerms;

    /**
     * Gets the value of the membershipTerms property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipTermList }
     *     
     */
    public MembershipTermList getMembershipTerms() {
        return membershipTerms;
    }

    /**
     * Sets the value of the membershipTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipTermList }
     *     
     */
    public void setMembershipTerms(MembershipTermList value) {
        this.membershipTerms = value;
    }

}
