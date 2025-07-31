package javamid2.collection.utils;

import java.util.*;

public class ImmutableMain {

    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);
        List<List<Integer>> ofList = List.of(list);

        //가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        //불변 리스트
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());

        // 예외 발생 java.lang.UnsupportedOperationException
        //unmodifiableList.add(5);

        Map<Object, Object> objectObjectMap = Collections.unmodifiableMap(new HashMap<>());
        System.out.println("objectObjectMap = " + objectObjectMap.getClass());

    }
}
