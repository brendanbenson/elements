import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        assertEqual(calculator.squareRoot(4), 2);
        assertEqual(calculator.squareRoot(5), 2);
        assertEqual(calculator.squareRoot(6), 2);
        assertEqual(calculator.squareRoot(7), 2);
        assertEqual(calculator.squareRoot(8), 2);
        assertEqual(calculator.squareRoot(9), 3);
        assertEqual(calculator.squareRoot(300), 17);
        assertEqual(calculator.squareRoot(289), 17);
        assertEqual(calculator.squareRoot(11108889), 3333);
    }
}
