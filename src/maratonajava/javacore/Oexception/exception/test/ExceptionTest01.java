package src.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        try {
            File file = new File("arquivo\\teste.txt");
           boolean isCreated = file.createNewFile();
            System.out.println("Arquivo foi criado: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


