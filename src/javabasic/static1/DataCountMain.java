package javabasic.static1;

public class DataCountMain {

    public static void main(String[] args) {
        Data data1 = new Data("A");
        System.out.println("data1 = " + data1);

        Data data2 = new Data("B");
        System.out.println("data2 = " + data2);

        Data data3 = new Data("C");
        System.out.println("data3 = " + data3);

        System.out.println("count : " + Data.getCount());
    }
}
