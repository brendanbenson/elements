import java.util.HashMap;
import java.util.Map;

public class AnonymousLetter {
    public Boolean canWrite(String letter, String magazine) {
        Map<String, Integer> letterMap = new HashMap<>();

        String[] letterChars = letter.split("");
        String[] magazineChars = magazine.split("");

        for (String theChar : letterChars) {
            Integer charCount = letterMap.get(theChar);
            letterMap.put(theChar, charCount == null ? 1 : charCount + 1);
        }

        for (String theChar : magazineChars) {
            Integer letterCount = letterMap.get(theChar);

            if (letterCount != null) {
                if (letterCount - 1 < 0) {
                    return false;
                }
                letterMap.put(theChar, letterCount - 1);
            }
        }

        return true;
    }
}
