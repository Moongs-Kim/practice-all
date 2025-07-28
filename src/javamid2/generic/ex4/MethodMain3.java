package javamid2.generic.ex4;

import javamid2.generic.animal.Cat;
import javamid2.generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        //ComplexBox<Integer> integerHospital = new ComplexBox<>(); // 타입 매개변수 제한
        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        // 제네릭 타입과 제네릭 메서드 서로 제한 다르게 설정
        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);

        // 제네릭 메서드 - 타입 매개변수 제한 안함
        Integer integerValue = 10;
        Integer returnInteger = hospital.printAndReturn(integerValue);
        System.out.println("returnInteger = " + returnInteger);
    }
}
