package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Alberto");
        nomes.add("Zaia");
        nomes.add("Pedro");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("--------------------");

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
