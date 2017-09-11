
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for RemoveIndividualFromOrganizationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveIndividualFromOrganizationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualContactId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="organizationAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveIndividualFromOrganizationRequest", propOrder = {
    "individualContactId",
    "organizationAccountId"
})
public class RemoveIndividualFromOrganizationRequest
    extends AbstractRequest
{

    protected long individualContactId;
    protected long organizationAccountId;

    /**
     * Gets the value of the individualContactId property.
     * 
     */
    public long getIndividualContactId() {
        return individualContactId;
    }

    /**
     * Sets the value of the individualContactId property.
     * 
     */
    public void setIndividualContactId(long value) {
        this.individualContactId = value;
    }

    /**
     * Gets the value of the organizationAccountId property.
     * 
     */
    public long getOrganizationAccountId() {
        return organizationAccountId;
    }

    /**
     * Sets the value of the organizationAccountId property.
     * 
     */
    public void setOrganizationAccountId(long value) {
        this.organizationAccountId = value;
    }

}
