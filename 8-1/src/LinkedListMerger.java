import linkedlist.ListNode;

public class LinkedListMerger {
    public ListNode<Integer> merge(
            ListNode<Integer> first,
            ListNode<Integer> second
    ) {
        ListNode<Integer> dummyHead = new ListNode<>();
        ListNode<Integer> current = dummyHead;
        ListNode<Integer> p1 = first, p2 = second;

        while (p1 != null && p2 != null) {
            if (p1.data < p2.data) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        current.next = p1 != null ? p1 : p2;
        return dummyHead.next;
    }
}
