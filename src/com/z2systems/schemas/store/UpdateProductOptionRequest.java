
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for UpdateProductOptionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProductOptionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productOption" type="{http://www.z2systems.com/schemas/store/}ProductOption"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProductOptionRequest", propOrder = {
    "productOption"
})
public class UpdateProductOptionRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected ProductOption productOption;

    /**
     * Gets the value of the productOption property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOption }
     *     
     */
    public ProductOption getProductOption() {
        return productOption;
    }

    /**
     * Sets the value of the productOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOption }
     *     
     */
    public void setProductOption(ProductOption value) {
        this.productOption = value;
    }

}
