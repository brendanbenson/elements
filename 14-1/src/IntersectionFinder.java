import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionFinder {
    public Set<Integer> getIntersection(List<Integer> l1, List<Integer> l2) {
        Set<Integer> set = new HashSet<>();
        Integer c1 = 0;
        Integer c2 = 0;

        while (c1 < l1.size() && c2 < l2.size()) {
            Integer i1 = l1.get(c1);
            Integer i2 = l2.get(c2);

            if (i1 == i2) {
                set.add(i1);
                c1 += 1;
                c2 += 1;
            }

            if (i1 < i2) {
                c1 += 1;
            }

            if (i1 > i2) {
                c2 += 1;
            }
        }

        return set;
    }
}
