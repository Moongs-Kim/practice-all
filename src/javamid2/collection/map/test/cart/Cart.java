package javamid2.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        Integer orDefault = cartMap.getOrDefault(product, 0);
        cartMap.put(product, orDefault + quantity);
    }

    public void minus(Product product, int quantity) {
        if (cartMap.containsKey(product)) {
            int checkQuantity = cartMap.get(product) - quantity;
            if (checkQuantity > 0) {
                cartMap.put(product, checkQuantity);
            } else {
                cartMap.remove(product);
            }
        } else {
            System.out.println("해당 상품은 장바구니에 없습니다.");
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> cartInfo : cartMap.entrySet()) {
            System.out.println("상품: " + cartInfo.getKey() + " 수량: " + cartInfo.getValue());
        }
    }
}
