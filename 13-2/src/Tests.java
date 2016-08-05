import static testutils.TestUtils.assertFalse;
import static testutils.TestUtils.assertTrue;

public class Tests {
    public static void main(String[] args) throws Exception {
        Permutor permutor = new Permutor();

        assertTrue(permutor.isPermutable("edified"));
        assertFalse(permutor.isPermutable("zedified"));
        assertTrue(permutor.isPermutable("aabcaabc"));
    }
}
