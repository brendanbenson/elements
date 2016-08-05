import java.util.PriorityQueue;

public class Sorter {
    public static void sort(int[] a, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < k; ++i) {
            q.add(a[i]);
        }

        for (int i = k; i < a.length; ++i) {
            q.add(a[i]);
            System.out.println(q.remove());
        }

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
