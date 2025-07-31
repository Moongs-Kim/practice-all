package javamid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성
        Map<String, Integer> productMap = new HashMap<>();
        for (int i = 0; i < productArr.length; i++) {
            String key = productArr[i][0];
            Integer value = Integer.valueOf(productArr[i][1]);
            productMap.put(key, value);
        }

        // Map의 모든 데이터 출력
        Set<String> keySet = productMap.keySet();
        for (String key : keySet) {
            System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
        }
    }
}
