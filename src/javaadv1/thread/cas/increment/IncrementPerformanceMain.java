package javaadv1.thread.cas.increment;

import java.util.ArrayList;
import java.util.List;

import static javaadv1.util.ThreadUtils.sleep;

public class IncrementPerformanceMain {

    public static final int COUNT = 100_000_000;

    public static void main(String[] args) throws InterruptedException {
        test(new BasicInteger());
        test(new MyAtomicInteger());
    }

    private static void test(IncrementInteger incrementInteger) throws InterruptedException {
        long startMs = System.currentTimeMillis();

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                sleep(10);

                incrementInteger.increment();
            }
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            incrementInteger.increment();
        }
        long endMs = System.currentTimeMillis();

        System.out.println(incrementInteger.getClass().getSimpleName() + ": ms= " + (endMs - startMs));

    }
}
