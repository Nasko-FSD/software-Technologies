import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        char[] line = input
                .readLine()
                .toCharArray();

        for (int i = 0; i < line.length/2; i++) {
            char temp = line[i];
            line[i] = line[line.length - 1 - i];
            line[line.length - 1 -i] = temp;
        }
        String reversed = new String(line);
        System.out.println(reversed);
    }
}