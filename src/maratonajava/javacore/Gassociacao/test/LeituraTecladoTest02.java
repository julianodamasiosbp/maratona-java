package src.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String resultado = "NÃO";
        boolean continuar = true;
        System.out.println("################################");
        System.out.println("Software de previsão do futuro!");
        System.out.println("################################");
        while (continuar) {
            resultado = "NÃO";
            System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO: ");
            String next = input.nextLine();
            char primeiraLetra = next.charAt(0);
            if(next.equalsIgnoreCase("SAIR")) {
                continuar = false;
                System.out.println("Até breve!");
                System.out.println("Deslogando...");
                break;
            }
            if (primeiraLetra == 'G' || primeiraLetra == 'g') {
                resultado = "SIM";
            }

            System.out.println(resultado);
        }


    }
}
