
package com.z2systems.schemas.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for RetrieveEventRegistrationStatsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEventRegistrationStatsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventRegistrationStats" type="{http://www.z2systems.com/schemas/event/}EventRegistrationStats" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEventRegistrationStatsResponse", propOrder = {
    "eventRegistrationStats"
})
public class RetrieveEventRegistrationStatsResponse
    extends AbstractResponse
{

    protected EventRegistrationStats eventRegistrationStats;

    /**
     * Gets the value of the eventRegistrationStats property.
     * 
     * @return
     *     possible object is
     *     {@link EventRegistrationStats }
     *     
     */
    public EventRegistrationStats getEventRegistrationStats() {
        return eventRegistrationStats;
    }

    /**
     * Sets the value of the eventRegistrationStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventRegistrationStats }
     *     
     */
    public void setEventRegistrationStats(EventRegistrationStats value) {
        this.eventRegistrationStats = value;
    }

}
