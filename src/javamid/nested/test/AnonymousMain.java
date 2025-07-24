package javamid.nested.test;

public class AnonymousMain {

    public static void main(String[] args) {
        Hello anonymousClass = new Hello() {

            @Override
            public void hello() {
                System.out.println("AnonymousClass");
            }
        };
        anonymousClass.hello();

        new Hello() {

            @Override
            public void hello() {
                System.out.println("AnonymousClass");
            }
        }.hello();
    }
}
