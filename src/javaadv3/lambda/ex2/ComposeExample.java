package javaadv3.lambda.ex2;

public class ComposeExample {

    // String transform(String s);
    private static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return str ->  f2.transform(f1.transform(str));
    }

    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();

        MyTransformer addDeco = s -> "**" + s + "**";

        MyTransformer composeFunc = compose(toUpper, addDeco);

        String result = composeFunc.transform("hello");
        System.out.println(result);
    }
}
