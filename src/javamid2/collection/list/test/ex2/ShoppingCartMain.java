package javamid2.collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new ArrayList<>());
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }
}
