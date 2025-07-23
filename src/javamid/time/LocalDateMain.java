package javamid.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변)
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 +10d = " + plusDays);
        System.out.println("기존 지정 날짜 변경 안됨 = " + ofDate);
    }
}
