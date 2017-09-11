
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *     &lt;enumeration value="Succeed"/&gt;
 *     &lt;enumeration value="Declined"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Scheduled"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Deferred"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionStatus")
@XmlEnum
public enum TransactionStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Succeed")
    SUCCEED("Succeed"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Deferred")
    DEFERRED("Deferred");
    private final String value;

    TransactionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionStatus fromValue(String v) {
        for (TransactionStatus c: TransactionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
