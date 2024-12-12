import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CensorEmailAddress {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String realEmail = input.readLine();
        String text = input.readLine();
        StringBuilder censored = new StringBuilder();
        while (text.contains(realEmail)) {
            int atIndex = 0;
            if (realEmail.contains("@")) {
                atIndex = realEmail.indexOf("@");
            }

            for (int i = 0; i < atIndex; i++) {
                censored = censored.append("*");
            }
            String domain = realEmail.substring(atIndex, realEmail.length());
            censored = censored.append(domain);
            String replaced = censored.toString();
            text = text.replaceAll(realEmail, replaced);
        }
        System.out.println(text);
    }
}