package maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 32, 12);
        LocalTime agora = LocalTime.now();
        System.out.println(localTime);
        System.out.println(agora);
        System.out.println(localTime.getMinute());
        System.out.println(agora.getHour());
        System.out.println(agora.getSecond());
        System.out.println(agora.getNano());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MAX);
    }
}
