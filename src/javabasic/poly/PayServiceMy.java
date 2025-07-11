package javabasic.poly;

public class PayServiceMy {

    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        if (option.equals("kakao")) {
            result = payStart(new KakaoPay(), amount);
        } else if (option.equals("naver")) {
            result = payStart(new NaverPay(), amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        isSuccess(result);
    }

    private boolean payStart(Pay pay, int amount) {
        return pay.pay(amount);
    }

    private void isSuccess(boolean result) {
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
