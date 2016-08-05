import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class PhoneUtils {
    static Map<String, List<String>> mappings;

    static {
        mappings = new HashMap<>();
        mappings.put("2", asList("A", "B", "C"));
        mappings.put("3", asList("D", "E", "F"));
        mappings.put("4", asList("G", "H", "I"));
        mappings.put("5", asList("J", "K", "L"));
        mappings.put("6", asList("M", "N", "O"));
        mappings.put("7", asList("P", "Q", "R", "S"));
        mappings.put("8", asList("T", "U", "V"));
        mappings.put("9", asList("W", "X", "Y", "Z"));
    }

    public List<String> findAcronyms(String phoneNumber) {
        List<String> digits = asList(phoneNumber.split(""));

        return findAcronymsHelper(digits, "");
    }

    public List<String> findAcronymsHelper(List<String> digits, String s) {
        if (digits.size() == 0) {
            return asList(s);
        }

        ArrayList<String> strings = new ArrayList<>();

        List<String> letters = mappings.get(digits.get(0));

        for (int i = 0; i < letters.size(); ++i) {
            strings.addAll(
                    findAcronymsHelper(digits.subList(1, digits.size()), s + letters.get(i))
            );
        }

        return strings;
    }
}
