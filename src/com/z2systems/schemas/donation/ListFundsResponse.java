
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListFundsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListFundsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funds" type="{http://www.z2systems.com/schemas/donation/}FundList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListFundsResponse", propOrder = {
    "funds"
})
public class ListFundsResponse
    extends AbstractResponse
{

    protected FundList funds;

    /**
     * Gets the value of the funds property.
     * 
     * @return
     *     possible object is
     *     {@link FundList }
     *     
     */
    public FundList getFunds() {
        return funds;
    }

    /**
     * Sets the value of the funds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundList }
     *     
     */
    public void setFunds(FundList value) {
        this.funds = value;
    }

}
