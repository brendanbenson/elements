import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        BaseConverter baseConverter = new BaseConverter();

        assertEqual(baseConverter.baseConversion("615", 7, 13), "1A7");
        assertEqual(baseConverter.baseConversion("20", 10, 7), "26");
    }
}
