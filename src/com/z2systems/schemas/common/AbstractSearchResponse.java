
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.account.ListAccountsByDefaultResponse;
import com.z2systems.schemas.account.ListAccountsResponse;
import com.z2systems.schemas.account.ListActivitiesResponse;
import com.z2systems.schemas.donation.ListDonationsResponse;
import com.z2systems.schemas.event.ListEventsResponse;
import com.z2systems.schemas.membership.ListMembershipsResponse;


/**
 * <p>Java class for AbstractSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="page" type="{http://www.z2systems.com/schemas/common/}Page" minOccurs="0"/&gt;
 *         &lt;element name="searchResults" type="{http://www.z2systems.com/schemas/common/}NameValuePairsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSearchResponse", propOrder = {
    "page",
    "searchResults"
})
@XmlSeeAlso({
    ListActivitiesResponse.class,
    ListAccountsResponse.class,
    ListAccountsByDefaultResponse.class,
    ListMembershipsResponse.class,
    ListDonationsResponse.class,
    ListEventsResponse.class
})
public class AbstractSearchResponse
    extends AbstractResponse
{

    protected Page page;
    protected NameValuePairsList searchResults;

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

    /**
     * Gets the value of the searchResults property.
     * 
     * @return
     *     possible object is
     *     {@link NameValuePairsList }
     *     
     */
    public NameValuePairsList getSearchResults() {
        return searchResults;
    }

    /**
     * Sets the value of the searchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValuePairsList }
     *     
     */
    public void setSearchResults(NameValuePairsList value) {
        this.searchResults = value;
    }

}
