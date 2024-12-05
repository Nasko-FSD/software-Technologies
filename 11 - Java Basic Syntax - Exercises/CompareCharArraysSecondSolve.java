import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareCharArraysSecondSolve {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String firstArr = String.join("", input.readLine().split(" "));
        String secondArr = String.join("", input.readLine().split(" "));

        int minLength = Math.min(firstArr.length(), secondArr.length());

        for (int i = 0; i < minLength; i++) {
            if (firstArr.charAt(i) > secondArr.charAt(i)) {
                System.out.println(secondArr);
                System.out.println(firstArr);
                return;
            }
            else if (secondArr.charAt(i) > firstArr.charAt(i)) {
                System.out.println(firstArr);
                System.out.println(secondArr);
                return;
            }
        }

        if (firstArr.length() < secondArr.length()) {
            System.out.println(firstArr);
            System.out.println(secondArr);
        } else {
            System.out.println(secondArr);
            System.out.println(firstArr);
        }
    }
}