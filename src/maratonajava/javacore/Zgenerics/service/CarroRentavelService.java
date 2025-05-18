package maratonajava.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import maratonajava.javacore.Zgenerics.dominio.Carro;

public class CarroRentavelService {

    private List<Carro> carrosDisponiveis = new ArrayList<>(
            List.of(new Carro("Fusca"), new Carro("Civic"), new Carro("Palio")));

    public Carro buscarCarroDisponivel() {
        if (carrosDisponiveis.isEmpty()) {
            System.out.println("Não há carros disponíveis");
            return null;
        }
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro " + carro);
        System.out.println("Carros disponíveis para alugar " + carrosDisponiveis);
        return carro;
    }

    public void retornarCarro(Carro carro) {
        System.out.println("Retornando carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar " + carrosDisponiveis);
    }
}
