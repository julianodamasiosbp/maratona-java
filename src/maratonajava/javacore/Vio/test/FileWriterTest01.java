package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        String texto = "Testando";
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(texto);
            for (int i = 1; i <= 3; i++) {
                fw.write("\n" + texto + " " + i);
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
