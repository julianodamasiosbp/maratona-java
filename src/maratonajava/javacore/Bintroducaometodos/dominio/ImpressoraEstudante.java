package maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("------------------ Dentro do ImpressoraEstudante ------------------");
        estudante.nome = "AAA";
        estudante.idade = 2;
        estudante.sexo = 'S';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
