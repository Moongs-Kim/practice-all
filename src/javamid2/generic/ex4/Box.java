package javamid2.generic.ex4;

public class Box<T> {
    static <V> V staticMethod1(V v) { return v; };
    static <V> void staticMethod2(V v) {};

    <Z> Z instanceMethod(Z z) { return z; };
    
    // 제네릭 타입의 T 사용 가능
    T instanceMethod2(T t) { return t;};
    
    // 제네릭 타입의 T 사용 불가능
    //static T staticMethod3(T t) {};
}
