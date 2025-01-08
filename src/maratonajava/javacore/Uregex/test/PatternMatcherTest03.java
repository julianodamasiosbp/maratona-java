package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        /*
         * ? Zero ou uma ocorrência
         * * Zero ou mais
         * + Uma ou mais
         * {n, m} de n até m
         * () Agrupamento
         * | o(c|v)o vai retornar as ocorrências ovo ou oco
         * $ Representa o final
         */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0X 0x5F64C 0x1 0xH54fG 0xFFFFFFF 0XFFFFH";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.println();
    }

}
