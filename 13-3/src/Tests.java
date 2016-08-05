import static testutils.TestUtils.assertFalse;
import static testutils.TestUtils.assertTrue;

public class Tests {
    public static void main(String[] args) throws Exception {
        AnonymousLetter anonymousLetter = new AnonymousLetter();

        String firstLetter = "abc";
        String secondLetter = "xyz";

        String magazine = "jlkajkjhasdblkjalkllkjasbbc";

        assertTrue(anonymousLetter.canWrite(firstLetter, magazine));
        assertFalse(anonymousLetter.canWrite(secondLetter, magazine));
    }
}
