
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListRelationTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRelationTypesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationTypes" type="{http://www.z2systems.com/schemas/account/}RelationTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRelationTypesResponse", propOrder = {
    "relationTypes"
})
public class ListRelationTypesResponse
    extends AbstractResponse
{

    protected RelationTypeList relationTypes;

    /**
     * Gets the value of the relationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RelationTypeList }
     *     
     */
    public RelationTypeList getRelationTypes() {
        return relationTypes;
    }

    /**
     * Sets the value of the relationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationTypeList }
     *     
     */
    public void setRelationTypes(RelationTypeList value) {
        this.relationTypes = value;
    }

}
