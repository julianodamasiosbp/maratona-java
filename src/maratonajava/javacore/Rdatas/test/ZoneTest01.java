package maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println("====================");

        System.out.println(ZoneId.systemDefault());
        System.out.println("====================");

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println("====================");
        System.out.println(tokyoZone);
        System.out.println("====================");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("====================");
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        System.out.println("====================");

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime instantZonedDateTime = instant.atZone(tokyoZone);
        System.out.println(instantZonedDateTime);
        System.out.println("====================");

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime);


    }
}
