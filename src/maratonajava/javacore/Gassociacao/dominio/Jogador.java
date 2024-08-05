package src.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        if(time == null){
            return "Jogador{" +
                    "nome='" + nome + '\'' +
                    '}';
        }
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", time=" + time.getNome() +
                '}';
    }
}
