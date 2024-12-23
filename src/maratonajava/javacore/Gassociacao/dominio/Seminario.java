package maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario(String titulo, Local local, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void imprime() {
        System.out.println("O titulo do seminário é: "+titulo);
        System.out.println("O local vai ser: "+local.getEndereco());
        if(alunos != null){
            System.out.println("Lista de Alunos cadastrados: ");
            for(Aluno aluno : alunos){
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Não existe alunos cadastrados");
        }
        System.out.println("O Professor que vai ministrar esse seminário é: "+professor.getNome());
    }
}
