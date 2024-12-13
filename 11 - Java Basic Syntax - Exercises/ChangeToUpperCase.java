import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeToUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String text = input.readLine();
        String regex = "<upcase>(.*?)</upcase>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String match = matcher.group(1);
            String upperCase = match.toUpperCase();

            text = text.replaceFirst(Pattern.quote("<upcase>" + match + "</upcase>"), upperCase);
        }
        System.out.println(text);
    }
}