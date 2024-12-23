package maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void criarNovoArquivo() throws IOException {
        try {
            File file = new File("arquivo\\teste.txt");
           boolean isCreated = file.createNewFile();
            System.out.println("Arquivo foi criado: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}


