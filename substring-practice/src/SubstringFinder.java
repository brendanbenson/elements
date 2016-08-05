import java.util.HashSet;
import java.util.Set;

public class SubstringFinder {
    public String maxSubstring(String s) {
        int start = 0;
        int end = 0;
        Set<Character> seenChars = new HashSet<>();

        for(int i = 0; i < s.length(); ++i) {
            char currentChar = s.charAt(i);

            if (seenChars.contains(currentChar)) {

            } else {
                start++;
            }
        }

        return s.substring(start, end);
    }
}
