
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for RetrieveReceiptResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveReceiptResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receiptPDF" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveReceiptResponse", propOrder = {
    "receiptPDF"
})
public class RetrieveReceiptResponse
    extends AbstractResponse
{

    protected byte[] receiptPDF;

    /**
     * Gets the value of the receiptPDF property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReceiptPDF() {
        return receiptPDF;
    }

    /**
     * Sets the value of the receiptPDF property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReceiptPDF(byte[] value) {
        this.receiptPDF = value;
    }

}
