
package com.z2systems.schemas.donation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.IdNamePair;


/**
 * <p>Java class for FundList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fund" type="{http://www.z2systems.com/schemas/common/}IdNamePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundList", propOrder = {
    "fund"
})
public class FundList {

    protected List<IdNamePair> fund;

    /**
     * Gets the value of the fund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdNamePair }
     * 
     * 
     */
    public List<IdNamePair> getFund() {
        if (fund == null) {
            fund = new ArrayList<IdNamePair>();
        }
        return this.fund;
    }

}
