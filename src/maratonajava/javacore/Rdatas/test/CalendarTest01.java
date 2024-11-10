package src.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(calendar.DAY_OF_WEEK);
        System.out.println(calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(calendar.DAY_OF_YEAR);
        System.out.println(calendar.DAY_OF_MONTH);
        calendar.add(calendar.DAY_OF_WEEK, 2);
        Date date = calendar.getTime();
        System.out.println(date);

    }
}
