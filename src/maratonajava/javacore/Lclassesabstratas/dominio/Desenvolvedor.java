package maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprime() {
        System.out.println(this.nome + " - " + this.salario);
    }
}
