package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class ListTest02 {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("ABC123", "Iphone");
        Smartphone smartphone2 = new Smartphone("123HJK", "Samsung");
        Smartphone smartphone3 = new Smartphone("999ppp", "Nokia");

        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone smartphone4 = new Smartphone("6789g", "Pixel");

        smartphones.add(smartphone4);

        System.out.println(smartphones.contains(smartphone4));

    }

}
