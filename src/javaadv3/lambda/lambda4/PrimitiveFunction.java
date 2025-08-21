package javaadv3.lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {

    public static void main(String[] args) {
         // 기본형 매개변수, IntFunction, LongFunction, DoubleFunction
        IntFunction<String> function = x -> "숫자: " + x;
        System.out.println(function.apply(5));

        // 기본형 반환, ToIntFunction, ToLongFunction, ToDoubleFunction
        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println(toIntFunction.applyAsInt("hihihi"));

        // 기본형 매개변수, 기본형 반환
        IntToLongFunction intToLongFunction = n -> n * 100L;
        System.out.println(intToLongFunction.applyAsLong(10));

        // IntUnaryOperator: int -> int
        IntUnaryOperator intUnaryOperator = n -> n * 100;
        System.out.println(intUnaryOperator.applyAsInt(300));

        // 기타, IntConsumer, IntSupplier, IntPredicate
    }
}
