import java.util.List;

import static java.util.Arrays.asList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        Calendar calendar = new Calendar();

        List<Calendar.Event> events = asList(
                new Calendar.Event(1, 5),
                new Calendar.Event(6, 10),
                new Calendar.Event(11, 13),
                new Calendar.Event(14, 15),
                new Calendar.Event(2, 7),
                new Calendar.Event(8, 9),
                new Calendar.Event(12, 15),
                new Calendar.Event(4, 5),
                new Calendar.Event(9, 17)
        );

        assertEqual(calendar.maxOverlaps(events), 3);
    }
}
