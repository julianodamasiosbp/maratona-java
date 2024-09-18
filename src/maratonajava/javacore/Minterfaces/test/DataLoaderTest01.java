package src.maratonajava.javacore.Minterfaces.test;

import src.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import src.maratonajava.javacore.Minterfaces.dominio.Databaseloader;
import src.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        Databaseloader db = new Databaseloader();
        db.load();
        db.remove();
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.remove();
        db.checkPermission();


        DataLoader.getMAX();
        Databaseloader.getMAX();
    }
}
