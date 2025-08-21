package javaadv3.lambda.lambda3;

public class TargetType1 {

    public static void main(String[] args) {
        FunctionA functionA = i -> "value = " + i;
        FunctionA functionB = i -> "value = " + i;

        // 이미 만들어진 FunctionA 인스턴스를 FunctionB에 대입 불가능
        //FunctionB targetB = functionA; // 컴파일 에러!
    }

    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }
}
