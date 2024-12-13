import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBookUpgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String entry = "";
        TreeMap<String, String> phoneBook = new TreeMap<>();

        while (!(entry = input.readLine()).equals("END")) {
            String[] parts = entry.split(" ");
            String command = parts[0];

            if (command.equals("A")) {
                String number = parts[2];
                String name = parts[1];

                phoneBook.put(name, number);
            }

            if (command.equals("S")) {
                String name = parts[1];
                if (phoneBook.containsKey(name)) {
                    System.out.printf("%s -> %s%n", name, phoneBook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            }
            if (command.equals("ListAll")) {
                for (Map.Entry<String, String> entries : phoneBook.entrySet()) {
                    System.out.println(entries.getKey() + " -> " + entries.getValue());
                }
            }
        }
    }
}