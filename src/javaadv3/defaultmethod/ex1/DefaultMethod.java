package javaadv3.defaultmethod.ex1;

public interface DefaultMethod {

    default String defaultMethod(int value) {
        return String.valueOf(value);
    }
}
