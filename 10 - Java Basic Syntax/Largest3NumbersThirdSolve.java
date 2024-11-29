import java.util.Arrays;
import java.util.Scanner;

public class Largest3NumbersThirdSolve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(numbers);

        int count = Math.min(3, numbers.length);

        for (int i = numbers.length - 1; i >= numbers.length - count; i--) {
            System.out.println(numbers[i] + " ");
        }
    }
}