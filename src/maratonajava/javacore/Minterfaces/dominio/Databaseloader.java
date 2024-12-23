package maratonajava.javacore.Minterfaces.dominio;

public class Databaseloader implements DataLoader, DataRemover{

    private static final int MAX = 40;

    @Override
    public void load() {
        System.out.println("Carregando database...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checkando Permissão...");
    }

    public static void getMAX() {
        System.out.println(MAX);
    }
}
