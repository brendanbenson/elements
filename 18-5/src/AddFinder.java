import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.sort;

public class AddFinder {
    private Map<Integer, Boolean> memoizedTwoSums = new HashMap<>();

    public Boolean hasThreeSum(List<Integer> a, int t) {
        sort(a);

        for (Integer i : a) {
            if (hasTwoSum(a, t - i)) {
                return true;
            }
        }

        return false;
    }

    private Boolean hasTwoSum(List<Integer> a, int t) {
        if (memoizedTwoSums.containsKey(t)) {
            return memoizedTwoSums.get(t);
        }

        for (Integer i : a) {
            if (a.contains(t - i)) {
                memoizedTwoSums.put(t, true);
                return true;
            }
        }

        memoizedTwoSums.put(t, false);
        return false;
    }

}
