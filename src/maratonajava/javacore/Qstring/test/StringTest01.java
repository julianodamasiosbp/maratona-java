package maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Pedro";
        String nome2 = "Pedro";
        nome = nome.concat(" da Silva");
        System.out.println(nome == nome2);
        String nome3 = new String("Pedro");
        System.out.println(nome3);
        System.out.println(nome2);
        System.out.println(nome2 == nome3);
    }
}
