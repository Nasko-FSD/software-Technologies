import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringSecondSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String reversed = new StringBuilder(input.readLine())
                .reverse()
                .toString();

        System.out.println(reversed);
    }
}