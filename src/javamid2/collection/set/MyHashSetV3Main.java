package javamid2.collection.set;

public class MyHashSetV3Main {

    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");
        //set.add(10);
        System.out.println(set);

        //검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
