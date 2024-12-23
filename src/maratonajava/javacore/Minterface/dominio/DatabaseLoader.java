package maratonajava.javacore.Minterface.dominio;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading Database...");
    }
}
