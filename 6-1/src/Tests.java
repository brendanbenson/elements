import java.util.List;

import static testutils.TestUtils.assertTrue;
import static java.util.Arrays.asList;

public class Tests {
    public static void main(String[] args) throws Exception {
        List<Color> example1 = asList(
                Color.RED,
                Color.BLUE,
                Color.WHITE,
                Color.BLUE
        );

        System.out.println(Color.WHITE.ordinal());

        assertTrue(true);
    }
}
