
package com.z2systems.schemas.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.AbstractResponse;


/**
 * <p>Java class for UploadProductImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadProductImageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imageSequenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadProductImageResponse", propOrder = {
    "imageSequenceId"
})
public class UploadProductImageResponse
    extends AbstractResponse
{

    protected Long imageSequenceId;

    /**
     * Gets the value of the imageSequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImageSequenceId() {
        return imageSequenceId;
    }

    /**
     * Sets the value of the imageSequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImageSequenceId(Long value) {
        this.imageSequenceId = value;
    }

}
