package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedListUtils {
    public static <T> ListNode<T> buildList(T... elements) {
        ListNode<T> dummyHead = new ListNode<>();
        ListNode<T> current = dummyHead;

        for (Integer i = 0; i < elements.length; i++) {
            current.next = new ListNode<>();
            current = current.next;
            current.data = elements[i];
        }
        return dummyHead.next;
    }

    public static <T> void printLinkedList(ListNode<T> listNode) {
        System.out.println(toList(listNode));
    }

    public static <T> Boolean linkedListsEqual(ListNode<T> first, ListNode<T> second) {
        return toList(first).equals(toList(second));
    }

    public static <T> List<T> toList(ListNode<T> l) {
        List<T> list = new ArrayList<>();

        list.add(l.data);
        while (l.next != null) {
            list.add(l.next.data);
            l = l.next;
        }

        return list;
    }
}
