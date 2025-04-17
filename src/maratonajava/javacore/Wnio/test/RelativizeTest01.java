package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path absoluto = Paths.get("/home/work/dev");
        Path absoluto2 = Paths.get("/home/");

        Path relativo = Paths.get("home/work/dev");
        Path relativo2 = Paths.get("home/");

        System.out.println("1: " + absoluto.relativize(absoluto2));
        System.out.println("2: " + relativo.relativize(relativo2));
        // System.out.println("3: " + absoluto.relativize(relativo2)); LANÇA UMA EXCEÇÃO
        // DO CAMINHO ABSOLUTO PARA RELATIVO
    }

}
