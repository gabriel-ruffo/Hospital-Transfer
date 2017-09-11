
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for CreateOrganizationAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrganizationAccountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organizationAccount" type="{http://www.z2systems.com/schemas/account/}OrganizationAccount"/&gt;
 *         &lt;element name="sendAcknowledgeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="originDetail" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrganizationAccountRequest", propOrder = {
    "organizationAccount",
    "sendAcknowledgeEmail",
    "originDetail"
})
public class CreateOrganizationAccountRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected OrganizationAccount organizationAccount;
    protected Boolean sendAcknowledgeEmail;
    protected String originDetail;

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

    /**
     * Gets the value of the sendAcknowledgeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAcknowledgeEmail() {
        return sendAcknowledgeEmail;
    }

    /**
     * Sets the value of the sendAcknowledgeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAcknowledgeEmail(Boolean value) {
        this.sendAcknowledgeEmail = value;
    }

    /**
     * Gets the value of the originDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDetail() {
        return originDetail;
    }

    /**
     * Sets the value of the originDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDetail(String value) {
        this.originDetail = value;
    }

}
