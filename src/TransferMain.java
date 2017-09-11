import com.z2systems.schemas.account.*;
import com.z2systems.schemas.common.*;
import com.z2systems.schemas.membership.Membership;
import com.z2systems.schemas.neonws.AccountService;
import com.z2systems.schemas.neonws.Neonws;

import javax.xml.namespace.QName;
import java.lang.reflect.Member;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Gabriel Ruffo on 5/24/2017.
 * Purpose: Main class to transfer the packets of info in each hospital to Neon.
 */
public class TransferMain {
    // Describes the URI and local partition to connect to Neon
    private static final QName SERVICE_NAME = new QName("http://www.z2systems.com/schemas/neonws/", "Neonws");
    private static final String WSDLURL = "https://api.neoncrm.com/neonws/services/AccountService?wsdl";
    // A list of all programs that can be sent letters
    private static final String[] PROGRAMS = {"ADULT ONCOLOGY", "BURN", "CARDIAC", "CHRONIC", "HEME/ONC",
            "L&D", "NEURO", "NICU", "ONCOLOGY", "ALL PROGRAMS"};

    public static void main(String[] args) {
        String sessionID = Login.LoginAndGetUserSessionID();

        // check if the  sessionID is valid; exit if not
        if (sessionID.equals("")) {
            System.err.println("ERROR: SessionID is invalid.");
            System.exit(1);
        }

        // Get all of the hospitals' information
        String[][] hospital_info = FormatData.getHospitalInfo();

        // Add all organizations
        addOrganizations(sessionID, hospital_info);
    }

    /**
     * This method sets up all the information needed for an organization using the data extracted
     * from the CSV file, and sending and creating the organization account to Neon
     *
     * @param sessionID     The session ID for the current user (Gabriel Ruffo)
     * @param hospital_info The 2D array containing all hospitals' information
     */
    private static void addOrganizations(String sessionID, String[][] hospital_info) {
        URL wsdlURL = null;
        try {
            wsdlURL = new URL(WSDLURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Neonws ss = new Neonws(wsdlURL, SERVICE_NAME);
        AccountService port = ss.getAccountPort();

        CreateOrganizationAccountRequest request = new CreateOrganizationAccountRequest();

        // Create and get a custom fields response to be printed
        ListCustomFieldsResponse customFieldsResponse = createCustomFieldsResponse(ss, sessionID);
        printCustomFields(customFieldsResponse);

        // for each hospital...
        for (int i = 1; i < hospital_info.length; i++) {
            // create an organization account w/ the information
            OrganizationAccount temp = createOrganizationPackage(hospital_info[i]);
            // send and create the organization account
            //sendAndCreateOrganizationAccount(request, temp, sessionID, port);
        }
        // Send and create Organization Account
        // Creates and gets a test organization account that sets values to all fields of
        // an organization.
        // OrganizationAccount organizationAccount = getTestOrganizationAccount();
        //sendAndCreateOrganizationAccount(request, organizationAccount, sessionID, port);
    }

    private static OrganizationAccount createOrganizationPackage(String[] row) {
        OrganizationAccount tempAccount = new OrganizationAccount();

        // set hospital name
        tempAccount.setOrganizationName(row[1]);

        // TODO: construct a contact..?

        CustomFieldDataList cfdl = new CustomFieldDataList();

        //  Hospital Type
        //  Types
        setUpHospitalTypesCustomFieldData(cfdl, row[4], row[5], row[6]);

        //  Hospital & Program Information and Supply Check
        //  Region
        createNewCustomFieldData(cfdl, "528", getRegionFieldOptId(row[2]), "");
        //  Introduction Sent?
        createNewCustomFieldData(cfdl, "529", "", row[7]);
        //  Information Verification Date & Notes with Hospital
        createNewCustomFieldData(cfdl, "530", "", row[8]);
        //  Supply check
        createNewCustomFieldData(cfdl, "531", "", row[9]);
        //  Program Notes
        createNewCustomFieldData(cfdl, "532", "", row[10]);
        //  Community Ambassador
        createNewCustomFieldData(cfdl, "533", "", row[11]);
        //  Wood Turner Bowls
        createNewCustomFieldData(cfdl, "534", "", row[12]);
        //  2017 Hospital Program Applications Sent?
        createNewCustomFieldData(cfdl, "535", "", row[13]);
        //  BOC Site Coordinator Assigned to Program
        setUpBOCSiteCoordCustomFieldData(cfdl, row[14]);

        //  Hospital Payment Information
        //  Who Pays
        createNewCustomFieldData(cfdl, "537", "", row[15]);
        //  Payment Terms
        createNewCustomFieldData(cfdl, "538", "", row[16]);
        //  Shipping Address
        createNewCustomFieldData(cfdl, "539", "", row[17]);
        //  2015 TYD Sales
        createNewCustomFieldData(cfdl, "540", "", row[18]);
        //  2016 TYD Sales
        createNewCustomFieldData(cfdl, "541", "", row[19]);
        //  2017 TYD Sales
        createNewCustomFieldData(cfdl, "542", "", row[20]);
        //  BOC Carried
        createNewCustomFieldData(cfdl, "543", "", row[21]);
        //  Sponsorship Information
        createNewCustomFieldData(cfdl, "544", "", row[22]);
        //  Logo Beads
        createNewCustomFieldData(cfdl, "545", "", row[23]);
        //  2017 Dues Collected
        createNewCustomFieldData(cfdl, "546", "", row[24]);
        //  Contract Renewal Date
        createNewCustomFieldData(cfdl, "547", "", row[25]);
        //  2015 Bead Challenge Site
        createNewCustomFieldData(cfdl, "548", "", row[26]);

        //  Received which Program... AND Notes
        setUpReceivedPrograms(cfdl, row[27]);

        //  2017 Training Manual
        //  " Sent? AND " Notes
        setUp2017TrainingManualCustomFieldData(cfdl, row[28]);

        //  2016 Info on Journals & Beads
        //  " Sent? AND " Notes
        setUp2016InfoOnJournalsAndBeadsCustomFieldData(cfdl, row[29]);

        //  2016 Received Journals & Beads
        //  " Received? AND " Notes
        setUp2016ReceivedJournalsAndBeadsInfoCustomFieldData(cfdl, row[30]);

        //  Chronic and Orders More
        //  "? AND " Notes
        setUpChronicAndMoreCustomFieldData(cfdl, row[31]);

        //  TDate Established
        createNewCustomFieldData(cfdl, "557", "", row[32]);
        //  Programs AND Notes
        setUpBOCPrograms(cfdl, new String[]{row[33], row[34], row[35], row[36], row[37], row[38], row[39], row[40], row[41], row[42], row[43], row[44]});
        // END: Set up all custom fields

        return tempAccount;
    }

    /**
     * This method takes the raw string from the Excel cell, tears it apart and
     * extracts the necessary information to give to the Organization account.
     * This does so by first extracting the programs; if this list of programs
     * is empty, then that means that no programs have been received, but there
     * still could be information, so the notes section is populated. Otherwise,
     * the list is sent to a helper method to create new custom field data based
     * on, and the information is put into the notes section for any further
     * clarification.
     *
     * @param cfdl CustomFieldDataList to add new field data is it is warranted
     * @param raw  The raw string containing all information that has yet to be
     *             formatted and split
     */
    private static void setUpReceivedPrograms(CustomFieldDataList cfdl, String raw) {
        String[] programs = extractPrograms(raw);

        if (programs.length == 0 && !raw.isEmpty()) {
            createNewCustomFieldData(cfdl, "550", "", raw);
        } else {
            addCustomFieldForPrograms(cfdl, programs);
            createNewCustomFieldData(cfdl, "550", "", raw);
        }
    }

    /**
     * This method takes the extracted list of programs, and based on which ones
     * are there, creates new custom field data for them.
     *
     * @param cfdl  CustomFieldDataList to add new field data is it is warranted
     * @param progs The list of extracted programs from the raw string
     */
    private static void addCustomFieldForPrograms(CustomFieldDataList cfdl, String[] progs) {
        for (String prog : progs) {
            // ADULT ONCOLOGY
            if (prog.equals(PROGRAMS[0])) {
                createNewCustomFieldData(cfdl, "549", "892", "");
            }
            // BURN
            if (prog.equals(PROGRAMS[1])) {
                createNewCustomFieldData(cfdl, "549", "867", "");
            }
            // CARDIAC
            if (prog.equals(PROGRAMS[2])) {
                createNewCustomFieldData(cfdl, "549", "864", "");
            }
            // CHRONIC
            if (prog.equals(PROGRAMS[3])) {
                createNewCustomFieldData(cfdl, "549", "865", "");
            }
            // HEME/ONC
            if (prog.equals(PROGRAMS[4])) {
                createNewCustomFieldData(cfdl, "549", "866", "");
            }
            // L&D
            if (prog.equals(PROGRAMS[5])) {
                createNewCustomFieldData(cfdl, "549", "869", "");
            }
            // NEURO
            if (prog.equals(PROGRAMS[6])) {
                createNewCustomFieldData(cfdl, "549", "870", "");
            }
            // NICU
            if (prog.equals(PROGRAMS[7])) {
                createNewCustomFieldData(cfdl, "549", "868", "");
            }
            // ONCOLOGY
            if (prog.equals(PROGRAMS[8])) {
                createNewCustomFieldData(cfdl, "549", "891", "");
            }
            // ALL PROGRAMS
            if (prog.equals(PROGRAMS[9])) {
                createNewCustomFieldData(cfdl, "549", "892", "");
                createNewCustomFieldData(cfdl, "549", "867", "");
                createNewCustomFieldData(cfdl, "549", "864", "");
                createNewCustomFieldData(cfdl, "549", "865", "");
                createNewCustomFieldData(cfdl, "549", "866", "");
                createNewCustomFieldData(cfdl, "549", "869", "");
                createNewCustomFieldData(cfdl, "549", "870", "");
                createNewCustomFieldData(cfdl, "549", "868", "");
                createNewCustomFieldData(cfdl, "549", "891", "");
            }

        }
    }

    /**
     * This method extracts the programs that are in the string given, and determines
     * whether or not they have been sent letters. This does so by splitting the string
     * apart a couple of times, and analyzing the resultant strings to determine if the
     * program a) exists, and b) letters has been sent to that specific program.
     *
     * @param raw The raw string of which programs have been sent letters
     *            with possibly more extraneous information.
     * @return A String array of the accepted programs
     */
    private static String[] extractPrograms(String raw) {
        // An array list containing accepted programs
        ArrayList<String> accepted = new ArrayList<>();
        // Split the programs from the raw string
        String[] programs = raw.split(";");

        // Clean up the strings
        for (int i = 0; i < programs.length; i++) {
            programs[i] = programs[i].trim();
        }

        // For each 'Program_Name - <Opt'...
        for (String tuple : programs) {
            // Split by the hyphen
            String[] temp = tuple.split("\\s-\\s");
            // If it is in the correct format
            if (temp.length == 2) {
                // Clean and check the right-half of the tuple
                if (temp[1].toUpperCase().trim().contains("YES")) {
                    // Clean up the left-half of the tuple
                    String prog = pigeonHole(temp[0].toUpperCase().trim());
                    // If the left hand side is in the list of programs
                    if (isInPrograms(prog)) {
                        // If the program isn't already accepted
                        if (!accepted.contains(prog)) {
                            // Add the program
                            accepted.add(prog);
                        }
                    }
                }
            }
        }

        // Return an array version of the array list
        return accepted.toArray(new String[accepted.size()]);
    }

    /**
     * This method takes a string and takes out any unnecessary information
     * from it, and leaves only the program that it contains, run against the
     * list of accepted programs.
     *
     * @param str String that possibly has a program name inside of it
     * @return Returns the cleaned up string that ONLY has the program
     * name
     */
    private static String pigeonHole(String str) {
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < PROGRAMS.length; i++) {
            if (str.contains(PROGRAMS[i])) {
                // A string with 'ONCOLOGY' could also be 'ADULT ONCOLOGY'
                if (PROGRAMS[i].equals("ONCOLOGY")) {
                    if (str.contains("ADULT ONCOLOGY")) {
                        return "ADULT ONCOLOGY";
                    }
                }
                return PROGRAMS[i];
            }
        }

        // something has gone terribly wrong
        return null;
    }

    /**
     * This helper method checks the PROGRAMS array if the string
     * given is contained in it.
     *
     * @param str String containing the current possible program
     * @return True if string is in program list, false if not
     */
    private static boolean isInPrograms(String str) {
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < PROGRAMS.length; i++) {
            if (PROGRAMS[i].equals(str)) {
                return true;
            }
        }
        return false;
    }


    /**
     * This method takes the fields that contain program information and adds
     * them to custom field datat if they are not empty. Their information is also
     * put into the notes section.
     *
     * @param cfdl   CustomFieldDataList to add new field data is it is warranted
     * @param fields The fields (33 - 44) that contain program information
     */
    private static void setUpBOCPrograms(CustomFieldDataList cfdl, String[] fields) {
        StringBuilder notes = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            if (!fields[i].isEmpty()) {
                createNewCustomFieldData(cfdl, "558", "" + (877 + i), "");
                notes.append(fields[i]);
            }
        }

        if (notes.length() > 0) {
            createNewCustomFieldData(cfdl, "559", "", notes.toString());
        }
    }

    /**
     * This method is really just used for the extra information, so if the string is not empty,
     * it send 'yes' as an option, and populates the notes section. Otherwise, it just sends a 'no'
     * option.
     *
     * @param cfdl CustomFieldDataList to add new field data is it is warranted
     * @param str  String containing information on whether or not a hospital using
     *             the Chronic program as well as other programs
     */
    private static void setUpChronicAndMoreCustomFieldData(CustomFieldDataList cfdl, String str) {
        if (str.isEmpty()) {
            createNewCustomFieldData(cfdl, "561", "890", "");
        } else {
            createNewCustomFieldData(cfdl, "561", "889", "");
            createNewCustomFieldData(cfdl, "562", "", str);
        }
    }

    /**
     * This method sets up the custom field data packets based on the information stored in the
     * string str. If it is empty, the no option is selected; in other words, the Excel cell did
     * not have any data, meaning that the manual was NOT sent. If the string contains the string
     * 'yes', then the option is selected, the notes section is filled, and the custom field data
     * is sent. If it doesn't contain 'yes', but it still has information, then the text
     * obviously has something important, so the text box is filled, and the 'no' option is
     * selected.
     *
     * @param cfdl CustomFieldDataList to add new field data is it is warranted
     * @param str  String containing information on the sent status of the 2017 Training Manual
     */
    private static void setUp2017TrainingManualCustomFieldData(CustomFieldDataList cfdl, String str) {
        if (str.isEmpty()) {
            createNewCustomFieldData(cfdl, "551", "872", "");
        } else if (str.contains("yes")) {
            createNewCustomFieldData(cfdl, "551", "871", "");
        } else if (!str.contains("yes")) {
            createNewCustomFieldData(cfdl, "551", "871", "");
            createNewCustomFieldData(cfdl, "552", "", str);
        }
    }

    /**
     * This method sets up the custom field data for the information on received journals and beads
     * information. If it is empty, then it means that no info was received, and it
     * is checked in the custom field data. Otherwise, if the information contains the string 'NA',
     * then neither yes or no is checked, but the string is sent to the notes section. Otherwise,
     * yes is checked, and notes section is populated.
     *
     * @param cfdl CustomFieldDataList to add new field data is it is warranted
     * @param str  String containing information on receiving journals and beads information
     */
    private static void setUp2016ReceivedJournalsAndBeadsInfoCustomFieldData(CustomFieldDataList cfdl, String str) {
        if (str.isEmpty()) {
            createNewCustomFieldData(cfdl, "555", "876", "");
        } else {
            if (str.equals("NA")) {
                createNewCustomFieldData(cfdl, "556", "", str);
            } else {
                createNewCustomFieldData(cfdl, "555", "875", "");
                createNewCustomFieldData(cfdl, "556", "", str);
            }
        }
    }

    /**
     * This method takes the info on journals and beads and creates a new custom field data packet
     * depending on the information. If it is empty, then it means that no info was sent, and it
     * is checked in the custom field data. Otherwise, if the information contains the string 'NA',
     * then neither yes or no is checked, but the string is sent to the notes section. Otherwise,
     * yes is checked, and notes is populated.
     *
     * @param cfdl CustomFieldDataList to add new field data is it is warranted
     * @param str  String containing information on journals and beads
     */
    private static void setUp2016InfoOnJournalsAndBeadsCustomFieldData(CustomFieldDataList cfdl, String str) {
        if (str.isEmpty()) {
            createNewCustomFieldData(cfdl, "553", "874", "");
        } else {
            if (str.equals("NA")) {
                createNewCustomFieldData(cfdl, "554", "", str);
            } else {
                createNewCustomFieldData(cfdl, "553", "873", "");
                createNewCustomFieldData(cfdl, "554", "", str);
            }
        }
    }

    /**
     * This method creates a new custom field data depending on whether or not there
     * is data in the strings magnet, cmn, and hfc. The Excel spreadsheet is set up
     * such that if there is any information, then it is that hospital type.
     *
     * @param cfdl   CustomFieldDataList to add new field data is it is warranted
     * @param magnet String containing whether or not a Hospital is a Magnet
     * @param cmn    String containing whether or not a Hospital is a CMN
     * @param hfc    String containing whether or not a Hospital is an HFC
     */
    private static void setUpHospitalTypesCustomFieldData(CustomFieldDataList cfdl, String magnet, String cmn, String hfc) {
        if (!magnet.isEmpty()) {
            createNewCustomFieldData(cfdl, "526", "839", "");
        }
        if (!cmn.isEmpty()) {
            createNewCustomFieldData(cfdl, "526", "840", "");
        }
        if (!hfc.isEmpty()) {
            createNewCustomFieldData(cfdl, "526", "841", "");
        }
    }

    /**
     * This method creates new custom field data to be added to the
     * CustomFieldDataList is the data is correct. If the length of the information given is
     * greater than 1024 - the max length in a Multi-Line Text entry -, then the string
     * is split into two and creates the necessary field data packets.
     *
     * @param cfdl CustomFieldDataList to add new field data is it is warranted
     * @param raw  The raw string containing the BOC Site Coordinator information
     */
    private static void setUpBOCSiteCoordCustomFieldData(CustomFieldDataList cfdl, String raw) {
        if (raw.length() >= 1024) {
            String first_half = raw.substring(0, 1016).concat(" (cont.)");
            String second_half = raw.substring(1016);

            createNewCustomFieldData(cfdl, "536", "", first_half);
            createNewCustomFieldData(cfdl, "560", "", second_half);
        } else {
            createNewCustomFieldData(cfdl, "536", "", raw);
        }
    }

    /**
     * This method takes in a raw format hospital region and spits
     * back the correct option id for it. Otherwise, the string is empty
     * and no option is selected.
     *
     * @param str The raw format of a hospital's region
     * @return Returns the correct option id for the given region
     */
    private static String getRegionFieldOptId(String str) {
        str = str.toLowerCase().trim();
        String option_id = "";
        switch (str) {
            case "northeast":
                option_id = "857";
                break;
            case "southeast":
                option_id = "859";
                break;
            case "midwest":
                option_id = "860";
                break;
            case "mid-atlantic":
                option_id = "858";
                break;
            case "rocky mountain west":
                option_id = "861";
                break;
            case "great plains":
                option_id = "862";
                break;
            case "pacific coast, alaska & hawaii":
                option_id = "863";
                break;
        }
        return option_id;
    }


    /**
     * This method creates and returns a custom fields response. This lists all of the custom fields
     * tied to an Account in order to find out their IDs and option IDs. This information is then
     * referenced to set up Organization accounts to be sent to Neon.
     *
     * @param ss        Web service to connect to Neon using the WSDL and Service Name to make requests, etc.
     * @param sessionID Current session ID
     * @return A custom fields request
     */
    private static ListCustomFieldsResponse createCustomFieldsResponse(Neonws ss, String sessionID) {
        // open a custom fields request
        ListCustomFieldsRequest customFieldsRequest = new ListCustomFieldsRequest();
        // sets up a custom field search criteria
        CustomFieldSearchCriteria searchCriteria = new CustomFieldSearchCriteria();
        // sets search criteria to all accounts
        searchCriteria.setComponent(Component.ACCOUNT);

        // set search criteria to custom fields request
        customFieldsRequest.setSearchCriteria(searchCriteria);
        customFieldsRequest.setUserSessionId(sessionID);

        // List the custom fields
        return ss.getCommonPort().listCustomFields(customFieldsRequest);
    }

    /**
     * This method consolidates the Organization Account being constructed, and
     * sends it to Neon; SUCCESS if successful, ERROR if not.
     *
     * @param request             The request made to create an Organization Account to Neon
     * @param organizationAccount The Organization Account itself, populated with
     *                            all custom information
     * @param sessionID           The current session ID
     * @param port                The AccountService port to send the CreateOrganizationAccountRequest
     */
    private static void sendAndCreateOrganizationAccount(CreateOrganizationAccountRequest request, OrganizationAccount organizationAccount, String sessionID, AccountService port) {
        // Plug in the Organization Account to the request
        request.setOrganizationAccount(organizationAccount);
        // Plug in the current session id to the request
        request.setUserSessionId(sessionID);
        // Get the response from the request made through the port
        CreateOrganizationAccountResponse response = port.createOrganizationAccount(request);

        // If the response did not encounter some freak of nature...
        if (response != null) {
            System.out.println(response.getOperationResult().toString());

            // If the Organization Account creation request was successful...
            if (OperationResult.SUCCESS.equals(response.getOperationResult())) {
                // Print out the Account ID of the new Organization Account
                System.out.println(response.getAccountId());
            } else {
                // Organization account creation request was no successful...
                ErrorList errorList = response.getErrors();
                List<com.z2systems.schemas.common.Error> errors = errorList.getError();
                for (com.z2systems.schemas.common.Error err : errors) {
                    System.out.println(err.getErrorCode());
                    System.out.println(err.getErrorMessage());
                }
            }
        }
    }

    /**
     * This method prints out the custom fields for any Account.
     * This is mainly for the purposes of discovering custom field
     * IDs for automated entry purposes described in this package.
     *
     * @param cfr The response from the ListCustomFieldsRequest
     */
    private static void printCustomFields(ListCustomFieldsResponse cfr) {
        // Set up a list of custom fields
        CustomFieldList fieldList = null;

        // Grab the custom fields if cfr isn't null
        if (cfr != null) {
            fieldList = cfr.getCustomFields();
            System.out.println(cfr.getResponseMessage());
            System.out.println(cfr.getOperationResult());
        } else {
            System.out.println("ERROR: CustomFieldsResponse is null.");
        }

        // If the list of fields isn't null...
        if (fieldList != null) {
            // Convert it to a List of CustomFields
            List<CustomField> customFieldList = fieldList.getCustomField();

            // Sort of custom fields by field ID
            //noinspection Convert2Lambda
            Collections.sort(customFieldList, new Comparator<CustomField>() {
                @Override
                public int compare(CustomField cf1, CustomField cf2) {
                    return (int) cf1.getFieldId() - (int) cf2.getFieldId();
                }
            });

            // For each field within the list...
            for (CustomField field : customFieldList) {
                System.out.println("-------------------------------");
                // Get the field name
                System.out.println("Field name: " + field.getFieldName());
                // Get the field code
                System.out.println("Field code: " + field.getCode());

                // Get the field option(s)
                System.out.println("Field options: ");
                FieldOptionList fieldOptionList = field.getFieldOptions();
                if (fieldOptionList != null) {
                    // WARNING: getFieldOption returns a LIVE version of the list;
                    //          any changes made WILL change the version in Neon.
                    //          DO NOT ALTER THIS LIST.
                    List<IdNamePair> optionList = fieldOptionList.getFieldOption();
                    if (optionList != null) {
                        for (IdNamePair optionItem : optionList) {
                            System.out.println("\tName: " + optionItem.getName());
                            System.out.println("\t\tID:   " + optionItem.getId());
                        }
                    } else {
                        System.out.println("\tNo field options.");
                    }
                }

                // Get the field components
                System.out.println("Field component: " + field.getComponent());
                // Get the field data type
                System.out.println("Field data type: " + field.getDataType());
                // Get the field ID
                System.out.println("Field ID: " + field.getFieldId());
                System.out.println("-------------------------------");
                System.out.println();
            }
        } else {
            System.out.println("ERROR: fieldList is null.");
        }
    }

    /**
     * This method creates a test dummy organization account in order to
     * test the custom fields and make sure they all transfer over to Neon.
     *
     * @return a test organization account with all custom fields filled
     */
    private static OrganizationAccount getTestOrganizationAccount() {
        OrganizationAccount orgAccount = new OrganizationAccount();
        // Set organization name
        orgAccount.setOrganizationName("TEST_ORGANIZATION");

        // BEGIN: Construct Primary contact
        Contact contact = new Contact();
        contact.setFirstName("TEST");
        contact.setLastName("TESTERSON");
        contact.setPrefix("Mr.");

        // Set up gender field
        CodeNamePair gender = new CodeNamePair();
        gender.setCode("M");
        contact.setGender(gender);

        // Set up address field(s)
        Address addr = new Address();
        addr.setIsPrimaryAddress(Boolean.TRUE);
        addr.setIsShippingAddress(Boolean.FALSE);

        addr.setAddressLine1("123 Test Lane");
        addr.setCity("Tucson");

        CodeNamePair state = new CodeNamePair();
        state.setCode("AZ");
        addr.setState(state);

        IdNamePair country = new IdNamePair();
        country.setId("1");
        addr.setCountry(country);

        addr.setZipCode("85745");

        AddressList addrList = new AddressList();
        addrList.getAddress().add(addr);
        contact.setAddresses(addrList);
        orgAccount.setPrimaryContact(contact);
        // END: Construct Primary contact

        // START: Set up all custom fields
        CustomFieldDataList customFieldDataList = new CustomFieldDataList();

        //  Parent/Guardian Information
        //  Parent/Guardian First Name
        createNewCustomFieldData(customFieldDataList, "87", "", "PARENT_FIRST_TEST");
        //  Parent/Guardian Last Name
        createNewCustomFieldData(customFieldDataList, "88", "", "PARENT_LAST_TEST");

        //  Other Information
        //  Newsletter Preference
        createNewCustomFieldData(customFieldDataList, "77", "9", "");
        //  How did you hear about Beads of Courage?
        createNewCustomFieldData(customFieldDataList, "78", "170", "");

        //  Member Information
        //  Participating Program
        createNewCustomFieldData(customFieldDataList, "86", "162", "");
        //  Where do you receive your Beads of Courage
        createNewCustomFieldData(customFieldDataList, "96", "176", "");
        //  Notes/Comments
        createNewCustomFieldData(customFieldDataList, "95", "", "TESTING: Should be notes/comments");
        //  Member Hospital
        createNewCustomFieldData(customFieldDataList, "121", "335", "");
        //  If at a Member Hospital, which one?
        createNewCustomFieldData(customFieldDataList, "115", "", "TESTING: Should be if at a...");

        //  Beads from a Distance Member Information
        //  Tell us about yourself...
        createNewCustomFieldData(customFieldDataList, "92", "", "TESTING: Should be tell us about...");
        //  Where is your child...
        createNewCustomFieldData(customFieldDataList, "93", "", "TESTING: Should be where is...");
        //  Primary Specialist
        createNewCustomFieldData(customFieldDataList, "94", "", "TESTING: Should be primary...");

        //  Hospital Type
        //  Types
        createNewCustomFieldData(customFieldDataList, "526", "839", "");

        //  Hospital & Program Information and Supply Check
        //  Region
        createNewCustomFieldData(customFieldDataList, "528", "860", "");
        //  Introduction Sent?
        createNewCustomFieldData(customFieldDataList, "529", "", "TESTING: Should be introduction sent");
        //  Information Verification Date & Notes with Hospital
        createNewCustomFieldData(customFieldDataList, "530", "", "TESTING: Should be Info Veri Date...");
        //  Supply check
        createNewCustomFieldData(customFieldDataList, "531", "", "TESTING: Should be supply check");
        //  Program Notes
        createNewCustomFieldData(customFieldDataList, "532", "", "TESTING: Should be program notes");
        //  Community Ambassador
        createNewCustomFieldData(customFieldDataList, "533", "", "TESTING: Should be community ambassador");
        //  Wood Turner Bowls
        createNewCustomFieldData(customFieldDataList, "534", "", "TESTING: Should be wood turner bowls");
        //  2017 Hospital Program Applications Sent?
        createNewCustomFieldData(customFieldDataList, "535", "", "TESTING: Should be 2017 hospital program applications sent");
        //  BOC Site Coordinator Assigned to Program
        createNewCustomFieldData(customFieldDataList, "536", "", "TESTING: Should be BOC site coord...");

        //  Hospital Payment Information
        //  Who Pays
        createNewCustomFieldData(customFieldDataList, "537", "", "TESTING: who pays");
        //  Payment Terms
        createNewCustomFieldData(customFieldDataList, "538", "", "TESTING: payment terms");
        //  Shipping Address
        createNewCustomFieldData(customFieldDataList, "539", "", "TESTING: shipping address");
        //  2015 TYD Sales
        createNewCustomFieldData(customFieldDataList, "540", "", "TESTING: 2015 TYD sales");
        //  2016 TYD Sales
        createNewCustomFieldData(customFieldDataList, "541", "", "TESTING: 2016 TYD sales");
        //  2017 TYD Sales
        createNewCustomFieldData(customFieldDataList, "542", "", "TESTING: 2017 TYD sales");
        //  BOC Carried
        createNewCustomFieldData(customFieldDataList, "543", "", "TESTING: BOC carried");
        //  Sponsorship Information
        createNewCustomFieldData(customFieldDataList, "544", "", "TESTING: sponsorship info");
        //  Logo Beads
        createNewCustomFieldData(customFieldDataList, "545", "", "TESTING: logo beads");
        //  2017 Dues Collected
        createNewCustomFieldData(customFieldDataList, "546", "", "TESTING: 2017 dues collected");
        //  Contract Renewal Date
        createNewCustomFieldData(customFieldDataList, "547", "", "TESTING: contract renewal date");
        //  2015 Bead Challenge Site
        createNewCustomFieldData(customFieldDataList, "548", "", "TESTING: 2015 bead challenge site");

        //  Received New Letters
        //  Received which Program...
        createNewCustomFieldData(customFieldDataList, "549", "870", "");
        //  Program Information Letters Notes
        createNewCustomFieldData(customFieldDataList, "550", "", "TESTING: should be program info letters notes");

        //  2017 Training Manual
        //  " Sent?
        createNewCustomFieldData(customFieldDataList, "551", "872", "");
        //  " Notes
        createNewCustomFieldData(customFieldDataList, "552", "", "TESTING: should be 2016 info notes");

        //  2016 Info on Journals & Beads
        //  " Sent?
        createNewCustomFieldData(customFieldDataList, "553", "874", "");
        //  " Notes
        createNewCustomFieldData(customFieldDataList, "554", "", "TESTING: should be 2016 info notes");

        //  2016 Received Journals & Beads
        //  " Received?
        createNewCustomFieldData(customFieldDataList, "555", "876", "");
        //  " Notes
        createNewCustomFieldData(customFieldDataList, "556", "", "TESTING: should be 2016 received ... notes");

        //  Beads of Courage Program
        //  Date Established
        createNewCustomFieldData(customFieldDataList, "557", "", "TESTING: should be date established");
        //  Programs
        createNewCustomFieldData(customFieldDataList, "558", "888", "");
        //  " Notes
        createNewCustomFieldData(customFieldDataList, "559", "", "TESTING: should be BOC program notes");
        // END: Set up all custom fields

        orgAccount.setCustomFieldDataList(customFieldDataList);
        return orgAccount;
    }

    /**
     * This method is a quick packaging of a CustomFieldData object, setting its fields and adding it to the
     * custom field data list. Simple error check at the end to make sure it was added correctly.
     *
     * @param fieldDataList The CustomFieldDataList that is being added to
     * @param fieldId       The custom field id
     * @param fieldOptId    The custom field option id
     * @param fieldVal      The custom field value
     */
    private static void createNewCustomFieldData(CustomFieldDataList fieldDataList, String fieldId, String fieldOptId, String fieldVal) {
        CustomFieldData customFieldData = new CustomFieldData();
        customFieldData.setFieldId(fieldId);
        customFieldData.setFieldOptionId(fieldOptId);
        customFieldData.setFieldValue(fieldVal);

        boolean add = fieldDataList.getCustomFieldData().add(customFieldData);
        if (!add) {
            System.out.println("ERROR: Problem adding fieldId: " + fieldId + "!");
        }
    }
}