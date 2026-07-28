package day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Bình", 8.5),
                new Student("An", 9.0),
                new Student("Chi", 8.5)));
        students.sort(Comparator.comparingDouble(Student::score).reversed()
                .thenComparing(Student::name));
        students.forEach(System.out::println);
    }
}

record Student(String name, double score) {}
