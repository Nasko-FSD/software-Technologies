import java.util.Arrays;

public class ArrayNumbers {
    public static void main(String[] args) {
        //Array holding numbers
        int[] intNumbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intNumbers));

        //Array holding floating-point numbers
        double[] doubleNumbers = {1.1, 5.44, 3.12, 4.44444, 5.0};
        System.out.println(Arrays.toString(doubleNumbers));

        //Array holding strings
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(String.join(", ", weekDays));
    }
}