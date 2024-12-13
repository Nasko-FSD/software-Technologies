import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLparserSecondSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String urlStart = input.readLine();

        String protocol = "";
        String server = "";
        String resource = "";

        String regex = "^(?:(?<protocol>\\w+)://)?(?<server>[^/]+)(?:/(?<resource>.*))?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(urlStart);

        if (matcher.matches()) {
            if (matcher.group("protocol") != null) {
                protocol = matcher.group("protocol");
            } else {
                protocol = "";
            }

            if (matcher.group("server") != null) {
                server = matcher.group("server");
            } else {
                server = "";
            }

            if (matcher.group("resource") != null) {
                resource = matcher.group("resource");
            } else {
                resource = "";
            }
        }

        System.out.printf("[protocol] = \"%s\"%n", protocol);
        System.out.printf("[server] = \"%s\"%n", server);
        System.out.printf("[resource] = \"%s\"%n", resource);
    }
}