package javaadv1.thread.executor.test;

import java.util.List;
import java.util.concurrent.*;

import static javaadv1.util.MyLogger.log;
import static javaadv1.util.ThreadUtils.sleep;

public class OrderService {

    public void order(String orderNo) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(3);

        List<Callable<Boolean>> orderTasks = List.of(new InventoryWork(orderNo), new ShippingWork(orderNo), new AccountingWork(orderNo));

        List<Future<Boolean>> futures = es.invokeAll(orderTasks);

        if (futures.get(0).get() && futures.get(1).get() && futures.get(2).get()) {
            log("모든 주문 처리가 성공적으로 완료되었습니다.");
        } else {
            log("일부 작입이 실패했습니다.");
        }
        es.close();


    }

    static class InventoryWork implements Callable<Boolean> {

        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class ShippingWork implements Callable<Boolean> {

        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork implements Callable<Boolean> {

        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
}
