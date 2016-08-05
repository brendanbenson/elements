import linkedlist.ListNode;

import static java.util.Arrays.asList;
import static linkedlist.LinkedListUtils.buildList;
import static linkedlist.LinkedListUtils.toList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        ListReverser listReverser = new ListReverser();

        ListNode<Integer> list = buildList(1, 2, 3, 4, 5);

        ListNode<Integer> reversedList = listReverser.reverseList(list);

        assertEqual(toList(reversedList), asList(5, 4, 3, 2, 1));

        ListNode<Integer> singleList = buildList(1);

        ListNode<Integer> otherListReversed = listReverser.reverseList(singleList);

        assertEqual(toList(otherListReversed), asList(1));
    }
}
