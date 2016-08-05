import java.util.List;
import java.util.Random;

import static java.util.Collections.swap;

public class SubsetFinder {
    private Random random;

    public SubsetFinder(Random random) {
        this.random = random;
    }

    public void randomSubset(int size, List<Integer> A) {
        for (int i = 0; i < size; ++i) {
            int j = random.nextInt(A.size() - i);
            swap(A, i, i + j);
        }
    }
}
