package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(8);
        numeros.add(0);
        numeros.add(24);
        numeros.add(55);

        Collections.sort(numeros);

        int index = Collections.binarySearch(numeros, 55);
        System.out.println(numeros.get(index));

        System.out.println(numeros.indexOf(55));
    }

}
