package src.maratonajava.javacore.Lclassesabstratas.test;

import src.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import src.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", 5000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
