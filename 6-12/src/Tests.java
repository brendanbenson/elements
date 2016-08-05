import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Tests {
    public static void main(String[] args) {
        SubsetFinder subsetFinder = new SubsetFinder(new Random());

        List<Integer> a = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        int size = 3;
        subsetFinder.randomSubset(size, a);

        System.out.println(a.subList(0, size));
    }
}
