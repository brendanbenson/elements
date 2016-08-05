import java.util.List;

import static testutils.TestUtils.assertTrue;

public class Tests {
    public static void main(String[] args) throws Exception {
        PhoneUtils phoneUtils = new PhoneUtils();

        String phoneNumber = "2276696";
        List<String> l = phoneUtils.findAcronyms(phoneNumber);

        assertTrue(l.contains("ACRONYM"));
        assertTrue(l.contains("ABPOMZN"));
    }
}
