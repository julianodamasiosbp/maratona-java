package src.maratonajava.javacore.Gassociacao.test;

import src.maratonajava.javacore.Gassociacao.dominio.Aluno;
import src.maratonajava.javacore.Gassociacao.dominio.Local;
import src.maratonajava.javacore.Gassociacao.dominio.Professor;
import src.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao", 18);
        Aluno aluno2 = new Aluno("Maria", 17);
        Local local = new Local("Rua das Laranjeiras");
        Local local2 = new Local("Rua Ponta Negra");
        Professor professor = new Professor("Carlos Antonio", "JAVA");
        Seminario seminario = new Seminario("Seminario sobre JAVA", local, professor);
        Seminario seminario2 = new Seminario("Seminario sobre Banco de Dados", local2, professor);

        seminario.setProfessor(professor);
        seminario2.setProfessor(professor);
        Seminario[] listaSeminario = {seminario, seminario2};
        professor.setSeminarios(listaSeminario);
        aluno.setSeminario(seminario);
        Aluno[] alunos = {aluno, aluno2};
        seminario.setAlunos(alunos);


        System.out.println("################# Aluno ######################");
        aluno.imprime();
        System.out.println("################ Local #######################");
        local.imprime();
        System.out.println("################ Professor #######################");
        professor.imprime();
        System.out.println("################ Seminario #######################");
        seminario.imprime();


    }
}
