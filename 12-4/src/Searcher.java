import java.util.List;

import static java.lang.Integer.min;

public class Searcher {
    public int findMin(List<Integer> a) {
        if (a.size() == 1) {
            return a.get(0);
        }

        if (a.get(0) < a.get(a.size() - 1)) {
            return a.get(0);
        }

        return min(
                findMin(a.subList(0, a.size() / 2)),
                findMin(a.subList(a.size() / 2, a.size()))
        );
    }
}
