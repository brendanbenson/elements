import static java.util.Arrays.asList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        Incrementer incrementer = new Incrementer();

        assertEqual(incrementer.increment(asList(1,2,8)), asList(1,2,9));
        assertEqual(incrementer.increment(asList(1,2,9)), asList(1,3,0));
        assertEqual(incrementer.increment(asList(9,9)), asList(1,0,0));
    }
}
