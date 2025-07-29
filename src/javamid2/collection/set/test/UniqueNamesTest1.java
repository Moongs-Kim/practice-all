package javamid2.collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();

        for (Integer integer : inputArr) {
            set.add(integer);
        }

        System.out.println(set);

        for (Integer s : set) {
            System.out.println(s);
        }
        System.out.println("==========");
        Iterator<Integer> iterator = set.iterator();
        int size = set.size();
        int index = 0;
        Integer[] newArr = new Integer[size];
        while (iterator.hasNext()) {
            newArr[index++] = iterator.next();
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if (i != newArr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
