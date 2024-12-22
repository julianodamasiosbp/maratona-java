package maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle rb = ResourceBundle.
                getBundle("messages",
                        new Locale("pt", "BR"));

        boolean hasKeyChuchu = rb.containsKey("Chuchu");
        System.out.println(hasKeyChuchu);

        boolean hasKeyHello = rb.containsKey("Hello");
        System.out.println(hasKeyHello);

        System.out.println(rb.getString("Hello"));
    }
}
