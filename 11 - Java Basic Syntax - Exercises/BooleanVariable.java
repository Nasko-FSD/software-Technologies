import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanVariable {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String readInput = input.readLine();

        boolean isTrue = Boolean.parseBoolean(readInput);

        if (isTrue) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}