
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.z2systems.schemas.account.AddActivityResponse;
import com.z2systems.schemas.account.AddAddressResponse;
import com.z2systems.schemas.account.AddIndividualToHouseHoldResponse;
import com.z2systems.schemas.account.AddToFavoriteAccountsResponse;
import com.z2systems.schemas.account.CreateHouseHoldResponse;
import com.z2systems.schemas.account.CreateIndividualAccountResponse;
import com.z2systems.schemas.account.CreateOrganizationAccountResponse;
import com.z2systems.schemas.account.DeleteHouseHoldResponse;
import com.z2systems.schemas.account.EditIndividualAccountResponse;
import com.z2systems.schemas.account.EditOrganizationAccountResponse;
import com.z2systems.schemas.account.LinkIndividualToOrganizationResponse;
import com.z2systems.schemas.account.ListAccountsByKeywordSearchResponse;
import com.z2systems.schemas.account.ListAccountsBySearchCriteriaResponse;
import com.z2systems.schemas.account.ListActivityStatusResponse;
import com.z2systems.schemas.account.ListAddressTypesResponse;
import com.z2systems.schemas.account.ListCountriesResponse;
import com.z2systems.schemas.account.ListFavoriteAccountsResponse;
import com.z2systems.schemas.account.ListGendersResponse;
import com.z2systems.schemas.account.ListHouseHoldsResponse;
import com.z2systems.schemas.account.ListIndividualTypesResponse;
import com.z2systems.schemas.account.ListOrganizationContactsResponse;
import com.z2systems.schemas.account.ListOrganizationTypesResponse;
import com.z2systems.schemas.account.ListPrefixesResponse;
import com.z2systems.schemas.account.ListRelationTypesResponse;
import com.z2systems.schemas.account.ListSourcesResponse;
import com.z2systems.schemas.account.ListStatesResponse;
import com.z2systems.schemas.account.ListSystemUsersResponse;
import com.z2systems.schemas.account.RemoveActivityResponse;
import com.z2systems.schemas.account.RemoveAddressResponse;
import com.z2systems.schemas.account.RemoveFromFavoriteAccountsResponse;
import com.z2systems.schemas.account.RemoveIndividualFromHouseHoldResponse;
import com.z2systems.schemas.account.RemoveIndividualFromOrganizationResponse;
import com.z2systems.schemas.account.RetrieveActivityResponse;
import com.z2systems.schemas.account.RetrieveIndividualAccountResponse;
import com.z2systems.schemas.account.RetrieveOrganizationAccountResponse;
import com.z2systems.schemas.account.RetrieveTransactionStatsResponse;
import com.z2systems.schemas.account.SyncAccountsResponse;
import com.z2systems.schemas.account.SyncActivitiesResponse;
import com.z2systems.schemas.account.UpdateActivityResponse;
import com.z2systems.schemas.account.UpdateAddressResponse;
import com.z2systems.schemas.account.UpdateHouseHoldPrimaryResponse;
import com.z2systems.schemas.account.UpdateHouseHoldResponse;
import com.z2systems.schemas.account.UpdateIndividualAccountResponse;
import com.z2systems.schemas.account.UpdateOrganizationAccountResponse;
import com.z2systems.schemas.donation.CreateDonationResponse;
import com.z2systems.schemas.donation.CreatePledgePaymentResponse;
import com.z2systems.schemas.donation.CreatePledgeResponse;
import com.z2systems.schemas.donation.CreateRecurringDonationResponse;
import com.z2systems.schemas.donation.ListCampaignsResponse;
import com.z2systems.schemas.donation.ListFundsResponse;
import com.z2systems.schemas.donation.ListPurposesResponse;
import com.z2systems.schemas.donation.ListRecurringDonorsResponse;
import com.z2systems.schemas.donation.ListSolicitationMethodsResponse;
import com.z2systems.schemas.donation.RetrieveCampaignSummaryResponse;
import com.z2systems.schemas.donation.RetrieveDonationStatsResponse;
import com.z2systems.schemas.event.RetrieveEventAttendeesResponse;
import com.z2systems.schemas.event.RetrieveEventRegistrationStatsResponse;
import com.z2systems.schemas.membership.AddMembershipToAccountResponse;
import com.z2systems.schemas.membership.ListMembershipHistoryResponse;
import com.z2systems.schemas.membership.ListMembershipTermsResponse;
import com.z2systems.schemas.membership.RetrieveMembershipStatsResponse;
import com.z2systems.schemas.membership.UpdateMembershipToAccountResponse;
import com.z2systems.schemas.store.AddItemToShoppingCartResponse;
import com.z2systems.schemas.store.AddOrUpdateCustomerToShoppingCartResponse;
import com.z2systems.schemas.store.AddOrUpdateShippingAddressToShoppingCartResponse;
import com.z2systems.schemas.store.AddOrUpdateShippingMethodToShoppingCartResponse;
import com.z2systems.schemas.store.AddProductToCatalogResponse;
import com.z2systems.schemas.store.CheckoutResponse;
import com.z2systems.schemas.store.CreateCatalogResponse;
import com.z2systems.schemas.store.CreateCategoryResponse;
import com.z2systems.schemas.store.CreateProductOptionResponse;
import com.z2systems.schemas.store.CreateProductResponse;
import com.z2systems.schemas.store.CreateShoppingCartResponse;
import com.z2systems.schemas.store.ListCatalogsResponse;
import com.z2systems.schemas.store.ListCategoriesResponse;
import com.z2systems.schemas.store.ListOrdersResponse;
import com.z2systems.schemas.store.ListProductImagesResponse;
import com.z2systems.schemas.store.ListProductOptionsResponse;
import com.z2systems.schemas.store.ListProductsResponse;
import com.z2systems.schemas.store.ListShippingMethodsResponse;
import com.z2systems.schemas.store.RemoveCatalogResponse;
import com.z2systems.schemas.store.RemoveCategoryResponse;
import com.z2systems.schemas.store.RemoveItemFromShoppingCartResponse;
import com.z2systems.schemas.store.RemoveProductFromCatalogResponse;
import com.z2systems.schemas.store.RemoveProductImageResponse;
import com.z2systems.schemas.store.RemoveProductOptionResponse;
import com.z2systems.schemas.store.RemoveProductResponse;
import com.z2systems.schemas.store.RetrieveOrderDetailsResponse;
import com.z2systems.schemas.store.RetrieveProductResponse;
import com.z2systems.schemas.store.RetrieveReceiptResponse;
import com.z2systems.schemas.store.RetrieveShoppingCartSummaryResponse;
import com.z2systems.schemas.store.RetrieveStorePurchaseStatsResponse;
import com.z2systems.schemas.store.UpdateCatalogResponse;
import com.z2systems.schemas.store.UpdateCategoryResponse;
import com.z2systems.schemas.store.UpdateProductOptionResponse;
import com.z2systems.schemas.store.UpdateProductResponse;
import com.z2systems.schemas.store.UploadProductImageResponse;


/**
 * <p>Java class for AbstractResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationResult" type="{http://www.z2systems.com/schemas/common/}OperationResult"/&gt;
 *         &lt;element name="responseMessage" type="{http://www.z2systems.com/schemas/common/}LongTextType" minOccurs="0"/&gt;
 *         &lt;element name="responseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="errors" type="{http://www.z2systems.com/schemas/common/}ErrorList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponse", propOrder = {
    "operationResult",
    "responseMessage",
    "responseDateTime",
    "errors"
})
@XmlSeeAlso({
    LoginResponse.class,
    LogoutResponse.class,
    AuthenticateUserResponse.class,
    ListCustomFieldsResponse.class,
    ListTendersResponse.class,
    ListCreditCardTypesResponse.class,
    UpdatePaymentResponse.class,
    RetrieveCurrentSystemUserResponse.class,
    RetrieveStatsResponse.class,
    ListSourcesResponse.class,
    ListOrganizationTypesResponse.class,
    ListIndividualTypesResponse.class,
    ListGendersResponse.class,
    ListAddressTypesResponse.class,
    ListPrefixesResponse.class,
    ListStatesResponse.class,
    ListRelationTypesResponse.class,
    ListCountriesResponse.class,
    ListActivityStatusResponse.class,
    ListSystemUsersResponse.class,
    CreateIndividualAccountResponse.class,
    UpdateIndividualAccountResponse.class,
    EditIndividualAccountResponse.class,
    RetrieveIndividualAccountResponse.class,
    RetrieveOrganizationAccountResponse.class,
    CreateOrganizationAccountResponse.class,
    UpdateOrganizationAccountResponse.class,
    EditOrganizationAccountResponse.class,
    LinkIndividualToOrganizationResponse.class,
    RemoveIndividualFromOrganizationResponse.class,
    ListOrganizationContactsResponse.class,
    AddAddressResponse.class,
    UpdateAddressResponse.class,
    RemoveAddressResponse.class,
    AddActivityResponse.class,
    UpdateActivityResponse.class,
    RemoveActivityResponse.class,
    CreateHouseHoldResponse.class,
    UpdateHouseHoldResponse.class,
    ListHouseHoldsResponse.class,
    AddIndividualToHouseHoldResponse.class,
    RemoveIndividualFromHouseHoldResponse.class,
    UpdateHouseHoldPrimaryResponse.class,
    DeleteHouseHoldResponse.class,
    SyncAccountsResponse.class,
    ListFavoriteAccountsResponse.class,
    AddToFavoriteAccountsResponse.class,
    RemoveFromFavoriteAccountsResponse.class,
    ListAccountsByKeywordSearchResponse.class,
    ListAccountsBySearchCriteriaResponse.class,
    SyncActivitiesResponse.class,
    RetrieveActivityResponse.class,
    RetrieveTransactionStatsResponse.class,
    ListCatalogsResponse.class,
    CreateCatalogResponse.class,
    UpdateCatalogResponse.class,
    RemoveCatalogResponse.class,
    AddProductToCatalogResponse.class,
    RemoveProductFromCatalogResponse.class,
    ListCategoriesResponse.class,
    CreateCategoryResponse.class,
    UpdateCategoryResponse.class,
    RemoveCategoryResponse.class,
    ListProductsResponse.class,
    CreateProductResponse.class,
    UpdateProductResponse.class,
    RemoveProductResponse.class,
    RetrieveProductResponse.class,
    UploadProductImageResponse.class,
    RemoveProductImageResponse.class,
    ListProductImagesResponse.class,
    CreateProductOptionResponse.class,
    ListProductOptionsResponse.class,
    UpdateProductOptionResponse.class,
    RemoveProductOptionResponse.class,
    CreateShoppingCartResponse.class,
    AddItemToShoppingCartResponse.class,
    RemoveItemFromShoppingCartResponse.class,
    AddOrUpdateShippingAddressToShoppingCartResponse.class,
    ListShippingMethodsResponse.class,
    AddOrUpdateShippingMethodToShoppingCartResponse.class,
    AddOrUpdateCustomerToShoppingCartResponse.class,
    RetrieveShoppingCartSummaryResponse.class,
    CheckoutResponse.class,
    RetrieveOrderDetailsResponse.class,
    ListOrdersResponse.class,
    RetrieveReceiptResponse.class,
    RetrieveStorePurchaseStatsResponse.class,
    ListMembershipHistoryResponse.class,
    AddMembershipToAccountResponse.class,
    UpdateMembershipToAccountResponse.class,
    ListMembershipTermsResponse.class,
    RetrieveMembershipStatsResponse.class,
    ListSolicitationMethodsResponse.class,
    ListFundsResponse.class,
    ListCampaignsResponse.class,
    ListPurposesResponse.class,
    CreateDonationResponse.class,
    CreateRecurringDonationResponse.class,
    CreatePledgeResponse.class,
    CreatePledgePaymentResponse.class,
    ListRecurringDonorsResponse.class,
    RetrieveDonationStatsResponse.class,
    RetrieveCampaignSummaryResponse.class,
    AbstractSearchResponse.class,
    RetrieveEventRegistrationStatsResponse.class,
    RetrieveEventAttendeesResponse.class
})
public class AbstractResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OperationResult operationResult;
    protected String responseMessage;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDateTime;
    protected ErrorList errors;

    /**
     * Gets the value of the operationResult property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResult }
     *     
     */
    public OperationResult getOperationResult() {
        return operationResult;
    }

    /**
     * Sets the value of the operationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResult }
     *     
     */
    public void setOperationResult(OperationResult value) {
        this.operationResult = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the responseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * Sets the value of the responseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDateTime(XMLGregorianCalendar value) {
        this.responseDateTime = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorList }
     *     
     */
    public ErrorList getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorList }
     *     
     */
    public void setErrors(ErrorList value) {
        this.errors = value;
    }

}
