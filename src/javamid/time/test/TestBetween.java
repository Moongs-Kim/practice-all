package javamid.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period dDay = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("남은 기간: " + dDay.getYears() + "년 " + dDay.getMonths()
                + "월 " + dDay.getDays() + "일");
        System.out.println("디데이: " + daysBetween + "일");
    }
}
