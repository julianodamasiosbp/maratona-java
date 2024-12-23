package maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + salario);
        System.out.println("=============================");
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario + " reais");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
