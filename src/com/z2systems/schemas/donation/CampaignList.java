
package com.z2systems.schemas.donation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.IdNamePair;


/**
 * <p>Java class for CampaignList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campaign" type="{http://www.z2systems.com/schemas/common/}IdNamePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignList", propOrder = {
    "campaign"
})
public class CampaignList {

    protected List<IdNamePair> campaign;

    /**
     * Gets the value of the campaign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdNamePair }
     * 
     * 
     */
    public List<IdNamePair> getCampaign() {
        if (campaign == null) {
            campaign = new ArrayList<IdNamePair>();
        }
        return this.campaign;
    }

}
