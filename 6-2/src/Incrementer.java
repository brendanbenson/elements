import java.util.ArrayList;
import java.util.List;

public class Incrementer {
    public List<Integer> increment(List<Integer> integers) {
        ArrayList<Integer> result = new ArrayList<>();
        int remainder = 1;

        for (int i = integers.size() - 1; i >= 0; --i) {
            Integer digit = integers.get(i);
            Integer toAdd = digit + remainder;

            if (toAdd == 10) {
                toAdd = 0;
                remainder = 1;
            } else {
                remainder = 0;
            }

            result.add(0, toAdd);
        }

        if (remainder == 1) {
            result.add(0, remainder);
        }

        return result;
    }
}
