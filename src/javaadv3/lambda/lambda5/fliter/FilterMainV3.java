package javaadv3.lambda.lambda5.fliter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV3 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = IntegerFilter.filter(numbers, n -> n % 2 == 0);
        List<Integer> oddNumbers = IntegerFilter.filter(numbers, n -> n % 2 == 1);

        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);



    }

}
