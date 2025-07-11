package javamid.lang.string.test;

public class TestString8 {

    public static void main(String[] args) {
        String str = "Hello Java";

        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println("reverseStr = " + reverseStr);
    }
}
