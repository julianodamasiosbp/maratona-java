package src.maratonajava.javacore.Bintroducaometodos.test;

import src.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Joao";
        funcionario.idade = 47;

        funcionario.adicionarSalario(5000);
        funcionario.adicionarSalario(1500);
        funcionario.adicionarSalario(1700);
        funcionario.adicionarSalario(5500);

        funcionario.imprimeOsDados();
        funcionario.mediaSalario();
    }
}
