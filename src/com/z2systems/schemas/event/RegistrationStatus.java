
package com.z2systems.schemas.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistrationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="SUCCEED"/&gt;
 *     &lt;enumeration value="DECLINED"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *     &lt;enumeration value="WAITINGLIST"/&gt;
 *     &lt;enumeration value="CANCEL_PENDING"/&gt;
 *     &lt;enumeration value="DEFERRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistrationStatus")
@XmlEnum
public enum RegistrationStatus {

    PENDING,
    CANCELLED,
    SUCCEED,
    DECLINED,
    FAILED,
    WAITINGLIST,
    CANCEL_PENDING,
    DEFERRED;

    public String value() {
        return name();
    }

    public static RegistrationStatus fromValue(String v) {
        return valueOf(v);
    }

}
