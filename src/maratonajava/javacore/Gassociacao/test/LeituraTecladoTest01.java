package maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite... ");
        String valor = input.nextLine();
        System.out.println("O dado informado é ... " + valor);

        System.out.println("Informe uma palavra: ");
        char letra = input.next().charAt(0);
        System.out.println(letra);
    }
}
