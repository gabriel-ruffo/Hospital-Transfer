
package com.z2systems.schemas.store;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOptionValueList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOptionValueList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="optionValue" type="{http://www.z2systems.com/schemas/store/}ProductOptionValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOptionValueList", propOrder = {
    "optionValue"
})
public class ProductOptionValueList {

    protected List<ProductOptionValue> optionValue;

    /**
     * Gets the value of the optionValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOptionValue }
     * 
     * 
     */
    public List<ProductOptionValue> getOptionValue() {
        if (optionValue == null) {
            optionValue = new ArrayList<ProductOptionValue>();
        }
        return this.optionValue;
    }

}
