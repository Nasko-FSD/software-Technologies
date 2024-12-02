import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SymmetricNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String readInput = input.readLine();
        int number = Integer.parseInt(readInput);
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 1; i <= number; i++) {
            if (isSymmetric(i)) {
                result.add(i + " ");
            }
        }
        System.out.println(String.join("", result).trim());
    }

    static boolean isSymmetric(int number) {
        String str = Integer.toString(number);
        int length = str.length();
        for (int j = 0; j < length/2; j++) {
            if (str.charAt(j) != str.charAt(length - j - 1)) {
                return false;
            }
        }
        return true;
    }
}