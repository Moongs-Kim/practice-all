package javabasic.extends1;

public class Item {
    private String itemName;
    private int price;


    public Item(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    /*public String getItemName() {
        return itemName;
    }*/

    public void print() {
        System.out.println("이름: " + itemName + "가격: " + price);
    }
}
