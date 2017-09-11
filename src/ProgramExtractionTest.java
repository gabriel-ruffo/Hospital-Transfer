import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author:  Gabriel Ruffo
 * Date:    5/31/2017
 * Purpose:
 */
class ProgramExtractionTest {

    private static final String[] PROGRAMS = {"ADULT ONCOLOGY", "BURN", "CARDIAC", "CHRONIC", "HEME/ONC",
            "L&D", "NEURO", "NICU", "ONCOLOGY", "ALL PROGRAMS"};

    private String[] extractPrograms(String raw) {
        ArrayList<String> accepted = new ArrayList<>();
        String[] programs = raw.split(";");

        for (int i = 0; i < programs.length; i++) {
            programs[i] = programs[i].trim();
        }

        for (String tuple : programs) {
            String[] temp = tuple.split("\\s-\\s");
            if (temp.length == 2) {
                if (temp[1].toUpperCase().trim().contains("YES")) {
                    String prog = pigeonHole(temp[0].toUpperCase().trim());
                    if (isInPrograms(prog)) {
                        if (!accepted.contains(prog)) {
                            accepted.add(prog);
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(accepted.toArray(new String[accepted.size()])));
        return accepted.toArray(new String[accepted.size()]);
    }

    private String pigeonHole(String str) {
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < PROGRAMS.length; i++) {
            if (str.contains(PROGRAMS[i])) {
                if (PROGRAMS[i].equals("ONCOLOGY")) {
                    if (str.contains("ADULT ONCOLOGY")) {
                        return "ADULT ONCOLOGY";
                    }
                }
                return PROGRAMS[i];
            }
        }
        return null;
    }

    private boolean isInPrograms(String str) {
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < PROGRAMS.length; i++) {
            if (PROGRAMS[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Test
    void testSinglePrograms() {
        String[] prog = extractPrograms("Chronic - YES");
        assertEquals(1, prog.length);
        assertEquals("CHRONIC", prog[0]);

        String[] prog2 = extractPrograms("L&D - YES (6/24/15)");
        assertEquals(1, prog2.length);
        assertEquals("L&D", prog2[0]);

        String[] prog3 = extractPrograms("Burn - YES");
        assertEquals(1, prog3.length);

        String[] corner = extractPrograms("NO");
        assertEquals(0, corner.length);
    }

    @Test
    void testExtractProgramsSimple() {
        String[] progs_1 = extractPrograms("Cardiac - YES; Chronic - YES; HEME/ONC - YES; Burn - YES");
        assertEquals(4, progs_1.length);
        assertEquals("CARDIAC", progs_1[0]);
        assertEquals("CHRONIC", progs_1[1]);
        assertEquals("HEME/ONC", progs_1[2]);
        assertEquals("BURN", progs_1[3]);

        String[] progs_2 = extractPrograms("NICU - YES; Cardiac - NO; Chronic - NO; HEME/ONC - NO");
        assertEquals(1, progs_2.length);
        assertEquals("NICU", progs_2[0]);

        String[] progs_3 = extractPrograms("HEME/ONC- NO; Cardiac- NO; Chronic- NO");
        assertEquals(0, progs_3.length);

        String[] progs_4 = extractPrograms("CARDIAC - NO; ONCOLOGY - NO; ADULT ONCOLOGY - YES");
        assertEquals(1, progs_4.length);
        assertEquals("ADULT ONCOLOGY", progs_4[0]);

        String[] progs_5 = extractPrograms("HEME/ONC - NO; Neuro - YES");
        assertEquals(1, progs_5.length);
        assertEquals("NEURO", progs_5[0]);

        String[] progs_6 = extractPrograms("All Programs - YES");
        assertEquals(1, progs_6.length);
        assertEquals("ALL PROGRAMS", progs_6[0]);
    }

    @Test
    void testExtractProgramsMedium() {
        String[] progs_1 = extractPrograms("no, small program, Carlos talked to them 7.19.16 and will stay on old style for now");
        assertEquals(0, progs_1.length);

        String[] prog2 = extractPrograms("Chronic - YES (11/23/2016)\n" +
                "returned old letters Feb 2017");
        assertEquals(1, prog2.length);
        assertEquals("CHRONIC", prog2[0]);

        String[] prog3 = extractPrograms("HEME/ONC - YES (talked to staff about updating letters)");
        assertEquals(1, prog3.length);
        assertEquals("HEME/ONC", prog3[0]);
    }

    @Test
    void testExtractProgramsHard() {
        String[] progs_1 = extractPrograms("H/O 2015; HEME/ONC - YES; NICU - YES; Cardiac - YES; Chronic - NO " +
                "(has a lot of old left 8.10.16, BM waiting to see if they will replace anyway or wait until they " +
                "run out of more old--told her     when she orders again, she should order all new)");

        assertEquals(3, progs_1.length);
        assertEquals("HEME/ONC", progs_1[0]);
        assertEquals("NICU", progs_1[1]);
        assertEquals("CARDIAC", progs_1[2]);

        String[] progs_2 = extractPrograms("Heme/Onc - NO (Ashley said she wants to exchange HO     letters for new)");
        assertEquals(0, progs_2.length);

        String[] progs_3 = extractPrograms("NICU - YES; HEME/ONC - YES; Cardiac - YES; Chronic (Neurosurgery) - " +
                "YES; Chronic (CF) - NO; Chronic (GI) - NO; Chronic (Organ) - YES");
        assertEquals(4, progs_3.length);
        assertEquals("NICU", progs_3[0]);
        assertEquals("HEME/ONC", progs_3[1]);
        assertEquals("CARDIAC", progs_3[2]);
        assertEquals("CHRONIC", progs_3[3]);
    }

    @Test
    void testIsntInPrograms() {
        String[] progs = extractPrograms("NICA - YES");
        assertEquals(0, progs.length);
    }
}