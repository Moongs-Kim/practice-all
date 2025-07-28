package javamid2.generic.ex4;

import javamid2.generic.animal.Cat;
import javamid2.generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.checkup(cat);

        Dog bigger = AnimalMethod.getBigger(dog, new Dog("큰 멍멍이", 200));
        System.out.println("bigger = " + bigger);
    }
}
