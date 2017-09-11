
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveStatsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveStatsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.z2systems.com/schemas/common/}ShortTextType" minOccurs="0"/&gt;
 *         &lt;element name="campaign" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="monthlyStats" type="{http://www.z2systems.com/schemas/common/}MonthlyStatsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveStatsResponse", propOrder = {
    "type",
    "campaign",
    "monthlyStats"
})
public class RetrieveStatsResponse
    extends AbstractResponse
{

    protected String type;
    protected IdNamePair campaign;
    protected MonthlyStatsList monthlyStats;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setCampaign(IdNamePair value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the monthlyStats property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyStatsList }
     *     
     */
    public MonthlyStatsList getMonthlyStats() {
        return monthlyStats;
    }

    /**
     * Sets the value of the monthlyStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyStatsList }
     *     
     */
    public void setMonthlyStats(MonthlyStatsList value) {
        this.monthlyStats = value;
    }

}
