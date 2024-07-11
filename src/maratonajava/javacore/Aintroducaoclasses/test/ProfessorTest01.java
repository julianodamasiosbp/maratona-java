package src.maratonajava.javacore.Aintroducaoclasses.test;

import src.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "João";
        professor.idade = 42;
        professor.sexo = 'M';

        System.out.println(professor.nome + " "
                + professor.idade + " " + professor.sexo);
    }
}
