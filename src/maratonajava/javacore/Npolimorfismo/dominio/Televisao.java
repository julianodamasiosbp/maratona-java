package src.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.21;

    public Televisao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto da Televisão");
        return preco * IMPOSTO_POR_CENTO;
    }
}
