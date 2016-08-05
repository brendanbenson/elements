import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        StringDecoder stringDecoder = new StringDecoder();

        assertEqual(stringDecoder.decode("123"), 123);
        assertEqual(stringDecoder.decode("999"), 999);
        assertEqual(stringDecoder.decode("-999"), -999);

        assertEqual(stringDecoder.encode(123), "123");
        assertEqual(stringDecoder.encode(999), "999");
        assertEqual(stringDecoder.encode(-999), "-999");
    }
}
