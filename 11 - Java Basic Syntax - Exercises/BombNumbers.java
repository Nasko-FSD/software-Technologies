import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BombNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Stream.of(input.readLine()
                .split(" "))
                .filter(e -> !e.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] specialNumbers = Arrays.stream(input.readLine()
                        .split(" "))
                .filter(e -> !e.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        int totalSum = 0;
        int bomb = specialNumbers[0];
        int radius = specialNumbers[1];

        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);
            int startIndex = Math.max(0, bombIndex - radius);
            int endIndex = Math.min(numbers.size() - 1, bombIndex + radius);

            for (int i = endIndex; i >= startIndex; i--) {
                numbers.remove(i);
            }
        }
        totalSum = numbers
                .stream()
                        .mapToInt(Integer::intValue)
                                .sum();
        System.out.println(totalSum);
    }
}