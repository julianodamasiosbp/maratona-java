package maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Julia";
        nomes[2] = "Jose";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
