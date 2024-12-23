package maratonajava.javacore.Fmodificadorestatico.test;

import maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        System.out.println("A velocidade limite é: "+ Carro.getVelocidadeLimite() + "km/h");
        Carro carro = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 300);

        Carro.setVelocidadeLimite(900);
        System.out.println("A velocidade limite é: "+Carro.getVelocidadeLimite() + "km/h");

        System.out.println(carro);
        System.out.println(carro2);
        System.out.println(carro3);

        carro.imprime();
    }
}
