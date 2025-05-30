package maratonajava.javacore.Xserializacao.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import maratonajava.javacore.Xserializacao.dominio.Aluno;
import maratonajava.javacore.Xserializacao.dominio.Turma;

public class SerializationTest01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1L, "Pedro", "123");
        aluno.setTurma(new Turma("Maratona Java"));
        // serializar(aluno);
        deserializar();

    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            try {
                Aluno aluno = (Aluno) ois.readObject();
                System.out.println(aluno);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
