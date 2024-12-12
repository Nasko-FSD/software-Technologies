import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringThirdSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        List<String> line = Stream.of(input.readLine()
                .split(" "))
                .filter(e-> !e.isEmpty())
                .collect(Collectors.toList());

        Collections.reverse(line);

        System.out.println(String.join(" ", line));
    }
}
