
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="gif"/&gt;
 *     &lt;enumeration value="jpg"/&gt;
 *     &lt;enumeration value="png"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageType")
@XmlEnum
public enum ImageType {

    @XmlEnumValue("gif")
    GIF("gif"),
    @XmlEnumValue("jpg")
    JPG("jpg"),
    @XmlEnumValue("png")
    PNG("png");
    private final String value;

    ImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageType fromValue(String v) {
        for (ImageType c: ImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
