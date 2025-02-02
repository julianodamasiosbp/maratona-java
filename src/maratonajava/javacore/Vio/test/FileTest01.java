package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/juliano/projetos/back/devdojo/maratona-java/arquivo/file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path Absolute: " + file.getAbsolutePath());
            System.out.println("Path Canonical: " + file.getCanonicalPath());
            System.out.println("Is directory? " + file.isDirectory());
            System.out.println("Is file? " + file.isFile());
            System.out.println("Last modified: " + new Date(file.lastModified()));
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
