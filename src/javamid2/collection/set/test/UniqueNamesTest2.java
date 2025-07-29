package javamid2.collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>();

        for (Integer integer : inputArr) {
            set.add(integer);
        }

        System.out.println(set);

        for (Integer s : set) {
            System.out.println(s);
        }

        List<Integer> list = List.of(30, 20, 20, 10, 10);
        Set<Integer> set2 = new LinkedHashSet<>();

        set2.addAll(list);
        System.out.println(set2);
    }
}
