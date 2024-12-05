import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseCharactersSecondSolve {
    public static void main(String[] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    String read = "";

    for (int i = 0; i < 3; i++) {
        read += input.readLine();
    }

    for (int i = read.length() - 1; i >= 0; i--) {
        System.out.print(read.charAt(i));
    }
}
}