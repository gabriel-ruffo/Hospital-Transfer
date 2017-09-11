
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for ListRecurringDonorsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRecurringDonorsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="donorSearch" type="{http://www.z2systems.com/schemas/donation/}RecurringDonorSearchCriteria" minOccurs="0"/&gt;
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
@XmlType(name = "ListRecurringDonorsRequest", propOrder = {
    "donorSearch",
    "page"
})
public class ListRecurringDonorsRequest
    extends AbstractRequest
{

    protected RecurringDonorSearchCriteria donorSearch;
    protected Page page;

    /**
     * Gets the value of the donorSearch property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringDonorSearchCriteria }
     *     
     */
    public RecurringDonorSearchCriteria getDonorSearch() {
        return donorSearch;
    }

    /**
     * Sets the value of the donorSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringDonorSearchCriteria }
     *     
     */
    public void setDonorSearch(RecurringDonorSearchCriteria value) {
        this.donorSearch = value;
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
