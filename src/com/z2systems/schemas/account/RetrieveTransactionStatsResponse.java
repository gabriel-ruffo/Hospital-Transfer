
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for RetrieveTransactionStatsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveTransactionStatsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionStats" type="{http://www.z2systems.com/schemas/account/}TransactionStats" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveTransactionStatsResponse", propOrder = {
    "transactionStats"
})
public class RetrieveTransactionStatsResponse
    extends AbstractResponse
{

    protected TransactionStats transactionStats;

    /**
     * Gets the value of the transactionStats property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStats }
     *     
     */
    public TransactionStats getTransactionStats() {
        return transactionStats;
    }

    /**
     * Sets the value of the transactionStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStats }
     *     
     */
    public void setTransactionStats(TransactionStats value) {
        this.transactionStats = value;
    }

}
