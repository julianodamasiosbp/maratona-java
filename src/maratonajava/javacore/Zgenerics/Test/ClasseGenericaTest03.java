package maratonajava.javacore.Zgenerics.Test;

import java.util.ArrayList;
import java.util.List;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.dominio.Carro;
import maratonajava.javacore.Zgenerics.service.RentalService;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        System.out.println("---------------------CARRO----------------------");
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("Fusca"), new Carro("Civic"), new Carro("Palio")));
        RentalService<Carro> rentalService = new RentalService<Carro>(carrosDisponiveis);

        Object buscarObjetoDisponivel = rentalService.buscarObjetoDisponivel();
        if (buscarObjetoDisponivel instanceof Carro) {
            Carro carro = (Carro) buscarObjetoDisponivel;
            System.out.println("Carro alugado: " + carro);
            System.out.println("Usando o carro por um mês...");
            rentalService.retornarObjeto(carro);
        } else {
            System.out.println("Nenhum carro disponível para alugar.");
        }
        System.out.println("Carros disponíveis para alugar: " + carrosDisponiveis);
        System.out.println("Tentando alugar outro carro...");
        buscarObjetoDisponivel = rentalService.buscarObjetoDisponivel();

        System.out.println("---------------------BARCO----------------------");

        List<Barco> BarcosDisponiveis = new ArrayList<>(
                List.of(new Barco("Barco"), new Barco("Iate"), new Barco("Canoa")));
        RentalService<Barco> barcoRentalService = new RentalService<Barco>(BarcosDisponiveis);
        Object buscarBarcoDisponivel = barcoRentalService.buscarObjetoDisponivel();
        if (buscarBarcoDisponivel instanceof Barco) {
            Barco barco = (Barco) buscarBarcoDisponivel;
            System.out.println("Barco alugado: " + barco);
            System.out.println("Usando o Barco por um mês...");
            barcoRentalService.retornarObjeto(barco);
        } else {
            System.out.println("Nenhum Barco disponível para alugar.");
        }
        System.out.println("Barcos disponíveis para alugar: " + BarcosDisponiveis);
    }

}
