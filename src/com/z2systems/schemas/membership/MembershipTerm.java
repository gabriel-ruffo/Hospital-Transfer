
package com.z2systems.schemas.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.common.IdNamePair;
import com.z2systems.schemas.common.IdNamePairList;


/**
 * <p>Java class for MembershipTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipTerm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="termInfo" type="{http://www.z2systems.com/schemas/common/}IdNamePair"/&gt;
 *         &lt;element name="isParentTerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="childTerms" type="{http://www.z2systems.com/schemas/common/}IdNamePairList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipTerm", propOrder = {
    "termInfo",
    "isParentTerm",
    "childTerms"
})
public class MembershipTerm {

    @XmlElement(required = true)
    protected IdNamePair termInfo;
    protected Boolean isParentTerm;
    protected IdNamePairList childTerms;

    /**
     * Gets the value of the termInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePair }
     *     
     */
    public IdNamePair getTermInfo() {
        return termInfo;
    }

    /**
     * Sets the value of the termInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePair }
     *     
     */
    public void setTermInfo(IdNamePair value) {
        this.termInfo = value;
    }

    /**
     * Gets the value of the isParentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParentTerm() {
        return isParentTerm;
    }

    /**
     * Sets the value of the isParentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParentTerm(Boolean value) {
        this.isParentTerm = value;
    }

    /**
     * Gets the value of the childTerms property.
     * 
     * @return
     *     possible object is
     *     {@link IdNamePairList }
     *     
     */
    public IdNamePairList getChildTerms() {
        return childTerms;
    }

    /**
     * Sets the value of the childTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdNamePairList }
     *     
     */
    public void setChildTerms(IdNamePairList value) {
        this.childTerms = value;
    }

}
