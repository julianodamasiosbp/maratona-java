package maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {

    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        if (objetosDisponiveis.isEmpty()) {
            System.out.println("Não há carros disponíveis");
            return null;
        }
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto " + t);
        System.out.println("Objetos disponíveis para alugar " + objetosDisponiveis);
        return t;
    }

    public void retornarObjeto(T t) {
        System.out.println("Retornando objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar " + objetosDisponiveis);
    }

}
