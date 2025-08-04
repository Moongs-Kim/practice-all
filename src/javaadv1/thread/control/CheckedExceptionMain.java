package javaadv1.thread.control;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() /* throws Exception */ { //주석 풀면 예외 발생
            //throw new Exception(); //주석 풀면 예외 발생
        }
    }
    static class CheckedRunnable2 implements Runnable {

        @Override
        public void run() /* throws InterruptedException */ { //주석 풀면 예외 발생
            //InterruptedException 체크 예외이다.
            //Thread.sleep(3000); //주석 풀면 예외 발생

        }
    }
}
