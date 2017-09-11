
package com.z2systems.schemas.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for RetrieveEventAttendeesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEventAttendeesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventAttendeesResults" type="{http://www.z2systems.com/schemas/event/}EventAttendeesResults" minOccurs="0"/&gt;
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
@XmlType(name = "RetrieveEventAttendeesResponse", propOrder = {
    "eventAttendeesResults",
    "page"
})
public class RetrieveEventAttendeesResponse
    extends AbstractResponse
{

    protected EventAttendeesResults eventAttendeesResults;
    protected Page page;

    /**
     * Gets the value of the eventAttendeesResults property.
     * 
     * @return
     *     possible object is
     *     {@link EventAttendeesResults }
     *     
     */
    public EventAttendeesResults getEventAttendeesResults() {
        return eventAttendeesResults;
    }

    /**
     * Sets the value of the eventAttendeesResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventAttendeesResults }
     *     
     */
    public void setEventAttendeesResults(EventAttendeesResults value) {
        this.eventAttendeesResults = value;
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
