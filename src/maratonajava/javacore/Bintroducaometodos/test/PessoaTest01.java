package src.maratonajava.javacore.Bintroducaometodos.test;

import src.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(-18);
//        pessoa.nome = "Joao";
//        pessoa.idade = 20;
        pessoa.imprime();
    }
}
