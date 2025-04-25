package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Pedro");
        lista.add("Maria");
        lista.add("Leandro");
        lista.add("Gabriel");
        // lista.add(12L);

        for (Object item : lista) {

            System.out.println(item);
        }

        System.out.println("--------------------");

        String nome = lista.get(3);
        System.out.println(nome);
        System.out.println("--------------------");
        lista.remove(3);

        for (Object item : lista) {
            System.out.println(item);
        }
    }

}
