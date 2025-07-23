package javamid.time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);
        //LocalDate twoWeekLater = localDate.plusWeeks(2);
        //System.out.println("twoWeekLater = " + twoWeekLater);

        /*for (int i = 1; i <= 5; i++) {
            System.out.println("날짜 " + i + ": " + date);
            date = date.plusWeeks(2);
        }
        System.out.println("date = " + date);*/

        for (int i = 0; i < 5; i++) {
            LocalDate plusedDate = date.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("plusedDate = " + plusedDate);
        }
    }
}
