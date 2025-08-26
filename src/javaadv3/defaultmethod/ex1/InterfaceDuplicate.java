package javaadv3.defaultmethod.ex1;

public class InterfaceDuplicate {
    private int value;
    
    interface A {
        default void hello() {
            System.out.println("Hello from A");
        }
    }

    interface B {
        default void hello() {
            System.out.println("Hello from B");
        }
    }
    
    static class InterfaceDuplicateClass implements A, B {

        @Override
        public void hello() {
            // 반드시 충돌을 해결해야 함(오버라이드 강제)
            // 해결 방법은
            // 1. 직접 구현
            // 2. 아래와 같이 어떤 인터페이스의 메서드를 사용할것인지 지정
            A.super.hello();
            B.super.hello();
        }
    }
}
