package javaadv3.lambda.lambda6.test;

public class AnonymousTest {

    public static void main(String[] args) {
        Parent parent = new Parent() {
            String name;
        };
        System.out.println("parent = " + parent);

        AbstractClass abstractClass = new AbstractClass() {

            @Override
            void abstractMethod() {
                System.out.println("AnonymousTest.abstractMethod");
            }
        };
        abstractClass.abstractMethod();
        System.out.println("abstractClass = " + abstractClass);
    }
}
