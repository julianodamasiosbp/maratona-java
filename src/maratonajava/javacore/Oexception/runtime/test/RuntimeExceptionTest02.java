package src.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Imprimiu");
    }
    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a/b;
    }
}
