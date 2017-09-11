
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for ListCatalogsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCatalogsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogs" type="{http://www.z2systems.com/schemas/store/}CatalogList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListCatalogsResponse", propOrder = {
    "catalogs"
})
public class ListCatalogsResponse
    extends AbstractResponse
{

    protected CatalogList catalogs;

    /**
     * Gets the value of the catalogs property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogList }
     *     
     */
    public CatalogList getCatalogs() {
        return catalogs;
    }

    /**
     * Sets the value of the catalogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogList }
     *     
     */
    public void setCatalogs(CatalogList value) {
        this.catalogs = value;
    }

}
