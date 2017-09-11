
package com.z2systems.schemas.donation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListSolicitationMethodsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListSolicitationMethodsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="solicitationMethods" type="{http://www.z2systems.com/schemas/donation/}SolicitationMethodList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSolicitationMethodsResponse", propOrder = {
    "solicitationMethods"
})
public class ListSolicitationMethodsResponse
    extends AbstractResponse
{

    protected SolicitationMethodList solicitationMethods;

    /**
     * Gets the value of the solicitationMethods property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationMethodList }
     *     
     */
    public SolicitationMethodList getSolicitationMethods() {
        return solicitationMethods;
    }

    /**
     * Sets the value of the solicitationMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationMethodList }
     *     
     */
    public void setSolicitationMethods(SolicitationMethodList value) {
        this.solicitationMethods = value;
    }

}
