package src.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

//    public void imprimeOsDados() {
//        System.out.println("Nome: " + nome);
//        System.out.println("Idade: " + idade);
//        for(double salario : this.salario) {
//            System.out.println("Salário: " + salario);
//        }
//    }
//
//    public void mediaSalario() {
//        double somaSalario = 0;
//        for(double salario : this.salario) {
//            somaSalario += salario;
//        }
//        System.out.println("A média dos salários é: " + somaSalario / this.salario.length);
//    }

//    public void adicionarSalario(double salario) {
//        if(this.salario == null) {
//            this.salario[0] = salario;
//            return;
//        }
//        if(this.salario.length == 3) {
//            System.out.println("Não é possível adicionar mais salário");
//            return;
//        }
//
//        int tamanho = this.salario.length;
//        this.salario[tamanho - 1] = salario;
//    }
}
