
package com.z2systems.schemas.neonws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.z2systems.schemas.account.AddActivityRequest;
import com.z2systems.schemas.account.AddActivityResponse;
import com.z2systems.schemas.account.AddAddressRequest;
import com.z2systems.schemas.account.AddAddressResponse;
import com.z2systems.schemas.account.AddIndividualToHouseHoldRequest;
import com.z2systems.schemas.account.AddIndividualToHouseHoldResponse;
import com.z2systems.schemas.account.AddToFavoirteAccountsRequest;
import com.z2systems.schemas.account.AddToFavoriteAccountsResponse;
import com.z2systems.schemas.account.CreateHouseHoldRequest;
import com.z2systems.schemas.account.CreateHouseHoldResponse;
import com.z2systems.schemas.account.CreateIndividualAccountRequest;
import com.z2systems.schemas.account.CreateIndividualAccountResponse;
import com.z2systems.schemas.account.CreateOrganizationAccountRequest;
import com.z2systems.schemas.account.CreateOrganizationAccountResponse;
import com.z2systems.schemas.account.DeleteHouseHoldRequest;
import com.z2systems.schemas.account.DeleteHouseHoldResponse;
import com.z2systems.schemas.account.EditIndividualAccountRequest;
import com.z2systems.schemas.account.EditIndividualAccountResponse;
import com.z2systems.schemas.account.EditOrganizationAccountRequest;
import com.z2systems.schemas.account.EditOrganizationAccountResponse;
import com.z2systems.schemas.account.LinkIndividualToOrganizationRequest;
import com.z2systems.schemas.account.LinkIndividualToOrganizationResponse;
import com.z2systems.schemas.account.ListAccountsByDefaultRequest;
import com.z2systems.schemas.account.ListAccountsByDefaultResponse;
import com.z2systems.schemas.account.ListAccountsByKeywordSearchRequest;
import com.z2systems.schemas.account.ListAccountsByKeywordSearchResponse;
import com.z2systems.schemas.account.ListAccountsBySearchCriteriaRequest;
import com.z2systems.schemas.account.ListAccountsBySearchCriteriaResponse;
import com.z2systems.schemas.account.ListAccountsRequest;
import com.z2systems.schemas.account.ListAccountsResponse;
import com.z2systems.schemas.account.ListActivitiesRequest;
import com.z2systems.schemas.account.ListActivitiesResponse;
import com.z2systems.schemas.account.ListActivityStatusRequest;
import com.z2systems.schemas.account.ListActivityStatusResponse;
import com.z2systems.schemas.account.ListAddressTypesRequest;
import com.z2systems.schemas.account.ListAddressTypesResponse;
import com.z2systems.schemas.account.ListCountriesRequest;
import com.z2systems.schemas.account.ListCountriesResponse;
import com.z2systems.schemas.account.ListFavoriteAccountsRequest;
import com.z2systems.schemas.account.ListFavoriteAccountsResponse;
import com.z2systems.schemas.account.ListGendersRequest;
import com.z2systems.schemas.account.ListGendersResponse;
import com.z2systems.schemas.account.ListHouseHoldsRequest;
import com.z2systems.schemas.account.ListHouseHoldsResponse;
import com.z2systems.schemas.account.ListIndividualTypesRequest;
import com.z2systems.schemas.account.ListIndividualTypesResponse;
import com.z2systems.schemas.account.ListOrganizationContactsRequest;
import com.z2systems.schemas.account.ListOrganizationContactsResponse;
import com.z2systems.schemas.account.ListOrganizationTypesRequest;
import com.z2systems.schemas.account.ListOrganizationTypesResponse;
import com.z2systems.schemas.account.ListPrefixesRequest;
import com.z2systems.schemas.account.ListPrefixesResponse;
import com.z2systems.schemas.account.ListRelationTypesRequest;
import com.z2systems.schemas.account.ListRelationTypesResponse;
import com.z2systems.schemas.account.ListSourcesRequest;
import com.z2systems.schemas.account.ListSourcesResponse;
import com.z2systems.schemas.account.ListStatesRequest;
import com.z2systems.schemas.account.ListStatesResponse;
import com.z2systems.schemas.account.ListSystemUsersRequest;
import com.z2systems.schemas.account.ListSystemUsersResponse;
import com.z2systems.schemas.account.RemoveActivityRequest;
import com.z2systems.schemas.account.RemoveActivityResponse;
import com.z2systems.schemas.account.RemoveAddressRequest;
import com.z2systems.schemas.account.RemoveAddressResponse;
import com.z2systems.schemas.account.RemoveFromFavoriteAccountsRequest;
import com.z2systems.schemas.account.RemoveFromFavoriteAccountsResponse;
import com.z2systems.schemas.account.RemoveIndividualFromHouseHoldRequest;
import com.z2systems.schemas.account.RemoveIndividualFromHouseHoldResponse;
import com.z2systems.schemas.account.RemoveIndividualFromOrganizationRequest;
import com.z2systems.schemas.account.RemoveIndividualFromOrganizationResponse;
import com.z2systems.schemas.account.RetrieveActivityRequest;
import com.z2systems.schemas.account.RetrieveActivityResponse;
import com.z2systems.schemas.account.RetrieveIndividualAccountRequest;
import com.z2systems.schemas.account.RetrieveIndividualAccountResponse;
import com.z2systems.schemas.account.RetrieveOrganizationAccountRequest;
import com.z2systems.schemas.account.RetrieveOrganizationAccountResponse;
import com.z2systems.schemas.account.RetrieveTransactionStatsRequest;
import com.z2systems.schemas.account.RetrieveTransactionStatsResponse;
import com.z2systems.schemas.account.SyncAccountsRequest;
import com.z2systems.schemas.account.SyncAccountsResponse;
import com.z2systems.schemas.account.SyncActivitiesRequest;
import com.z2systems.schemas.account.SyncActivitiesResponse;
import com.z2systems.schemas.account.UpdateActivityRequest;
import com.z2systems.schemas.account.UpdateActivityResponse;
import com.z2systems.schemas.account.UpdateAddressRequest;
import com.z2systems.schemas.account.UpdateAddressResponse;
import com.z2systems.schemas.account.UpdateHouseHoldPrimaryRequest;
import com.z2systems.schemas.account.UpdateHouseHoldPrimaryResponse;
import com.z2systems.schemas.account.UpdateHouseHoldRequest;
import com.z2systems.schemas.account.UpdateHouseHoldResponse;
import com.z2systems.schemas.account.UpdateIndividualAccountRequest;
import com.z2systems.schemas.account.UpdateIndividualAccountResponse;
import com.z2systems.schemas.account.UpdateOrganizationAccountRequest;
import com.z2systems.schemas.account.UpdateOrganizationAccountResponse;
import com.z2systems.schemas.common.AuthenticateUserRequest;
import com.z2systems.schemas.common.AuthenticateUserResponse;
import com.z2systems.schemas.common.ListCreditCardTypesRequest;
import com.z2systems.schemas.common.ListCreditCardTypesResponse;
import com.z2systems.schemas.common.ListCustomFieldsRequest;
import com.z2systems.schemas.common.ListCustomFieldsResponse;
import com.z2systems.schemas.common.ListTendersRequest;
import com.z2systems.schemas.common.ListTendersResponse;
import com.z2systems.schemas.common.LoginRequest;
import com.z2systems.schemas.common.LoginResponse;
import com.z2systems.schemas.common.LogoutRequest;
import com.z2systems.schemas.common.LogoutResponse;
import com.z2systems.schemas.common.RetrieveCurrentSystemUserRequest;
import com.z2systems.schemas.common.RetrieveCurrentSystemUserResponse;
import com.z2systems.schemas.common.RetrieveStatsRequest;
import com.z2systems.schemas.common.RetrieveStatsResponse;
import com.z2systems.schemas.common.UpdatePaymentRequest;
import com.z2systems.schemas.common.UpdatePaymentResponse;
import com.z2systems.schemas.donation.CreateDonationRequest;
import com.z2systems.schemas.donation.CreateDonationResponse;
import com.z2systems.schemas.donation.CreatePledgePaymentRequest;
import com.z2systems.schemas.donation.CreatePledgePaymentResponse;
import com.z2systems.schemas.donation.CreatePledgeRequest;
import com.z2systems.schemas.donation.CreatePledgeResponse;
import com.z2systems.schemas.donation.CreateRecurringDonationRequest;
import com.z2systems.schemas.donation.CreateRecurringDonationResponse;
import com.z2systems.schemas.donation.ListCampaignsRequest;
import com.z2systems.schemas.donation.ListCampaignsResponse;
import com.z2systems.schemas.donation.ListDonationsRequest;
import com.z2systems.schemas.donation.ListDonationsResponse;
import com.z2systems.schemas.donation.ListFundsRequest;
import com.z2systems.schemas.donation.ListFundsResponse;
import com.z2systems.schemas.donation.ListPurposesRequest;
import com.z2systems.schemas.donation.ListPurposesResponse;
import com.z2systems.schemas.donation.ListRecurringDonorsRequest;
import com.z2systems.schemas.donation.ListRecurringDonorsResponse;
import com.z2systems.schemas.donation.ListSolicitationMethodsRequest;
import com.z2systems.schemas.donation.ListSolicitationMethodsResponse;
import com.z2systems.schemas.donation.RetrieveCampaignSummaryRequest;
import com.z2systems.schemas.donation.RetrieveCampaignSummaryResponse;
import com.z2systems.schemas.donation.RetrieveDonationStatsRequest;
import com.z2systems.schemas.donation.RetrieveDonationStatsResponse;
import com.z2systems.schemas.event.ListEventsRequest;
import com.z2systems.schemas.event.ListEventsResponse;
import com.z2systems.schemas.event.RetrieveEventAttendeesRequest;
import com.z2systems.schemas.event.RetrieveEventAttendeesResponse;
import com.z2systems.schemas.event.RetrieveEventRegistrationStatsRequest;
import com.z2systems.schemas.event.RetrieveEventRegistrationStatsResponse;
import com.z2systems.schemas.membership.AddMembershipToAccountRequest;
import com.z2systems.schemas.membership.AddMembershipToAccountResponse;
import com.z2systems.schemas.membership.ListMembershipHistoryRequest;
import com.z2systems.schemas.membership.ListMembershipHistoryResponse;
import com.z2systems.schemas.membership.ListMembershipTermsRequest;
import com.z2systems.schemas.membership.ListMembershipTermsResponse;
import com.z2systems.schemas.membership.ListMembershipsRequest;
import com.z2systems.schemas.membership.ListMembershipsResponse;
import com.z2systems.schemas.membership.RetrieveMembershipStatsRequest;
import com.z2systems.schemas.membership.RetrieveMembershipStatsResponse;
import com.z2systems.schemas.store.AddItemToShoppingCartRequest;
import com.z2systems.schemas.store.AddItemToShoppingCartResponse;
import com.z2systems.schemas.store.AddOrUpdateCustomerToShoppingCartRequest;
import com.z2systems.schemas.store.AddOrUpdateCustomerToShoppingCartResponse;
import com.z2systems.schemas.store.AddOrUpdateShippingAddressToShoppingCartRequest;
import com.z2systems.schemas.store.AddOrUpdateShippingAddressToShoppingCartResponse;
import com.z2systems.schemas.store.AddOrUpdateShippingMethodToShoppingCartRequest;
import com.z2systems.schemas.store.AddOrUpdateShippingMethodToShoppingCartResponse;
import com.z2systems.schemas.store.AddProductToCatalogRequest;
import com.z2systems.schemas.store.AddProductToCatalogResponse;
import com.z2systems.schemas.store.CheckoutRequest;
import com.z2systems.schemas.store.CheckoutResponse;
import com.z2systems.schemas.store.CreateCatalogRequest;
import com.z2systems.schemas.store.CreateCatalogResponse;
import com.z2systems.schemas.store.CreateCategoryRequest;
import com.z2systems.schemas.store.CreateCategoryResponse;
import com.z2systems.schemas.store.CreateProductOptionRequest;
import com.z2systems.schemas.store.CreateProductOptionResponse;
import com.z2systems.schemas.store.CreateProductRequest;
import com.z2systems.schemas.store.CreateProductResponse;
import com.z2systems.schemas.store.CreateShoppingCartRequest;
import com.z2systems.schemas.store.CreateShoppingCartResponse;
import com.z2systems.schemas.store.ListCatalogsRequest;
import com.z2systems.schemas.store.ListCatalogsResponse;
import com.z2systems.schemas.store.ListCategoriesRequest;
import com.z2systems.schemas.store.ListCategoriesResponse;
import com.z2systems.schemas.store.ListOrdersRequest;
import com.z2systems.schemas.store.ListOrdersResponse;
import com.z2systems.schemas.store.ListProductImagesRequest;
import com.z2systems.schemas.store.ListProductImagesResponse;
import com.z2systems.schemas.store.ListProductOptionsRequest;
import com.z2systems.schemas.store.ListProductOptionsResponse;
import com.z2systems.schemas.store.ListProductsRequest;
import com.z2systems.schemas.store.ListProductsResponse;
import com.z2systems.schemas.store.ListShippingMethodsRequest;
import com.z2systems.schemas.store.ListShippingMethodsResponse;
import com.z2systems.schemas.store.RemoveCatalogRequest;
import com.z2systems.schemas.store.RemoveCatalogResponse;
import com.z2systems.schemas.store.RemoveCategoryRequest;
import com.z2systems.schemas.store.RemoveCategoryResponse;
import com.z2systems.schemas.store.RemoveItemFromShoppingCartRequest;
import com.z2systems.schemas.store.RemoveItemFromShoppingCartResponse;
import com.z2systems.schemas.store.RemoveProductFromCatalogRequest;
import com.z2systems.schemas.store.RemoveProductFromCatalogResponse;
import com.z2systems.schemas.store.RemoveProductImageRequest;
import com.z2systems.schemas.store.RemoveProductImageResponse;
import com.z2systems.schemas.store.RemoveProductOptionRequest;
import com.z2systems.schemas.store.RemoveProductOptionResponse;
import com.z2systems.schemas.store.RemoveProductRequest;
import com.z2systems.schemas.store.RemoveProductResponse;
import com.z2systems.schemas.store.RetrieveOrderDetailsRequest;
import com.z2systems.schemas.store.RetrieveOrderDetailsResponse;
import com.z2systems.schemas.store.RetrieveProductRequest;
import com.z2systems.schemas.store.RetrieveProductResponse;
import com.z2systems.schemas.store.RetrieveReceiptRequest;
import com.z2systems.schemas.store.RetrieveReceiptResponse;
import com.z2systems.schemas.store.RetrieveShoppingCartSummaryRequest;
import com.z2systems.schemas.store.RetrieveShoppingCartSummaryResponse;
import com.z2systems.schemas.store.RetrieveStorePurchaseStatsRequest;
import com.z2systems.schemas.store.RetrieveStorePurchaseStatsResponse;
import com.z2systems.schemas.store.UpdateCatalogRequest;
import com.z2systems.schemas.store.UpdateCatalogResponse;
import com.z2systems.schemas.store.UpdateCategoryRequest;
import com.z2systems.schemas.store.UpdateCategoryResponse;
import com.z2systems.schemas.store.UpdateProductOptionRequest;
import com.z2systems.schemas.store.UpdateProductOptionResponse;
import com.z2systems.schemas.store.UpdateProductRequest;
import com.z2systems.schemas.store.UpdateProductResponse;
import com.z2systems.schemas.store.UploadProductImageRequest;
import com.z2systems.schemas.store.UploadProductImageResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.z2systems.schemas.neonws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "loginRequest");
    private final static QName _LoginResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "loginResponse");
    private final static QName _LogoutRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "logoutRequest");
    private final static QName _LogoutResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "logoutResponse");
    private final static QName _AuthenticateUserRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "authenticateUserRequest");
    private final static QName _AuthenticateUserResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "authenticateUserResponse");
    private final static QName _ListCustomFieldsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCustomFieldsRequest");
    private final static QName _ListCustomFieldsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCustomFieldsResponse");
    private final static QName _ListCreditCardTypesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCreditCardTypesRequest");
    private final static QName _ListCreditCardTypesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCreditCardTypesResponse");
    private final static QName _ListTendersRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listTendersRequest");
    private final static QName _ListTendersResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listTendersResponse");
    private final static QName _UpdatePaymentRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updatePaymentRequest");
    private final static QName _UpdatePaymentResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updatePaymentResponse");
    private final static QName _RetrieveCurrentSystemUserRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveCurrentSystemUserRequest");
    private final static QName _RetrieveCurrentSystemUserResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveCurrentSystemUserResponse");
    private final static QName _RetrieveStatsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveStatsRequest");
    private final static QName _RetrieveStatsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveStatsResponse");
    private final static QName _ListSourcesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listSourcesRequest");
    private final static QName _ListSourcesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listSourcesResponse");
    private final static QName _ListOrganizationTypesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listOrganizationTypesRequest");
    private final static QName _ListOrganizationTypesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listOrganizationTypesResponse");
    private final static QName _ListIndividualTypesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listIndividualTypesRequest");
    private final static QName _ListIndividualTypesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listIndividualTypesResponse");
    private final static QName _ListGendersRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listGendersRequest");
    private final static QName _ListGendersResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listGendersResponse");
    private final static QName _ListAddressTypesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAddressTypesRequest");
    private final static QName _ListAddressTypesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAddressTypesResponse");
    private final static QName _ListPrefixesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listPrefixesRequest");
    private final static QName _ListPrefixesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listPrefixesResponse");
    private final static QName _ListStatesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listStatesRequest");
    private final static QName _ListStatesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listStatesResponse");
    private final static QName _ListCountriesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCountriesRequest");
    private final static QName _ListCountriesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCountriesResponse");
    private final static QName _ListRelationTypesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listRelationTypesRequest");
    private final static QName _ListRelationTypesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listRelationTypesResponse");
    private final static QName _ListActivityStatusRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listActivityStatusRequest");
    private final static QName _ListActivityStatusResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listActivityStatusResponse");
    private final static QName _ListActivitiesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listActivitiesRequest");
    private final static QName _ListActivitiesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listActivitiesResponse");
    private final static QName _ListSystemUsersRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listSystemUsersRequest");
    private final static QName _ListSystemUsersResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listSystemUsersResponse");
    private final static QName _CreateIndividualAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createIndividualAccountRequest");
    private final static QName _CreateIndividualAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createIndividualAccountResponse");
    private final static QName _UpdateIndividualAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateIndividualAccountRequest");
    private final static QName _UpdateIndividualAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateIndividualAccountResponse");
    private final static QName _EditIndividualAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "editIndividualAccountRequest");
    private final static QName _EditIndividualAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "editIndividualAccountResponse");
    private final static QName _RetrieveIndividualAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveIndividualAccountRequest");
    private final static QName _RetrieveIndividualAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveIndividualAccountResponse");
    private final static QName _RetrieveOrganizationAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveOrganizationAccountRequest");
    private final static QName _RetrieveOrganizationAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveOrganizationAccountResponse");
    private final static QName _CreateOrganizationAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createOrganizationAccountRequest");
    private final static QName _CreateOrganizationAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createOrganizationAccountResponse");
    private final static QName _UpdateOrganizationAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateOrganizationAccountRequest");
    private final static QName _UpdateOrganizationAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateOrganizationAccountResponse");
    private final static QName _EditOrganizationAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "editOrganizationAccountRequest");
    private final static QName _EditOrganizationAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "editOrganizationAccountResponse");
    private final static QName _LinkIndividualToOrganizationRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "linkIndividualToOrganizationRequest");
    private final static QName _LinkIndividualToOrganizationResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "linkIndividualToOrganizationResponse");
    private final static QName _RemoveIndividualFromOrganizationRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeIndividualFromOrganizationRequest");
    private final static QName _RemoveIndividualFromOrganizationResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeIndividualFromOrganizationResponse");
    private final static QName _ListOrganizationContactsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listOrganizationContactsRequest");
    private final static QName _ListOrganizationContactsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listOrganizationContactsResponse");
    private final static QName _ListAccountsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAccountsRequest");
    private final static QName _ListAccountsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAccountsResponse");
    private final static QName _ListAccountsByDefaultRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAccountsByDefaultRequest");
    private final static QName _ListAccountsByDefaultResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAccountsByDefaultResponse");
    private final static QName _SyncAccountsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "syncAccountsRequest");
    private final static QName _SyncAccountsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "syncAccountsResponse");
    private final static QName _ListFavoriteAccountsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "ListFavoriteAccountsRequest");
    private final static QName _ListFavoriteAccountsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "ListFavoriteAccountsResponse");
    private final static QName _AddToFavoirteAccountsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "AddToFavoirteAccountsRequest");
    private final static QName _AddToFavoriteAccountsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "AddToFavoriteAccountsResponse");
    private final static QName _RemoveFromFavoriteAccountsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "RemoveFromFavoriteAccountsRequest");
    private final static QName _RemoveFromFavoriteAccountsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "RemoveFromFavoriteAccountsResponse");
    private final static QName _ListAccountsByKeywordSearchRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAccountsByKeywordSearchRequest");
    private final static QName _ListAccountsByKeywordSearchResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAccountsByKeywordSearchResponse");
    private final static QName _ListAccountsBySearchCriteriaRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAccountsBySearchCriteriaRequest");
    private final static QName _ListAccountsBySearchCriteriaResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listAccountsBySearchCriteriaResponse");
    private final static QName _AddAddressRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addAddressRequest");
    private final static QName _AddAddressResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addAddressResponse");
    private final static QName _UpdateAddressRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateAddressRequest");
    private final static QName _UpdateAddressResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateAddressResponse");
    private final static QName _RemoveAddressRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeAddressRequest");
    private final static QName _RemoveAddressResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeAddressResponse");
    private final static QName _AddActivityRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addActivityRequest");
    private final static QName _AddActivityResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addActivityResponse");
    private final static QName _UpdateActivityRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateActivityRequest");
    private final static QName _UpdateActivityResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateActivityResponse");
    private final static QName _RemoveActivityRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeActivityRequest");
    private final static QName _RemoveActivityResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeActivityResponse");
    private final static QName _CreateHouseHoldRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createHouseHoldRequest");
    private final static QName _CreateHouseHoldResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createHouseHoldResponse");
    private final static QName _UpdateHouseHoldRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateHouseHoldRequest");
    private final static QName _UpdateHouseHoldResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateHouseHoldResponse");
    private final static QName _ListHouseHoldsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listHouseHoldsRequest");
    private final static QName _ListHouseHoldsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listHouseHoldsResponse");
    private final static QName _AddIndividualToHouseHoldRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addIndividualToHouseHoldRequest");
    private final static QName _AddIndividualToHouseHoldResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addIndividualToHouseHoldResponse");
    private final static QName _RemoveIndividualFromHouseHoldRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeIndividualFromHouseHoldRequest");
    private final static QName _RemoveIndividualFromHouseHoldResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeIndividualFromHouseHoldResponse");
    private final static QName _UpdateHouseHoldPrimaryRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateHouseHoldPrimaryRequest");
    private final static QName _UpdateHouseHoldPrimaryResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateHouseHoldPrimaryResponse");
    private final static QName _DeleteHouseHoldRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "deleteHouseHoldRequest");
    private final static QName _DeleteHouseHoldResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "deleteHouseHoldResponse");
    private final static QName _SyncActivitiesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "syncActivitiesRequest");
    private final static QName _SyncActivitiesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "syncActivitiesResponse");
    private final static QName _RetrieveActivityRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveActivityRequest");
    private final static QName _RetrieveActivityResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveActivityResponse");
    private final static QName _RetrieveTransactionStatsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveTransactionStatsRequest");
    private final static QName _RetrieveTransactionStatsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveTransactionStatsResponse");
    private final static QName _ListEventsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listEventsRequest");
    private final static QName _ListEventsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listEventsResponse");
    private final static QName _RetrieveEventRegistrationStatsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveEventRegistrationStatsRequest");
    private final static QName _RetrieveEventRegistrationStatsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveEventRegistrationStatsResponse");
    private final static QName _RetrieveEventAttendeesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveEventAttendeesRequest");
    private final static QName _RetrieveEventAttendeesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveEventAttendeesResponse");
    private final static QName _ListFundsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listFundsRequest");
    private final static QName _ListFundsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listFundsResponse");
    private final static QName _ListSolicitationMethodsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listSolicitationMethodsRequest");
    private final static QName _ListSolicitationMethodsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listSolicitationMethodsResponse");
    private final static QName _ListCampaignsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCampaignsRequest");
    private final static QName _ListCampaignsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCampaignsResponse");
    private final static QName _ListPurposesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listPurposesRequest");
    private final static QName _ListPurposesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listPurposesResponse");
    private final static QName _CreateDonationRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createDonationRequest");
    private final static QName _CreateDonationResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createDonationResponse");
    private final static QName _CreateRecurringDonationRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createRecurringDonationRequest");
    private final static QName _CreateRecurringDonationResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createRecurringDonationResponse");
    private final static QName _CreatePledgeRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createPledgeRequest");
    private final static QName _CreatePledgeResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createPledgeResponse");
    private final static QName _CreatePledgePaymentRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createPledgePaymentRequest");
    private final static QName _CreatePledgePaymentResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createPledgePaymentResponse");
    private final static QName _ListDonationsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listDonationsRequest");
    private final static QName _ListDonationsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listDonationsResponse");
    private final static QName _ListRecurringDonorsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listRecurringDonorsRequest");
    private final static QName _ListRecurringDonorsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listRecurringDonorsResponse");
    private final static QName _RetrieveDonationStatsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveDonationStatsRequest");
    private final static QName _RetrieveDonationStatsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveDonationStatsResponse");
    private final static QName _RetrieveCampaignSummaryRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveCampaignSummaryRequest");
    private final static QName _RetrieveCampaignSummaryResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveCampaignSummaryResponse");
    private final static QName _ListMembershipsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listMembershipsRequest");
    private final static QName _ListMembershipsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listMembershipsResponse");
    private final static QName _ListMembershipTermsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listMembershipTermsRequest");
    private final static QName _ListMembershipTermsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listMembershipTermsResponse");
    private final static QName _AddMembershipToAccountRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addMembershipToAccountRequest");
    private final static QName _AddMembershipToAccountResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addMembershipToAccountResponse");
    private final static QName _ListMembershipHistoryRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listMembershipHistoryRequest");
    private final static QName _ListMembershipHistoryResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listMembershipHistoryResponse");
    private final static QName _RetrieveMembershipStatsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveMembershipStatsRequest");
    private final static QName _RetrieveMembershipStatsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveMembershipStatsResponse");
    private final static QName _ListCatalogsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCatalogsRequest");
    private final static QName _ListCatalogsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCatalogsResponse");
    private final static QName _CreateCatalogRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createCatalogRequest");
    private final static QName _CreateCatalogResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createCatalogResponse");
    private final static QName _UpdateCatalogRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateCatalogRequest");
    private final static QName _UpdateCatalogResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateCatalogResponse");
    private final static QName _RemoveCatalogRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeCatalogRequest");
    private final static QName _RemoveCatalogResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeCatalogResponse");
    private final static QName _AddProductToCatalogRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addProductToCatalogRequest");
    private final static QName _AddProductToCatalogResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addProductToCatalogResponse");
    private final static QName _RemoveProductFromCatalogRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeProductFromCatalogRequest");
    private final static QName _RemoveProductFromCatalogResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeProductFromCatalogResponse");
    private final static QName _ListCategoriesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCategoriesRequest");
    private final static QName _ListCategoriesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listCategoriesResponse");
    private final static QName _CreateCategoryRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createCategoryRequest");
    private final static QName _CreateCategoryResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createCategoryResponse");
    private final static QName _UpdateCategoryRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateCategoryRequest");
    private final static QName _UpdateCategoryResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateCategoryResponse");
    private final static QName _RemoveCategoryRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeCategoryRequest");
    private final static QName _RemoveCategoryResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeCategoryResponse");
    private final static QName _ListProductsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listProductsRequest");
    private final static QName _ListProductsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listProductsResponse");
    private final static QName _CreateProductRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createProductRequest");
    private final static QName _CreateProductResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createProductResponse");
    private final static QName _UpdateProductRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateProductRequest");
    private final static QName _UpdateProductResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateProductResponse");
    private final static QName _RemoveProductRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeProductRequest");
    private final static QName _RemoveProductResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeProductResponse");
    private final static QName _RetrieveProductRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveProductRequest");
    private final static QName _RetrieveProductResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveProductResponse");
    private final static QName _UploadProductImageRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "uploadProductImageRequest");
    private final static QName _UploadProductImageResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "uploadProductImageResponse");
    private final static QName _RemoveProductImageRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeProductImageRequest");
    private final static QName _RemoveProductImageResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeProductImageResponse");
    private final static QName _ListProductImagesRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listProductImagesRequest");
    private final static QName _ListProductImagesResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listProductImagesResponse");
    private final static QName _CreateProductOptionRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createProductOptionRequest");
    private final static QName _CreateProductOptionResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createProductOptionResponse");
    private final static QName _ListProductOptionsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listProductOptionsRequest");
    private final static QName _ListProductOptionsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listProductOptionsResponse");
    private final static QName _UpdateProductOptionRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateProductOptionRequest");
    private final static QName _UpdateProductOptionResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "updateProductOptionResponse");
    private final static QName _RemoveProductOptionRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeProductOptionRequest");
    private final static QName _RemoveProductOptionResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeProductOptionResponse");
    private final static QName _CreateShoppingCartRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createShoppingCartRequest");
    private final static QName _CreateShoppingCartResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "createShoppingCartResponse");
    private final static QName _AddItemToShoppingCartRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addItemToShoppingCartRequest");
    private final static QName _AddItemToShoppingCartResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addItemToShoppingCartResponse");
    private final static QName _RemoveItemFromShoppingCartRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeItemFromShoppingCartRequest");
    private final static QName _RemoveItemFromShoppingCartResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "removeItemFromShoppingCartResponse");
    private final static QName _AddOrUpdateShippingAddressToShoppingCartRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addOrUpdateShippingAddressToShoppingCartRequest");
    private final static QName _AddOrUpdateShippingAddressToShoppingCartResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addOrUpdateShippingAddressToShoppingCartResponse");
    private final static QName _ListShippingMethodsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listShippingMethodsRequest");
    private final static QName _ListShippingMethodsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listShippingMethodsResponse");
    private final static QName _AddOrUpdateShippingMethodToShoppingCartRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addOrUpdateShippingMethodToShoppingCartRequest");
    private final static QName _AddOrUpdateShippingMethodToShoppingCartResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addOrUpdateShippingMethodToShoppingCartResponse");
    private final static QName _AddOrUpdateCustomerToShoppingCartRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addOrUpdateCustomerToShoppingCartRequest");
    private final static QName _AddOrUpdateCustomerToShoppingCartResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "addOrUpdateCustomerToShoppingCartResponse");
    private final static QName _RetrieveShoppingCartSummaryRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveShoppingCartSummaryRequest");
    private final static QName _RetrieveShoppingCartSummaryResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveShoppingCartSummaryResponse");
    private final static QName _CheckoutRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "checkoutRequest");
    private final static QName _CheckoutResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "checkoutResponse");
    private final static QName _RetrieveOrderDetailsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveOrderDetailsRequest");
    private final static QName _RetrieveOrderDetailsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveOrderDetailsResponse");
    private final static QName _ListOrdersRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listOrdersRequest");
    private final static QName _ListOrdersResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "listOrdersResponse");
    private final static QName _RetrieveReceiptRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveReceiptRequest");
    private final static QName _RetrieveReceiptResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveReceiptResponse");
    private final static QName _RetrieveStorePurchaseStatsRequest_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveStorePurchaseStatsRequest");
    private final static QName _RetrieveStorePurchaseStatsResponse_QNAME = new QName("http://www.z2systems.com/schemas/neonws/", "retrieveStorePurchaseStatsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.z2systems.schemas.neonws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "loginRequest")
    public JAXBElement<LoginRequest> createLoginRequest(LoginRequest value) {
        return new JAXBElement<LoginRequest>(_LoginRequest_QNAME, LoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "logoutRequest")
    public JAXBElement<LogoutRequest> createLogoutRequest(LogoutRequest value) {
        return new JAXBElement<LogoutRequest>(_LogoutRequest_QNAME, LogoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUserRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "authenticateUserRequest")
    public JAXBElement<AuthenticateUserRequest> createAuthenticateUserRequest(AuthenticateUserRequest value) {
        return new JAXBElement<AuthenticateUserRequest>(_AuthenticateUserRequest_QNAME, AuthenticateUserRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "authenticateUserResponse")
    public JAXBElement<AuthenticateUserResponse> createAuthenticateUserResponse(AuthenticateUserResponse value) {
        return new JAXBElement<AuthenticateUserResponse>(_AuthenticateUserResponse_QNAME, AuthenticateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCustomFieldsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCustomFieldsRequest")
    public JAXBElement<ListCustomFieldsRequest> createListCustomFieldsRequest(ListCustomFieldsRequest value) {
        return new JAXBElement<ListCustomFieldsRequest>(_ListCustomFieldsRequest_QNAME, ListCustomFieldsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCustomFieldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCustomFieldsResponse")
    public JAXBElement<ListCustomFieldsResponse> createListCustomFieldsResponse(ListCustomFieldsResponse value) {
        return new JAXBElement<ListCustomFieldsResponse>(_ListCustomFieldsResponse_QNAME, ListCustomFieldsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCreditCardTypesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCreditCardTypesRequest")
    public JAXBElement<ListCreditCardTypesRequest> createListCreditCardTypesRequest(ListCreditCardTypesRequest value) {
        return new JAXBElement<ListCreditCardTypesRequest>(_ListCreditCardTypesRequest_QNAME, ListCreditCardTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCreditCardTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCreditCardTypesResponse")
    public JAXBElement<ListCreditCardTypesResponse> createListCreditCardTypesResponse(ListCreditCardTypesResponse value) {
        return new JAXBElement<ListCreditCardTypesResponse>(_ListCreditCardTypesResponse_QNAME, ListCreditCardTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTendersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listTendersRequest")
    public JAXBElement<ListTendersRequest> createListTendersRequest(ListTendersRequest value) {
        return new JAXBElement<ListTendersRequest>(_ListTendersRequest_QNAME, ListTendersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTendersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listTendersResponse")
    public JAXBElement<ListTendersResponse> createListTendersResponse(ListTendersResponse value) {
        return new JAXBElement<ListTendersResponse>(_ListTendersResponse_QNAME, ListTendersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updatePaymentRequest")
    public JAXBElement<UpdatePaymentRequest> createUpdatePaymentRequest(UpdatePaymentRequest value) {
        return new JAXBElement<UpdatePaymentRequest>(_UpdatePaymentRequest_QNAME, UpdatePaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updatePaymentResponse")
    public JAXBElement<UpdatePaymentResponse> createUpdatePaymentResponse(UpdatePaymentResponse value) {
        return new JAXBElement<UpdatePaymentResponse>(_UpdatePaymentResponse_QNAME, UpdatePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCurrentSystemUserRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveCurrentSystemUserRequest")
    public JAXBElement<RetrieveCurrentSystemUserRequest> createRetrieveCurrentSystemUserRequest(RetrieveCurrentSystemUserRequest value) {
        return new JAXBElement<RetrieveCurrentSystemUserRequest>(_RetrieveCurrentSystemUserRequest_QNAME, RetrieveCurrentSystemUserRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCurrentSystemUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveCurrentSystemUserResponse")
    public JAXBElement<RetrieveCurrentSystemUserResponse> createRetrieveCurrentSystemUserResponse(RetrieveCurrentSystemUserResponse value) {
        return new JAXBElement<RetrieveCurrentSystemUserResponse>(_RetrieveCurrentSystemUserResponse_QNAME, RetrieveCurrentSystemUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveStatsRequest")
    public JAXBElement<RetrieveStatsRequest> createRetrieveStatsRequest(RetrieveStatsRequest value) {
        return new JAXBElement<RetrieveStatsRequest>(_RetrieveStatsRequest_QNAME, RetrieveStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveStatsResponse")
    public JAXBElement<RetrieveStatsResponse> createRetrieveStatsResponse(RetrieveStatsResponse value) {
        return new JAXBElement<RetrieveStatsResponse>(_RetrieveStatsResponse_QNAME, RetrieveStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSourcesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listSourcesRequest")
    public JAXBElement<ListSourcesRequest> createListSourcesRequest(ListSourcesRequest value) {
        return new JAXBElement<ListSourcesRequest>(_ListSourcesRequest_QNAME, ListSourcesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSourcesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listSourcesResponse")
    public JAXBElement<ListSourcesResponse> createListSourcesResponse(ListSourcesResponse value) {
        return new JAXBElement<ListSourcesResponse>(_ListSourcesResponse_QNAME, ListSourcesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOrganizationTypesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listOrganizationTypesRequest")
    public JAXBElement<ListOrganizationTypesRequest> createListOrganizationTypesRequest(ListOrganizationTypesRequest value) {
        return new JAXBElement<ListOrganizationTypesRequest>(_ListOrganizationTypesRequest_QNAME, ListOrganizationTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOrganizationTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listOrganizationTypesResponse")
    public JAXBElement<ListOrganizationTypesResponse> createListOrganizationTypesResponse(ListOrganizationTypesResponse value) {
        return new JAXBElement<ListOrganizationTypesResponse>(_ListOrganizationTypesResponse_QNAME, ListOrganizationTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListIndividualTypesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listIndividualTypesRequest")
    public JAXBElement<ListIndividualTypesRequest> createListIndividualTypesRequest(ListIndividualTypesRequest value) {
        return new JAXBElement<ListIndividualTypesRequest>(_ListIndividualTypesRequest_QNAME, ListIndividualTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListIndividualTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listIndividualTypesResponse")
    public JAXBElement<ListIndividualTypesResponse> createListIndividualTypesResponse(ListIndividualTypesResponse value) {
        return new JAXBElement<ListIndividualTypesResponse>(_ListIndividualTypesResponse_QNAME, ListIndividualTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGendersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listGendersRequest")
    public JAXBElement<ListGendersRequest> createListGendersRequest(ListGendersRequest value) {
        return new JAXBElement<ListGendersRequest>(_ListGendersRequest_QNAME, ListGendersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGendersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listGendersResponse")
    public JAXBElement<ListGendersResponse> createListGendersResponse(ListGendersResponse value) {
        return new JAXBElement<ListGendersResponse>(_ListGendersResponse_QNAME, ListGendersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAddressTypesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAddressTypesRequest")
    public JAXBElement<ListAddressTypesRequest> createListAddressTypesRequest(ListAddressTypesRequest value) {
        return new JAXBElement<ListAddressTypesRequest>(_ListAddressTypesRequest_QNAME, ListAddressTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAddressTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAddressTypesResponse")
    public JAXBElement<ListAddressTypesResponse> createListAddressTypesResponse(ListAddressTypesResponse value) {
        return new JAXBElement<ListAddressTypesResponse>(_ListAddressTypesResponse_QNAME, ListAddressTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPrefixesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listPrefixesRequest")
    public JAXBElement<ListPrefixesRequest> createListPrefixesRequest(ListPrefixesRequest value) {
        return new JAXBElement<ListPrefixesRequest>(_ListPrefixesRequest_QNAME, ListPrefixesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPrefixesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listPrefixesResponse")
    public JAXBElement<ListPrefixesResponse> createListPrefixesResponse(ListPrefixesResponse value) {
        return new JAXBElement<ListPrefixesResponse>(_ListPrefixesResponse_QNAME, ListPrefixesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStatesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listStatesRequest")
    public JAXBElement<ListStatesRequest> createListStatesRequest(ListStatesRequest value) {
        return new JAXBElement<ListStatesRequest>(_ListStatesRequest_QNAME, ListStatesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listStatesResponse")
    public JAXBElement<ListStatesResponse> createListStatesResponse(ListStatesResponse value) {
        return new JAXBElement<ListStatesResponse>(_ListStatesResponse_QNAME, ListStatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCountriesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCountriesRequest")
    public JAXBElement<ListCountriesRequest> createListCountriesRequest(ListCountriesRequest value) {
        return new JAXBElement<ListCountriesRequest>(_ListCountriesRequest_QNAME, ListCountriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCountriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCountriesResponse")
    public JAXBElement<ListCountriesResponse> createListCountriesResponse(ListCountriesResponse value) {
        return new JAXBElement<ListCountriesResponse>(_ListCountriesResponse_QNAME, ListCountriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRelationTypesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listRelationTypesRequest")
    public JAXBElement<ListRelationTypesRequest> createListRelationTypesRequest(ListRelationTypesRequest value) {
        return new JAXBElement<ListRelationTypesRequest>(_ListRelationTypesRequest_QNAME, ListRelationTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRelationTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listRelationTypesResponse")
    public JAXBElement<ListRelationTypesResponse> createListRelationTypesResponse(ListRelationTypesResponse value) {
        return new JAXBElement<ListRelationTypesResponse>(_ListRelationTypesResponse_QNAME, ListRelationTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListActivityStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listActivityStatusRequest")
    public JAXBElement<ListActivityStatusRequest> createListActivityStatusRequest(ListActivityStatusRequest value) {
        return new JAXBElement<ListActivityStatusRequest>(_ListActivityStatusRequest_QNAME, ListActivityStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListActivityStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listActivityStatusResponse")
    public JAXBElement<ListActivityStatusResponse> createListActivityStatusResponse(ListActivityStatusResponse value) {
        return new JAXBElement<ListActivityStatusResponse>(_ListActivityStatusResponse_QNAME, ListActivityStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListActivitiesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listActivitiesRequest")
    public JAXBElement<ListActivitiesRequest> createListActivitiesRequest(ListActivitiesRequest value) {
        return new JAXBElement<ListActivitiesRequest>(_ListActivitiesRequest_QNAME, ListActivitiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListActivitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listActivitiesResponse")
    public JAXBElement<ListActivitiesResponse> createListActivitiesResponse(ListActivitiesResponse value) {
        return new JAXBElement<ListActivitiesResponse>(_ListActivitiesResponse_QNAME, ListActivitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSystemUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listSystemUsersRequest")
    public JAXBElement<ListSystemUsersRequest> createListSystemUsersRequest(ListSystemUsersRequest value) {
        return new JAXBElement<ListSystemUsersRequest>(_ListSystemUsersRequest_QNAME, ListSystemUsersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSystemUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listSystemUsersResponse")
    public JAXBElement<ListSystemUsersResponse> createListSystemUsersResponse(ListSystemUsersResponse value) {
        return new JAXBElement<ListSystemUsersResponse>(_ListSystemUsersResponse_QNAME, ListSystemUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIndividualAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createIndividualAccountRequest")
    public JAXBElement<CreateIndividualAccountRequest> createCreateIndividualAccountRequest(CreateIndividualAccountRequest value) {
        return new JAXBElement<CreateIndividualAccountRequest>(_CreateIndividualAccountRequest_QNAME, CreateIndividualAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIndividualAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createIndividualAccountResponse")
    public JAXBElement<CreateIndividualAccountResponse> createCreateIndividualAccountResponse(CreateIndividualAccountResponse value) {
        return new JAXBElement<CreateIndividualAccountResponse>(_CreateIndividualAccountResponse_QNAME, CreateIndividualAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIndividualAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateIndividualAccountRequest")
    public JAXBElement<UpdateIndividualAccountRequest> createUpdateIndividualAccountRequest(UpdateIndividualAccountRequest value) {
        return new JAXBElement<UpdateIndividualAccountRequest>(_UpdateIndividualAccountRequest_QNAME, UpdateIndividualAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIndividualAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateIndividualAccountResponse")
    public JAXBElement<UpdateIndividualAccountResponse> createUpdateIndividualAccountResponse(UpdateIndividualAccountResponse value) {
        return new JAXBElement<UpdateIndividualAccountResponse>(_UpdateIndividualAccountResponse_QNAME, UpdateIndividualAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditIndividualAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "editIndividualAccountRequest")
    public JAXBElement<EditIndividualAccountRequest> createEditIndividualAccountRequest(EditIndividualAccountRequest value) {
        return new JAXBElement<EditIndividualAccountRequest>(_EditIndividualAccountRequest_QNAME, EditIndividualAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditIndividualAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "editIndividualAccountResponse")
    public JAXBElement<EditIndividualAccountResponse> createEditIndividualAccountResponse(EditIndividualAccountResponse value) {
        return new JAXBElement<EditIndividualAccountResponse>(_EditIndividualAccountResponse_QNAME, EditIndividualAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveIndividualAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveIndividualAccountRequest")
    public JAXBElement<RetrieveIndividualAccountRequest> createRetrieveIndividualAccountRequest(RetrieveIndividualAccountRequest value) {
        return new JAXBElement<RetrieveIndividualAccountRequest>(_RetrieveIndividualAccountRequest_QNAME, RetrieveIndividualAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveIndividualAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveIndividualAccountResponse")
    public JAXBElement<RetrieveIndividualAccountResponse> createRetrieveIndividualAccountResponse(RetrieveIndividualAccountResponse value) {
        return new JAXBElement<RetrieveIndividualAccountResponse>(_RetrieveIndividualAccountResponse_QNAME, RetrieveIndividualAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveOrganizationAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveOrganizationAccountRequest")
    public JAXBElement<RetrieveOrganizationAccountRequest> createRetrieveOrganizationAccountRequest(RetrieveOrganizationAccountRequest value) {
        return new JAXBElement<RetrieveOrganizationAccountRequest>(_RetrieveOrganizationAccountRequest_QNAME, RetrieveOrganizationAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveOrganizationAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveOrganizationAccountResponse")
    public JAXBElement<RetrieveOrganizationAccountResponse> createRetrieveOrganizationAccountResponse(RetrieveOrganizationAccountResponse value) {
        return new JAXBElement<RetrieveOrganizationAccountResponse>(_RetrieveOrganizationAccountResponse_QNAME, RetrieveOrganizationAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrganizationAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createOrganizationAccountRequest")
    public JAXBElement<CreateOrganizationAccountRequest> createCreateOrganizationAccountRequest(CreateOrganizationAccountRequest value) {
        return new JAXBElement<CreateOrganizationAccountRequest>(_CreateOrganizationAccountRequest_QNAME, CreateOrganizationAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrganizationAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createOrganizationAccountResponse")
    public JAXBElement<CreateOrganizationAccountResponse> createCreateOrganizationAccountResponse(CreateOrganizationAccountResponse value) {
        return new JAXBElement<CreateOrganizationAccountResponse>(_CreateOrganizationAccountResponse_QNAME, CreateOrganizationAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrganizationAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateOrganizationAccountRequest")
    public JAXBElement<UpdateOrganizationAccountRequest> createUpdateOrganizationAccountRequest(UpdateOrganizationAccountRequest value) {
        return new JAXBElement<UpdateOrganizationAccountRequest>(_UpdateOrganizationAccountRequest_QNAME, UpdateOrganizationAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrganizationAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateOrganizationAccountResponse")
    public JAXBElement<UpdateOrganizationAccountResponse> createUpdateOrganizationAccountResponse(UpdateOrganizationAccountResponse value) {
        return new JAXBElement<UpdateOrganizationAccountResponse>(_UpdateOrganizationAccountResponse_QNAME, UpdateOrganizationAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditOrganizationAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "editOrganizationAccountRequest")
    public JAXBElement<EditOrganizationAccountRequest> createEditOrganizationAccountRequest(EditOrganizationAccountRequest value) {
        return new JAXBElement<EditOrganizationAccountRequest>(_EditOrganizationAccountRequest_QNAME, EditOrganizationAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditOrganizationAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "editOrganizationAccountResponse")
    public JAXBElement<EditOrganizationAccountResponse> createEditOrganizationAccountResponse(EditOrganizationAccountResponse value) {
        return new JAXBElement<EditOrganizationAccountResponse>(_EditOrganizationAccountResponse_QNAME, EditOrganizationAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkIndividualToOrganizationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "linkIndividualToOrganizationRequest")
    public JAXBElement<LinkIndividualToOrganizationRequest> createLinkIndividualToOrganizationRequest(LinkIndividualToOrganizationRequest value) {
        return new JAXBElement<LinkIndividualToOrganizationRequest>(_LinkIndividualToOrganizationRequest_QNAME, LinkIndividualToOrganizationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkIndividualToOrganizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "linkIndividualToOrganizationResponse")
    public JAXBElement<LinkIndividualToOrganizationResponse> createLinkIndividualToOrganizationResponse(LinkIndividualToOrganizationResponse value) {
        return new JAXBElement<LinkIndividualToOrganizationResponse>(_LinkIndividualToOrganizationResponse_QNAME, LinkIndividualToOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIndividualFromOrganizationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeIndividualFromOrganizationRequest")
    public JAXBElement<RemoveIndividualFromOrganizationRequest> createRemoveIndividualFromOrganizationRequest(RemoveIndividualFromOrganizationRequest value) {
        return new JAXBElement<RemoveIndividualFromOrganizationRequest>(_RemoveIndividualFromOrganizationRequest_QNAME, RemoveIndividualFromOrganizationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIndividualFromOrganizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeIndividualFromOrganizationResponse")
    public JAXBElement<RemoveIndividualFromOrganizationResponse> createRemoveIndividualFromOrganizationResponse(RemoveIndividualFromOrganizationResponse value) {
        return new JAXBElement<RemoveIndividualFromOrganizationResponse>(_RemoveIndividualFromOrganizationResponse_QNAME, RemoveIndividualFromOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOrganizationContactsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listOrganizationContactsRequest")
    public JAXBElement<ListOrganizationContactsRequest> createListOrganizationContactsRequest(ListOrganizationContactsRequest value) {
        return new JAXBElement<ListOrganizationContactsRequest>(_ListOrganizationContactsRequest_QNAME, ListOrganizationContactsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOrganizationContactsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listOrganizationContactsResponse")
    public JAXBElement<ListOrganizationContactsResponse> createListOrganizationContactsResponse(ListOrganizationContactsResponse value) {
        return new JAXBElement<ListOrganizationContactsResponse>(_ListOrganizationContactsResponse_QNAME, ListOrganizationContactsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAccountsRequest")
    public JAXBElement<ListAccountsRequest> createListAccountsRequest(ListAccountsRequest value) {
        return new JAXBElement<ListAccountsRequest>(_ListAccountsRequest_QNAME, ListAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAccountsResponse")
    public JAXBElement<ListAccountsResponse> createListAccountsResponse(ListAccountsResponse value) {
        return new JAXBElement<ListAccountsResponse>(_ListAccountsResponse_QNAME, ListAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsByDefaultRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAccountsByDefaultRequest")
    public JAXBElement<ListAccountsByDefaultRequest> createListAccountsByDefaultRequest(ListAccountsByDefaultRequest value) {
        return new JAXBElement<ListAccountsByDefaultRequest>(_ListAccountsByDefaultRequest_QNAME, ListAccountsByDefaultRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsByDefaultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAccountsByDefaultResponse")
    public JAXBElement<ListAccountsByDefaultResponse> createListAccountsByDefaultResponse(ListAccountsByDefaultResponse value) {
        return new JAXBElement<ListAccountsByDefaultResponse>(_ListAccountsByDefaultResponse_QNAME, ListAccountsByDefaultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "syncAccountsRequest")
    public JAXBElement<SyncAccountsRequest> createSyncAccountsRequest(SyncAccountsRequest value) {
        return new JAXBElement<SyncAccountsRequest>(_SyncAccountsRequest_QNAME, SyncAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "syncAccountsResponse")
    public JAXBElement<SyncAccountsResponse> createSyncAccountsResponse(SyncAccountsResponse value) {
        return new JAXBElement<SyncAccountsResponse>(_SyncAccountsResponse_QNAME, SyncAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFavoriteAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "ListFavoriteAccountsRequest")
    public JAXBElement<ListFavoriteAccountsRequest> createListFavoriteAccountsRequest(ListFavoriteAccountsRequest value) {
        return new JAXBElement<ListFavoriteAccountsRequest>(_ListFavoriteAccountsRequest_QNAME, ListFavoriteAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFavoriteAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "ListFavoriteAccountsResponse")
    public JAXBElement<ListFavoriteAccountsResponse> createListFavoriteAccountsResponse(ListFavoriteAccountsResponse value) {
        return new JAXBElement<ListFavoriteAccountsResponse>(_ListFavoriteAccountsResponse_QNAME, ListFavoriteAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToFavoirteAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "AddToFavoirteAccountsRequest")
    public JAXBElement<AddToFavoirteAccountsRequest> createAddToFavoirteAccountsRequest(AddToFavoirteAccountsRequest value) {
        return new JAXBElement<AddToFavoirteAccountsRequest>(_AddToFavoirteAccountsRequest_QNAME, AddToFavoirteAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToFavoriteAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "AddToFavoriteAccountsResponse")
    public JAXBElement<AddToFavoriteAccountsResponse> createAddToFavoriteAccountsResponse(AddToFavoriteAccountsResponse value) {
        return new JAXBElement<AddToFavoriteAccountsResponse>(_AddToFavoriteAccountsResponse_QNAME, AddToFavoriteAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFromFavoriteAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "RemoveFromFavoriteAccountsRequest")
    public JAXBElement<RemoveFromFavoriteAccountsRequest> createRemoveFromFavoriteAccountsRequest(RemoveFromFavoriteAccountsRequest value) {
        return new JAXBElement<RemoveFromFavoriteAccountsRequest>(_RemoveFromFavoriteAccountsRequest_QNAME, RemoveFromFavoriteAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFromFavoriteAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "RemoveFromFavoriteAccountsResponse")
    public JAXBElement<RemoveFromFavoriteAccountsResponse> createRemoveFromFavoriteAccountsResponse(RemoveFromFavoriteAccountsResponse value) {
        return new JAXBElement<RemoveFromFavoriteAccountsResponse>(_RemoveFromFavoriteAccountsResponse_QNAME, RemoveFromFavoriteAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsByKeywordSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAccountsByKeywordSearchRequest")
    public JAXBElement<ListAccountsByKeywordSearchRequest> createListAccountsByKeywordSearchRequest(ListAccountsByKeywordSearchRequest value) {
        return new JAXBElement<ListAccountsByKeywordSearchRequest>(_ListAccountsByKeywordSearchRequest_QNAME, ListAccountsByKeywordSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsByKeywordSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAccountsByKeywordSearchResponse")
    public JAXBElement<ListAccountsByKeywordSearchResponse> createListAccountsByKeywordSearchResponse(ListAccountsByKeywordSearchResponse value) {
        return new JAXBElement<ListAccountsByKeywordSearchResponse>(_ListAccountsByKeywordSearchResponse_QNAME, ListAccountsByKeywordSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsBySearchCriteriaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAccountsBySearchCriteriaRequest")
    public JAXBElement<ListAccountsBySearchCriteriaRequest> createListAccountsBySearchCriteriaRequest(ListAccountsBySearchCriteriaRequest value) {
        return new JAXBElement<ListAccountsBySearchCriteriaRequest>(_ListAccountsBySearchCriteriaRequest_QNAME, ListAccountsBySearchCriteriaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsBySearchCriteriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listAccountsBySearchCriteriaResponse")
    public JAXBElement<ListAccountsBySearchCriteriaResponse> createListAccountsBySearchCriteriaResponse(ListAccountsBySearchCriteriaResponse value) {
        return new JAXBElement<ListAccountsBySearchCriteriaResponse>(_ListAccountsBySearchCriteriaResponse_QNAME, ListAccountsBySearchCriteriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addAddressRequest")
    public JAXBElement<AddAddressRequest> createAddAddressRequest(AddAddressRequest value) {
        return new JAXBElement<AddAddressRequest>(_AddAddressRequest_QNAME, AddAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addAddressResponse")
    public JAXBElement<AddAddressResponse> createAddAddressResponse(AddAddressResponse value) {
        return new JAXBElement<AddAddressResponse>(_AddAddressResponse_QNAME, AddAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateAddressRequest")
    public JAXBElement<UpdateAddressRequest> createUpdateAddressRequest(UpdateAddressRequest value) {
        return new JAXBElement<UpdateAddressRequest>(_UpdateAddressRequest_QNAME, UpdateAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateAddressResponse")
    public JAXBElement<UpdateAddressResponse> createUpdateAddressResponse(UpdateAddressResponse value) {
        return new JAXBElement<UpdateAddressResponse>(_UpdateAddressResponse_QNAME, UpdateAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeAddressRequest")
    public JAXBElement<RemoveAddressRequest> createRemoveAddressRequest(RemoveAddressRequest value) {
        return new JAXBElement<RemoveAddressRequest>(_RemoveAddressRequest_QNAME, RemoveAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeAddressResponse")
    public JAXBElement<RemoveAddressResponse> createRemoveAddressResponse(RemoveAddressResponse value) {
        return new JAXBElement<RemoveAddressResponse>(_RemoveAddressResponse_QNAME, RemoveAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddActivityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addActivityRequest")
    public JAXBElement<AddActivityRequest> createAddActivityRequest(AddActivityRequest value) {
        return new JAXBElement<AddActivityRequest>(_AddActivityRequest_QNAME, AddActivityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addActivityResponse")
    public JAXBElement<AddActivityResponse> createAddActivityResponse(AddActivityResponse value) {
        return new JAXBElement<AddActivityResponse>(_AddActivityResponse_QNAME, AddActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateActivityRequest")
    public JAXBElement<UpdateActivityRequest> createUpdateActivityRequest(UpdateActivityRequest value) {
        return new JAXBElement<UpdateActivityRequest>(_UpdateActivityRequest_QNAME, UpdateActivityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateActivityResponse")
    public JAXBElement<UpdateActivityResponse> createUpdateActivityResponse(UpdateActivityResponse value) {
        return new JAXBElement<UpdateActivityResponse>(_UpdateActivityResponse_QNAME, UpdateActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveActivityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeActivityRequest")
    public JAXBElement<RemoveActivityRequest> createRemoveActivityRequest(RemoveActivityRequest value) {
        return new JAXBElement<RemoveActivityRequest>(_RemoveActivityRequest_QNAME, RemoveActivityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeActivityResponse")
    public JAXBElement<RemoveActivityResponse> createRemoveActivityResponse(RemoveActivityResponse value) {
        return new JAXBElement<RemoveActivityResponse>(_RemoveActivityResponse_QNAME, RemoveActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHouseHoldRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createHouseHoldRequest")
    public JAXBElement<CreateHouseHoldRequest> createCreateHouseHoldRequest(CreateHouseHoldRequest value) {
        return new JAXBElement<CreateHouseHoldRequest>(_CreateHouseHoldRequest_QNAME, CreateHouseHoldRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHouseHoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createHouseHoldResponse")
    public JAXBElement<CreateHouseHoldResponse> createCreateHouseHoldResponse(CreateHouseHoldResponse value) {
        return new JAXBElement<CreateHouseHoldResponse>(_CreateHouseHoldResponse_QNAME, CreateHouseHoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHouseHoldRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateHouseHoldRequest")
    public JAXBElement<UpdateHouseHoldRequest> createUpdateHouseHoldRequest(UpdateHouseHoldRequest value) {
        return new JAXBElement<UpdateHouseHoldRequest>(_UpdateHouseHoldRequest_QNAME, UpdateHouseHoldRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHouseHoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateHouseHoldResponse")
    public JAXBElement<UpdateHouseHoldResponse> createUpdateHouseHoldResponse(UpdateHouseHoldResponse value) {
        return new JAXBElement<UpdateHouseHoldResponse>(_UpdateHouseHoldResponse_QNAME, UpdateHouseHoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListHouseHoldsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listHouseHoldsRequest")
    public JAXBElement<ListHouseHoldsRequest> createListHouseHoldsRequest(ListHouseHoldsRequest value) {
        return new JAXBElement<ListHouseHoldsRequest>(_ListHouseHoldsRequest_QNAME, ListHouseHoldsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListHouseHoldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listHouseHoldsResponse")
    public JAXBElement<ListHouseHoldsResponse> createListHouseHoldsResponse(ListHouseHoldsResponse value) {
        return new JAXBElement<ListHouseHoldsResponse>(_ListHouseHoldsResponse_QNAME, ListHouseHoldsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIndividualToHouseHoldRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addIndividualToHouseHoldRequest")
    public JAXBElement<AddIndividualToHouseHoldRequest> createAddIndividualToHouseHoldRequest(AddIndividualToHouseHoldRequest value) {
        return new JAXBElement<AddIndividualToHouseHoldRequest>(_AddIndividualToHouseHoldRequest_QNAME, AddIndividualToHouseHoldRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIndividualToHouseHoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addIndividualToHouseHoldResponse")
    public JAXBElement<AddIndividualToHouseHoldResponse> createAddIndividualToHouseHoldResponse(AddIndividualToHouseHoldResponse value) {
        return new JAXBElement<AddIndividualToHouseHoldResponse>(_AddIndividualToHouseHoldResponse_QNAME, AddIndividualToHouseHoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIndividualFromHouseHoldRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeIndividualFromHouseHoldRequest")
    public JAXBElement<RemoveIndividualFromHouseHoldRequest> createRemoveIndividualFromHouseHoldRequest(RemoveIndividualFromHouseHoldRequest value) {
        return new JAXBElement<RemoveIndividualFromHouseHoldRequest>(_RemoveIndividualFromHouseHoldRequest_QNAME, RemoveIndividualFromHouseHoldRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIndividualFromHouseHoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeIndividualFromHouseHoldResponse")
    public JAXBElement<RemoveIndividualFromHouseHoldResponse> createRemoveIndividualFromHouseHoldResponse(RemoveIndividualFromHouseHoldResponse value) {
        return new JAXBElement<RemoveIndividualFromHouseHoldResponse>(_RemoveIndividualFromHouseHoldResponse_QNAME, RemoveIndividualFromHouseHoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHouseHoldPrimaryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateHouseHoldPrimaryRequest")
    public JAXBElement<UpdateHouseHoldPrimaryRequest> createUpdateHouseHoldPrimaryRequest(UpdateHouseHoldPrimaryRequest value) {
        return new JAXBElement<UpdateHouseHoldPrimaryRequest>(_UpdateHouseHoldPrimaryRequest_QNAME, UpdateHouseHoldPrimaryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHouseHoldPrimaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateHouseHoldPrimaryResponse")
    public JAXBElement<UpdateHouseHoldPrimaryResponse> createUpdateHouseHoldPrimaryResponse(UpdateHouseHoldPrimaryResponse value) {
        return new JAXBElement<UpdateHouseHoldPrimaryResponse>(_UpdateHouseHoldPrimaryResponse_QNAME, UpdateHouseHoldPrimaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHouseHoldRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "deleteHouseHoldRequest")
    public JAXBElement<DeleteHouseHoldRequest> createDeleteHouseHoldRequest(DeleteHouseHoldRequest value) {
        return new JAXBElement<DeleteHouseHoldRequest>(_DeleteHouseHoldRequest_QNAME, DeleteHouseHoldRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHouseHoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "deleteHouseHoldResponse")
    public JAXBElement<DeleteHouseHoldResponse> createDeleteHouseHoldResponse(DeleteHouseHoldResponse value) {
        return new JAXBElement<DeleteHouseHoldResponse>(_DeleteHouseHoldResponse_QNAME, DeleteHouseHoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncActivitiesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "syncActivitiesRequest")
    public JAXBElement<SyncActivitiesRequest> createSyncActivitiesRequest(SyncActivitiesRequest value) {
        return new JAXBElement<SyncActivitiesRequest>(_SyncActivitiesRequest_QNAME, SyncActivitiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncActivitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "syncActivitiesResponse")
    public JAXBElement<SyncActivitiesResponse> createSyncActivitiesResponse(SyncActivitiesResponse value) {
        return new JAXBElement<SyncActivitiesResponse>(_SyncActivitiesResponse_QNAME, SyncActivitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveActivityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveActivityRequest")
    public JAXBElement<RetrieveActivityRequest> createRetrieveActivityRequest(RetrieveActivityRequest value) {
        return new JAXBElement<RetrieveActivityRequest>(_RetrieveActivityRequest_QNAME, RetrieveActivityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveActivityResponse")
    public JAXBElement<RetrieveActivityResponse> createRetrieveActivityResponse(RetrieveActivityResponse value) {
        return new JAXBElement<RetrieveActivityResponse>(_RetrieveActivityResponse_QNAME, RetrieveActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTransactionStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveTransactionStatsRequest")
    public JAXBElement<RetrieveTransactionStatsRequest> createRetrieveTransactionStatsRequest(RetrieveTransactionStatsRequest value) {
        return new JAXBElement<RetrieveTransactionStatsRequest>(_RetrieveTransactionStatsRequest_QNAME, RetrieveTransactionStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTransactionStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveTransactionStatsResponse")
    public JAXBElement<RetrieveTransactionStatsResponse> createRetrieveTransactionStatsResponse(RetrieveTransactionStatsResponse value) {
        return new JAXBElement<RetrieveTransactionStatsResponse>(_RetrieveTransactionStatsResponse_QNAME, RetrieveTransactionStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEventsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listEventsRequest")
    public JAXBElement<ListEventsRequest> createListEventsRequest(ListEventsRequest value) {
        return new JAXBElement<ListEventsRequest>(_ListEventsRequest_QNAME, ListEventsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listEventsResponse")
    public JAXBElement<ListEventsResponse> createListEventsResponse(ListEventsResponse value) {
        return new JAXBElement<ListEventsResponse>(_ListEventsResponse_QNAME, ListEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEventRegistrationStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveEventRegistrationStatsRequest")
    public JAXBElement<RetrieveEventRegistrationStatsRequest> createRetrieveEventRegistrationStatsRequest(RetrieveEventRegistrationStatsRequest value) {
        return new JAXBElement<RetrieveEventRegistrationStatsRequest>(_RetrieveEventRegistrationStatsRequest_QNAME, RetrieveEventRegistrationStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEventRegistrationStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveEventRegistrationStatsResponse")
    public JAXBElement<RetrieveEventRegistrationStatsResponse> createRetrieveEventRegistrationStatsResponse(RetrieveEventRegistrationStatsResponse value) {
        return new JAXBElement<RetrieveEventRegistrationStatsResponse>(_RetrieveEventRegistrationStatsResponse_QNAME, RetrieveEventRegistrationStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEventAttendeesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveEventAttendeesRequest")
    public JAXBElement<RetrieveEventAttendeesRequest> createRetrieveEventAttendeesRequest(RetrieveEventAttendeesRequest value) {
        return new JAXBElement<RetrieveEventAttendeesRequest>(_RetrieveEventAttendeesRequest_QNAME, RetrieveEventAttendeesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEventAttendeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveEventAttendeesResponse")
    public JAXBElement<RetrieveEventAttendeesResponse> createRetrieveEventAttendeesResponse(RetrieveEventAttendeesResponse value) {
        return new JAXBElement<RetrieveEventAttendeesResponse>(_RetrieveEventAttendeesResponse_QNAME, RetrieveEventAttendeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFundsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listFundsRequest")
    public JAXBElement<ListFundsRequest> createListFundsRequest(ListFundsRequest value) {
        return new JAXBElement<ListFundsRequest>(_ListFundsRequest_QNAME, ListFundsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFundsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listFundsResponse")
    public JAXBElement<ListFundsResponse> createListFundsResponse(ListFundsResponse value) {
        return new JAXBElement<ListFundsResponse>(_ListFundsResponse_QNAME, ListFundsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSolicitationMethodsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listSolicitationMethodsRequest")
    public JAXBElement<ListSolicitationMethodsRequest> createListSolicitationMethodsRequest(ListSolicitationMethodsRequest value) {
        return new JAXBElement<ListSolicitationMethodsRequest>(_ListSolicitationMethodsRequest_QNAME, ListSolicitationMethodsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSolicitationMethodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listSolicitationMethodsResponse")
    public JAXBElement<ListSolicitationMethodsResponse> createListSolicitationMethodsResponse(ListSolicitationMethodsResponse value) {
        return new JAXBElement<ListSolicitationMethodsResponse>(_ListSolicitationMethodsResponse_QNAME, ListSolicitationMethodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCampaignsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCampaignsRequest")
    public JAXBElement<ListCampaignsRequest> createListCampaignsRequest(ListCampaignsRequest value) {
        return new JAXBElement<ListCampaignsRequest>(_ListCampaignsRequest_QNAME, ListCampaignsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCampaignsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCampaignsResponse")
    public JAXBElement<ListCampaignsResponse> createListCampaignsResponse(ListCampaignsResponse value) {
        return new JAXBElement<ListCampaignsResponse>(_ListCampaignsResponse_QNAME, ListCampaignsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPurposesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listPurposesRequest")
    public JAXBElement<ListPurposesRequest> createListPurposesRequest(ListPurposesRequest value) {
        return new JAXBElement<ListPurposesRequest>(_ListPurposesRequest_QNAME, ListPurposesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPurposesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listPurposesResponse")
    public JAXBElement<ListPurposesResponse> createListPurposesResponse(ListPurposesResponse value) {
        return new JAXBElement<ListPurposesResponse>(_ListPurposesResponse_QNAME, ListPurposesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDonationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createDonationRequest")
    public JAXBElement<CreateDonationRequest> createCreateDonationRequest(CreateDonationRequest value) {
        return new JAXBElement<CreateDonationRequest>(_CreateDonationRequest_QNAME, CreateDonationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDonationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createDonationResponse")
    public JAXBElement<CreateDonationResponse> createCreateDonationResponse(CreateDonationResponse value) {
        return new JAXBElement<CreateDonationResponse>(_CreateDonationResponse_QNAME, CreateDonationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringDonationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createRecurringDonationRequest")
    public JAXBElement<CreateRecurringDonationRequest> createCreateRecurringDonationRequest(CreateRecurringDonationRequest value) {
        return new JAXBElement<CreateRecurringDonationRequest>(_CreateRecurringDonationRequest_QNAME, CreateRecurringDonationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringDonationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createRecurringDonationResponse")
    public JAXBElement<CreateRecurringDonationResponse> createCreateRecurringDonationResponse(CreateRecurringDonationResponse value) {
        return new JAXBElement<CreateRecurringDonationResponse>(_CreateRecurringDonationResponse_QNAME, CreateRecurringDonationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePledgeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createPledgeRequest")
    public JAXBElement<CreatePledgeRequest> createCreatePledgeRequest(CreatePledgeRequest value) {
        return new JAXBElement<CreatePledgeRequest>(_CreatePledgeRequest_QNAME, CreatePledgeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePledgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createPledgeResponse")
    public JAXBElement<CreatePledgeResponse> createCreatePledgeResponse(CreatePledgeResponse value) {
        return new JAXBElement<CreatePledgeResponse>(_CreatePledgeResponse_QNAME, CreatePledgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePledgePaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createPledgePaymentRequest")
    public JAXBElement<CreatePledgePaymentRequest> createCreatePledgePaymentRequest(CreatePledgePaymentRequest value) {
        return new JAXBElement<CreatePledgePaymentRequest>(_CreatePledgePaymentRequest_QNAME, CreatePledgePaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePledgePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createPledgePaymentResponse")
    public JAXBElement<CreatePledgePaymentResponse> createCreatePledgePaymentResponse(CreatePledgePaymentResponse value) {
        return new JAXBElement<CreatePledgePaymentResponse>(_CreatePledgePaymentResponse_QNAME, CreatePledgePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDonationsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listDonationsRequest")
    public JAXBElement<ListDonationsRequest> createListDonationsRequest(ListDonationsRequest value) {
        return new JAXBElement<ListDonationsRequest>(_ListDonationsRequest_QNAME, ListDonationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDonationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listDonationsResponse")
    public JAXBElement<ListDonationsResponse> createListDonationsResponse(ListDonationsResponse value) {
        return new JAXBElement<ListDonationsResponse>(_ListDonationsResponse_QNAME, ListDonationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRecurringDonorsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listRecurringDonorsRequest")
    public JAXBElement<ListRecurringDonorsRequest> createListRecurringDonorsRequest(ListRecurringDonorsRequest value) {
        return new JAXBElement<ListRecurringDonorsRequest>(_ListRecurringDonorsRequest_QNAME, ListRecurringDonorsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRecurringDonorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listRecurringDonorsResponse")
    public JAXBElement<ListRecurringDonorsResponse> createListRecurringDonorsResponse(ListRecurringDonorsResponse value) {
        return new JAXBElement<ListRecurringDonorsResponse>(_ListRecurringDonorsResponse_QNAME, ListRecurringDonorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDonationStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveDonationStatsRequest")
    public JAXBElement<RetrieveDonationStatsRequest> createRetrieveDonationStatsRequest(RetrieveDonationStatsRequest value) {
        return new JAXBElement<RetrieveDonationStatsRequest>(_RetrieveDonationStatsRequest_QNAME, RetrieveDonationStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDonationStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveDonationStatsResponse")
    public JAXBElement<RetrieveDonationStatsResponse> createRetrieveDonationStatsResponse(RetrieveDonationStatsResponse value) {
        return new JAXBElement<RetrieveDonationStatsResponse>(_RetrieveDonationStatsResponse_QNAME, RetrieveDonationStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCampaignSummaryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveCampaignSummaryRequest")
    public JAXBElement<RetrieveCampaignSummaryRequest> createRetrieveCampaignSummaryRequest(RetrieveCampaignSummaryRequest value) {
        return new JAXBElement<RetrieveCampaignSummaryRequest>(_RetrieveCampaignSummaryRequest_QNAME, RetrieveCampaignSummaryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCampaignSummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveCampaignSummaryResponse")
    public JAXBElement<RetrieveCampaignSummaryResponse> createRetrieveCampaignSummaryResponse(RetrieveCampaignSummaryResponse value) {
        return new JAXBElement<RetrieveCampaignSummaryResponse>(_RetrieveCampaignSummaryResponse_QNAME, RetrieveCampaignSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMembershipsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listMembershipsRequest")
    public JAXBElement<ListMembershipsRequest> createListMembershipsRequest(ListMembershipsRequest value) {
        return new JAXBElement<ListMembershipsRequest>(_ListMembershipsRequest_QNAME, ListMembershipsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMembershipsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listMembershipsResponse")
    public JAXBElement<ListMembershipsResponse> createListMembershipsResponse(ListMembershipsResponse value) {
        return new JAXBElement<ListMembershipsResponse>(_ListMembershipsResponse_QNAME, ListMembershipsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMembershipTermsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listMembershipTermsRequest")
    public JAXBElement<ListMembershipTermsRequest> createListMembershipTermsRequest(ListMembershipTermsRequest value) {
        return new JAXBElement<ListMembershipTermsRequest>(_ListMembershipTermsRequest_QNAME, ListMembershipTermsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMembershipTermsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listMembershipTermsResponse")
    public JAXBElement<ListMembershipTermsResponse> createListMembershipTermsResponse(ListMembershipTermsResponse value) {
        return new JAXBElement<ListMembershipTermsResponse>(_ListMembershipTermsResponse_QNAME, ListMembershipTermsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMembershipToAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addMembershipToAccountRequest")
    public JAXBElement<AddMembershipToAccountRequest> createAddMembershipToAccountRequest(AddMembershipToAccountRequest value) {
        return new JAXBElement<AddMembershipToAccountRequest>(_AddMembershipToAccountRequest_QNAME, AddMembershipToAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMembershipToAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addMembershipToAccountResponse")
    public JAXBElement<AddMembershipToAccountResponse> createAddMembershipToAccountResponse(AddMembershipToAccountResponse value) {
        return new JAXBElement<AddMembershipToAccountResponse>(_AddMembershipToAccountResponse_QNAME, AddMembershipToAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMembershipHistoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listMembershipHistoryRequest")
    public JAXBElement<ListMembershipHistoryRequest> createListMembershipHistoryRequest(ListMembershipHistoryRequest value) {
        return new JAXBElement<ListMembershipHistoryRequest>(_ListMembershipHistoryRequest_QNAME, ListMembershipHistoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMembershipHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listMembershipHistoryResponse")
    public JAXBElement<ListMembershipHistoryResponse> createListMembershipHistoryResponse(ListMembershipHistoryResponse value) {
        return new JAXBElement<ListMembershipHistoryResponse>(_ListMembershipHistoryResponse_QNAME, ListMembershipHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMembershipStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveMembershipStatsRequest")
    public JAXBElement<RetrieveMembershipStatsRequest> createRetrieveMembershipStatsRequest(RetrieveMembershipStatsRequest value) {
        return new JAXBElement<RetrieveMembershipStatsRequest>(_RetrieveMembershipStatsRequest_QNAME, RetrieveMembershipStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMembershipStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveMembershipStatsResponse")
    public JAXBElement<RetrieveMembershipStatsResponse> createRetrieveMembershipStatsResponse(RetrieveMembershipStatsResponse value) {
        return new JAXBElement<RetrieveMembershipStatsResponse>(_RetrieveMembershipStatsResponse_QNAME, RetrieveMembershipStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCatalogsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCatalogsRequest")
    public JAXBElement<ListCatalogsRequest> createListCatalogsRequest(ListCatalogsRequest value) {
        return new JAXBElement<ListCatalogsRequest>(_ListCatalogsRequest_QNAME, ListCatalogsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCatalogsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCatalogsResponse")
    public JAXBElement<ListCatalogsResponse> createListCatalogsResponse(ListCatalogsResponse value) {
        return new JAXBElement<ListCatalogsResponse>(_ListCatalogsResponse_QNAME, ListCatalogsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCatalogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createCatalogRequest")
    public JAXBElement<CreateCatalogRequest> createCreateCatalogRequest(CreateCatalogRequest value) {
        return new JAXBElement<CreateCatalogRequest>(_CreateCatalogRequest_QNAME, CreateCatalogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCatalogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createCatalogResponse")
    public JAXBElement<CreateCatalogResponse> createCreateCatalogResponse(CreateCatalogResponse value) {
        return new JAXBElement<CreateCatalogResponse>(_CreateCatalogResponse_QNAME, CreateCatalogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCatalogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateCatalogRequest")
    public JAXBElement<UpdateCatalogRequest> createUpdateCatalogRequest(UpdateCatalogRequest value) {
        return new JAXBElement<UpdateCatalogRequest>(_UpdateCatalogRequest_QNAME, UpdateCatalogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCatalogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateCatalogResponse")
    public JAXBElement<UpdateCatalogResponse> createUpdateCatalogResponse(UpdateCatalogResponse value) {
        return new JAXBElement<UpdateCatalogResponse>(_UpdateCatalogResponse_QNAME, UpdateCatalogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCatalogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeCatalogRequest")
    public JAXBElement<RemoveCatalogRequest> createRemoveCatalogRequest(RemoveCatalogRequest value) {
        return new JAXBElement<RemoveCatalogRequest>(_RemoveCatalogRequest_QNAME, RemoveCatalogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCatalogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeCatalogResponse")
    public JAXBElement<RemoveCatalogResponse> createRemoveCatalogResponse(RemoveCatalogResponse value) {
        return new JAXBElement<RemoveCatalogResponse>(_RemoveCatalogResponse_QNAME, RemoveCatalogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductToCatalogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addProductToCatalogRequest")
    public JAXBElement<AddProductToCatalogRequest> createAddProductToCatalogRequest(AddProductToCatalogRequest value) {
        return new JAXBElement<AddProductToCatalogRequest>(_AddProductToCatalogRequest_QNAME, AddProductToCatalogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductToCatalogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addProductToCatalogResponse")
    public JAXBElement<AddProductToCatalogResponse> createAddProductToCatalogResponse(AddProductToCatalogResponse value) {
        return new JAXBElement<AddProductToCatalogResponse>(_AddProductToCatalogResponse_QNAME, AddProductToCatalogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductFromCatalogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeProductFromCatalogRequest")
    public JAXBElement<RemoveProductFromCatalogRequest> createRemoveProductFromCatalogRequest(RemoveProductFromCatalogRequest value) {
        return new JAXBElement<RemoveProductFromCatalogRequest>(_RemoveProductFromCatalogRequest_QNAME, RemoveProductFromCatalogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductFromCatalogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeProductFromCatalogResponse")
    public JAXBElement<RemoveProductFromCatalogResponse> createRemoveProductFromCatalogResponse(RemoveProductFromCatalogResponse value) {
        return new JAXBElement<RemoveProductFromCatalogResponse>(_RemoveProductFromCatalogResponse_QNAME, RemoveProductFromCatalogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCategoriesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCategoriesRequest")
    public JAXBElement<ListCategoriesRequest> createListCategoriesRequest(ListCategoriesRequest value) {
        return new JAXBElement<ListCategoriesRequest>(_ListCategoriesRequest_QNAME, ListCategoriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listCategoriesResponse")
    public JAXBElement<ListCategoriesResponse> createListCategoriesResponse(ListCategoriesResponse value) {
        return new JAXBElement<ListCategoriesResponse>(_ListCategoriesResponse_QNAME, ListCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createCategoryRequest")
    public JAXBElement<CreateCategoryRequest> createCreateCategoryRequest(CreateCategoryRequest value) {
        return new JAXBElement<CreateCategoryRequest>(_CreateCategoryRequest_QNAME, CreateCategoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createCategoryResponse")
    public JAXBElement<CreateCategoryResponse> createCreateCategoryResponse(CreateCategoryResponse value) {
        return new JAXBElement<CreateCategoryResponse>(_CreateCategoryResponse_QNAME, CreateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateCategoryRequest")
    public JAXBElement<UpdateCategoryRequest> createUpdateCategoryRequest(UpdateCategoryRequest value) {
        return new JAXBElement<UpdateCategoryRequest>(_UpdateCategoryRequest_QNAME, UpdateCategoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateCategoryResponse")
    public JAXBElement<UpdateCategoryResponse> createUpdateCategoryResponse(UpdateCategoryResponse value) {
        return new JAXBElement<UpdateCategoryResponse>(_UpdateCategoryResponse_QNAME, UpdateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeCategoryRequest")
    public JAXBElement<RemoveCategoryRequest> createRemoveCategoryRequest(RemoveCategoryRequest value) {
        return new JAXBElement<RemoveCategoryRequest>(_RemoveCategoryRequest_QNAME, RemoveCategoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeCategoryResponse")
    public JAXBElement<RemoveCategoryResponse> createRemoveCategoryResponse(RemoveCategoryResponse value) {
        return new JAXBElement<RemoveCategoryResponse>(_RemoveCategoryResponse_QNAME, RemoveCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listProductsRequest")
    public JAXBElement<ListProductsRequest> createListProductsRequest(ListProductsRequest value) {
        return new JAXBElement<ListProductsRequest>(_ListProductsRequest_QNAME, ListProductsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listProductsResponse")
    public JAXBElement<ListProductsResponse> createListProductsResponse(ListProductsResponse value) {
        return new JAXBElement<ListProductsResponse>(_ListProductsResponse_QNAME, ListProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createProductRequest")
    public JAXBElement<CreateProductRequest> createCreateProductRequest(CreateProductRequest value) {
        return new JAXBElement<CreateProductRequest>(_CreateProductRequest_QNAME, CreateProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createProductResponse")
    public JAXBElement<CreateProductResponse> createCreateProductResponse(CreateProductResponse value) {
        return new JAXBElement<CreateProductResponse>(_CreateProductResponse_QNAME, CreateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateProductRequest")
    public JAXBElement<UpdateProductRequest> createUpdateProductRequest(UpdateProductRequest value) {
        return new JAXBElement<UpdateProductRequest>(_UpdateProductRequest_QNAME, UpdateProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<UpdateProductResponse>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeProductRequest")
    public JAXBElement<RemoveProductRequest> createRemoveProductRequest(RemoveProductRequest value) {
        return new JAXBElement<RemoveProductRequest>(_RemoveProductRequest_QNAME, RemoveProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeProductResponse")
    public JAXBElement<RemoveProductResponse> createRemoveProductResponse(RemoveProductResponse value) {
        return new JAXBElement<RemoveProductResponse>(_RemoveProductResponse_QNAME, RemoveProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveProductRequest")
    public JAXBElement<RetrieveProductRequest> createRetrieveProductRequest(RetrieveProductRequest value) {
        return new JAXBElement<RetrieveProductRequest>(_RetrieveProductRequest_QNAME, RetrieveProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveProductResponse")
    public JAXBElement<RetrieveProductResponse> createRetrieveProductResponse(RetrieveProductResponse value) {
        return new JAXBElement<RetrieveProductResponse>(_RetrieveProductResponse_QNAME, RetrieveProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadProductImageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "uploadProductImageRequest")
    public JAXBElement<UploadProductImageRequest> createUploadProductImageRequest(UploadProductImageRequest value) {
        return new JAXBElement<UploadProductImageRequest>(_UploadProductImageRequest_QNAME, UploadProductImageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadProductImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "uploadProductImageResponse")
    public JAXBElement<UploadProductImageResponse> createUploadProductImageResponse(UploadProductImageResponse value) {
        return new JAXBElement<UploadProductImageResponse>(_UploadProductImageResponse_QNAME, UploadProductImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductImageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeProductImageRequest")
    public JAXBElement<RemoveProductImageRequest> createRemoveProductImageRequest(RemoveProductImageRequest value) {
        return new JAXBElement<RemoveProductImageRequest>(_RemoveProductImageRequest_QNAME, RemoveProductImageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeProductImageResponse")
    public JAXBElement<RemoveProductImageResponse> createRemoveProductImageResponse(RemoveProductImageResponse value) {
        return new JAXBElement<RemoveProductImageResponse>(_RemoveProductImageResponse_QNAME, RemoveProductImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductImagesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listProductImagesRequest")
    public JAXBElement<ListProductImagesRequest> createListProductImagesRequest(ListProductImagesRequest value) {
        return new JAXBElement<ListProductImagesRequest>(_ListProductImagesRequest_QNAME, ListProductImagesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductImagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listProductImagesResponse")
    public JAXBElement<ListProductImagesResponse> createListProductImagesResponse(ListProductImagesResponse value) {
        return new JAXBElement<ListProductImagesResponse>(_ListProductImagesResponse_QNAME, ListProductImagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductOptionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createProductOptionRequest")
    public JAXBElement<CreateProductOptionRequest> createCreateProductOptionRequest(CreateProductOptionRequest value) {
        return new JAXBElement<CreateProductOptionRequest>(_CreateProductOptionRequest_QNAME, CreateProductOptionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductOptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createProductOptionResponse")
    public JAXBElement<CreateProductOptionResponse> createCreateProductOptionResponse(CreateProductOptionResponse value) {
        return new JAXBElement<CreateProductOptionResponse>(_CreateProductOptionResponse_QNAME, CreateProductOptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductOptionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listProductOptionsRequest")
    public JAXBElement<ListProductOptionsRequest> createListProductOptionsRequest(ListProductOptionsRequest value) {
        return new JAXBElement<ListProductOptionsRequest>(_ListProductOptionsRequest_QNAME, ListProductOptionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listProductOptionsResponse")
    public JAXBElement<ListProductOptionsResponse> createListProductOptionsResponse(ListProductOptionsResponse value) {
        return new JAXBElement<ListProductOptionsResponse>(_ListProductOptionsResponse_QNAME, ListProductOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductOptionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateProductOptionRequest")
    public JAXBElement<UpdateProductOptionRequest> createUpdateProductOptionRequest(UpdateProductOptionRequest value) {
        return new JAXBElement<UpdateProductOptionRequest>(_UpdateProductOptionRequest_QNAME, UpdateProductOptionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductOptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "updateProductOptionResponse")
    public JAXBElement<UpdateProductOptionResponse> createUpdateProductOptionResponse(UpdateProductOptionResponse value) {
        return new JAXBElement<UpdateProductOptionResponse>(_UpdateProductOptionResponse_QNAME, UpdateProductOptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductOptionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeProductOptionRequest")
    public JAXBElement<RemoveProductOptionRequest> createRemoveProductOptionRequest(RemoveProductOptionRequest value) {
        return new JAXBElement<RemoveProductOptionRequest>(_RemoveProductOptionRequest_QNAME, RemoveProductOptionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductOptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeProductOptionResponse")
    public JAXBElement<RemoveProductOptionResponse> createRemoveProductOptionResponse(RemoveProductOptionResponse value) {
        return new JAXBElement<RemoveProductOptionResponse>(_RemoveProductOptionResponse_QNAME, RemoveProductOptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShoppingCartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createShoppingCartRequest")
    public JAXBElement<CreateShoppingCartRequest> createCreateShoppingCartRequest(CreateShoppingCartRequest value) {
        return new JAXBElement<CreateShoppingCartRequest>(_CreateShoppingCartRequest_QNAME, CreateShoppingCartRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShoppingCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "createShoppingCartResponse")
    public JAXBElement<CreateShoppingCartResponse> createCreateShoppingCartResponse(CreateShoppingCartResponse value) {
        return new JAXBElement<CreateShoppingCartResponse>(_CreateShoppingCartResponse_QNAME, CreateShoppingCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemToShoppingCartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addItemToShoppingCartRequest")
    public JAXBElement<AddItemToShoppingCartRequest> createAddItemToShoppingCartRequest(AddItemToShoppingCartRequest value) {
        return new JAXBElement<AddItemToShoppingCartRequest>(_AddItemToShoppingCartRequest_QNAME, AddItemToShoppingCartRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemToShoppingCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addItemToShoppingCartResponse")
    public JAXBElement<AddItemToShoppingCartResponse> createAddItemToShoppingCartResponse(AddItemToShoppingCartResponse value) {
        return new JAXBElement<AddItemToShoppingCartResponse>(_AddItemToShoppingCartResponse_QNAME, AddItemToShoppingCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveItemFromShoppingCartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeItemFromShoppingCartRequest")
    public JAXBElement<RemoveItemFromShoppingCartRequest> createRemoveItemFromShoppingCartRequest(RemoveItemFromShoppingCartRequest value) {
        return new JAXBElement<RemoveItemFromShoppingCartRequest>(_RemoveItemFromShoppingCartRequest_QNAME, RemoveItemFromShoppingCartRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveItemFromShoppingCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "removeItemFromShoppingCartResponse")
    public JAXBElement<RemoveItemFromShoppingCartResponse> createRemoveItemFromShoppingCartResponse(RemoveItemFromShoppingCartResponse value) {
        return new JAXBElement<RemoveItemFromShoppingCartResponse>(_RemoveItemFromShoppingCartResponse_QNAME, RemoveItemFromShoppingCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateShippingAddressToShoppingCartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addOrUpdateShippingAddressToShoppingCartRequest")
    public JAXBElement<AddOrUpdateShippingAddressToShoppingCartRequest> createAddOrUpdateShippingAddressToShoppingCartRequest(AddOrUpdateShippingAddressToShoppingCartRequest value) {
        return new JAXBElement<AddOrUpdateShippingAddressToShoppingCartRequest>(_AddOrUpdateShippingAddressToShoppingCartRequest_QNAME, AddOrUpdateShippingAddressToShoppingCartRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateShippingAddressToShoppingCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addOrUpdateShippingAddressToShoppingCartResponse")
    public JAXBElement<AddOrUpdateShippingAddressToShoppingCartResponse> createAddOrUpdateShippingAddressToShoppingCartResponse(AddOrUpdateShippingAddressToShoppingCartResponse value) {
        return new JAXBElement<AddOrUpdateShippingAddressToShoppingCartResponse>(_AddOrUpdateShippingAddressToShoppingCartResponse_QNAME, AddOrUpdateShippingAddressToShoppingCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListShippingMethodsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listShippingMethodsRequest")
    public JAXBElement<ListShippingMethodsRequest> createListShippingMethodsRequest(ListShippingMethodsRequest value) {
        return new JAXBElement<ListShippingMethodsRequest>(_ListShippingMethodsRequest_QNAME, ListShippingMethodsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListShippingMethodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listShippingMethodsResponse")
    public JAXBElement<ListShippingMethodsResponse> createListShippingMethodsResponse(ListShippingMethodsResponse value) {
        return new JAXBElement<ListShippingMethodsResponse>(_ListShippingMethodsResponse_QNAME, ListShippingMethodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateShippingMethodToShoppingCartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addOrUpdateShippingMethodToShoppingCartRequest")
    public JAXBElement<AddOrUpdateShippingMethodToShoppingCartRequest> createAddOrUpdateShippingMethodToShoppingCartRequest(AddOrUpdateShippingMethodToShoppingCartRequest value) {
        return new JAXBElement<AddOrUpdateShippingMethodToShoppingCartRequest>(_AddOrUpdateShippingMethodToShoppingCartRequest_QNAME, AddOrUpdateShippingMethodToShoppingCartRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateShippingMethodToShoppingCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addOrUpdateShippingMethodToShoppingCartResponse")
    public JAXBElement<AddOrUpdateShippingMethodToShoppingCartResponse> createAddOrUpdateShippingMethodToShoppingCartResponse(AddOrUpdateShippingMethodToShoppingCartResponse value) {
        return new JAXBElement<AddOrUpdateShippingMethodToShoppingCartResponse>(_AddOrUpdateShippingMethodToShoppingCartResponse_QNAME, AddOrUpdateShippingMethodToShoppingCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateCustomerToShoppingCartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addOrUpdateCustomerToShoppingCartRequest")
    public JAXBElement<AddOrUpdateCustomerToShoppingCartRequest> createAddOrUpdateCustomerToShoppingCartRequest(AddOrUpdateCustomerToShoppingCartRequest value) {
        return new JAXBElement<AddOrUpdateCustomerToShoppingCartRequest>(_AddOrUpdateCustomerToShoppingCartRequest_QNAME, AddOrUpdateCustomerToShoppingCartRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateCustomerToShoppingCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "addOrUpdateCustomerToShoppingCartResponse")
    public JAXBElement<AddOrUpdateCustomerToShoppingCartResponse> createAddOrUpdateCustomerToShoppingCartResponse(AddOrUpdateCustomerToShoppingCartResponse value) {
        return new JAXBElement<AddOrUpdateCustomerToShoppingCartResponse>(_AddOrUpdateCustomerToShoppingCartResponse_QNAME, AddOrUpdateCustomerToShoppingCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveShoppingCartSummaryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveShoppingCartSummaryRequest")
    public JAXBElement<RetrieveShoppingCartSummaryRequest> createRetrieveShoppingCartSummaryRequest(RetrieveShoppingCartSummaryRequest value) {
        return new JAXBElement<RetrieveShoppingCartSummaryRequest>(_RetrieveShoppingCartSummaryRequest_QNAME, RetrieveShoppingCartSummaryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveShoppingCartSummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveShoppingCartSummaryResponse")
    public JAXBElement<RetrieveShoppingCartSummaryResponse> createRetrieveShoppingCartSummaryResponse(RetrieveShoppingCartSummaryResponse value) {
        return new JAXBElement<RetrieveShoppingCartSummaryResponse>(_RetrieveShoppingCartSummaryResponse_QNAME, RetrieveShoppingCartSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "checkoutRequest")
    public JAXBElement<CheckoutRequest> createCheckoutRequest(CheckoutRequest value) {
        return new JAXBElement<CheckoutRequest>(_CheckoutRequest_QNAME, CheckoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "checkoutResponse")
    public JAXBElement<CheckoutResponse> createCheckoutResponse(CheckoutResponse value) {
        return new JAXBElement<CheckoutResponse>(_CheckoutResponse_QNAME, CheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveOrderDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveOrderDetailsRequest")
    public JAXBElement<RetrieveOrderDetailsRequest> createRetrieveOrderDetailsRequest(RetrieveOrderDetailsRequest value) {
        return new JAXBElement<RetrieveOrderDetailsRequest>(_RetrieveOrderDetailsRequest_QNAME, RetrieveOrderDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveOrderDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveOrderDetailsResponse")
    public JAXBElement<RetrieveOrderDetailsResponse> createRetrieveOrderDetailsResponse(RetrieveOrderDetailsResponse value) {
        return new JAXBElement<RetrieveOrderDetailsResponse>(_RetrieveOrderDetailsResponse_QNAME, RetrieveOrderDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listOrdersRequest")
    public JAXBElement<ListOrdersRequest> createListOrdersRequest(ListOrdersRequest value) {
        return new JAXBElement<ListOrdersRequest>(_ListOrdersRequest_QNAME, ListOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "listOrdersResponse")
    public JAXBElement<ListOrdersResponse> createListOrdersResponse(ListOrdersResponse value) {
        return new JAXBElement<ListOrdersResponse>(_ListOrdersResponse_QNAME, ListOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveReceiptRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveReceiptRequest")
    public JAXBElement<RetrieveReceiptRequest> createRetrieveReceiptRequest(RetrieveReceiptRequest value) {
        return new JAXBElement<RetrieveReceiptRequest>(_RetrieveReceiptRequest_QNAME, RetrieveReceiptRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveReceiptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveReceiptResponse")
    public JAXBElement<RetrieveReceiptResponse> createRetrieveReceiptResponse(RetrieveReceiptResponse value) {
        return new JAXBElement<RetrieveReceiptResponse>(_RetrieveReceiptResponse_QNAME, RetrieveReceiptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveStorePurchaseStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveStorePurchaseStatsRequest")
    public JAXBElement<RetrieveStorePurchaseStatsRequest> createRetrieveStorePurchaseStatsRequest(RetrieveStorePurchaseStatsRequest value) {
        return new JAXBElement<RetrieveStorePurchaseStatsRequest>(_RetrieveStorePurchaseStatsRequest_QNAME, RetrieveStorePurchaseStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveStorePurchaseStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.z2systems.com/schemas/neonws/", name = "retrieveStorePurchaseStatsResponse")
    public JAXBElement<RetrieveStorePurchaseStatsResponse> createRetrieveStorePurchaseStatsResponse(RetrieveStorePurchaseStatsResponse value) {
        return new JAXBElement<RetrieveStorePurchaseStatsResponse>(_RetrieveStorePurchaseStatsResponse_QNAME, RetrieveStorePurchaseStatsResponse.class, null, value);
    }

}
