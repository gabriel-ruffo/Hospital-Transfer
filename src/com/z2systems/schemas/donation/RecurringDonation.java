
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecurringDonation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringDonation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/donation/}AbstractDonation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurringPeriod" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="recurringPeriodType" type="{http://www.z2systems.com/schemas/donation/}RecurringPeriodType"/&gt;
 *         &lt;element name="nextDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringDonation", propOrder = {
    "recurringPeriod",
    "recurringPeriodType",
    "nextDate",
    "endDate"
})
public class RecurringDonation
    extends AbstractDonation
{

    protected long recurringPeriod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RecurringPeriodType recurringPeriodType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the recurringPeriod property.
     * 
     */
    public long getRecurringPeriod() {
        return recurringPeriod;
    }

    /**
     * Sets the value of the recurringPeriod property.
     * 
     */
    public void setRecurringPeriod(long value) {
        this.recurringPeriod = value;
    }

    /**
     * Gets the value of the recurringPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPeriodType }
     *     
     */
    public RecurringPeriodType getRecurringPeriodType() {
        return recurringPeriodType;
    }

    /**
     * Sets the value of the recurringPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPeriodType }
     *     
     */
    public void setRecurringPeriodType(RecurringPeriodType value) {
        this.recurringPeriodType = value;
    }

    /**
     * Gets the value of the nextDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextDate() {
        return nextDate;
    }

    /**
     * Sets the value of the nextDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextDate(XMLGregorianCalendar value) {
        this.nextDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
