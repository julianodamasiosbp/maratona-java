package maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();

        fila.add("Z");
        fila.add("H");
        fila.add("G");
        fila.add("F");
        fila.add("A");
        fila.add("B");

        System.out.println(fila);
        System.out.println("=========================");
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }

    }

}
