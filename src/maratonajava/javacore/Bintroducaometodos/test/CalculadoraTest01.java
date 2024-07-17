package src.maratonajava.javacore.Bintroducaometodos.test;

import src.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(10,20);
        calculadora.subtraiDoisNumeros(10, 20);
        calculadora.divideDoisNumeros(10, 20);
        calculadora.multiplicaNumeros(10, 20);

        double num = 40;
        double num2 = 0;

        var numCalculado = calculadora.divideDoisNumeros(num, num2);
        System.out.println("Numero Calculado: "+numCalculado);

        calculadora.imprimeDivisaoDeDoisNumeros(10, 30);
    }
}
