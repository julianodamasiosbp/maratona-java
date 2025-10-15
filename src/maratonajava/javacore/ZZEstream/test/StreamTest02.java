package maratonajava.javacore.ZZEstream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import maratonajava.javacore.ZZEstream.domain.LightNovel;

public class StreamTest02 {
    private static ArrayList<LightNovel> lista = new ArrayList<>(List.of(new LightNovel("B Novel 1", 10),
            new LightNovel("C Novel 2", 5), new LightNovel("A Novel 3", 15), new LightNovel("A Novel 4", 2),
            new LightNovel("A Novel 5", 5)));

    public static void main(String[] args) {

        List<String> collect = lista.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter((novel) -> novel.getPrice() <= 10)
                .limit(4)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}