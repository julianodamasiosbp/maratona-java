package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        /*
         * \d = Todos os digitos
         * \D = Tudo que não for digito
         * \s = Todos os espaços em branco \t \n \f \r
         * \S = Todos os caracteres excluindo os brancos
         * \w = Tudo que for de a-zA-Z, dígitos e _ (underscore)
         * \W = Tudo que NÃO for de a-zA-Z, dígitos e _ (underscore)
         * [a, t, r, R, T] = Todos os valores que estão no colchete
         * [a-zB] = Retorna todos os valores de a - z minusculo e B maiusculo
         */

        String regex = "0[xX][0-9a-fA-F]";

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
