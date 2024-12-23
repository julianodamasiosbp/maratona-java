package maratonajava.javacore.Minterface.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading file");
    }
}
