package src.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2024, 1, 9);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // ano bissexto
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
