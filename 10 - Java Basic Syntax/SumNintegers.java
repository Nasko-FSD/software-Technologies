import java.util.Scanner;

public class SumNintegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        long sum = 0;

        for (int i = 0; i < n; i++)
        {
            int currentNumber = Integer.parseInt(input.nextLine());
            sum += currentNumber;
        }

        System.out.println("Sum = " + sum);
    }
}