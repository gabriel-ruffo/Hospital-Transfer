
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnonymousType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnonymousType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="DonorNameAnonymous"/&gt;
 *     &lt;enumeration value="DonationAmountAnonymous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnonymousType")
@XmlEnum
public enum AnonymousType {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("DonorNameAnonymous")
    DONOR_NAME_ANONYMOUS("DonorNameAnonymous"),
    @XmlEnumValue("DonationAmountAnonymous")
    DONATION_AMOUNT_ANONYMOUS("DonationAmountAnonymous");
    private final String value;

    AnonymousType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnonymousType fromValue(String v) {
        for (AnonymousType c: AnonymousType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
