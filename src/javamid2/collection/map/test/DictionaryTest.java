package javamid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "사과");
        dictionary.put("banana", "바나나");

        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String input = scanner.nextLine();

            if (input.equals("q")) break;

            String output = dictionary.getOrDefault(input, "사전에 없는 단어입니다.");

            System.out.println(input + "의 뜻: " + output);
        }
    }
}
