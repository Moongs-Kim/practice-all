package javaadv3.lambda.lambda5.fliter;

import java.util.List;

public class FilterMainV4 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = GenericFilter.filter(numbers, n -> n % 2 == 0);
        List<Integer> oddNumbers = GenericFilter.filter(numbers, n -> n % 2 == 1);

        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);

        List<String> strings = List.of("A", "BB", "CCC");
        List<String> stringsResult = GenericFilter.filter(strings, s -> s.length() >= 2);
        System.out.println("stringsResult = " + stringsResult);


    }

}
