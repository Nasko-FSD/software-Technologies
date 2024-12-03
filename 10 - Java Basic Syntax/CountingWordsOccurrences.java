import java.util.HashMap;

public class CountingWordsOccurrences {
    public static void main(String[] args) {
        String[] words = { "yes", "hi", "hello", "hi", "welcome", "yes", "yes", "welcome", "hi", "yes", "hello", "yes" };
        HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
        for (String word : words) {
            Integer count = wordsCount.get(word);

            if (count == null) {
                count = 0;
            }
            wordsCount.put(word, count+1);
        }
        System.out.println(wordsCount);
    }
}