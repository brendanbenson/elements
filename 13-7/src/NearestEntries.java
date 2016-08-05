import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NearestEntries {
    public int find(List<String> paragraph) {
        Map<String, List<Integer>> m = new HashMap<>();

        for (int i = 0; i < paragraph.size(); ++i) {
            String word = paragraph.get(i);
            m.putIfAbsent(word, new ArrayList<>());
            List<Integer> indexes = m.get(word);
            indexes.add(i);
        }

        int min = Integer.MAX_VALUE;

        for (Map.Entry<String, List<Integer>> e : m.entrySet()) {
            List<Integer> freqs = e.getValue();
            if (freqs.size() > 1) {
                for (int i = 1; i < freqs.size(); ++i) {
                    int diff = freqs.get(i) - freqs.get(i - 1);
                    if (diff < min) {
                        min = diff;
                    }
                }
            }
        }

        return min;
    }
}
