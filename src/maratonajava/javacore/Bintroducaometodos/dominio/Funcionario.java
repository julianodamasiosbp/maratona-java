package src.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimeOsDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        for(double salario : this.salarios) {
            System.out.println("Salário: " + salario);
        }
    }

    public void mediaSalario() {
        double somaSalario = 0;
        for(double salario : this.salarios) {
            somaSalario += salario;
        }
        System.out.println("A média dos salários é: " + somaSalario / this.salarios.length);
    }

    public void adicionarSalario(double salario) {
        for(int i = 0; i < this.salarios.length; i++) {
            if(this.salarios[2] > 0) {
                System.out.println("Não é possível adicionar mais salário");
            }
            if(this.salarios[i] > 0) {
                continue;
            }
            this.salarios[i] = salario;
            break;
        }
    }
}
