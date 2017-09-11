
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingCartItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://www.z2systems.com/schemas/store/}Product" minOccurs="0"/&gt;
 *         &lt;element name="itemInfo" type="{http://www.z2systems.com/schemas/store/}ShoppingCartItemInfo" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="selectedOptionIds" type="{http://www.z2systems.com/schemas/store/}SelectedProductOptionList" minOccurs="0"/&gt;
 *         &lt;element name="selectedOptions" type="{http://www.z2systems.com/schemas/store/}ProductOptionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartItem", propOrder = {
    "sequenceId",
    "product",
    "itemInfo",
    "quantity",
    "selectedOptionIds",
    "selectedOptions"
})
public class ShoppingCartItem {

    protected Long sequenceId;
    protected Product product;
    protected ShoppingCartItemInfo itemInfo;
    protected long quantity;
    protected SelectedProductOptionList selectedOptionIds;
    protected ProductOptionList selectedOptions;

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceId(Long value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartItemInfo }
     *     
     */
    public ShoppingCartItemInfo getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartItemInfo }
     *     
     */
    public void setItemInfo(ShoppingCartItemInfo value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the selectedOptionIds property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedProductOptionList }
     *     
     */
    public SelectedProductOptionList getSelectedOptionIds() {
        return selectedOptionIds;
    }

    /**
     * Sets the value of the selectedOptionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedProductOptionList }
     *     
     */
    public void setSelectedOptionIds(SelectedProductOptionList value) {
        this.selectedOptionIds = value;
    }

    /**
     * Gets the value of the selectedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOptionList }
     *     
     */
    public ProductOptionList getSelectedOptions() {
        return selectedOptions;
    }

    /**
     * Sets the value of the selectedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOptionList }
     *     
     */
    public void setSelectedOptions(ProductOptionList value) {
        this.selectedOptions = value;
    }

}
