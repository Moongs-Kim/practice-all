package javamid.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                
                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                
                System.out.println("outInstanceVar = " + outInstanceVar);

                // 지역 변수 변경시도 -> 컴파일 에러
                //localVar = 3;
                //paramVar = 3;
            }
        }
        LocalPrinter printer = new LocalPrinter();
        //printer.print();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        // printer.print() 를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
            //아래는 지역변수 목록 -> 캡처 변수를 확인할 수 있음
            //field = final int javamid.nested.local.LocalOuterV3$1LocalPrinter.val$localVar
            //field = final int javamid.nested.local.LocalOuterV3$1LocalPrinter.val$paramVar
        }
        
        /*
        process() 메서드가 종료되면 process()의 스택 프레임이 제거되면서 두 지역 변수도 함께 제거
        문제는 process() 메서드가 종료되어도 LocalPrinter 인스턴스는 계속 생존할 수 있다는 점
        */
    }
}
