package src.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static{
        System.out.println("Dentro do bloco de inicialização estático");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    {
        System.out.println("Dentro do bloco de inicialização Não estático");
    }

    public Anime() {
        System.out.println("Dentro do Construtor");
        for(int ep: episodios) {
            System.out.println(ep);
        }
    }
}
