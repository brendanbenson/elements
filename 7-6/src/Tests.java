import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        SentenceReverser sentenceReverser = new SentenceReverser();

        char[] words = "Alice likes Bob".toCharArray();

        sentenceReverser.reverseWords(words);

        assertEqual(new String(words), "Bob likes Alice");
    }
}
