package maratonajava.javacore.Npolimorfismo.servico;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("==== Relatório do computador: ====");
        double imposto = computador.calcularImposto();
        System.out.println("computador: " + computador.getNome());
        System.out.println("preço: " + computador.getPreco());
        System.out.println("Imposto: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("==== Relatório do Tomate: ====");
        double imposto = tomate.calcularImposto();
        System.out.println("tomate: " + tomate.getNome());
        System.out.println("preço: " + tomate.getPreco());
        System.out.println("Imposto: " + imposto);
    }

    public static void calcularImposto(Produto produto) {
        System.out.println("==== Relatório ====");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("preço: " + produto.getPreco());
        System.out.println("Imposto: " + imposto);

        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }
}
