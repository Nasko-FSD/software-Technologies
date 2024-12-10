import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSumsSecondSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(input.readLine()
                .split(" "))
                .filter(e -> !e.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        int totalSum = Arrays
                .stream(numbers)
                .sum();

        int leftSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int rightSum = totalSum - leftSum - numbers[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum += numbers[i];

        }
        System.out.println("no");
    }
}