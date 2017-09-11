
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingCartItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShoppingCartItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Donation"/&gt;
 *     &lt;enumeration value="Event"/&gt;
 *     &lt;enumeration value="Membership"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShoppingCartItemType")
@XmlEnum
public enum ShoppingCartItemType {

    @XmlEnumValue("Donation")
    DONATION("Donation"),
    @XmlEnumValue("Event")
    EVENT("Event"),
    @XmlEnumValue("Membership")
    MEMBERSHIP("Membership");
    private final String value;

    ShoppingCartItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShoppingCartItemType fromValue(String v) {
        for (ShoppingCartItemType c: ShoppingCartItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
