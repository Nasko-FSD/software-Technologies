import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class SumsByTownValueSort {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        TreeMap<String, Double> sumsByTown = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = input.readLine().split("\\|");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());

            if (!sumsByTown.containsKey(town)) {
                sumsByTown.put(town, sumsByTown.get(town) + income);
            } else {
                sumsByTown.put(town, income);
            }
        }

        // Create a list from the entries of the TreeMap
        List<Map.Entry<String, Double>> entryList = new ArrayList<>(sumsByTown.entrySet());

        // Sort the list by value (income)
        entryList.sort(Map.Entry.comparingByValue());

        // Print the sorted entries
        for (Map.Entry<String, Double> entry : entryList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}