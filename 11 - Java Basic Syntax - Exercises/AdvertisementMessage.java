import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AdvertisementMessage {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(input.readLine());

        String[] phrases = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can't live without this product."
        };
        String[] events = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };
        String[] authors = {
                "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"
        };
        String[] cities = {
                "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"
        };

        Random finalMessage = new Random();

        for (int i = 0; i < number; i++) {
            int phrasesIndex = finalMessage.nextInt(phrases.length);
            int eventsIndex = finalMessage.nextInt(events.length);
            int authorsIndex = finalMessage.nextInt(authors.length);
            int citiesIndex = finalMessage.nextInt(cities.length);

            System.out.printf("%s %s %s - %s%n", phrases[phrasesIndex], events[eventsIndex], authors[authorsIndex], cities[citiesIndex]);
        }
    }
}
