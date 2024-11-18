package src.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDatetime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalTime time = LocalTime.of(9, 45, 21);
        System.out.println(localDatetime);

        LocalDateTime localDateTime = date.atTime(time);
        System.out.println(localDatetime);
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime2);
    }
}
