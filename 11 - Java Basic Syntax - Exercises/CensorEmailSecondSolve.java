import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CensorEmailSecondSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String realEmail = input.readLine();
        String text = input.readLine();

        while (text.contains(realEmail)) {
            int atIndex = realEmail.indexOf("@");
            String censored = "*".repeat(atIndex) + realEmail.substring(atIndex);
            text = text.replace(realEmail, censored);
        }
        System.out.println(text);
    }
}