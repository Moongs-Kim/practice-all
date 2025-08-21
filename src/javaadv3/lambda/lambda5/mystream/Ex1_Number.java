package javaadv3.lambda.lambda5.mystream;

import javaadv3.lambda.lambda5.fliter.GenericFilter;
import javaadv3.lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1_Number {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> direct = direct(numbers, n -> n % 2 == 0);
        System.out.println("direct = " + direct);

        List<Integer> lambda = lambda(numbers);
        System.out.println("lambda = " + lambda);
    }

    static List<Integer> direct(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number * 2);
            }
        }
        return result;
    }

    static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filtered = GenericFilter.filter(numbers, n -> n % 2 == 0);
        return GenericMapper.map(filtered, n -> n * 2);
    }
}
