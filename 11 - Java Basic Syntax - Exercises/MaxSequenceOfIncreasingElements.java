import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int startIndex = 0;
        int maxLength = 1;
        int counter = 1;
        int tempStartIndex = 0;

        int[] inputArray = Arrays.stream(input.readLine()
                .split(" "))
                .filter(e -> !e.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] < inputArray[i+1]) {
                counter++;
                if (counter > maxLength) {
                    maxLength = counter;
                    startIndex = tempStartIndex;
                }
            } else {
                    counter = 1;
                    tempStartIndex = i + 1;
                }
        }
        for (int j = startIndex; j < startIndex + maxLength; j++) {
            System.out.printf("%d ", inputArray[j]);
        }
    }
}