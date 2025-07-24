package javamid.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        //static class StaticLocalPrinter { } // static class 사용 불가
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                
                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

            // static 테스트 -> 자바 버전이 올라가면서 부터 사용 가능
            static int localStaticVar = 0;
            public static void staticTest() {
                System.out.println("지역 클래스에서 static method 선언 가능");
            }
        }
        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        //localVar = 10; // 컴파일 오류
        //paramVar = 20; // 컴파일 오류

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();

    }
}
