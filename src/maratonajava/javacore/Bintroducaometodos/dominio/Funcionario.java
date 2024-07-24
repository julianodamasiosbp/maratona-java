package src.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimeOsDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        for(double salario : this.salarios) {
            System.out.print(salario + " ");
        }
        System.out.println();
    }

    public void mediaSalario() {
        double media = 0;
        for(double salario : this.salarios) {
            media += salario;
        }
        System.out.println("A média dos salários é: " + media / this.salarios.length);
    }

    public void adicionarSalario(double salario) {
        if(this.salarios[2] > 0) {
            System.out.println("Não é possível adicionar mais salário");
            return;
        }
        for(int i = 0; i < this.salarios.length; i++) {
            if(this.salarios[i] > 0) {
                continue;
            }
            this.salarios[i] = salario;
            break;
        }
    }
}
