public class Exponentiator {
    private int iterationCount;

    public double pow(double v, int i) {
        iterationCount = 0;
        double result = 1.0;

        while (i != 0) {
            iterationCount++;
            if ((i & 1) == 1) {
                result *= v;
            }
            v *= v;
            i >>>= 1;
        }

        return result;
    }

    public int getIterationCount() {
        return iterationCount;
    }
}
