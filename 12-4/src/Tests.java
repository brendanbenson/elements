import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        Searcher searcher = new Searcher();

        assertEqual(
                searcher.findMin(
                        asList(378, 478, 550, 631, 103, 203, 220, 234, 279, 368)
                ),
                103
        );

        assertEqual(
                searcher.findMin(
                        asList(378, 478, 550, 631, 632, 103, 203, 220, 234, 279, 368)
                ),
                103
        );

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<Integer> sub = integers.subList(0, 2);

        System.out.println(integers);
        System.out.println(sub);


        sub.add(0, 99);

        System.out.println(integers);
        System.out.println(sub);
    }
}
