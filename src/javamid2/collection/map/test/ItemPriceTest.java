package javamid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        //Set<Map.Entry<String, Integer>> entries = map.entrySet();

        String formmat = "[";
        for (String key : map.keySet()) {
            if (map.get(key) == 1000) {
                formmat += key;
            }
        }
        formmat += "]";
        System.out.println(formmat);
    }
}
