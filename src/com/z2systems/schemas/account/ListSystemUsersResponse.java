
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListSystemUsersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListSystemUsersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemUsers" type="{http://www.z2systems.com/schemas/account/}SystemUserList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSystemUsersResponse", propOrder = {
    "systemUsers"
})
public class ListSystemUsersResponse
    extends AbstractResponse
{

    protected SystemUserList systemUsers;

    /**
     * Gets the value of the systemUsers property.
     * 
     * @return
     *     possible object is
     *     {@link SystemUserList }
     *     
     */
    public SystemUserList getSystemUsers() {
        return systemUsers;
    }

    /**
     * Sets the value of the systemUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemUserList }
     *     
     */
    public void setSystemUsers(SystemUserList value) {
        this.systemUsers = value;
    }

}
