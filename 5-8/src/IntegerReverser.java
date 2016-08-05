public class IntegerReverser {
    public int reverse(int i) {
        int result = 0;
        boolean isNegative = false;
        int start = i;

        if (i < 0) {
            isNegative = true;
            start = -start;
        }


        result += start % 10;
        start = start / 10;

        while (start > 0) {
            result *= 10;
            result += start % 10;
            start = start / 10;
        }

        return isNegative ? 0 - result : result;
    }
}
