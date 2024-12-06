import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareCharArrayFourthSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        char[] firstArray = input
                .readLine()
                .toCharArray();

        char[] secondArray = input
                .readLine()
                .toCharArray();

        int minLength = Math.min(firstArray.length, secondArray.length);

        for (int i = 0; i <minLength; i++) {
            if (firstArray[i] == ' ') {
                continue;
            }

            if (firstArray[i] > secondArray[i]) {
                printChar(secondArray);
                printChar(firstArray);
                break;
            } else if (secondArray[i] > firstArray[i]) {
                printChar(firstArray);
                printChar(secondArray);
                break;
            } else if (i == minLength - 1) {
                if (firstArray.length > secondArray.length) {
                    printChar(secondArray);
                    printChar(firstArray);
                } else {
                    printChar(firstArray);
                    printChar(secondArray);
                }
            }
        }
    }

    private static void printChar(char[] secondArray) {
        for (char ch : secondArray) {
            if (ch != ' ') {
                System.out.printf("%c", ch);
            }
        }
        System.out.println();
    }
}