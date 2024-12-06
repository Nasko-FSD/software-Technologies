import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxSequenceOfEquelElements {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArray = Arrays.stream(input.readLine()
                .split(" "))
                .filter(e -> !e.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter = 1;
        int bestLength = 0;
        int currentNumber = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                counter++;
                if (bestLength < counter) {
                    bestLength = counter;
                    currentNumber = inputArray[i];
                }
            } else {
                counter = 1;
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.printf("%d ", currentNumber);
        }
    }
}