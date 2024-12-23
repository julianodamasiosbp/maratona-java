package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Jogador;
import maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador pele = new Jogador("Pele");
        Time botafogo = new Time("Botafogo");

        pele.setTime(botafogo);

        System.out.println(pele);
    }
}
