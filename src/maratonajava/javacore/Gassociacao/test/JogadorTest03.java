package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Jogador;
import maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Cafe");
        Time time = new Time("Botafogo");
        Jogador[] jogadores = {j1};
        j1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println(j1);
        time.imprime();

    }
}
