package maratonajava.javacore.ZZClambdas.services;

import maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {

    public static int compareByTitle(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public static int compareByEpisodes(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getepisodesInteger(), anime2.getepisodesInteger());
    }

    public int compareByEpisodesNonStatic(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getepisodesInteger(), anime2.getepisodesInteger());
    }

}
