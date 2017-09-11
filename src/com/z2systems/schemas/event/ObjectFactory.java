
package com.z2systems.schemas.event;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.z2systems.schemas.event package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.z2systems.schemas.event
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventAttendeesResult }
     * 
     */
    public EventAttendeesResult createEventAttendeesResult() {
        return new EventAttendeesResult();
    }

    /**
     * Create an instance of {@link EventAttendeesResults }
     * 
     */
    public EventAttendeesResults createEventAttendeesResults() {
        return new EventAttendeesResults();
    }

    /**
     * Create an instance of {@link EventRegistrationStats }
     * 
     */
    public EventRegistrationStats createEventRegistrationStats() {
        return new EventRegistrationStats();
    }

    /**
     * Create an instance of {@link ListEventsRequest }
     * 
     */
    public ListEventsRequest createListEventsRequest() {
        return new ListEventsRequest();
    }

    /**
     * Create an instance of {@link ListEventsResponse }
     * 
     */
    public ListEventsResponse createListEventsResponse() {
        return new ListEventsResponse();
    }

    /**
     * Create an instance of {@link RetrieveEventRegistrationStatsRequest }
     * 
     */
    public RetrieveEventRegistrationStatsRequest createRetrieveEventRegistrationStatsRequest() {
        return new RetrieveEventRegistrationStatsRequest();
    }

    /**
     * Create an instance of {@link RetrieveEventRegistrationStatsResponse }
     * 
     */
    public RetrieveEventRegistrationStatsResponse createRetrieveEventRegistrationStatsResponse() {
        return new RetrieveEventRegistrationStatsResponse();
    }

    /**
     * Create an instance of {@link RetrieveEventAttendeesRequest }
     * 
     */
    public RetrieveEventAttendeesRequest createRetrieveEventAttendeesRequest() {
        return new RetrieveEventAttendeesRequest();
    }

    /**
     * Create an instance of {@link RetrieveEventAttendeesResponse }
     * 
     */
    public RetrieveEventAttendeesResponse createRetrieveEventAttendeesResponse() {
        return new RetrieveEventAttendeesResponse();
    }

}
