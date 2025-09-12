package maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import maratonajava.javacore.ZZClambdas.dominio.Anime;
import maratonajava.javacore.ZZClambdas.services.AnimeComparators;

public class MethodReferenceTest04 {
    // Method Reference
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 5), new Anime("Peppa Pig", 1),
                new Anime("Little Angel", 99), new Anime("AAA", 35)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Dragon Ball GT", 42));

    }
}
