
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Checkbox"/&gt;
 *     &lt;enumeration value="Dropdown"/&gt;
 *     &lt;enumeration value="OneLineText"/&gt;
 *     &lt;enumeration value="MultiLineText"/&gt;
 *     &lt;enumeration value="Password"/&gt;
 *     &lt;enumeration value="File"/&gt;
 *     &lt;enumeration value="Radio"/&gt;
 *     &lt;enumeration value="Account"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FieldDataType")
@XmlEnum
public enum FieldDataType {

    @XmlEnumValue("Checkbox")
    CHECKBOX("Checkbox"),
    @XmlEnumValue("Dropdown")
    DROPDOWN("Dropdown"),
    @XmlEnumValue("OneLineText")
    ONE_LINE_TEXT("OneLineText"),
    @XmlEnumValue("MultiLineText")
    MULTI_LINE_TEXT("MultiLineText"),
    @XmlEnumValue("Password")
    PASSWORD("Password"),
    @XmlEnumValue("File")
    FILE("File"),
    @XmlEnumValue("Radio")
    RADIO("Radio"),
    @XmlEnumValue("Account")
    ACCOUNT("Account");
    private final String value;

    FieldDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldDataType fromValue(String v) {
        for (FieldDataType c: FieldDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
