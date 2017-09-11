
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.Address;
import com.z2systems.schemas.common.NameValuePairsList;


/**
 * <p>Java class for ShoppingCart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="shoppingCartItems" type="{http://www.z2systems.com/schemas/store/}ShoppingCartItemList" minOccurs="0"/&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddress" type="{http://www.z2systems.com/schemas/common/}Address" minOccurs="0"/&gt;
 *         &lt;element name="shippingHandlingFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shippingHandlingMethod" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="discounts" type="{http://www.z2systems.com/schemas/common/}NameValuePairsList" minOccurs="0"/&gt;
 *         &lt;element name="itemsCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="totalDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalCharge" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCart", propOrder = {
    "shoppingCartId",
    "shoppingCartItems",
    "accountId",
    "shippingAddress",
    "shippingHandlingFee",
    "shippingHandlingMethod",
    "discounts",
    "itemsCount",
    "totalDiscount",
    "subTotal",
    "taxAmount",
    "totalCharge"
})
public class ShoppingCart {

    protected Long shoppingCartId;
    protected ShoppingCartItemList shoppingCartItems;
    protected Long accountId;
    protected Address shippingAddress;
    protected Double shippingHandlingFee;
    protected String shippingHandlingMethod;
    protected NameValuePairsList discounts;
    protected Long itemsCount;
    protected Double totalDiscount;
    protected Double subTotal;
    protected Double taxAmount;
    protected Double totalCharge;

    /**
     * Gets the value of the shoppingCartId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShoppingCartId() {
        return shoppingCartId;
    }

    /**
     * Sets the value of the shoppingCartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShoppingCartId(Long value) {
        this.shoppingCartId = value;
    }

    /**
     * Gets the value of the shoppingCartItems property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartItemList }
     *     
     */
    public ShoppingCartItemList getShoppingCartItems() {
        return shoppingCartItems;
    }

    /**
     * Sets the value of the shoppingCartItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartItemList }
     *     
     */
    public void setShoppingCartItems(ShoppingCartItemList value) {
        this.shoppingCartItems = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the shippingHandlingFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingHandlingFee() {
        return shippingHandlingFee;
    }

    /**
     * Sets the value of the shippingHandlingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingHandlingFee(Double value) {
        this.shippingHandlingFee = value;
    }

    /**
     * Gets the value of the shippingHandlingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingHandlingMethod() {
        return shippingHandlingMethod;
    }

    /**
     * Sets the value of the shippingHandlingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingHandlingMethod(String value) {
        this.shippingHandlingMethod = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link NameValuePairsList }
     *     
     */
    public NameValuePairsList getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValuePairsList }
     *     
     */
    public void setDiscounts(NameValuePairsList value) {
        this.discounts = value;
    }

    /**
     * Gets the value of the itemsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemsCount() {
        return itemsCount;
    }

    /**
     * Sets the value of the itemsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemsCount(Long value) {
        this.itemsCount = value;
    }

    /**
     * Gets the value of the totalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Sets the value of the totalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDiscount(Double value) {
        this.totalDiscount = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubTotal(Double value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxAmount(Double value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCharge(Double value) {
        this.totalCharge = value;
    }

}
