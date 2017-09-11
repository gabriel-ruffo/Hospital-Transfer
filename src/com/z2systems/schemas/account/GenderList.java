
package com.z2systems.schemas.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.CodeNamePair;


/**
 * <p>Java class for GenderList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenderList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gender" type="{http://www.z2systems.com/schemas/common/}CodeNamePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenderList", propOrder = {
    "gender"
})
public class GenderList {

    protected List<CodeNamePair> gender;

    /**
     * Gets the value of the gender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeNamePair }
     * 
     * 
     */
    public List<CodeNamePair> getGender() {
        if (gender == null) {
            gender = new ArrayList<CodeNamePair>();
        }
        return this.gender;
    }

}
