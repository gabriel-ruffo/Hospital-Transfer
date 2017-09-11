
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringPeriodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurringPeriodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="MONTH"/&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="LIFE"/&gt;
 *     &lt;enumeration value="WEEKLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecurringPeriodType")
@XmlEnum
public enum RecurringPeriodType {

    YEAR,
    MONTH,
    DAY,
    LIFE,
    WEEKLY;

    public String value() {
        return name();
    }

    public static RecurringPeriodType fromValue(String v) {
        return valueOf(v);
    }

}
