package maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX = 10;
    void load();
    default void checkPermission() {
        System.out.println("check permission");
    }

    static void getMAX() {
        System.out.println(MAX);
    }
}
