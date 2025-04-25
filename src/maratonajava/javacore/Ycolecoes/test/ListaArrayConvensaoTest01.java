package maratonajava.javacore.Ycolecoes.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaArrayConvensaoTest01 {
    public static void main(String[] args) {

        Integer[] numeros = new Integer[6];
        numeros[0] = 2;
        numeros[1] = 6;
        numeros[2] = 9;
        numeros[3] = 12;

        List<Integer> asList = Arrays.asList(numeros);

        asList.stream().forEach(System.out::println);

        System.out.println("----------------------");

        // asList.add(5); Não é permitido adicionar um novo elemento quando o Array é
        // convertido para List

        Set<Integer> numerosSet = new HashSet<>();

        numerosSet.add(6);
        numerosSet.add(9);
        numerosSet.add(18);

        for (Integer integer : numerosSet) {
            System.out.println(integer);
        }

        numerosSet.remove(9);
        System.out.println("----------------------");

        for (Integer integer : numerosSet) {
            System.out.println(integer);
        }

    }

}
