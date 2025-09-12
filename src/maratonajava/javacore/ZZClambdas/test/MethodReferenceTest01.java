package maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;

import maratonajava.javacore.ZZClambdas.dominio.Anime;
import maratonajava.javacore.ZZClambdas.services.AnimeComparators;

public class MethodReferenceTest01 {
    // Static Method Reference
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 5), new Anime("Peppa Pig", 1),
                new Anime("Little Angel", 99), new Anime("AAA", 35)));

        // Collections.sort(animeList, (anime1, anime2) ->
        // anime1.getTitle().compareTo(anime2.getTitle()));

        animeList.sort(AnimeComparators::compareByTitle);

        System.out.println(animeList);
    }

}
