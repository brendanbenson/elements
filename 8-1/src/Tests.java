import linkedlist.ListNode;

import static linkedlist.LinkedListUtils.*;
import static testutils.TestUtils.assertTrue;

public class Tests {
    public static void main(String[] args) throws Exception {
        LinkedListMerger linkedListMerger = new LinkedListMerger();

        ListNode<Integer> firstList = buildList(2, 5, 7);
        ListNode<Integer> secondList = buildList(3, 11);
        ListNode<Integer> mergedList = linkedListMerger.merge(firstList, secondList);

        printLinkedList(firstList);
        printLinkedList(secondList);
        printLinkedList(mergedList);

        assertTrue(
                linkedListsEqual(
                        mergedList,
                        buildList(2, 3, 5, 7, 11)
                )
        );
    }
}
