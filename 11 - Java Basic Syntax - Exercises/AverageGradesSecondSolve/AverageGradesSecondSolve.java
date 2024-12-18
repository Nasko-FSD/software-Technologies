import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AverageGradesSecondSolve {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int totalStudents = Integer.parseInt(input.readLine());
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < totalStudents; i++) {
            String[] parts = input.readLine().split(" ");

            String name = parts[0];
            ArrayList<Double> studentGrades = new ArrayList<>();

            for (int j = 1; j < parts.length; j++) {
                studentGrades.add(Double.parseDouble(parts[j]));
            }
            students.add(new Student(name, studentGrades));
        }

        ArrayList<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageGrade() >= 5) {
                filteredStudents.add(student);
            }
        }

        Collections.sort(filteredStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int nameComparison = s1.getName().compareTo(s2.getName());
                if (nameComparison == 0) {
                    return Double.compare(s2.getAverageGrade(), s1.getAverageGrade());
                }
                return nameComparison;
            }
        });

        for (Student student : filteredStudents) {
            System.out.printf("%s -> %.2f%n", student.getName(), student.getAverageGrade());
        }

    }
}

class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name, ArrayList<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        return this.grades
                .stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}
