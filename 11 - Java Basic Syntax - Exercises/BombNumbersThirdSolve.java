import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BombNumbersThirdSolve {
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
            int bombIndex = numbers.indexOf(bombNumber);
            int startIndex = Math.max(0, bombIndex - range);
            int endIndex = Math.min(numbers.size(), bombIndex + range + 1);

            numbers.subList(startIndex, endIndex).clear();
        }

        int totalSum = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(totalSum);

    }
}