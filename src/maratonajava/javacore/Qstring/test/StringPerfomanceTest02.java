package maratonajava.javacore.Qstring.test;

public class StringPerfomanceTest02 {
    public static void main(String[] args) {
        String nome = "Pedro da Silva";
        nome.concat("DevDojo");

        System.out.println(nome);

        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" Ferreira");
        System.out.println(sb);

        String substring = sb.substring(0, 5);
        System.out.println(substring);
        StringBuilder reverse = sb;
        reverse.reverse();
        System.out.println(reverse);
        System.out.println(sb);

    }

}
