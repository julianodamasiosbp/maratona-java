package maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {

    public static void main(String[] args) {
        String texto = "Testando";
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(texto);
            bw.newLine();
            for (int i = 1; i <= 3; i++) {
                bw.write(texto + " " + i);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
