import static testutils.TestUtils.assertEqual;
import static testutils.TestUtils.assertNull;

public class Tests {
    public static void main(String[] args) throws Exception {
        MaxStack maxStack = new MaxStack();

        assertNull(maxStack.max());

        maxStack.push(1);
        maxStack.push(2);

        assertEqual(maxStack.max(), 2);

        maxStack.pop();

        assertEqual(maxStack.max(), 1);

        maxStack.push(0);

        assertEqual(maxStack.max(), 1);
    }
}
