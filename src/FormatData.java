import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Gabriel Ruffo on 5/24/2017.
 * Purpose: To import the hospital information and insert it into a 2D array.
 * Note:    Information starts and ends at all_info[1][1] ... [154][45]; don't
 *          ask me why.
 */
class FormatData {
    private static final int NUMBER_OF_HOSPITALS = 155;
    private static final int NUMBER_OF_FIELDS = 46;

    /**
     * This method takes in the raw .txt file of all the hospitals'
     * information, and stores it into a 2D array. This does so by
     * simply using a Scanner on the file and a delimiter of the
     * end of file character to put the entire contents into one
     * string. This string is then split two more times to access
     * the rows and fields, which are stored in the 2D array.
     *
     * @return A 2D array containing all of the hospital information
     */
    static String[][] getHospitalInfo() {
        // set up raw_content string
        String raw_content = "";
        try {
            // get contents of New_Info.txt and put it into raw_content
            raw_content = new Scanner(new File("src/hospital_info.txt")).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // set up a 2d array to hold all of the hospitals' information
        // probably could get away with an ArrayList of arrays...
        String[][] all_info = new String[NUMBER_OF_HOSPITALS][NUMBER_OF_FIELDS];
        // split the string on the beginning character of each row, '^'
        String[] rows = raw_content.split("\\^");

        // populate the 2d array
        int row_count = 0;
        int col_count;
        for (String row : rows) {
            // split the fields
            String[] fields = row.split(">>");
            col_count = 0;
            for (String field : fields) {
                // add each field into the 2d array
                all_info[row_count][col_count] = field;
                col_count++;
            }
            row_count++;
        }

        return all_info;
    }


}
