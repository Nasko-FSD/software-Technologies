import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder read = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            read.append(input.readLine());
        }
        System.out.println(read.reverse());
    }
}