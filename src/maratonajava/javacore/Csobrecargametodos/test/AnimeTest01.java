package src.maratonajava.javacore.Csobrecargametodos.test;

import src.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("DBZ", "TV", 123);
        anime.setGenero("Ação");
        System.out.println(anime);
    }
}
