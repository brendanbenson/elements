import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        RpnCalculator rpnCalculator = new RpnCalculator();

        assertEqual(rpnCalculator.eval("2,3,x"), 6);
    }
}
