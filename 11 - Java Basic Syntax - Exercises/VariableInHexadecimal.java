import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VariableInHexadecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String hexadecimal = input.readLine();
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println(decimal);
    }
}