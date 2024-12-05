import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelOrDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String readInput = input.readLine();

        String[] vowels = {"a", "o", "u", "i", "e", "y"};

            try {
                Integer.parseInt(readInput);
                System.out.println("digit");
            }
            catch (NumberFormatException e) {
                boolean isVowel = false;
                for (int i = 0; i < vowels.length; i++) {
                    if (readInput.toLowerCase().contains(vowels[i])) {
                        isVowel = true;
                        System.out.println("vowel");
                        break;
                    }
                }
                if (isVowel == false) {
                    System.out.println("other");
                }
            }
    }
}