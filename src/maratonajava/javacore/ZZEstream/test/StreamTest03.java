package maratonajava.javacore.ZZEstream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import maratonajava.javacore.ZZEstream.domain.LightNovel;

public class StreamTest03 {
    private static ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("B Novel 1", 10),
            new LightNovel("C Novel 2", 5), new LightNovel("A Novel 3", 15), new LightNovel("A Novel 4", 2),
            new LightNovel("A Novel 5", 5), new LightNovel("A Novel 5", 5)));

    public static void main(String[] args) {

        Stream<LightNovel> stream = lightNovels.stream();

        long count = stream.filter(ln -> ln.getPrice() <= 10).count();

        System.out.println(count);

        // Caso você chame o mesmo stream, ele dará um erro, já que uma vez utilizado, o
        // stream não pode ser utilizado
        // novamente, sendo necessário criar um novo stream para fazer uma nova operação

        // long count2 = stream.distinct().filter(ln -> ln.getPrice() <= 4).count();

        // !IMPORTANTE - Para utilizar o DISTINCT corretamente é necessário que o objeto
        // tenha implementado o
        // equals and hashcode para fazer a comparação entre os objetos

        // System.out.println(count2);

        // EXEMPLO
        long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 10).count();
        System.out.println(count2);

    }
}