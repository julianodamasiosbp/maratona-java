package maratonajava.javacore.ZZClambdas.dominio;

public class Anime {

    private String title;
    private Integer episodesInteger;

    public Anime(String title, Integer episodesInteger) {
        this.title = title;
        this.episodesInteger = episodesInteger;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getepisodesInteger() {
        return episodesInteger;
    }

    public void setepisodesInteger(Integer episodesInteger) {
        this.episodesInteger = episodesInteger;
    }

    @Override
    public String toString() {
        return "Anime [title=" + title + ", episodesInteger=" + episodesInteger + "]";
    }

    

}
