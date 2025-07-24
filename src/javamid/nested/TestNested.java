package javamid.nested;

public class TestNested {

    B instanceValue1 = new B();
    C instanceValue2 = new C();
    
    void method1() {
        B var1 = new B();
        C var2 = new C();
    }
    
    //static B classValue1 = new B(); 에러 -> 외부 클래스가 먼저 생성되야 가능
    static C classValue2 = new C();
    
    static void method2() {
        //B var1 = new B(); 에러 -> 클래스 메서드에서 인스턴스 참조값 없이 사용 불가
        C var2 = new C();
    }
    
    class B {
        
    }

    static class C {
        
    }
}
