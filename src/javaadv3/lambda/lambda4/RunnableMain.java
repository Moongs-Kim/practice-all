package javaadv3.lambda.lambda4;

public class RunnableMain {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> {
            System.out.println("lambda thread = " + Thread.currentThread().getName());
        };
        Thread lambdaThread = new Thread(runnable2);
        lambdaThread.start();

        System.out.println("== main end ==");
    }
}
