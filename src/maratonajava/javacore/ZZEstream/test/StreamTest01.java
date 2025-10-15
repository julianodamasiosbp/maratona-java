package maratonajava.javacore.ZZEstream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import maratonajava.javacore.ZZEstream.domain.LightNovel;

public class StreamTest01 {
    private static ArrayList<LightNovel> lista = new ArrayList<>(List.of(new LightNovel("B Novel 1", 10),
            new LightNovel("C Novel 2", 5), new LightNovel("A Novel 3", 15)));

    public static void main(String[] args) {

        lista.add(new LightNovel("Z Novel 4", 25));

        // lista.forEach((el) -> System.out.println(el));
        lista.sort(Comparator.comparing(LightNovel::getTitle));

        System.out.println(lista);
    }

}
