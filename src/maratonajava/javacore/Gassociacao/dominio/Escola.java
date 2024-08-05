package src.maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    @Override
    public String toString() {
        if(professores == null){
            return "Escola{" +
                    "nome='" + nome + '\'' +
                    '}';
        }
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", professores=" + Arrays.toString(professores) +
                '}';
    }
}
