package javamid.nested.inner.ex2;



public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    public class Engine {
        // 내부 클래스에 static 변수 선언 가능
        static int staticTest = 1;

        public void start() {
            System.out.println("staticTest = " + staticTest);
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }

        //내부 클래스에 static method 선언 가능
        public static void staticTest() {
            System.out.println("static method test");
        }
    }
}
