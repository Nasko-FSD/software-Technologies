import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        char[] charArray = line
                .replaceAll(" ", "")
                .toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int value = charArray[i] - 97;
            System.out.printf("%c -> %d%n", charArray[i], value);
        }
    }
}