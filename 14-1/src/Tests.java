import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;

public class Tests {
    public static void main(String[] args) {
        List<Integer> firstList = asList(2, 3, 3, 5, 5, 6, 7, 7, 8, 12);
        List<Integer> secondList = asList(5, 5, 6, 7, 7, 9, 10, 10);

        IntersectionFinder intersectionFinder = new IntersectionFinder();

        Set<Integer> intersection = intersectionFinder.getIntersection(firstList, secondList);

        System.out.println(intersection);
    }
}
