package javamid.lang.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitsArr = fruits.split(",");
        for (String s : fruitsArr) {
            System.out.println(s);
        }
        String joinedString1 = String.join("->", fruitsArr[0], fruitsArr[1], fruitsArr[2]);
        System.out.println("joinedString1 = " + joinedString1);

        String joinedString2 = String.join("->", fruitsArr);
        System.out.println("joinedString2 = " + joinedString2);

    }
}
