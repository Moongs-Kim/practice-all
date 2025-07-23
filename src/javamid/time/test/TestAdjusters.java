package javamid.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);

        LocalDate firstDate = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("with = " + firstDate);

        DayOfWeek firstDayOfWeek = firstDate.getDayOfWeek();
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);

        LocalDate lastDate = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDate = " + lastDate);

        DayOfWeek lastDateDayOfWeek = lastDate.getDayOfWeek();
        System.out.println("lastDateDayOfWeek = " + lastDateDayOfWeek);
    }
}
