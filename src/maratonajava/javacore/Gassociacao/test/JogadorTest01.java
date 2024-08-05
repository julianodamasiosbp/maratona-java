package src.maratonajava.javacore.Gassociacao.test;

import src.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pele");
        Jogador j2 = new Jogador("Cafu");
        Jogador j3 = new Jogador("Romario");

        Jogador[] jogadores = {j1, j2, j3};

        for(Jogador j : jogadores){
            System.out.println(j);
        }

    }
}
