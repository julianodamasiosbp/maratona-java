package maratonajava.javacore.Zgenerics.Test;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService BarcoRentavelService = new BarcoRentavelService();

        Barco Barco = BarcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Barco alugado: " + Barco);
        System.out.println("Usando o Barco por um mês...");

        BarcoRentavelService.retornarBarco(Barco);

    }

}
