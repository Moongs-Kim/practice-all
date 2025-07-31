package javamid2.collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] texts = text.split(" ");
        System.out.println("tests = " + Arrays.toString(texts));

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < texts.length; i++) {
            Integer value = map.getOrDefault(texts[i], 0);
            map.put(texts[i], value + 1);
        }
        System.out.println(map);
    }
}
