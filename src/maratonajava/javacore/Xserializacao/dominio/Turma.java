package maratonajava.javacore.Xserializacao.dominio;

public class Turma {

    // @Serial
    // private static final long serialVersionUID = 1L;

    private String nome;

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
