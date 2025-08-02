package javaadv1.thread.start.test;

import static javaadv1.util.MyLogger.log;

public class StartTest2Main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    log("value: " + (i + 1));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "counter").start();

        new Thread(
                () -> {
                    for (int i = 0; i < 5; i++) {
                        log("value: " + (i + 1));
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }, "counter2").start();
    }
}
