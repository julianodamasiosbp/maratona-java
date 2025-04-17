package maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        // BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        LocalDateTime dateTime = LocalDateTime.now().minusDays(10);
        File file = new File("pasta/novo.txt");
        boolean isCreated = file.createNewFile();

        file.setLastModified(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta/novo2.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(dateTime.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));

    }

}
