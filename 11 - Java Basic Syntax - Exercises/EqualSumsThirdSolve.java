import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSumsThirdSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays
                .stream(input.readLine()
                        .split(" "))
                .filter(e -> !e.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft += numbers[j];
            }

            for (int j = i + 1; j < numbers.length; j++) {
                sumRight += numbers[j];
            }

            if (sumLeft == sumRight) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}