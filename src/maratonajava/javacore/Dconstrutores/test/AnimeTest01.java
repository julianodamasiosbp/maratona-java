package maratonajava.javacore.Dconstrutores.test;


import maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Turma da Monica", "TV", 12, "Acao");
        //Anime animeConstrutorVazio = new Anime();
        //anime.init("DBZ", "TV", 123);
        anime.setGenero("Ação");
        System.out.println(anime);
        //System.out.println(animeConstrutorVazio);
    }
}
