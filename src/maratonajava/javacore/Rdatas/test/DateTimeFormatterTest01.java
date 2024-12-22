package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_DATE);
        String format3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);

        System.out.println("====================");
        LocalDate parse = LocalDate.parse("20241222", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse1 = LocalDate.parse("2024-12-22+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-12-22", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println("====================");

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
    }
}
