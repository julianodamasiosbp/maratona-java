package src.maratonajava.javacore.Hheranca.test;

import src.maratonajava.javacore.Hheranca.dominio.Endereco;
import src.maratonajava.javacore.Hheranca.dominio.Funcionario;
import src.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Laranjeiras");
        endereco.setCep("59000-000");

        Pessoa pessoa = new Pessoa("Joao");
        pessoa.setCpf("09856785499");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Maria");
        funcionario.setCpf("0987654321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);
        funcionario.imprime();

        funcionario.relatorioPagamento();
    }
}
