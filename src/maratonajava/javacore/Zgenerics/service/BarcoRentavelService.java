package maratonajava.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import maratonajava.javacore.Zgenerics.dominio.Barco;

public class BarcoRentavelService {

    private List<Barco> BarcosDisponiveis = new ArrayList<>(
            List.of(new Barco("Barco"), new Barco("Iate"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel() {
        if (BarcosDisponiveis.isEmpty()) {
            System.out.println("Não há Barcos disponíveis");
            return null;
        }
        Barco Barco = BarcosDisponiveis.remove(0);
        System.out.println("Alugando Barco " + Barco);
        System.out.println("Barcos disponíveis para alugar " + BarcosDisponiveis);
        return Barco;
    }

    public void retornarBarco(Barco Barco) {
        System.out.println("Retornando Barco " + Barco);
        BarcosDisponiveis.add(Barco);
        System.out.println("Barcos disponíveis para alugar " + BarcosDisponiveis);
    }
}
