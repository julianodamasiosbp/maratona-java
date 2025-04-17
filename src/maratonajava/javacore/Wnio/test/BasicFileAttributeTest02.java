package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributeTest02 {
    public static void main(String[] args) throws IOException {
        // BasicFileAttributes, DosFileAttributes, PosixFileAttributes

        Path path = Paths.get("pasta/novo.txt");
        Files.createFile(path);
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime(); // Sempre retorna ZULU time
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, lastModifiedTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);

    }

}
