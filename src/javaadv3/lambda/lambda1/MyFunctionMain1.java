package javaadv3.lambda.lambda1;

import javaadv3.lambda.MyFunction;

public class MyFunctionMain1 {

    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction() {

            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };
        int result = myFunction.apply(1, 2);
        System.out.println("result = " + result);

    }
}
