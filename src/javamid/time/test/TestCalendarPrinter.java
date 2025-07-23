package javamid.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 시작이 무슨 요일인지 파악
            // 시작 요일부터 1씩 증가
            // 토요일이면 개행

            System.out.print("년도를 입력하세요: ");
            int year = scanner.nextInt();

            if (year == -1) {
                System.out.println("종료합니다.");
                break;
            }

            System.out.print("월을 입력하세요: ");
            int month = scanner.nextInt();

            LocalDate calendar = LocalDate.of(year, month, 1);
            LocalDate firstDay = calendar.with(TemporalAdjusters.firstDayOfMonth());
            int lastDay = calendar.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();

            System.out.println("Su Mo Tu We Th Fr Sa");

            DayOfWeek[] values = DayOfWeek.values();
            int saturdayOffset = 0;
            for (DayOfWeek value : values) {
                if (value.equals(firstDay.getDayOfWeek())) {
                    saturdayOffset = firstWeekOffset(value);
                }
            }

            for (int i = 1; i <= lastDay; i++) {
                if (i == saturdayOffset) {
                    System.out.printf("%2d ", i);
                    System.out.println();
                    saturdayOffset += 7;
                } else {
                    System.out.printf("%2d ", i);
                }
            }
            System.out.println();

        }

    }

    private static int firstWeekOffset(DayOfWeek firstWeekDayOfWeek) {
        int saturdayOffset = 7;
        switch (firstWeekDayOfWeek) {
            case SUNDAY:
                break;
            case MONDAY:
                System.out.printf("%3s", " ");
                saturdayOffset -= 1;
                break;
            case TUESDAY:
                System.out.printf("%6s", " ");
                saturdayOffset -= 2;
                break;
            case WEDNESDAY:
                System.out.printf("%9s", " ");
                saturdayOffset -= 3;
                break;
            case THURSDAY:
                System.out.printf("%12s", " ");
                saturdayOffset -= 4;
                break;
            case FRIDAY:
                System.out.printf("%15s", " ");
                saturdayOffset -= 5;
                break;
            case SATURDAY:
                System.out.printf("%18s", " ");
                saturdayOffset -= 6;
                break;
        }
        return saturdayOffset;
    }

}
