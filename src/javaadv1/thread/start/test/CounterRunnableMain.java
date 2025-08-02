package javaadv1.thread.start.test;

public class CounterRunnableMain {

    public static void main(String[] args) {
        new Thread(new CounterRunnable(), "counter").start();
    }
}
