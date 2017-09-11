
package com.z2systems.schemas.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventAttendeesResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventAttendeesResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventAttendeesResult" type="{http://www.z2systems.com/schemas/event/}EventAttendeesResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventAttendeesResults", propOrder = {
    "eventAttendeesResult"
})
public class EventAttendeesResults {

    protected List<EventAttendeesResult> eventAttendeesResult;

    /**
     * Gets the value of the eventAttendeesResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventAttendeesResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventAttendeesResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventAttendeesResult }
     * 
     * 
     */
    public List<EventAttendeesResult> getEventAttendeesResult() {
        if (eventAttendeesResult == null) {
            eventAttendeesResult = new ArrayList<EventAttendeesResult>();
        }
        return this.eventAttendeesResult;
    }

}
