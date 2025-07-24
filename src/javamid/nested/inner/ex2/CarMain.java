package javamid.nested.inner.ex2;

public class CarMain {

    public static void main(String[] args) {
        Car myCar = new Car("Model Y", 100);
        myCar.start();
        //myCar.new Engine().staticTest();
        System.out.println(Car.Engine.staticTest);
        Car.Engine.staticTest = 2;
        System.out.println(Car.Engine.staticTest);
        Car.Engine.staticTest();
    }
}
