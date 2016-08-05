import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class BaseConverter {

    public String baseConversion(String a, int b1, int b2) {
        return fromBase10(parseInt(a, b1), b2);
    }

    private String fromBase10(int a, int b2) {
        List<Integer> digits = new ArrayList<>();

        while(a > 0) {
            int mod = a % b2;
            digits.add(mod);
            a -= mod;
            a /= b2;
        }

        StringBuilder s = new StringBuilder();

        for (int i = digits.size() - 1; i >= 0; --i) {
            s.append(digitToChar(digits.get(i)));
        }

        return s.toString();
    }

    private String digitToChar(int i) {
        if (i < 10) {
            return Integer.toString(i);
        }

        return Character.toString((char) (i + 55));
    }
}
