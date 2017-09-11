import com.z2systems.schemas.common.APILogin;
import com.z2systems.schemas.common.LoginRequest;
import com.z2systems.schemas.common.LoginResponse;
import com.z2systems.schemas.neonws.CommonService;
import com.z2systems.schemas.neonws.Neonws;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Gabriel Ruffo on 5/24/2017.
 * Purpose: This class logs in to Neon CRM using the API key
 * given to Gabriel Ruffo -- found in Neon > System Users > Gabriel Ruffo [Edit] .
 */
class Login {
    // Uses QName constructor to specify the Namespace URI and local part
    private static final QName SERVICE_NAME = new QName("http://www.z2systems.com/schemas/neonws/", "Neonws");
    private static final String WSDL_URL = "https://api.neoncrm.com/neonws/services/CommonService?wsdl";
    public static final String API_KEY = "620dfd6b104183d27678e771583f78e3";
    public static final String ORG_ID = "beadsofcourage";

    /**
     * This method logs in to Neon CRM through the CommonService port by using
     * the API key for Gabriel Ruffo and the organization ID for Beads of Courage.
     *
     * @return  The session ID for the user given the API key, as a string
     */
    static String LoginAndGetUserSessionID() {
        // Set up URL for the wsdl doc
        URL wsdlURL = null;
        try {
            // Set URL to location of wsdl doc
            wsdlURL = new URL(WSDL_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Neonws object that takes the URL to the wsdl file and QName
        Neonws ss = new Neonws(wsdlURL, SERVICE_NAME);
        CommonService port = ss.getCommonPort();

        System.out.println("Invoking Login...");
        APILogin api = new APILogin();
        api.setApiKey(API_KEY);
        api.setOrgId(ORG_ID);

        // Set up a login request with API key
        LoginRequest request = new LoginRequest();
        request.setLogin(api);
        LoginResponse response = port.login(request);

        // Check if we got a response from Neon CRM
        if (response != null) {
            String sessID = response.getUserSessionId();
            System.out.println(response.getOperationResult().toString());
            System.out.println("User Session ID: " + sessID);
            System.out.println(response.getResponseMessage());
            System.out.println();

            return sessID;
        }

        return "";
    }
}
