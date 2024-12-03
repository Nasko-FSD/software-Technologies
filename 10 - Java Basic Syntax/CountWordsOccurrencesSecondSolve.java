import java.util.LinkedHashMap;

public class CountWordsOccurrencesSecondSolve {
    public static void main(String[] args) {
        String[] words = { "yes", "hi", "hello", "hi", "welcome", "yes", "yes", "welcome", "hi", "yes", "hello", "yes" };

        LinkedHashMap<String, Integer> wordsCount = new LinkedHashMap<>();

        for (String word : words) {

            if (!wordsCount.containsKey(word)) {
                wordsCount.put(word, 1);
            } else {
                wordsCount.put(word, wordsCount.get(word) +1);
            }
        }

        wordsCount.entrySet().forEach(e -> {
            System.out.printf("%s=%d%n", e.getKey(), e.getValue());
        });
    }
}
