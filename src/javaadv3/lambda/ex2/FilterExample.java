package javaadv3.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {

    private static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);

        List<Integer> filtered1 = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        });
        System.out.println("filtered1 = " + filtered1);

        List<Integer> filtered2 = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });
        System.out.println("filtered2 = " + filtered2);


        List<Integer> negative = filter(numbers, n -> n < 0);
        System.out.println("negative = " + negative);

        List<Integer> even = filter(numbers, n -> n % 2 == 0);
        System.out.println("even = " + even);
    }
}
