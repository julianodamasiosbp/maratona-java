package src.maratonajava.javacore.Jmodificadorfinal.test;

import src.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import src.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import src.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Carro.VELOCIDADE_MAXIMA = 300;
        carro.COMPRADOR.setNome("Joao");
        System.out.println(Carro.VELOCIDADE_MAXIMA);
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}