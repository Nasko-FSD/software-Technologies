import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Largest3NumbersSecondSolve {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(input
                .readLine()
                .split(" "))
                .map(Integer::parseInt)
                .sorted((e1, e2) -> Integer.compare(e2, e1))
                .limit(3)
                .collect(Collectors.toList());

        numbers.forEach(e ->
                        System.out.print(e + " "));
    }
}