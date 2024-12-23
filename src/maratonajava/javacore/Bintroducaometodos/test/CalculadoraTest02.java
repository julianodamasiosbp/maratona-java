package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculadora calculadora = new Calculadora();

        calculadora.alteraDoisNumeros(num1, num2);

        Double numDouble1 = 5d;
        Double numDouble2 = 15d;

        calculadora.alteraDoisNumeros02(numDouble1, numDouble2);
        System.out.println("Dentro do CalculadoraTest02");
        System.out.println("numDouble1: "+numDouble2+" y: "+numDouble1);
    }
}
