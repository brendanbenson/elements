import static testutils.TestUtils.assertEqual;
import static testutils.TestUtils.assertWithin;

public class Tests {
    public static void main(String[] args) throws Exception {
        Exponentiator exponentiator = new Exponentiator();

        assertEqual(exponentiator.pow(3.3, 0), 1.0);
        assertWithin(exponentiator.pow(2.3, 2), 5.29, 0.01);
        assertWithin(exponentiator.pow(19.9, 4), 156823.9201, 0.01);

        assertWithin(exponentiator.pow(1.01, 1000), 20959.155638, 0.01);
        System.out.println("Iterations: " + exponentiator.getIterationCount());

        exponentiator.pow(1.0000001, 200000000);
        System.out.println("Iterations: " + exponentiator.getIterationCount());
    }
}
