
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HonorMemoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HonorMemoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Honor"/&gt;
 *     &lt;enumeration value="Memory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HonorMemoryType")
@XmlEnum
public enum HonorMemoryType {

    @XmlEnumValue("Honor")
    HONOR("Honor"),
    @XmlEnumValue("Memory")
    MEMORY("Memory");
    private final String value;

    HonorMemoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HonorMemoryType fromValue(String v) {
        for (HonorMemoryType c: HonorMemoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
