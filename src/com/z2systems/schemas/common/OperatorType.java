
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EQUAL"/&gt;
 *     &lt;enumeration value="NOT_EQUAL"/&gt;
 *     &lt;enumeration value="BLANK"/&gt;
 *     &lt;enumeration value="NOT_BLANK"/&gt;
 *     &lt;enumeration value="LESS_THAN"/&gt;
 *     &lt;enumeration value="GREATER_THAN"/&gt;
 *     &lt;enumeration value="LESS_AND_EQUAL"/&gt;
 *     &lt;enumeration value="GREATER_AND_EQUAL"/&gt;
 *     &lt;enumeration value="IN_RANGE"/&gt;
 *     &lt;enumeration value="NOT_IN_RANGE"/&gt;
 *     &lt;enumeration value="CONTAIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatorType")
@XmlEnum
public enum OperatorType {

    EQUAL,
    NOT_EQUAL,
    BLANK,
    NOT_BLANK,
    LESS_THAN,
    GREATER_THAN,
    LESS_AND_EQUAL,
    GREATER_AND_EQUAL,
    IN_RANGE,
    NOT_IN_RANGE,
    CONTAIN;

    public String value() {
        return name();
    }

    public static OperatorType fromValue(String v) {
        return valueOf(v);
    }

}
