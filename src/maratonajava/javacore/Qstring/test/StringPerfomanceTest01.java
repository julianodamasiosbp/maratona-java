package src.maratonajava.javacore.Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatString(200_000);
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo String: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        concatStringBuilder(200_000);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo StringBuilder: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        concatStringBuffer(200_000);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo StringBuffer: " + (endTime - startTime) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
