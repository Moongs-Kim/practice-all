package javaadv1.thread.start.test;

import static javaadv1.util.MyLogger.log;

public class StartTest3Main {


    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log("A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "Thread-A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log("B");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "Thread-B");

        threadA.start();
        threadB.start();

        System.out.println("main() end");
    }
}
