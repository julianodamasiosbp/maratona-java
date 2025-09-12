package maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;

import maratonajava.javacore.ZZClambdas.dominio.Anime;
import maratonajava.javacore.ZZClambdas.services.AnimeComparators;

public class MethodReferenceTest02 {
    // Non-Static Method Reference
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 5), new Anime("Peppa Pig", 1),
                new Anime("Little Angel", 99), new Anime("AAA", 35)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
    }
}
