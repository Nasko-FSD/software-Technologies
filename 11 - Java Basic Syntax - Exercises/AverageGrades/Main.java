package AverageGrades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
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

        students
                .stream()
                .filter(s -> s.getAverageGrade() >= 5)
                .sorted(
                        Comparator.comparing(Student::getName)
                                .thenComparing(Comparator.comparing(Student::getAverageGrade).reversed())
                )
                .toList()
                .forEach(r -> System.out.printf("%s -> %.2f%n", r.getName(), r.getAverageGrade()));
    }
}
