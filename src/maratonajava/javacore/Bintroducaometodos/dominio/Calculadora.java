package src.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int x, int y) {
        System.out.println("Somando dois números");
        System.out.println(x + y);
    }

    public void subtraiDoisNumeros(int x, int y) {
        System.out.println("Subtraindo dois números");
        System.out.println(x - y);
    }

    public void divideDoisNumeros(int x, int y) {
        System.out.println("Dividindo dois números");
        System.out.println(x / y);
    }

    public void multiplicaNumeros(int x, int y) {
        System.out.println("Multiplica dois números");
        System.out.println(x * y);
    }

    public double divideDoisNumeros(double x, double y) {
        if(y == 0) {
            return 0;
        }
        return x / y;
    }
}
