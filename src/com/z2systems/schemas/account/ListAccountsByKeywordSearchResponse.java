
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for ListAccountsByKeywordSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListAccountsByKeywordSearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountSearchResults" type="{http://www.z2systems.com/schemas/account/}AccountSearchResultList" minOccurs="0"/&gt;
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
@XmlType(name = "ListAccountsByKeywordSearchResponse", propOrder = {
    "accountSearchResults",
    "page"
})
public class ListAccountsByKeywordSearchResponse
    extends AbstractResponse
{

    protected AccountSearchResultList accountSearchResults;
    protected Page page;

    /**
     * Gets the value of the accountSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchResultList }
     *     
     */
    public AccountSearchResultList getAccountSearchResults() {
        return accountSearchResults;
    }

    /**
     * Sets the value of the accountSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchResultList }
     *     
     */
    public void setAccountSearchResults(AccountSearchResultList value) {
        this.accountSearchResults = value;
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
