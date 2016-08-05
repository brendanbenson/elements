import java.util.List;

import static java.util.Arrays.asList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        NearestEntries nearestEntries = new NearestEntries();

        List<String> paragraph = asList("All work and no play makes for no work no fun and no results".split(" "));

        assertEqual(nearestEntries.find(paragraph), 2);
    }
}
