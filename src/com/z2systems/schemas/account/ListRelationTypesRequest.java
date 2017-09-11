
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractRequest;


/**
 * <p>Java class for ListRelationTypesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRelationTypesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationTypeCategory" type="{http://www.z2systems.com/schemas/account/}RelationTypeCategory"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRelationTypesRequest", propOrder = {
    "relationTypeCategory"
})
public class ListRelationTypesRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RelationTypeCategory relationTypeCategory;

    /**
     * Gets the value of the relationTypeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RelationTypeCategory }
     *     
     */
    public RelationTypeCategory getRelationTypeCategory() {
        return relationTypeCategory;
    }

    /**
     * Sets the value of the relationTypeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationTypeCategory }
     *     
     */
    public void setRelationTypeCategory(RelationTypeCategory value) {
        this.relationTypeCategory = value;
    }

}
