
package com.z2systems.schemas.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.common.AbstractRequest;
import com.z2systems.schemas.common.Page;


/**
 * <p>Java class for SyncAccountsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncAccountsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.z2systems.com/schemas/common/}AbstractRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountIds" type="{http://www.z2systems.com/schemas/account/}AccountIdList" minOccurs="0"/&gt;
 *         &lt;element name="syncAccountTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="syncAccountTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="page" type="{http://www.z2systems.com/schemas/common/}Page" minOccurs="0"/&gt;
 *         &lt;element name="ignoreDeletedIdList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncAccountsRequest", propOrder = {
    "accountIds",
    "syncAccountTimeFrom",
    "syncAccountTimeTo",
    "page",
    "ignoreDeletedIdList"
})
public class SyncAccountsRequest
    extends AbstractRequest
{

    protected AccountIdList accountIds;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar syncAccountTimeFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar syncAccountTimeTo;
    protected Page page;
    protected Boolean ignoreDeletedIdList;

    /**
     * Gets the value of the accountIds property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdList }
     *     
     */
    public AccountIdList getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the value of the accountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdList }
     *     
     */
    public void setAccountIds(AccountIdList value) {
        this.accountIds = value;
    }

    /**
     * Gets the value of the syncAccountTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSyncAccountTimeFrom() {
        return syncAccountTimeFrom;
    }

    /**
     * Sets the value of the syncAccountTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSyncAccountTimeFrom(XMLGregorianCalendar value) {
        this.syncAccountTimeFrom = value;
    }

    /**
     * Gets the value of the syncAccountTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSyncAccountTimeTo() {
        return syncAccountTimeTo;
    }

    /**
     * Sets the value of the syncAccountTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSyncAccountTimeTo(XMLGregorianCalendar value) {
        this.syncAccountTimeTo = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Page }
     *     
     */
    public Page getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Page }
     *     
     */
    public void setPage(Page value) {
        this.page = value;
    }

    /**
     * Gets the value of the ignoreDeletedIdList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDeletedIdList() {
        return ignoreDeletedIdList;
    }

    /**
     * Sets the value of the ignoreDeletedIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDeletedIdList(Boolean value) {
        this.ignoreDeletedIdList = value;
    }

}
