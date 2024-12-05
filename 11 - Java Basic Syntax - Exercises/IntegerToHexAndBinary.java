import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerToHexAndBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int readInput = Integer.parseInt(input.readLine());
        String hexString = Integer.toHexString(readInput).toUpperCase();
        String binaryString = Integer.toBinaryString(readInput);
        System.out.println(hexString);
        System.out.println(binaryString);
    }
}