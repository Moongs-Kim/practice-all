package javamid2.generic.ex5;

import javamid2.generic.animal.Animal;
import javamid2.generic.animal.Cat;
import javamid2.generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        //writeBox(dogBox); // 하한이 Animal
        //writeBox(catBox); // 하한이 Animal


    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
