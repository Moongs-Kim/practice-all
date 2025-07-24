package javamid.nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.new InnerClass().hello();

        new OuterClass2().new InnerClass().hello();
    }
}
