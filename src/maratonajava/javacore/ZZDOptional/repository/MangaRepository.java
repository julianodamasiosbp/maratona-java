package maratonajava.javacore.ZZDOptional.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import maratonajava.javacore.ZZDOptional.domain.Manga;

public class MangaRepository {

    private static List<Manga> mangas = List.of(new Manga(1, "Anime 1", 10),
            new Manga(2, "Anime 2", 40),
            new Manga(3, "Anime 3", 5));

    public Optional<Manga> findByTitle(String title) {
        return findBy((m) -> m.getTitle().equals(title));
    }

    public Optional<Manga> findById(Integer id) {
        return findBy((m) -> m.getId().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
                return Optional.of(found);
            }
        }

        return Optional.ofNullable(found);
    }

}
