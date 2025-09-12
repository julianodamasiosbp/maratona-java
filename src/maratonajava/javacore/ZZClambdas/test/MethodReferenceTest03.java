package maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceTest03 {
    // Method Reference
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));

        list.sort(String::compareTo);

        Function<String, Integer> parseStringToInteger = Integer::parseInt;
        Integer numero = parseStringToInteger.apply("200");
        System.out.println(numero);
    }
}
