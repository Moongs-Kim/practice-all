package javaadv1.thread.control;

import javaadv1.thread.start.HelloRunnable;

import static javaadv1.util.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread = " + mainThread.threadId());
        log("mainThread = " + mainThread.getName());
        log("mainThread = " + mainThread.getPriority()); // 1~10(기본값 5)
        log("mainThread = " + mainThread.getThreadGroup());
        log("mainThread = " + mainThread.getState());

        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread = " + myThread.threadId());
        log("myThread = " + myThread.getName());
        log("myThread = " + myThread.getPriority());
        log("myThread = " + myThread.getThreadGroup());
        log("myThread = " + myThread.getState());
    }
}
