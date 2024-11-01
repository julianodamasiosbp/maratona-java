package src.maratonajava.javacore.Oexception.exception.test;

import src.maratonajava.javacore.Oexception.exception.dominio.Leitor01;
import src.maratonajava.javacore.Oexception.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResoucesTest01 {

    public static void main(String[] args) {
        lerArquivo();
    }

    private static void lerArquivo() {
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerArquivo3() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


