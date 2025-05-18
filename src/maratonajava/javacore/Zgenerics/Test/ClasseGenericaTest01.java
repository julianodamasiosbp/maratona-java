package maratonajava.javacore.Zgenerics.Test;

import maratonajava.javacore.Zgenerics.dominio.Carro;
import maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Carro alugado: " + carro);
        System.out.println("Usando o carro por um mês...");

        carroRentavelService.retornarCarro(carro);

    }

}
