import java.util.List;

import static java.util.Arrays.asList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        ScoreFinder scoreFinder = new ScoreFinder();

        List<Integer> individualPlayScores = asList(2, 3, 7);

        assertEqual(scoreFinder.findCombinations(12, individualPlayScores), 4);
        assertEqual(scoreFinder.findCombinations(10000000, individualPlayScores), 771678056);
    }
}
