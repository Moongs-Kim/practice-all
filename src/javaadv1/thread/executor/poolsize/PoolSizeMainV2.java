package javaadv1.thread.executor.poolsize;

import javaadv1.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static javaadv1.thread.executor.ExecutorUtils.printState;
import static javaadv1.util.MyLogger.log;
import static javaadv1.util.ThreadUtils.sleep;

public class PoolSizeMainV2 {

    public static void main(String[] args) {
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        //ExecutorService es = new ThreadPoolExecutor(2, 4, 3000, TimeUnit.MILLISECONDS, workQueue);
        ExecutorService es = Executors.newFixedThreadPool(2);
        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 6; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        es.close();
        log("== shutdown 완료 ==");
    }
}
