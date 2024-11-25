package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalenderPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalender(year, month);

    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMoth = LocalDate.of(year, month, 1);
        LocalDate firstDayaOfNextMonth = firstDayOfMoth.plusMonths(1);

        System.out.println("offsetWeekDays = " + firstDayOfMoth.getDayOfWeek().getValue() % 7);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // 월요일=1(1&7=1) ... 일요일=7(1&7=0)
        int offsetWeekDays = firstDayOfMoth.getDayOfWeek().getValue() % 7;
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMoth;
        System.out.println(dayIterator + " 2");
        while (dayIterator.isBefore(firstDayaOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
