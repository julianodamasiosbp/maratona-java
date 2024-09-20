package src.maratonajava.javacore.Npolimorfismo.test;

import src.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import src.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import src.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        // Tipo mais generico fazendo referência (produto) a um tipo mais específico (computador)
        Produto produto = new Computador("XPTO", 500);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        Produto produto2 = new Tomate("Americano", 15);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getPreco());
        //System.out.println(produto2.getdataValidade());
    }
}
