
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for RetrieveStorePurchaseStatsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveStorePurchaseStatsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storePurchaseStats" type="{http://www.z2systems.com/schemas/store/}StorePurchaseStats" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveStorePurchaseStatsResponse", propOrder = {
    "storePurchaseStats"
})
public class RetrieveStorePurchaseStatsResponse
    extends AbstractResponse
{

    protected StorePurchaseStats storePurchaseStats;

    /**
     * Gets the value of the storePurchaseStats property.
     * 
     * @return
     *     possible object is
     *     {@link StorePurchaseStats }
     *     
     */
    public StorePurchaseStats getStorePurchaseStats() {
        return storePurchaseStats;
    }

    /**
     * Sets the value of the storePurchaseStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorePurchaseStats }
     *     
     */
    public void setStorePurchaseStats(StorePurchaseStats value) {
        this.storePurchaseStats = value;
    }

}
