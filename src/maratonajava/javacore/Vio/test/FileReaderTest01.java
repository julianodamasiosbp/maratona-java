package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File arquivo = new File("arquivo.txt");
        try (FileWriter fw = new FileWriter(arquivo)) {
            fw.write("Olá, mundo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(arquivo)) {
            // Retorna a quantidade de character do arquivo

            // char[] in = new char[1000];
            // int size = fr.read(in);
            // System.out.println(size);

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
