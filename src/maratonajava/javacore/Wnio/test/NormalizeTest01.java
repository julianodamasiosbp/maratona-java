package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/work/dev";
        String arquivo = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivo);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./work/./dev/");
        System.out.println(path2.normalize());

    }

}
