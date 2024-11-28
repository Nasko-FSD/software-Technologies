import java.util.Arrays;

public class ReplaceAndReplaceAll {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers)
                .replace("[", "")
                .replace("]", ""));

        System.out.println(Arrays.toString(numbers)
                .replaceAll("\\[|]", ""));

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}