
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationTypeCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationTypeCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Individual-Individual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationTypeCategory")
@XmlEnum
public enum RelationTypeCategory {

    @XmlEnumValue("Individual-Individual")
    INDIVIDUAL_INDIVIDUAL("Individual-Individual");
    private final String value;

    RelationTypeCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationTypeCategory fromValue(String v) {
        for (RelationTypeCategory c: RelationTypeCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
