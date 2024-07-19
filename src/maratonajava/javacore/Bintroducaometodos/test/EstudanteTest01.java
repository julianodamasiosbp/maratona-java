package src.maratonajava.javacore.Bintroducaometodos.test;

import src.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import src.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        Estudante est2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        est.nome = "Joao";
        est.idade = 22;
        est.sexo = 'M';

        System.out.println("------------------ Dentro do EstudanteTest01 ------------------");
        System.out.println(est.nome);
        System.out.println(est.idade);
        System.out.println(est.sexo);
        System.out.println("------------------");

        est2.nome = "Maria";
        est2.idade = 21;
        est2.sexo = 'F';

        impressora.imprime(est);

        System.out.println("------------------ Dentro do EstudanteTest01 ------------------");
        System.out.println(est.nome);
        System.out.println(est.idade);
        System.out.println(est.sexo);
        System.out.println("------------------");
        System.out.println(est2.nome);
        System.out.println(est2.idade);
        System.out.println(est2.sexo);

        est.imprime();
        est2.imprime();
    }
}
