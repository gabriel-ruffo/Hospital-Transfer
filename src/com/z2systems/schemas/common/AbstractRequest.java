
package com.z2systems.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.z2systems.schemas.account.AddActivityRequest;
import com.z2systems.schemas.account.AddAddressRequest;
import com.z2systems.schemas.account.AddIndividualToHouseHoldRequest;
import com.z2systems.schemas.account.AddToFavoirteAccountsRequest;
import com.z2systems.schemas.account.CreateHouseHoldRequest;
import com.z2systems.schemas.account.CreateIndividualAccountRequest;
import com.z2systems.schemas.account.CreateOrganizationAccountRequest;
import com.z2systems.schemas.account.DeleteHouseHoldRequest;
import com.z2systems.schemas.account.EditIndividualAccountRequest;
import com.z2systems.schemas.account.EditOrganizationAccountRequest;
import com.z2systems.schemas.account.LinkIndividualToOrganizationRequest;
import com.z2systems.schemas.account.ListAccountsByDefaultRequest;
import com.z2systems.schemas.account.ListAccountsByKeywordSearchRequest;
import com.z2systems.schemas.account.ListAccountsBySearchCriteriaRequest;
import com.z2systems.schemas.account.ListActivityStatusRequest;
import com.z2systems.schemas.account.ListAddressTypesRequest;
import com.z2systems.schemas.account.ListCountriesRequest;
import com.z2systems.schemas.account.ListFavoriteAccountsRequest;
import com.z2systems.schemas.account.ListGendersRequest;
import com.z2systems.schemas.account.ListHouseHoldsRequest;
import com.z2systems.schemas.account.ListIndividualTypesRequest;
import com.z2systems.schemas.account.ListOrganizationContactsRequest;
import com.z2systems.schemas.account.ListOrganizationTypesRequest;
import com.z2systems.schemas.account.ListPrefixesRequest;
import com.z2systems.schemas.account.ListRelationTypesRequest;
import com.z2systems.schemas.account.ListSourcesRequest;
import com.z2systems.schemas.account.ListStatesRequest;
import com.z2systems.schemas.account.ListSystemUsersRequest;
import com.z2systems.schemas.account.RemoveActivityRequest;
import com.z2systems.schemas.account.RemoveAddressRequest;
import com.z2systems.schemas.account.RemoveFromFavoriteAccountsRequest;
import com.z2systems.schemas.account.RemoveIndividualFromHouseHoldRequest;
import com.z2systems.schemas.account.RemoveIndividualFromOrganizationRequest;
import com.z2systems.schemas.account.RetrieveActivityRequest;
import com.z2systems.schemas.account.RetrieveIndividualAccountRequest;
import com.z2systems.schemas.account.RetrieveOrganizationAccountRequest;
import com.z2systems.schemas.account.RetrieveTransactionStatsRequest;
import com.z2systems.schemas.account.SyncAccountsRequest;
import com.z2systems.schemas.account.SyncActivitiesRequest;
import com.z2systems.schemas.account.UpdateActivityRequest;
import com.z2systems.schemas.account.UpdateAddressRequest;
import com.z2systems.schemas.account.UpdateHouseHoldPrimaryRequest;
import com.z2systems.schemas.account.UpdateHouseHoldRequest;
import com.z2systems.schemas.account.UpdateIndividualAccountRequest;
import com.z2systems.schemas.account.UpdateOrganizationAccountRequest;
import com.z2systems.schemas.donation.CreateDonationRequest;
import com.z2systems.schemas.donation.CreatePledgePaymentRequest;
import com.z2systems.schemas.donation.CreatePledgeRequest;
import com.z2systems.schemas.donation.CreateRecurringDonationRequest;
import com.z2systems.schemas.donation.ListCampaignsRequest;
import com.z2systems.schemas.donation.ListFundsRequest;
import com.z2systems.schemas.donation.ListPurposesRequest;
import com.z2systems.schemas.donation.ListRecurringDonorsRequest;
import com.z2systems.schemas.donation.ListSolicitationMethodsRequest;
import com.z2systems.schemas.donation.RetrieveCampaignSummaryRequest;
import com.z2systems.schemas.donation.RetrieveDonationStatsRequest;
import com.z2systems.schemas.event.RetrieveEventAttendeesRequest;
import com.z2systems.schemas.event.RetrieveEventRegistrationStatsRequest;
import com.z2systems.schemas.membership.AddMembershipToAccountRequest;
import com.z2systems.schemas.membership.ListMembershipHistoryRequest;
import com.z2systems.schemas.membership.ListMembershipTermsRequest;
import com.z2systems.schemas.membership.RetrieveMembershipStatsRequest;
import com.z2systems.schemas.membership.UpdateMembershipToAccountRequest;
import com.z2systems.schemas.store.AddItemToShoppingCartRequest;
import com.z2systems.schemas.store.AddOrUpdateCustomerToShoppingCartRequest;
import com.z2systems.schemas.store.AddOrUpdateShippingAddressToShoppingCartRequest;
import com.z2systems.schemas.store.AddOrUpdateShippingMethodToShoppingCartRequest;
import com.z2systems.schemas.store.AddProductToCatalogRequest;
import com.z2systems.schemas.store.CheckoutRequest;
import com.z2systems.schemas.store.CreateCatalogRequest;
import com.z2systems.schemas.store.CreateCategoryRequest;
import com.z2systems.schemas.store.CreateProductOptionRequest;
import com.z2systems.schemas.store.CreateProductRequest;
import com.z2systems.schemas.store.CreateShoppingCartRequest;
import com.z2systems.schemas.store.ListCatalogsRequest;
import com.z2systems.schemas.store.ListCategoriesRequest;
import com.z2systems.schemas.store.ListOrdersRequest;
import com.z2systems.schemas.store.ListProductImagesRequest;
import com.z2systems.schemas.store.ListProductOptionsRequest;
import com.z2systems.schemas.store.ListProductsRequest;
import com.z2systems.schemas.store.ListShippingMethodsRequest;
import com.z2systems.schemas.store.RemoveCatalogRequest;
import com.z2systems.schemas.store.RemoveCategoryRequest;
import com.z2systems.schemas.store.RemoveItemFromShoppingCartRequest;
import com.z2systems.schemas.store.RemoveProductFromCatalogRequest;
import com.z2systems.schemas.store.RemoveProductImageRequest;
import com.z2systems.schemas.store.RemoveProductOptionRequest;
import com.z2systems.schemas.store.RemoveProductRequest;
import com.z2systems.schemas.store.RetrieveOrderDetailsRequest;
import com.z2systems.schemas.store.RetrieveProductRequest;
import com.z2systems.schemas.store.RetrieveReceiptRequest;
import com.z2systems.schemas.store.RetrieveShoppingCartSummaryRequest;
import com.z2systems.schemas.store.RetrieveStorePurchaseStatsRequest;
import com.z2systems.schemas.store.UpdateCatalogRequest;
import com.z2systems.schemas.store.UpdateCategoryRequest;
import com.z2systems.schemas.store.UpdateProductOptionRequest;
import com.z2systems.schemas.store.UpdateProductRequest;
import com.z2systems.schemas.store.UploadProductImageRequest;


/**
 * <p>Java class for AbstractRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userSessionId" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *         &lt;element name="fromSource" type="{http://www.z2systems.com/schemas/common/}MediumTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequest", propOrder = {
    "userSessionId",
    "fromSource"
})
@XmlSeeAlso({
    LoginRequest.class,
    LogoutRequest.class,
    AuthenticateUserRequest.class,
    ListCustomFieldsRequest.class,
    ListTendersRequest.class,
    ListCreditCardTypesRequest.class,
    UpdatePaymentRequest.class,
    RetrieveCurrentSystemUserRequest.class,
    RetrieveStatsRequest.class,
    ListSourcesRequest.class,
    ListOrganizationTypesRequest.class,
    ListIndividualTypesRequest.class,
    ListGendersRequest.class,
    ListAddressTypesRequest.class,
    ListPrefixesRequest.class,
    ListStatesRequest.class,
    ListRelationTypesRequest.class,
    ListCountriesRequest.class,
    ListActivityStatusRequest.class,
    ListSystemUsersRequest.class,
    CreateIndividualAccountRequest.class,
    UpdateIndividualAccountRequest.class,
    EditIndividualAccountRequest.class,
    RetrieveIndividualAccountRequest.class,
    RetrieveOrganizationAccountRequest.class,
    CreateOrganizationAccountRequest.class,
    UpdateOrganizationAccountRequest.class,
    EditOrganizationAccountRequest.class,
    LinkIndividualToOrganizationRequest.class,
    RemoveIndividualFromOrganizationRequest.class,
    ListOrganizationContactsRequest.class,
    AddAddressRequest.class,
    UpdateAddressRequest.class,
    RemoveAddressRequest.class,
    AddActivityRequest.class,
    UpdateActivityRequest.class,
    RemoveActivityRequest.class,
    CreateHouseHoldRequest.class,
    UpdateHouseHoldRequest.class,
    ListHouseHoldsRequest.class,
    AddIndividualToHouseHoldRequest.class,
    RemoveIndividualFromHouseHoldRequest.class,
    UpdateHouseHoldPrimaryRequest.class,
    DeleteHouseHoldRequest.class,
    SyncAccountsRequest.class,
    ListFavoriteAccountsRequest.class,
    AddToFavoirteAccountsRequest.class,
    RemoveFromFavoriteAccountsRequest.class,
    ListAccountsByDefaultRequest.class,
    ListAccountsByKeywordSearchRequest.class,
    ListAccountsBySearchCriteriaRequest.class,
    SyncActivitiesRequest.class,
    RetrieveActivityRequest.class,
    RetrieveTransactionStatsRequest.class,
    ListCatalogsRequest.class,
    CreateCatalogRequest.class,
    UpdateCatalogRequest.class,
    RemoveCatalogRequest.class,
    AddProductToCatalogRequest.class,
    RemoveProductFromCatalogRequest.class,
    ListCategoriesRequest.class,
    CreateCategoryRequest.class,
    UpdateCategoryRequest.class,
    RemoveCategoryRequest.class,
    ListProductsRequest.class,
    CreateProductRequest.class,
    UpdateProductRequest.class,
    RemoveProductRequest.class,
    RetrieveProductRequest.class,
    UploadProductImageRequest.class,
    RemoveProductImageRequest.class,
    ListProductImagesRequest.class,
    CreateProductOptionRequest.class,
    ListProductOptionsRequest.class,
    UpdateProductOptionRequest.class,
    RemoveProductOptionRequest.class,
    CreateShoppingCartRequest.class,
    AddItemToShoppingCartRequest.class,
    RemoveItemFromShoppingCartRequest.class,
    AddOrUpdateShippingAddressToShoppingCartRequest.class,
    ListShippingMethodsRequest.class,
    AddOrUpdateShippingMethodToShoppingCartRequest.class,
    AddOrUpdateCustomerToShoppingCartRequest.class,
    RetrieveShoppingCartSummaryRequest.class,
    CheckoutRequest.class,
    RetrieveOrderDetailsRequest.class,
    ListOrdersRequest.class,
    RetrieveReceiptRequest.class,
    RetrieveStorePurchaseStatsRequest.class,
    ListMembershipHistoryRequest.class,
    AddMembershipToAccountRequest.class,
    UpdateMembershipToAccountRequest.class,
    ListMembershipTermsRequest.class,
    RetrieveMembershipStatsRequest.class,
    ListSolicitationMethodsRequest.class,
    ListFundsRequest.class,
    ListCampaignsRequest.class,
    ListPurposesRequest.class,
    CreateDonationRequest.class,
    CreateRecurringDonationRequest.class,
    CreatePledgeRequest.class,
    CreatePledgePaymentRequest.class,
    ListRecurringDonorsRequest.class,
    RetrieveDonationStatsRequest.class,
    RetrieveCampaignSummaryRequest.class,
    AbstractSearchRequest.class,
    RetrieveEventRegistrationStatsRequest.class,
    RetrieveEventAttendeesRequest.class
})
public class AbstractRequest {

    protected String userSessionId;
    protected String fromSource;

    /**
     * Gets the value of the userSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSessionId() {
        return userSessionId;
    }

    /**
     * Sets the value of the userSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSessionId(String value) {
        this.userSessionId = value;
    }

    /**
     * Gets the value of the fromSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromSource() {
        return fromSource;
    }

    /**
     * Sets the value of the fromSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromSource(String value) {
        this.fromSource = value;
    }

}
