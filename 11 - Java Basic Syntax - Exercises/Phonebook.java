import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String entry = "";
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

        while (!(entry = input.readLine()).equals("END")) {
            String[] parts = entry.split(" ");
            String command = parts[0];
            String name = parts[1];

            if (command.equals("A")) {
                String number = parts[2];

                phoneBook.put(name, number);
            }

            if (command.equals("S")) {
                if (phoneBook.containsKey(name)) {
                    System.out.printf("%s -> %s%n", name, phoneBook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            }
        }
    }
}