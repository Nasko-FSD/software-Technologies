import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BombNumbersSecondSolve {
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

        int bombNumber = specialNumbers[0];
        int range = specialNumbers[1];

        while (numbers.contains(bombNumber)) {
            int startIndex = numbers.indexOf(bombNumber) - range;
            int endIndex = numbers.indexOf(bombNumber) + range + 1;

            if (startIndex < 0) {
                startIndex = 0;
            }

            if (endIndex > numbers.size()) {
                endIndex = numbers.size() - 1;
            }

            numbers.subList(startIndex, endIndex).clear();
        }

        int totalSum = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(totalSum);

    }
}