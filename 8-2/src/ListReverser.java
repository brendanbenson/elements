import linkedlist.ListNode;

public class ListReverser {
    public ListNode<Integer> reverseList(ListNode<Integer> head) {
        ListNode<Integer> a = null;
        ListNode<Integer> b = head;

        while (b != null) {
            ListNode<Integer> c = b.next;
            b.next = a;
            a = b;
            b = c;
        }

        return a;
    }
}
