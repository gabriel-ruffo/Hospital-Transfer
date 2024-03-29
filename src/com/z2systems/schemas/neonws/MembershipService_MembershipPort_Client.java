
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
 * 2017-05-24T17:30:59.358Z
 * Generated source version: 3.1.11
 * 
 */
public final class MembershipService_MembershipPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.z2systems.com/schemas/neonws/", "Neonws");

    private MembershipService_MembershipPort_Client() {
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
        MembershipService port = ss.getMembershipPort();  
        
        {
        System.out.println("Invoking listMemberships...");
        com.z2systems.schemas.membership.ListMembershipsRequest _listMemberships_request = null;
        com.z2systems.schemas.membership.ListMembershipsResponse _listMemberships__return = port.listMemberships(_listMemberships_request);
        System.out.println("listMemberships.result=" + _listMemberships__return);


        }
        {
        System.out.println("Invoking retrieveMembershipStats...");
        com.z2systems.schemas.membership.RetrieveMembershipStatsRequest _retrieveMembershipStats_request = null;
        com.z2systems.schemas.membership.RetrieveMembershipStatsResponse _retrieveMembershipStats__return = port.retrieveMembershipStats(_retrieveMembershipStats_request);
        System.out.println("retrieveMembershipStats.result=" + _retrieveMembershipStats__return);


        }
        {
        System.out.println("Invoking listMembershipHistory...");
        com.z2systems.schemas.membership.ListMembershipHistoryRequest _listMembershipHistory_request = null;
        com.z2systems.schemas.membership.ListMembershipHistoryResponse _listMembershipHistory__return = port.listMembershipHistory(_listMembershipHistory_request);
        System.out.println("listMembershipHistory.result=" + _listMembershipHistory__return);


        }
        {
        System.out.println("Invoking listMembershipTerms...");
        com.z2systems.schemas.membership.ListMembershipTermsRequest _listMembershipTerms_request = null;
        com.z2systems.schemas.membership.ListMembershipTermsResponse _listMembershipTerms__return = port.listMembershipTerms(_listMembershipTerms_request);
        System.out.println("listMembershipTerms.result=" + _listMembershipTerms__return);


        }
        {
        System.out.println("Invoking addMembershipToAccount...");
        com.z2systems.schemas.membership.AddMembershipToAccountRequest _addMembershipToAccount_request = null;
        com.z2systems.schemas.membership.AddMembershipToAccountResponse _addMembershipToAccount__return = port.addMembershipToAccount(_addMembershipToAccount_request);
        System.out.println("addMembershipToAccount.result=" + _addMembershipToAccount__return);


        }

        System.exit(0);
    }

}
