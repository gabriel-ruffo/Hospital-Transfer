
package com.z2systems.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdNamePairList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdNamePairList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idNamePair" type="{http://www.z2systems.com/schemas/common/}IdNamePair" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdNamePairList", propOrder = {
    "idNamePair"
})
public class IdNamePairList {

    @XmlElement(required = true)
    protected List<IdNamePair> idNamePair;

    /**
     * Gets the value of the idNamePair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idNamePair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdNamePair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdNamePair }
     * 
     * 
     */
    public List<IdNamePair> getIdNamePair() {
        if (idNamePair == null) {
            idNamePair = new ArrayList<IdNamePair>();
        }
        return this.idNamePair;
    }

}
