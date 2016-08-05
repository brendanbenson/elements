import java.util.*;

public class AnagramPartitioner {

    public List<List<String>> partition(List<String> strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }

            map.get(sortedString).add(s);
        }

        Set<String> keySet = map.keySet();
        List<List<String>> list = new ArrayList<>();

        for (String key : keySet) {
            List<String> val = map.get(key);
            if (val.size() > 1) {
                list.add(val);
            }
        }

        return list;
    }
}
