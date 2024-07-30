package src.maratonajava.javacore.Fmodificadorestatico.test;

import src.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 300);

        carro3.setVelocidadeLimite(500);

        System.out.println(carro);
        System.out.println(carro2);
        System.out.println(carro3);
    }
}
