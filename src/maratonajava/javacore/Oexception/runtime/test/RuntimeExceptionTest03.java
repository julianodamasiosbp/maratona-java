package src.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        System.out.println("Finalizando o programa");
    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso lbierado pelo Sistema Operacional");
        }
    }
}
