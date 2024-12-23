package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        // Tipo mais generico fazendo referência (produto) a um tipo mais específico (computador)
        Produto produto = new Computador("XPTO", 500);

        Tomate tomate = new Tomate("Americano", 15);
        tomate.setDataValidade("01/01/2020");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
