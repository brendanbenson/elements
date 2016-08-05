import java.util.Deque;
import java.util.LinkedList;

public class MaxStack {
    private Deque<ElementWithMax> stack = new LinkedList<>();

    public void push(Integer el) {
        Integer newMax = max();

        if (newMax == null || el > newMax) {
            newMax = el;
        }

        stack.push(new ElementWithMax(el, newMax));
    }

    public Integer pop() {
        return stack.pop().element;
    }

    public Integer max() {
        if (stack.isEmpty()) {
            return null;
        }

        return stack.peek().max;
    }
}
