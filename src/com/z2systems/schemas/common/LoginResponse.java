
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userSessionId" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResponse", propOrder = {
    "userSessionId"
})
public class LoginResponse
    extends AbstractResponse
{

    protected String userSessionId;

    /**
     * Gets the value of the userSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSessionId() {
        return userSessionId;
    }

    /**
     * Sets the value of the userSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSessionId(String value) {
        this.userSessionId = value;
    }

}
