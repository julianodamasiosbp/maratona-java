package maratonajava.javacore.ZZDOptional.domain;

public class Manga {
    private Integer id;
    private String title;
    private int episodes;

    public Manga(Integer id, String title, int episodes) {
        this.id = id;
        this.title = title;
        this.episodes = episodes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Manga [id=" + id + ", title=" + title + ", episodes=" + episodes + "]";
    }

}
