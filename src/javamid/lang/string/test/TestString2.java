package javamid.lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int charLengthSum = 0;
        for (String s : arr) {
            charLengthSum += s.length();
        }
        System.out.println("charLengthSum = " + charLengthSum);
    }
}
