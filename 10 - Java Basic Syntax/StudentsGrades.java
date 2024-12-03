import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class StudentsGrades {
    public static void main(String[] args) {

        LinkedHashMap<String, ArrayList<Integer>> grades = new LinkedHashMap<>();

        grades.put("Peter", new ArrayList<>(Arrays.asList(5)));
        grades.put("George", new ArrayList<>(Arrays.asList(5, 5, 6)));
        grades.put("Maria", new ArrayList<>(Arrays.asList(5, 4, 4)));
        grades.get("Peter").add(6);
        grades.get("George").add(6);

        for (String key : grades.keySet()) {
            System.out.println("" + key + " -> " + grades.get(key));
        }
    }
}