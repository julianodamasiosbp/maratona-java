package maratonajava.javacore.Ycolecoes.test;

import java.util.NavigableSet;
import java.util.TreeSet;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

class smartphoneMarcaComparator implements java.util.Comparator<Smartphone> {
    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return s1.getModelo().compareTo(s2.getModelo());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new smartphoneMarcaComparator());

        Smartphone smartphone1 = new Smartphone("234", "Galaxy S21");
        Smartphone smartphone2 = new Smartphone("123", "iPhone 12");
        Smartphone smartphone3 = new Smartphone("456", "Pixel 5");

        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        System.out.println("----------------------");
        Smartphone lower = smartphones.lower(smartphone2);
        System.out.println("menor valor comparado: " + lower);
        Smartphone pollLast = smartphones.pollLast();
        System.out.println("remove o último: " + pollLast);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        System.out.println("----------------------");

    }

}
