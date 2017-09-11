
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.account.ListAccountsRequest;
import com.z2systems.schemas.account.ListActivitiesRequest;
import com.z2systems.schemas.donation.ListDonationsRequest;
import com.z2systems.schemas.event.ListEventsRequest;
import com.z2systems.schemas.membership.ListMembershipsRequest;


/**
 * <p>Java class for AbstractSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSearchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searches" type="{http://www.z2systems.com/schemas/common/}SearchList" minOccurs="0"/&gt;
 *         &lt;element name="outputFields" type="{http://www.z2systems.com/schemas/common/}IdNamePairList"/&gt;
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
@XmlType(name = "AbstractSearchRequest", propOrder = {
    "searches",
    "outputFields",
    "page"
})
@XmlSeeAlso({
    ListActivitiesRequest.class,
    ListAccountsRequest.class,
    ListMembershipsRequest.class,
    ListDonationsRequest.class,
    ListEventsRequest.class
})
public class AbstractSearchRequest
    extends AbstractRequest
{

    protected SearchList searches;
    @XmlElement(required = true)
    protected IdNamePairList outputFields;
    protected Page page;

    /**
     * Gets the value of the searches property.
     * 
     * @return
     *     possible object is
     *     {@link SearchList }
     *     
     */
    public SearchList getSearches() {
        return searches;
    }

    /**
     * Sets the value of the searches property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchList }
     *     
     */
    public void setSearches(SearchList value) {
        this.searches = value;
    }

    /**
     * Gets the value of the outputFields property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePairList }
     *     
     */
    public IdNamePairList getOutputFields() {
        return outputFields;
    }

    /**
     * Sets the value of the outputFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePairList }
     *     
     */
    public void setOutputFields(IdNamePairList value) {
        this.outputFields = value;
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
