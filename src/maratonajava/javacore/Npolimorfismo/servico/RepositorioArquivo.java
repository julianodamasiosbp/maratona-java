package src.maratonajava.javacore.Npolimorfismo.servico;

import src.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando arquivo...");
    }
}
