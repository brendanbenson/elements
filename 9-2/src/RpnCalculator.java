import java.util.Deque;
import java.util.LinkedList;

import static java.lang.Integer.valueOf;

public class RpnCalculator {
    public int eval(String expression) {
        Deque<Integer> d = new LinkedList<>();

        String[] elements = expression.split(",");

        for (String e : elements) {
            if (e.equals("x")) {
                d.push(d.pop() * d.pop());
            } else {
                d.push(valueOf(e));
            }
        }

        return d.getFirst();
    }
}
