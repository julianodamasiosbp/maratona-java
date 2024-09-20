package src.maratonajava.javacore.Npolimorfismo.test;

import src.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import src.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import src.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import src.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Compaq", 5000);
        Tomate tomate = new Tomate("Cereja", 10);
        Televisao televisao = new Televisao("Samsung 50\"", 3478);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(televisao);
    }
}
