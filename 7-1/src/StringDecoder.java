public class StringDecoder {
    public Integer decode(String s) {
        char[] chars = s.toCharArray();

        Integer accumulatedValue = 0;
        Integer multiplier = 1;

        for (Integer i = chars.length - 1; i >= 0; i--) {
            char currentChar = chars[i];

            if ((int) currentChar == 45) {
                accumulatedValue = -accumulatedValue;
            } else {
                accumulatedValue += (((int) currentChar) - 48) * multiplier;
                multiplier *= 10;
            }
        }

        return accumulatedValue;
    }

    public String encode(Integer i) {
        Boolean negative = i < 0;

        if (negative) {
            i = -i;
        }

        StringBuilder accumulatedValue = new StringBuilder();

        while (i > 0) {
            accumulatedValue.append(i % 10);
            i = i / 10;
        }

        if (negative) {
            accumulatedValue.append("-");
        }

        return accumulatedValue.reverse().toString();
    }
}
