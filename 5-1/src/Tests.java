import static testutils.TestUtils.assertTrue;

public class Tests {
    public static void main(String[] args) throws Exception {
        ParityFinder parityFinder = new ParityFinder();

        assertTrue(!parityFinder.getParity(0L));
        assertTrue(parityFinder.getParity(1L));
        assertTrue(parityFinder.getParity(2L));

        Long sixtyFourOnes = 32767L;
        assertTrue(parityFinder.getParity(sixtyFourOnes));
        assertTrue(!parityFinder.getParity(sixtyFourOnes - 1L));
        assertTrue(!parityFinder.getParity(sixtyFourOnes - 8L));
        assertTrue(!parityFinder.getParity(sixtyFourOnes - 1024L));
        assertTrue(parityFinder.getParity(sixtyFourOnes - 1024L - 1L));

        System.out.println("starting computations...");

        for (Long i = (long) Math.pow(2, 25); i <= Math.pow(2, 28); i++) {
            parityFinder.getParity(i);
        }

        System.out.println("done!");
    }
}
