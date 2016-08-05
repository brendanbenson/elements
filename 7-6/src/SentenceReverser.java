public class SentenceReverser {
    public void reverseWords(char[] words) {
        reverseSubstring(words, 0, words.length - 1);

        int j = 0;
        for (int i = 0; i <= words.length; ++i) {
            if (i == words.length || words[i] == ' ') {
                reverseSubstring(words, j, i - 1);
                j = i + 1;
            }
        }
    }

    private void reverseSubstring(char[] str, int start, int end) {
        for (int i = 0; i < (end - start) / 2; ++i) {
            char a = str[i + start];
            int bIdx = end - i;
            char b = str[bIdx];
            str[i + start] = b;
            str[bIdx] = a;
        }
    }
}
