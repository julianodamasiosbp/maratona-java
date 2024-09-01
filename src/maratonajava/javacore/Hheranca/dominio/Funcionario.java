package src.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public void imprime() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Rua: " + super.getEndereco().getRua());
        System.out.println("CEP: " + super.getEndereco().getCep());
        System.out.println("Salario: " + salario);
        System.out.println("=============================");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
