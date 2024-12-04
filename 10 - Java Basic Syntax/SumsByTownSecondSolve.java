import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class SumsByTownSecondSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        TreeMap<String, Double> sumsByTown = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = input.readLine().split("\\|");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());

            if (sumsByTown.containsKey(town)) {
                sumsByTown.put(town, sumsByTown.get(town) + income);
            } else {
                sumsByTown.put(town, income);
            }
        }
        for (Map.Entry<String, Double> entry : sumsByTown.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}