package src.maratonajava.javacore.Npolimorfismo.servico;

import src.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria...");
    }
}
