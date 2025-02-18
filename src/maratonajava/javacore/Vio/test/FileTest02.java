package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File arquivoDiretorio = new File(fileDiretorio, "Arquivo.txt");
        boolean isArquivoCriado = arquivoDiretorio.createNewFile();
        System.out.println(isArquivoCriado);

        File arquivoRenomeado = new File(fileDiretorio, "Arquivo-renomeado.txt");
        arquivoDiretorio.renameTo(arquivoRenomeado);

        File fileDiretorioRenomeado = new File("pasta-renomeada");
        fileDiretorio.renameTo(fileDiretorioRenomeado);
    }

}
