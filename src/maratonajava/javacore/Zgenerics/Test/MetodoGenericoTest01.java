package maratonajava.javacore.Zgenerics.Test;

import java.util.List;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.dominio.Carro;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArray(new Barco("Barco"));
        criarArray(new Carro("Carro"));
    }

    public static <T> void criarArray(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }
}
