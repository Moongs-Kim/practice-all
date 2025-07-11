package javabasic.static1;

public class Data {
    private String name;
    private static int count;

    public Data(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
