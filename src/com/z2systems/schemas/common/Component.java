
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Component.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Component"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Account"/&gt;
 *     &lt;enumeration value="Donation"/&gt;
 *     &lt;enumeration value="Event"/&gt;
 *     &lt;enumeration value="Attendee"/&gt;
 *     &lt;enumeration value="Individual"/&gt;
 *     &lt;enumeration value="Organization"/&gt;
 *     &lt;enumeration value="Activity"/&gt;
 *     &lt;enumeration value="Membership"/&gt;
 *     &lt;enumeration value="Product"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Component")
@XmlEnum
public enum Component {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Donation")
    DONATION("Donation"),
    @XmlEnumValue("Event")
    EVENT("Event"),
    @XmlEnumValue("Attendee")
    ATTENDEE("Attendee"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Activity")
    ACTIVITY("Activity"),
    @XmlEnumValue("Membership")
    MEMBERSHIP("Membership"),
    @XmlEnumValue("Product")
    PRODUCT("Product");
    private final String value;

    Component(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Component fromValue(String v) {
        for (Component c: Component.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
