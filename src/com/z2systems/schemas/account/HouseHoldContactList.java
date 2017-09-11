
package com.z2systems.schemas.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseHoldContactList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseHoldContactList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="houseHoldContact" type="{http://www.z2systems.com/schemas/account/}HouseHoldContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseHoldContactList", propOrder = {
    "houseHoldContact"
})
public class HouseHoldContactList {

    protected List<HouseHoldContact> houseHoldContact;

    /**
     * Gets the value of the houseHoldContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseHoldContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseHoldContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseHoldContact }
     * 
     * 
     */
    public List<HouseHoldContact> getHouseHoldContact() {
        if (houseHoldContact == null) {
            houseHoldContact = new ArrayList<HouseHoldContact>();
        }
        return this.houseHoldContact;
    }

}
