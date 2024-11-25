import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = Double.parseDouble(input.nextLine());
        double num2 = Double.parseDouble(input.nextLine());
        System.out.printf("Sum = %.2f", num1 + num2);

    }
}