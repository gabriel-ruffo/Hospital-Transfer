
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
 * 2017-05-24T17:30:59.488Z
 * Generated source version: 3.1.11
 * 
 */
public final class CommonService_CommonPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.z2systems.com/schemas/neonws/", "Neonws");

    private CommonService_CommonPort_Client() {
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
        CommonService port = ss.getCommonPort();  
        
        {
        System.out.println("Invoking logout...");
        com.z2systems.schemas.common.LogoutRequest _logout_request = null;
        com.z2systems.schemas.common.LogoutResponse _logout__return = port.logout(_logout_request);
        System.out.println("logout.result=" + _logout__return);


        }
        {
        System.out.println("Invoking login...");
        com.z2systems.schemas.common.LoginRequest _login_request = null;
        com.z2systems.schemas.common.LoginResponse _login__return = port.login(_login_request);
        System.out.println("login.result=" + _login__return);


        }
        {
        System.out.println("Invoking updatePayment...");
        com.z2systems.schemas.common.UpdatePaymentRequest _updatePayment_request = null;
        com.z2systems.schemas.common.UpdatePaymentResponse _updatePayment__return = port.updatePayment(_updatePayment_request);
        System.out.println("updatePayment.result=" + _updatePayment__return);


        }
        {
        System.out.println("Invoking authenticateUser...");
        com.z2systems.schemas.common.AuthenticateUserRequest _authenticateUser_request = null;
        com.z2systems.schemas.common.AuthenticateUserResponse _authenticateUser__return = port.authenticateUser(_authenticateUser_request);
        System.out.println("authenticateUser.result=" + _authenticateUser__return);


        }
        {
        System.out.println("Invoking retrieveStats...");
        com.z2systems.schemas.common.RetrieveStatsRequest _retrieveStats_request = null;
        com.z2systems.schemas.common.RetrieveStatsResponse _retrieveStats__return = port.retrieveStats(_retrieveStats_request);
        System.out.println("retrieveStats.result=" + _retrieveStats__return);


        }
        {
        System.out.println("Invoking retrieveCurrentSystemUser...");
        com.z2systems.schemas.common.RetrieveCurrentSystemUserRequest _retrieveCurrentSystemUser_request = null;
        com.z2systems.schemas.common.RetrieveCurrentSystemUserResponse _retrieveCurrentSystemUser__return = port.retrieveCurrentSystemUser(_retrieveCurrentSystemUser_request);
        System.out.println("retrieveCurrentSystemUser.result=" + _retrieveCurrentSystemUser__return);


        }
        {
        System.out.println("Invoking listCreditCardTypes...");
        com.z2systems.schemas.common.ListCreditCardTypesRequest _listCreditCardTypes_request = null;
        com.z2systems.schemas.common.ListCreditCardTypesResponse _listCreditCardTypes__return = port.listCreditCardTypes(_listCreditCardTypes_request);
        System.out.println("listCreditCardTypes.result=" + _listCreditCardTypes__return);


        }
        {
        System.out.println("Invoking listTenders...");
        com.z2systems.schemas.common.ListTendersRequest _listTenders_request = null;
        com.z2systems.schemas.common.ListTendersResponse _listTenders__return = port.listTenders(_listTenders_request);
        System.out.println("listTenders.result=" + _listTenders__return);


        }
        {
        System.out.println("Invoking listCustomFields...");
        com.z2systems.schemas.common.ListCustomFieldsRequest _listCustomFields_request = null;
        com.z2systems.schemas.common.ListCustomFieldsResponse _listCustomFields__return = port.listCustomFields(_listCustomFields_request);
        System.out.println("listCustomFields.result=" + _listCustomFields__return);


        }

        System.exit(0);
    }

}