package javaadv3.lambda.lambda5.mystream;

import javaadv3.lambda.lambda5.fliter.GenericFilter;
import javaadv3.lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex2_Student {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    static List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                result.add(student.getName());
            }
        }
        return result;
    }

    static List<String> lambda(List<Student> Students) {
        List<Student> filtered = GenericFilter.filter(Students, student -> student.getScore() >= 80);
        return GenericMapper.map(filtered, student -> student.getName());
    }
}
