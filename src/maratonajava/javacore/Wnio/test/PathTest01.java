package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest01 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");

        if (Files.notExists(pastaPath)) {

            Files.createDirectories(pastaPath);

            Path subPasta = Paths.get("pasta/subpasta");

            Files.createDirectories(subPasta);

            Path filePath = Paths.get(subPasta.toString(), "arquivo.txt");

            Files.createFile(filePath);

            Path source = filePath;
            Path target = Paths.get(filePath.getParent().toString(), "arquivo-renomeado.txt");

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        }

    }

}
