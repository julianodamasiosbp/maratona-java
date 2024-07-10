package src.maratonajava.javacore.Aintroducaoclasses.test;

import src.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Maria";
        estudante.idade = 12;
        estudante.sexo = 'F';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
