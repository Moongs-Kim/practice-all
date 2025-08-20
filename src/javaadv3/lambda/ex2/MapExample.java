package javaadv3.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    private static List<String> map(List<String> list, StringFunction function) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(function.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        List<String> upper = map(words, str -> str.toUpperCase());
        System.out.println("upper = " + upper);

        List<String> deco = map(words, str -> "***" + str + "***");
        System.out.println("deco = " + deco);
    }
}
