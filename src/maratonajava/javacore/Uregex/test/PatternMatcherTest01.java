package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // Expressão Regular
        // Utilizado em validação de E-mail

        String regex = "aba";
        // String texto = "abaaba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
        System.out.println();
    }

}
