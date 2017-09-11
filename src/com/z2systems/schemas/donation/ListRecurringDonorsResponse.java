
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for ListRecurringDonorsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRecurringDonorsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurringDonors" type="{http://www.z2systems.com/schemas/donation/}RecurringDonorList" minOccurs="0"/&gt;
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
@XmlType(name = "ListRecurringDonorsResponse", propOrder = {
    "recurringDonors",
    "page"
})
public class ListRecurringDonorsResponse
    extends AbstractResponse
{

    protected RecurringDonorList recurringDonors;
    protected Page page;

    /**
     * Gets the value of the recurringDonors property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringDonorList }
     *     
     */
    public RecurringDonorList getRecurringDonors() {
        return recurringDonors;
    }

    /**
     * Sets the value of the recurringDonors property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringDonorList }
     *     
     */
    public void setRecurringDonors(RecurringDonorList value) {
        this.recurringDonors = value;
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
