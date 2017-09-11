
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.z2systems.schemas.neonws;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-24T17:30:59.650Z
 * Generated source version: 3.1.11
 * 
 */

@WebService(
                      serviceName = "Neonws",
                      portName = "CommonPort",
                      targetNamespace = "http://www.z2systems.com/schemas/neonws/",
                      wsdlLocation = "file:../wsdl/definitions.wsdl",
                      endpointInterface = "com.z2systems.schemas.neonws.CommonService")
                      
public class CommonPortImpl implements CommonService {

    private static final Logger LOG = Logger.getLogger(CommonPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#logout(com.z2systems.schemas.common.LogoutRequest request)*
     */
    public com.z2systems.schemas.common.LogoutResponse logout(com.z2systems.schemas.common.LogoutRequest request) { 
        LOG.info("Executing operation logout");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.LogoutResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#login(com.z2systems.schemas.common.LoginRequest request)*
     */
    public com.z2systems.schemas.common.LoginResponse login(com.z2systems.schemas.common.LoginRequest request) { 
        LOG.info("Executing operation login");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.LoginResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#updatePayment(com.z2systems.schemas.common.UpdatePaymentRequest request)*
     */
    public com.z2systems.schemas.common.UpdatePaymentResponse updatePayment(com.z2systems.schemas.common.UpdatePaymentRequest request) { 
        LOG.info("Executing operation updatePayment");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.UpdatePaymentResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#authenticateUser(com.z2systems.schemas.common.AuthenticateUserRequest request)*
     */
    public com.z2systems.schemas.common.AuthenticateUserResponse authenticateUser(com.z2systems.schemas.common.AuthenticateUserRequest request) { 
        LOG.info("Executing operation authenticateUser");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.AuthenticateUserResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#retrieveStats(com.z2systems.schemas.common.RetrieveStatsRequest request)*
     */
    public com.z2systems.schemas.common.RetrieveStatsResponse retrieveStats(com.z2systems.schemas.common.RetrieveStatsRequest request) { 
        LOG.info("Executing operation retrieveStats");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.RetrieveStatsResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#retrieveCurrentSystemUser(com.z2systems.schemas.common.RetrieveCurrentSystemUserRequest request)*
     */
    public com.z2systems.schemas.common.RetrieveCurrentSystemUserResponse retrieveCurrentSystemUser(com.z2systems.schemas.common.RetrieveCurrentSystemUserRequest request) { 
        LOG.info("Executing operation retrieveCurrentSystemUser");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.RetrieveCurrentSystemUserResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#listCreditCardTypes(com.z2systems.schemas.common.ListCreditCardTypesRequest request)*
     */
    public com.z2systems.schemas.common.ListCreditCardTypesResponse listCreditCardTypes(com.z2systems.schemas.common.ListCreditCardTypesRequest request) { 
        LOG.info("Executing operation listCreditCardTypes");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.ListCreditCardTypesResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#listTenders(com.z2systems.schemas.common.ListTendersRequest request)*
     */
    public com.z2systems.schemas.common.ListTendersResponse listTenders(com.z2systems.schemas.common.ListTendersRequest request) { 
        LOG.info("Executing operation listTenders");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.ListTendersResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.z2systems.schemas.neonws.CommonService#listCustomFields(com.z2systems.schemas.common.ListCustomFieldsRequest request)*
     */
    public com.z2systems.schemas.common.ListCustomFieldsResponse listCustomFields(com.z2systems.schemas.common.ListCustomFieldsRequest request) { 
        LOG.info("Executing operation listCustomFields");
        System.out.println(request);
        try {
            com.z2systems.schemas.common.ListCustomFieldsResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
