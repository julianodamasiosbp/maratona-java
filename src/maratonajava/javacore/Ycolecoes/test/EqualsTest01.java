package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("123", "Iphone");
        Smartphone smartphone2 = new Smartphone("123", "Iphone");

        Smartphone smartphone3 = smartphone1;

        System.out.println(smartphone1.equals(smartphone2));
        System.out.println(smartphone3.equals(smartphone1));

        System.out.println(smartphone1);
        System.out.println(smartphone2);
        System.out.println(smartphone3);

        System.out.println(smartphone1 == smartphone2);
    }

}
