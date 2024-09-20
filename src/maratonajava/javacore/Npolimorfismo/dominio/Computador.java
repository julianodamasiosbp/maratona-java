package src.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do Computador");
        return preco * IMPOSTO_POR_CENTO;
    }
}
