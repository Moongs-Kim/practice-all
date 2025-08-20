package javaadv3.lambda.ex2;

public class BuildGreeterExample {

    private static StringFunction buildGreeter(String greeting) {
        return str -> greeting + ", " + str;
    }

    public static void main(String[] args) {
        StringFunction hello = buildGreeter("Hello");
        String result1 = hello.apply("Java");
        System.out.println("result1 = " + result1);

        StringFunction hi = buildGreeter("Hi");
        String result2 = hi.apply("Lambda");
        System.out.println("result2 = " + result2);
    }
}
