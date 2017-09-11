
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fieldName" type="{http://www.z2systems.com/schemas/common/}ExtraLongTextType"/&gt;
 *         &lt;element name="code" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="dataType" type="{http://www.z2systems.com/schemas/common/}FieldDataType"/&gt;
 *         &lt;element name="component" type="{http://www.z2systems.com/schemas/common/}Component"/&gt;
 *         &lt;element name="fieldOptions" type="{http://www.z2systems.com/schemas/common/}FieldOptionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomField", propOrder = {
    "fieldId",
    "fieldName",
    "code",
    "dataType",
    "component",
    "fieldOptions"
})
public class CustomField {

    protected long fieldId;
    @XmlElement(required = true)
    protected String fieldName;
    protected String code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FieldDataType dataType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Component component;
    protected FieldOptionList fieldOptions;

    /**
     * Gets the value of the fieldId property.
     * 
     */
    public long getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     */
    public void setFieldId(long value) {
        this.fieldId = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
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
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDataType }
     *     
     */
    public FieldDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDataType }
     *     
     */
    public void setDataType(FieldDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link Component }
     *     
     */
    public Component getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link Component }
     *     
     */
    public void setComponent(Component value) {
        this.component = value;
    }

    /**
     * Gets the value of the fieldOptions property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOptionList }
     *     
     */
    public FieldOptionList getFieldOptions() {
        return fieldOptions;
    }

    /**
     * Sets the value of the fieldOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOptionList }
     *     
     */
    public void setFieldOptions(FieldOptionList value) {
        this.fieldOptions = value;
    }

}
