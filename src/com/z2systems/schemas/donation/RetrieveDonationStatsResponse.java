
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for RetrieveDonationStatsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveDonationStatsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="donationStats" type="{http://www.z2systems.com/schemas/donation/}DonationStats" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveDonationStatsResponse", propOrder = {
    "donationStats"
})
public class RetrieveDonationStatsResponse
    extends AbstractResponse
{

    protected DonationStats donationStats;

    /**
     * Gets the value of the donationStats property.
     * 
     * @return
     *     possible object is
     *     {@link DonationStats }
     *     
     */
    public DonationStats getDonationStats() {
        return donationStats;
    }

    /**
     * Sets the value of the donationStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonationStats }
     *     
     */
    public void setDonationStats(DonationStats value) {
        this.donationStats = value;
    }

}
