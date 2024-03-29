
package com.z2systems.schemas.neonws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-24T17:30:59.455Z
 * Generated source version: 3.1.11
 * 
 */
public final class StoreService_StorePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.z2systems.com/schemas/neonws/", "Neonws");

    private StoreService_StorePort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = Neonws.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Neonws ss = new Neonws(wsdlURL, SERVICE_NAME);
        StoreService port = ss.getStorePort();  
        
        {
        System.out.println("Invoking listOrders...");
        com.z2systems.schemas.store.ListOrdersRequest _listOrders_request = null;
        com.z2systems.schemas.store.ListOrdersResponse _listOrders__return = port.listOrders(_listOrders_request);
        System.out.println("listOrders.result=" + _listOrders__return);


        }
        {
        System.out.println("Invoking removeItemFromShoppingCart...");
        com.z2systems.schemas.store.RemoveItemFromShoppingCartRequest _removeItemFromShoppingCart_request = null;
        com.z2systems.schemas.store.RemoveItemFromShoppingCartResponse _removeItemFromShoppingCart__return = port.removeItemFromShoppingCart(_removeItemFromShoppingCart_request);
        System.out.println("removeItemFromShoppingCart.result=" + _removeItemFromShoppingCart__return);


        }
        {
        System.out.println("Invoking listProductOptions...");
        com.z2systems.schemas.store.ListProductOptionsRequest _listProductOptions_request = null;
        com.z2systems.schemas.store.ListProductOptionsResponse _listProductOptions__return = port.listProductOptions(_listProductOptions_request);
        System.out.println("listProductOptions.result=" + _listProductOptions__return);


        }
        {
        System.out.println("Invoking removeCategory...");
        com.z2systems.schemas.store.RemoveCategoryRequest _removeCategory_request = null;
        com.z2systems.schemas.store.RemoveCategoryResponse _removeCategory__return = port.removeCategory(_removeCategory_request);
        System.out.println("removeCategory.result=" + _removeCategory__return);


        }
        {
        System.out.println("Invoking listCatalogs...");
        com.z2systems.schemas.store.ListCatalogsRequest _listCatalogs_request = null;
        com.z2systems.schemas.store.ListCatalogsResponse _listCatalogs__return = port.listCatalogs(_listCatalogs_request);
        System.out.println("listCatalogs.result=" + _listCatalogs__return);


        }
        {
        System.out.println("Invoking listProductImages...");
        com.z2systems.schemas.store.ListProductImagesRequest _listProductImages_request = null;
        com.z2systems.schemas.store.ListProductImagesResponse _listProductImages__return = port.listProductImages(_listProductImages_request);
        System.out.println("listProductImages.result=" + _listProductImages__return);


        }
        {
        System.out.println("Invoking addOrUpdateShippingAddressToShoppingCart...");
        com.z2systems.schemas.store.AddOrUpdateShippingAddressToShoppingCartRequest _addOrUpdateShippingAddressToShoppingCart_request = null;
        com.z2systems.schemas.store.AddOrUpdateShippingAddressToShoppingCartResponse _addOrUpdateShippingAddressToShoppingCart__return = port.addOrUpdateShippingAddressToShoppingCart(_addOrUpdateShippingAddressToShoppingCart_request);
        System.out.println("addOrUpdateShippingAddressToShoppingCart.result=" + _addOrUpdateShippingAddressToShoppingCart__return);


        }
        {
        System.out.println("Invoking listProducts...");
        com.z2systems.schemas.store.ListProductsRequest _listProducts_request = null;
        com.z2systems.schemas.store.ListProductsResponse _listProducts__return = port.listProducts(_listProducts_request);
        System.out.println("listProducts.result=" + _listProducts__return);


        }
        {
        System.out.println("Invoking retrieveShoppingCartSummary...");
        com.z2systems.schemas.store.RetrieveShoppingCartSummaryRequest _retrieveShoppingCartSummary_request = null;
        com.z2systems.schemas.store.RetrieveShoppingCartSummaryResponse _retrieveShoppingCartSummary__return = port.retrieveShoppingCartSummary(_retrieveShoppingCartSummary_request);
        System.out.println("retrieveShoppingCartSummary.result=" + _retrieveShoppingCartSummary__return);


        }
        {
        System.out.println("Invoking retrieveReceipt...");
        com.z2systems.schemas.store.RetrieveReceiptRequest _retrieveReceipt_request = null;
        com.z2systems.schemas.store.RetrieveReceiptResponse _retrieveReceipt__return = port.retrieveReceipt(_retrieveReceipt_request);
        System.out.println("retrieveReceipt.result=" + _retrieveReceipt__return);


        }
        {
        System.out.println("Invoking checkout...");
        com.z2systems.schemas.store.CheckoutRequest _checkout_request = null;
        com.z2systems.schemas.store.CheckoutResponse _checkout__return = port.checkout(_checkout_request);
        System.out.println("checkout.result=" + _checkout__return);


        }
        {
        System.out.println("Invoking addItemToShoppingCart...");
        com.z2systems.schemas.store.AddItemToShoppingCartRequest _addItemToShoppingCart_request = null;
        com.z2systems.schemas.store.AddItemToShoppingCartResponse _addItemToShoppingCart__return = port.addItemToShoppingCart(_addItemToShoppingCart_request);
        System.out.println("addItemToShoppingCart.result=" + _addItemToShoppingCart__return);


        }
        {
        System.out.println("Invoking retrieveOrderDetails...");
        com.z2systems.schemas.store.RetrieveOrderDetailsRequest _retrieveOrderDetails_request = null;
        com.z2systems.schemas.store.RetrieveOrderDetailsResponse _retrieveOrderDetails__return = port.retrieveOrderDetails(_retrieveOrderDetails_request);
        System.out.println("retrieveOrderDetails.result=" + _retrieveOrderDetails__return);


        }
        {
        System.out.println("Invoking removeProductOption...");
        com.z2systems.schemas.store.RemoveProductOptionRequest _removeProductOption_request = null;
        com.z2systems.schemas.store.RemoveProductOptionResponse _removeProductOption__return = port.removeProductOption(_removeProductOption_request);
        System.out.println("removeProductOption.result=" + _removeProductOption__return);


        }
        {
        System.out.println("Invoking updateCategory...");
        com.z2systems.schemas.store.UpdateCategoryRequest _updateCategory_request = null;
        com.z2systems.schemas.store.UpdateCategoryResponse _updateCategory__return = port.updateCategory(_updateCategory_request);
        System.out.println("updateCategory.result=" + _updateCategory__return);


        }
        {
        System.out.println("Invoking createProductOption...");
        com.z2systems.schemas.store.CreateProductOptionRequest _createProductOption_request = null;
        com.z2systems.schemas.store.CreateProductOptionResponse _createProductOption__return = port.createProductOption(_createProductOption_request);
        System.out.println("createProductOption.result=" + _createProductOption__return);


        }
        {
        System.out.println("Invoking updateProductOption...");
        com.z2systems.schemas.store.UpdateProductOptionRequest _updateProductOption_request = null;
        com.z2systems.schemas.store.UpdateProductOptionResponse _updateProductOption__return = port.updateProductOption(_updateProductOption_request);
        System.out.println("updateProductOption.result=" + _updateProductOption__return);


        }
        {
        System.out.println("Invoking retrieveProduct...");
        com.z2systems.schemas.store.RetrieveProductRequest _retrieveProduct_request = null;
        com.z2systems.schemas.store.RetrieveProductResponse _retrieveProduct__return = port.retrieveProduct(_retrieveProduct_request);
        System.out.println("retrieveProduct.result=" + _retrieveProduct__return);


        }
        {
        System.out.println("Invoking createProduct...");
        com.z2systems.schemas.store.CreateProductRequest _createProduct_request = null;
        com.z2systems.schemas.store.CreateProductResponse _createProduct__return = port.createProduct(_createProduct_request);
        System.out.println("createProduct.result=" + _createProduct__return);


        }
        {
        System.out.println("Invoking removeCatalog...");
        com.z2systems.schemas.store.RemoveCatalogRequest _removeCatalog_request = null;
        com.z2systems.schemas.store.RemoveCatalogResponse _removeCatalog__return = port.removeCatalog(_removeCatalog_request);
        System.out.println("removeCatalog.result=" + _removeCatalog__return);


        }
        {
        System.out.println("Invoking removeProductImage...");
        com.z2systems.schemas.store.RemoveProductImageRequest _removeProductImage_request = null;
        com.z2systems.schemas.store.RemoveProductImageResponse _removeProductImage__return = port.removeProductImage(_removeProductImage_request);
        System.out.println("removeProductImage.result=" + _removeProductImage__return);


        }
        {
        System.out.println("Invoking updateProduct...");
        com.z2systems.schemas.store.UpdateProductRequest _updateProduct_request = null;
        com.z2systems.schemas.store.UpdateProductResponse _updateProduct__return = port.updateProduct(_updateProduct_request);
        System.out.println("updateProduct.result=" + _updateProduct__return);


        }
        {
        System.out.println("Invoking uploadProductImage...");
        com.z2systems.schemas.store.UploadProductImageRequest _uploadProductImage_request = null;
        com.z2systems.schemas.store.UploadProductImageResponse _uploadProductImage__return = port.uploadProductImage(_uploadProductImage_request);
        System.out.println("uploadProductImage.result=" + _uploadProductImage__return);


        }
        {
        System.out.println("Invoking removeProductFromCatalog...");
        com.z2systems.schemas.store.RemoveProductFromCatalogRequest _removeProductFromCatalog_request = null;
        com.z2systems.schemas.store.RemoveProductFromCatalogResponse _removeProductFromCatalog__return = port.removeProductFromCatalog(_removeProductFromCatalog_request);
        System.out.println("removeProductFromCatalog.result=" + _removeProductFromCatalog__return);


        }
        {
        System.out.println("Invoking createCategory...");
        com.z2systems.schemas.store.CreateCategoryRequest _createCategory_request = null;
        com.z2systems.schemas.store.CreateCategoryResponse _createCategory__return = port.createCategory(_createCategory_request);
        System.out.println("createCategory.result=" + _createCategory__return);


        }
        {
        System.out.println("Invoking createShoppingCart...");
        com.z2systems.schemas.store.CreateShoppingCartRequest _createShoppingCart_request = null;
        com.z2systems.schemas.store.CreateShoppingCartResponse _createShoppingCart__return = port.createShoppingCart(_createShoppingCart_request);
        System.out.println("createShoppingCart.result=" + _createShoppingCart__return);


        }
        {
        System.out.println("Invoking addOrUpdateCustomerToShoppingCart...");
        com.z2systems.schemas.store.AddOrUpdateCustomerToShoppingCartRequest _addOrUpdateCustomerToShoppingCart_request = null;
        com.z2systems.schemas.store.AddOrUpdateCustomerToShoppingCartResponse _addOrUpdateCustomerToShoppingCart__return = port.addOrUpdateCustomerToShoppingCart(_addOrUpdateCustomerToShoppingCart_request);
        System.out.println("addOrUpdateCustomerToShoppingCart.result=" + _addOrUpdateCustomerToShoppingCart__return);


        }
        {
        System.out.println("Invoking removeProduct...");
        com.z2systems.schemas.store.RemoveProductRequest _removeProduct_request = null;
        com.z2systems.schemas.store.RemoveProductResponse _removeProduct__return = port.removeProduct(_removeProduct_request);
        System.out.println("removeProduct.result=" + _removeProduct__return);


        }
        {
        System.out.println("Invoking updateCatalog...");
        com.z2systems.schemas.store.UpdateCatalogRequest _updateCatalog_request = null;
        com.z2systems.schemas.store.UpdateCatalogResponse _updateCatalog__return = port.updateCatalog(_updateCatalog_request);
        System.out.println("updateCatalog.result=" + _updateCatalog__return);


        }
        {
        System.out.println("Invoking listShippingMethods...");
        com.z2systems.schemas.store.ListShippingMethodsRequest _listShippingMethods_request = null;
        com.z2systems.schemas.store.ListShippingMethodsResponse _listShippingMethods__return = port.listShippingMethods(_listShippingMethods_request);
        System.out.println("listShippingMethods.result=" + _listShippingMethods__return);


        }
        {
        System.out.println("Invoking createCatalog...");
        com.z2systems.schemas.store.CreateCatalogRequest _createCatalog_request = null;
        com.z2systems.schemas.store.CreateCatalogResponse _createCatalog__return = port.createCatalog(_createCatalog_request);
        System.out.println("createCatalog.result=" + _createCatalog__return);


        }
        {
        System.out.println("Invoking addProductToCatalog...");
        com.z2systems.schemas.store.AddProductToCatalogRequest _addProductToCatalog_request = null;
        com.z2systems.schemas.store.AddProductToCatalogResponse _addProductToCatalog__return = port.addProductToCatalog(_addProductToCatalog_request);
        System.out.println("addProductToCatalog.result=" + _addProductToCatalog__return);


        }
        {
        System.out.println("Invoking retrieveStorePurchaseStats...");
        com.z2systems.schemas.store.RetrieveStorePurchaseStatsRequest _retrieveStorePurchaseStats_request = null;
        com.z2systems.schemas.store.RetrieveStorePurchaseStatsResponse _retrieveStorePurchaseStats__return = port.retrieveStorePurchaseStats(_retrieveStorePurchaseStats_request);
        System.out.println("retrieveStorePurchaseStats.result=" + _retrieveStorePurchaseStats__return);


        }
        {
        System.out.println("Invoking addOrUpdateShippingMethodToShoppingCart...");
        com.z2systems.schemas.store.AddOrUpdateShippingMethodToShoppingCartRequest _addOrUpdateShippingMethodToShoppingCart_request = null;
        com.z2systems.schemas.store.AddOrUpdateShippingMethodToShoppingCartResponse _addOrUpdateShippingMethodToShoppingCart__return = port.addOrUpdateShippingMethodToShoppingCart(_addOrUpdateShippingMethodToShoppingCart_request);
        System.out.println("addOrUpdateShippingMethodToShoppingCart.result=" + _addOrUpdateShippingMethodToShoppingCart__return);


        }
        {
        System.out.println("Invoking listCategories...");
        com.z2systems.schemas.store.ListCategoriesRequest _listCategories_request = null;
        com.z2systems.schemas.store.ListCategoriesResponse _listCategories__return = port.listCategories(_listCategories_request);
        System.out.println("listCategories.result=" + _listCategories__return);


        }

        System.exit(0);
    }

}
