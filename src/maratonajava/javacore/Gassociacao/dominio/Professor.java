package maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("O nome do professor é : "+nome);
        System.out.println("A especialidade do professor é : "+especialidade);
        if(seminarios != null){
            System.out.println("Lista de Seminarios cadastrados para esse professor: ");
            for(Seminario seminario : seminarios){
                System.out.println(seminario.getTitulo());
            }
        } else {
            System.out.println("Não existe seminários cadastrados");
        }
    }
}
