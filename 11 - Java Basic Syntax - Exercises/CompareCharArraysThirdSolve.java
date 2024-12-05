import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CompareCharArraysThirdSolve {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String firstArr = Arrays.stream(input.readLine().split(" "))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining());

        String secondArr = Arrays.stream(input.readLine().split(" "))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining());

        int minLength = Math.min(firstArr.length(), secondArr.length());

        for (int i = 0; i < minLength; i++) {
            if (firstArr.charAt(i) > secondArr.charAt(i)) {
                System.out.println(secondArr);
                System.out.println(firstArr);
                return;
            } else if (secondArr.charAt(i) > firstArr.charAt(i)) {
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