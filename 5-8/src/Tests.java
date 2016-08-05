import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        IntegerReverser integerReverser = new IntegerReverser();

        assertEqual(integerReverser.reverse(42), 24);
        assertEqual(integerReverser.reverse(98765), 56789);

        assertEqual(integerReverser.reverse(-98765), -56789);
    }
}
