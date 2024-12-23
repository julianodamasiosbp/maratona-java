package maratonajava.javacore.Minterface.test;

import maratonajava.javacore.Minterface.dominio.DatabaseLoader;
import maratonajava.javacore.Minterface.dominio.FileLoader;

public class DatabaseLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader db = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        db.load();
        fileLoader.load();
    }
}
