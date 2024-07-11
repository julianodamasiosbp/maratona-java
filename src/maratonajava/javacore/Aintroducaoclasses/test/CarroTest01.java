package src.maratonajava.javacore.Aintroducaoclasses.test;

import src.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Renault";
        carro01.modelo = "Logan";
        carro01.ano = "1999";

        Carro carro02 = new Carro();
        carro02.nome = "Fiat";
        carro02.modelo = "Argo";
        carro02.ano = "2024";

        System.out.println(carro01.toString());
        System.out.println(carro02.toString());
    }
}
