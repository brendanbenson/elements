import testutils.TestUtils;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Tests {
    public static void main(String[] args) throws Exception {
        MergeSort mergeSort = new MergeSort();

        List<Integer> firstList = new ArrayList<>(8);
        firstList.add(5);
        firstList.add(13);
        firstList.add(17);
        firstList.add(0);
        firstList.add(0);
        firstList.add(0);
        firstList.add(0);
        firstList.add(0);

        int m = 3;


        List<Integer> secondList = new ArrayList<>(4);
        secondList.add(3);
        secondList.add(7);
        secondList.add(11);
        secondList.add(19);

        int n = 4;

        mergeSort.mergeTwoLists(firstList, m, secondList, n);

        TestUtils.assertEqual(
                firstList,
                asList(3, 5, 7, 11, 13, 17, 19, 0)
        );
    }
}
