package maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        System.out.println("Dentro do Construtor");
        for(int ep: episodios) {
            System.out.println(ep);
        }
    }
}
