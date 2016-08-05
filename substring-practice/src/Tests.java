import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        SubstringFinder substringFinder = new SubstringFinder();

        assertEqual(substringFinder.maxSubstring("abaccbzxab"), "cbzxa");
        assertEqual(substringFinder.maxSubstring("abaabb"), "ab");
    }
}
