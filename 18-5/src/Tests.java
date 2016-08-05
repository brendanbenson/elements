import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static testutils.TestUtils.assertFalse;
import static testutils.TestUtils.assertTrue;

public class Tests {
    public static void main(String[] args) throws Exception {
        AddFinder addFinder = new AddFinder();

        List<Integer> factors = new ArrayList<>(asList(11, 2, 5, 3, 7));

        for (int i = 0; i < 10000; ++i) {
            factors.add(0, 2);
        }

        assertTrue(addFinder.hasThreeSum(factors, 21));
        assertFalse(addFinder.hasThreeSum(factors, 22));
    }
}
