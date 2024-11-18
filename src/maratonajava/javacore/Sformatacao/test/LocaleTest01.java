package src.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localItaly = new Locale("it", "IT");
        Locale localSuica = new Locale("it", "CH");
        Locale localIndia = new Locale("hi", "IN");
        Locale localJapao = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat italyFormat = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat suicaFormat = DateFormat.getDateInstance(DateFormat.FULL, localSuica);
        DateFormat indiaFormat = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat japaoFormat = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
        System.out.println("Italia: " + italyFormat.format(calendar.getTime()));
        System.out.println("Suica: " + suicaFormat.format(calendar.getTime()));
        System.out.println("India: " + indiaFormat.format(calendar.getTime()));
        System.out.println("Japão: " + japaoFormat.format(calendar.getTime()));

    }
}
