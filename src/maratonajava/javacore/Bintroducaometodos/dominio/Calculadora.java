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

    public double divideDoisNumeros02(double x, double y) {
        if(y == 0) {
            return 0;
        }
        return x / y;
    }

    public void imprimeDivisaoDeDoisNumeros(double x, double y) {
        if(y == 0) {
            System.out.println("Não existe divisão por zero.");
            return;
        }
            System.out.println("A divisão de "+x+" por "+y+" é: "+ x / y);
    }

    public void alteraDoisNumeros(int x, int y) {
        x = 99;
        y = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("x: "+x+" y: "+y);

    }

    public void alteraDoisNumeros02(Double x, Double y) {
        x = 99d;
        y = 33d;
        System.out.println("Dentro do alteraDoisNumeros02");
        System.out.println("x: "+x+" y: "+y);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma+=numeros[i];
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int ...numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
