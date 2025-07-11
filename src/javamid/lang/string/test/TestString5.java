package javamid.lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        System.out.println(str.indexOf(key, 0));
        System.out.println(str.indexOf(key, 7));
        System.out.println(str.indexOf(key, 18));
        System.out.println(str.indexOf(key, 19));

       /* int index = 0;
        for (int i = 0; i < 3; i++) {
            index = str.indexOf(key, index + 1);
            System.out.println(index);
        }*/

        int index = 0;
        int count = 0;
        while (true) {
            index = str.indexOf(key, index + 1);
            if (index < 0) break;
            count++;
        }
        System.out.println("count = " + count);
    }
}
