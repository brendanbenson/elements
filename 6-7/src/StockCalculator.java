import java.util.List;

public class StockCalculator {
    public Integer maxProfit(List<Integer> prices) {
        Integer maxPrice = 0;
        Integer minPrice = Integer.MAX_VALUE;

        for (Integer price : prices) {
            maxPrice = Math.max(maxPrice, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }

        return maxPrice;
    }
}
