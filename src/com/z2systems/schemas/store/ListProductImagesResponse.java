
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListProductImagesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListProductImagesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productImages" type="{http://www.z2systems.com/schemas/store/}ProductImageList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListProductImagesResponse", propOrder = {
    "productImages"
})
public class ListProductImagesResponse
    extends AbstractResponse
{

    protected ProductImageList productImages;

    /**
     * Gets the value of the productImages property.
     * 
     * @return
     *     possible object is
     *     {@link ProductImageList }
     *     
     */
    public ProductImageList getProductImages() {
        return productImages;
    }

    /**
     * Sets the value of the productImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductImageList }
     *     
     */
    public void setProductImages(ProductImageList value) {
        this.productImages = value;
    }

}
