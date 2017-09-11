
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for ListAccountsBySearchCriteriaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListAccountsBySearchCriteriaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountSearchCriteria" type="{http://www.z2systems.com/schemas/account/}AccountSearchCriteria" minOccurs="0"/&gt;
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
@XmlType(name = "ListAccountsBySearchCriteriaRequest", propOrder = {
    "accountSearchCriteria",
    "page"
})
public class ListAccountsBySearchCriteriaRequest
    extends AbstractRequest
{

    protected AccountSearchCriteria accountSearchCriteria;
    protected Page page;

    /**
     * Gets the value of the accountSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchCriteria }
     *     
     */
    public AccountSearchCriteria getAccountSearchCriteria() {
        return accountSearchCriteria;
    }

    /**
     * Sets the value of the accountSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchCriteria }
     *     
     */
    public void setAccountSearchCriteria(AccountSearchCriteria value) {
        this.accountSearchCriteria = value;
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
