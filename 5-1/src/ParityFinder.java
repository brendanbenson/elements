import java.util.ArrayList;
import java.util.List;

public class ParityFinder {
    static List<Boolean> precomputed = new ArrayList<>();

    static {
        for (Long i = 0L; i < 65536L; i++) {
            precomputed.add(computeParity(i));
        }
    }

    public Boolean getParity(Long word) throws Exception {
        Long first = word & 65535L;
        Long second = (word & (65535L << 16)) >> 16;
        Long third = (word & (65535L << 32)) >> 32;
        Long fourth = (word & (65535L << 48)) >> 48;

        Long mask = 0L;
        mask = mask + (getPrecomputedValue(first) ? 1 : 0);
        mask = mask + (getPrecomputedValue(second) ? 2 : 0);
        mask = mask + (getPrecomputedValue(third) ? 4 : 0);
        mask = mask + (getPrecomputedValue(fourth) ? 8 : 0);

        return getPrecomputedValue(mask);
    }

    private static Boolean computeParity(Long word) {
        Boolean parity = false;

        while ((word & ~(word - 1)) != 0) {
            parity = !parity;
            word = word ^ (word & ~(word - 1));
        }
        return parity;
    }

    private Boolean getPrecomputedValue(Long key) throws Exception {
        Boolean aBoolean = precomputed.get((int) (long) key);
        if (aBoolean == null) {
            throw new Exception();
        }
        return aBoolean;
    }
}
