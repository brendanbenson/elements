import java.util.List;

import static java.util.Arrays.asList;

public class Tests {
    public static void main(String [] args) {
        List<String> strings = asList("debitcard",
                "elvis",
                "silent",
                "badcredit",
                "lives",
                "freedom",
                "listen",
                "levis",
                "money"
        );

        AnagramPartitioner anagramPartitioner = new AnagramPartitioner();

        List<List<String>> partition = anagramPartitioner.partition(strings);

        for (List<String> p : partition) {
            System.out.println(p);
        }
    }
}
