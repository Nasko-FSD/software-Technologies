import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FitStringIn20Chars {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        StringBuilder exactLength = new StringBuilder();
        exactLength.append(line);

        if (line.length() == 20) {
            System.out.println(line);
        } else if (line.length() < 20) {
            for (int i = line.length(); i < 20; i++) {
                exactLength = exactLength.append("*");
            }
            System.out.println(exactLength);
        } else {
            exactLength = new StringBuilder(exactLength.substring(0, 20));
            System.out.println(exactLength);
        }
    }
}