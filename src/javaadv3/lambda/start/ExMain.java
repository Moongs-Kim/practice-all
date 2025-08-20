package javaadv3.lambda.start;

import java.util.Random;

public class ExMain {

    public static void main(String[] args) {
        helloMethod(new Dice());
        helloMethod(new Increment());
    }

    private static void helloMethod(Hello hello) {
        long startNs = System.nanoTime();

        hello.hello();

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    static interface Hello {
        void hello();
    }

    static class Dice implements Hello{

        @Override
        public void hello() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Increment implements Hello {

        @Override
        public void hello() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
}
