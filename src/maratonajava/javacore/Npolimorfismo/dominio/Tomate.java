package src.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.05;
    private String dataValidade;

    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do Tomate");
        return preco * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
