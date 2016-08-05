import java.util.List;

import static java.util.Arrays.asList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        List<Integer> prices = asList(310, 315, 275, 295, 260, 270, 290, 230, 255, 250);

        StockCalculator stockCalculator = new StockCalculator();

        assertEqual(stockCalculator.maxProfit(prices), 30);
    }
}
