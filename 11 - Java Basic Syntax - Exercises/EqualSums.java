import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(input.readLine()
                        .split(" "))
                .filter(e -> !e.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int l = 0; l < numbers.length; l++) {
           int leftSum = Arrays
                   .stream(numbers)
                   .limit(l)
                   .sum();

           int rightSum = Arrays
                   .stream(numbers)
                   .skip(l + 1)
                   .sum();

           if (leftSum == rightSum) {
               System.out.println(l);
               return;
            }
        }
        System.out.println("no");
    }
}