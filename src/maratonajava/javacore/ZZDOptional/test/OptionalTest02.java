package maratonajava.javacore.ZZDOptional.test;

import java.util.Optional;

import maratonajava.javacore.ZZDOptional.domain.Manga;
import maratonajava.javacore.ZZDOptional.repository.MangaRepository;

public class OptionalTest02 {

    public static void main(String[] args) {
        MangaRepository mangaRepository = new MangaRepository();

        Optional<Manga> mangaOptional = mangaRepository.findByTitle("Anime 1");

        if (mangaOptional.isPresent()) {
            System.out.println(mangaOptional.get());
        } else {
            System.out.println("Não existe um Manga com esse nome");
        }

        Manga mangaById = mangaRepository.findById(10).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);
    }
}
