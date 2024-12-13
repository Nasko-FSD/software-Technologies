import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URLparser {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String urlStart = input.readLine();
        String protocol = "";
        String server = "";
        String resource = "";
        String firstDelimiter = "://";
        String secondDelimiter = "/";


        if (urlStart.contains(firstDelimiter)) {
            String[] parts = urlStart.split(firstDelimiter, 2);
            protocol = parts[0];
            urlStart = parts[1];
        }
        if (urlStart.contains(secondDelimiter)) {
            int slashIndex = urlStart.indexOf("/");
            server = urlStart.substring(0, slashIndex);
            resource = urlStart.substring(slashIndex + 1);
        }
        else {
            server = urlStart;
        }
        System.out.printf("[protocol] = \"%s\"%n", protocol);
        System.out.printf("[server] = \"%s\"%n", server);
        System.out.printf("[resource] = \"%s\"", resource);
    }
}