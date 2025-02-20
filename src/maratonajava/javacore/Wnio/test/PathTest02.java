package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) {
        // home/work -> caminho relativo
        // /home/work -> caminho absoluto
        Path dir = Paths.get("home/work");
        Path arquivo = Paths.get("dev/arquivo.txt");

        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/work");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("Absoluto + relativo: " + absoluto.resolve(relativo));
        System.out.println("Absoluto + file: " + absoluto.resolve(file));
        System.out.println("Relativo + Absoluto: " + relativo.resolve(absoluto));
        System.out.println("Relativo + file: " + relativo.resolve(file));
        System.out.println("file + Absoluto: " + file.resolve(absoluto));
        System.out.println("file + Relativo: " + file.resolve(relativo));

    }

}
