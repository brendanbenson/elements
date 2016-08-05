import java.util.HashMap;
import java.util.Map;

public class Permutor {
    public boolean isPermutable(String s) {
        Map<Character, Integer> m = new HashMap<>();

        for (Character a : s.toCharArray()) {
            m.put(a, m.getOrDefault(a, 0) + 1);
        }

        boolean singleSeen = false;

        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            if (e.getValue() % 2 == 1 && singleSeen) {
                return false;
            }

            if (e.getValue() % 2 == 1 && !singleSeen) {
                singleSeen = true;
            }
        }

        return true;
    }
}
