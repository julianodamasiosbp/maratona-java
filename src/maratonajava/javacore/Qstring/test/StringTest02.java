package src.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Maria";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("r", "l"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

        String numeros = "0123456789";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,10));

        String teste = "   Teste Testando o Teste      ";
        System.out.println(teste.trim());
    }
}
