package javamid.time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        /*
        LocalDate date = LocalDate.of(2024, 1, 1);
        LocalTime time = LocalTime.of(9, 0, 0);

        ZonedDateTime seoulTime = ZonedDateTime.of(date, time, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = ZonedDateTime.of(date, time, ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = ZonedDateTime.of(date, time, ZoneId.of("America/New_York"));
        System.out.println("서울의 회의 시간: " + seoulTime);
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴옥의 회의 시간: " + newYorkTime);
        */

        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("서울의 회의 시간: " + seoulTime);
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴옥의 회의 시간: " + newYorkTime);
    }
}
