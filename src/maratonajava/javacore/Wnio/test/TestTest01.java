package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestTest01 {
    public static void main(String[] args) {

        Path caminho = Paths.get("/home/projeto/exemplo.txt");
        System.out.println("Caminho: " + caminho);

        Path caminho2 = Path.of("exemplo.txt");
        System.out.println("Caminho2: " + caminho2);

        System.out.println("É absoluto? " + caminho.isAbsolute());
        System.out.println("É absoluto? " + caminho2.isAbsolute());
        System.out.println("Caminho Absoluto: " + caminho.toAbsolutePath());
        System.out.println("Caminho Absoluto: " + caminho2.toAbsolutePath());

        // Utilizando RESOLVE

        Path base = Path.of("/home/projeto");
        Path caminhoCompleto = base.resolve("exemplo.txt");

        System.out.println(caminhoCompleto.toAbsolutePath());

    }
}
