package src.maratonajava.javacore.Gassociacao.test;

import src.maratonajava.javacore.Gassociacao.dominio.Escola;
import src.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Joao", "Fisica");
        Escola escola = new Escola("CEI");
        Professor[] professores = {professor};
        escola.setProfessores(professores);

        System.out.println(escola);
    }
}
