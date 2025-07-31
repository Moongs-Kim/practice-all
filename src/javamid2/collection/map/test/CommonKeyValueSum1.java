package javamid2.collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Set<String> map1Key = map1.keySet();
        Set<String> map2Key = map2.keySet();

        Set<String> commonKey = new HashSet<>(map1Key);
        commonKey.retainAll(map2Key);

        Map<String, Integer> newMap = new HashMap<>();
        for (String key : commonKey) {
            newMap.put(key, map1.get(key) + map2.get(key));
        }
        System.out.println(newMap);
    }
}
