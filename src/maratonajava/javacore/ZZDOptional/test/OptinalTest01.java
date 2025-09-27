package maratonajava.javacore.ZZDOptional.test;

import java.util.List;
import java.util.Optional;

public class OptinalTest01 {
    public static void main(String[] args) {
        Optional<String> name = findName("Joao");
        Optional<String> nameNotFound = findName("Joao 2");

        if (name.isPresent()) {

            System.out.println(name.get());
        } else {
            System.out.println("NOME NAO ENCONTRADO");
        }

        if (nameNotFound.isPresent()) {

            System.out.println(nameNotFound.get());
        } else {
            System.out.println("NOME NAO ENCONTRADO");
        }

        System.out.println("---------------------------");
        // String name = findName("Joaoo");
        Optional<String> optionalName = Optional.ofNullable(findName2("Joao"));
        System.out.println(optionalName);

        String orElse = optionalName.orElse("EMPTY");
        System.out.println(orElse);

        optionalName.ifPresent((n) -> System.out.println(n.toUpperCase()));
        optionalName.ifPresentOrElse((n) -> System.out.println("ENCONTROU: " + n),
                () -> System.out.println("NOME NAO ENCONTRADO"));

        System.out.println("---------------------------");
        Optional<String> optionalNameNotFound = Optional.ofNullable(findName2("Gabriel"));
        System.out.println(optionalNameNotFound);

        String orElse2 = optionalNameNotFound.orElse("EMPTY");
        System.out.println(orElse2);

        optionalNameNotFound.ifPresent((n) -> System.out.println(n.toUpperCase()));
        optionalNameNotFound.ifPresentOrElse((n) -> System.out.println("ENCONTROU: " + n),
                () -> System.out.println("NOME NAO ENCONTRADO"));
    }

    public static Optional<String> findName(String name) {
        List<String> names = List.of("Joao", "Maria");
        int nameFound = names.indexOf(name);

        if (nameFound != -1) {
            return Optional.of(names.get(nameFound));
        }

        return Optional.empty();
    }

    public static String findName2(String name) {
        List<String> names = List.of("Joao", "Maria");
        int nameFound = names.indexOf(name);

        if (nameFound != -1) {
            return names.get(nameFound);
        }

        return null;
    }

}
