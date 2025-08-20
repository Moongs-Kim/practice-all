package javaadv3.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

    private static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        int result = initial;
        for (Integer i : list) {
            result = reducer.reduce(result, i);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);

        int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("sum = " + sum);

        int product = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("product = " + product);
    }
}
