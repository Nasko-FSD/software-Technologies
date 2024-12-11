import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSumsFourthSolve {
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
        int rightSum = totalSum;
        boolean isEqual = false;

        for (int i = 0; i < numbers.length; i++) {
            rightSum -= numbers[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                isEqual = true;
                break;
            }

            leftSum += numbers[i];
        }

        if (isEqual == false) {
            System.out.println("no");
        }
    }
}