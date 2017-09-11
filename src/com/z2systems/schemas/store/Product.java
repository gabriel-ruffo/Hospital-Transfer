
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.IdNamePair;
import com.z2systems.schemas.common.IdNamePairList;
import com.z2systems.schemas.common.RecordStatus;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="catalogs" type="{http://www.z2systems.com/schemas/common/}IdNamePairList" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.z2systems.com/schemas/common/}IdNamePair" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.z2systems.com/schemas/common/}ShortTextType" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.z2systems.com/schemas/common/}TextFieldType" minOccurs="0"/&gt;
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shippingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="daysToShip" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="defaultShippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="priceOffDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="isDiscountInPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="priceOffDiscountStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="priceOffDiscountEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="imageUrl" type="{http://www.z2systems.com/schemas/common/}TextFieldType" minOccurs="0"/&gt;
 *         &lt;element name="imageLabel" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="pounds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ounces" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="hasOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.z2systems.com/schemas/common/}RecordStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "productId",
    "catalogs",
    "category",
    "code",
    "name",
    "description",
    "unitPrice",
    "shippingRequired",
    "daysToShip",
    "defaultShippingCost",
    "priceOffDiscount",
    "isDiscountInPercentage",
    "priceOffDiscountStartDate",
    "priceOffDiscountEndDate",
    "imageUrl",
    "imageLabel",
    "pounds",
    "ounces",
    "hasOptions",
    "status"
})
public class Product {

    protected Long productId;
    protected IdNamePairList catalogs;
    protected IdNamePair category;
    protected String code;
    protected String name;
    protected String description;
    protected Double unitPrice;
    protected Boolean shippingRequired;
    protected Long daysToShip;
    protected Double defaultShippingCost;
    protected Double priceOffDiscount;
    protected Boolean isDiscountInPercentage;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priceOffDiscountStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priceOffDiscountEndDate;
    protected String imageUrl;
    protected String imageLabel;
    protected Long pounds;
    protected Double ounces;
    protected Boolean hasOptions;
    @XmlSchemaType(name = "string")
    protected RecordStatus status;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the catalogs property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePairList }
     *     
     */
    public IdNamePairList getCatalogs() {
        return catalogs;
    }

    /**
     * Sets the value of the catalogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePairList }
     *     
     */
    public void setCatalogs(IdNamePairList value) {
        this.catalogs = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setCategory(IdNamePair value) {
        this.category = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPrice(Double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the shippingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingRequired() {
        return shippingRequired;
    }

    /**
     * Sets the value of the shippingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingRequired(Boolean value) {
        this.shippingRequired = value;
    }

    /**
     * Gets the value of the daysToShip property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysToShip() {
        return daysToShip;
    }

    /**
     * Sets the value of the daysToShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysToShip(Long value) {
        this.daysToShip = value;
    }

    /**
     * Gets the value of the defaultShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultShippingCost() {
        return defaultShippingCost;
    }

    /**
     * Sets the value of the defaultShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultShippingCost(Double value) {
        this.defaultShippingCost = value;
    }

    /**
     * Gets the value of the priceOffDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceOffDiscount() {
        return priceOffDiscount;
    }

    /**
     * Sets the value of the priceOffDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceOffDiscount(Double value) {
        this.priceOffDiscount = value;
    }

    /**
     * Gets the value of the isDiscountInPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscountInPercentage() {
        return isDiscountInPercentage;
    }

    /**
     * Sets the value of the isDiscountInPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscountInPercentage(Boolean value) {
        this.isDiscountInPercentage = value;
    }

    /**
     * Gets the value of the priceOffDiscountStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceOffDiscountStartDate() {
        return priceOffDiscountStartDate;
    }

    /**
     * Sets the value of the priceOffDiscountStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceOffDiscountStartDate(XMLGregorianCalendar value) {
        this.priceOffDiscountStartDate = value;
    }

    /**
     * Gets the value of the priceOffDiscountEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceOffDiscountEndDate() {
        return priceOffDiscountEndDate;
    }

    /**
     * Sets the value of the priceOffDiscountEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceOffDiscountEndDate(XMLGregorianCalendar value) {
        this.priceOffDiscountEndDate = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the imageLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageLabel() {
        return imageLabel;
    }

    /**
     * Sets the value of the imageLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageLabel(String value) {
        this.imageLabel = value;
    }

    /**
     * Gets the value of the pounds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPounds() {
        return pounds;
    }

    /**
     * Sets the value of the pounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPounds(Long value) {
        this.pounds = value;
    }

    /**
     * Gets the value of the ounces property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOunces() {
        return ounces;
    }

    /**
     * Sets the value of the ounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOunces(Double value) {
        this.ounces = value;
    }

    /**
     * Gets the value of the hasOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOptions() {
        return hasOptions;
    }

    /**
     * Sets the value of the hasOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOptions(Boolean value) {
        this.hasOptions = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RecordStatus }
     *     
     */
    public RecordStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatus }
     *     
     */
    public void setStatus(RecordStatus value) {
        this.status = value;
    }

}
