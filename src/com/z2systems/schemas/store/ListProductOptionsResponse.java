
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListProductOptionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListProductOptionsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productOptions" type="{http://www.z2systems.com/schemas/store/}ProductOptionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListProductOptionsResponse", propOrder = {
    "productOptions"
})
public class ListProductOptionsResponse
    extends AbstractResponse
{

    protected ProductOptionList productOptions;

    /**
     * Gets the value of the productOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOptionList }
     *     
     */
    public ProductOptionList getProductOptions() {
        return productOptions;
    }

    /**
     * Sets the value of the productOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOptionList }
     *     
     */
    public void setProductOptions(ProductOptionList value) {
        this.productOptions = value;
    }

}
