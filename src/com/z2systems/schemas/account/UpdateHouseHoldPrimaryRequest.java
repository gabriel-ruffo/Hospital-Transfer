
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for UpdateHouseHoldPrimaryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateHouseHoldPrimaryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primaryIndividualAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="houseHoldId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHouseHoldPrimaryRequest", propOrder = {
    "primaryIndividualAccountId",
    "houseHoldId"
})
public class UpdateHouseHoldPrimaryRequest
    extends AbstractRequest
{

    protected long primaryIndividualAccountId;
    protected long houseHoldId;

    /**
     * Gets the value of the primaryIndividualAccountId property.
     * 
     */
    public long getPrimaryIndividualAccountId() {
        return primaryIndividualAccountId;
    }

    /**
     * Sets the value of the primaryIndividualAccountId property.
     * 
     */
    public void setPrimaryIndividualAccountId(long value) {
        this.primaryIndividualAccountId = value;
    }

    /**
     * Gets the value of the houseHoldId property.
     * 
     */
    public long getHouseHoldId() {
        return houseHoldId;
    }

    /**
     * Sets the value of the houseHoldId property.
     * 
     */
    public void setHouseHoldId(long value) {
        this.houseHoldId = value;
    }

}
