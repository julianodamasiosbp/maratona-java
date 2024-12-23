package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        calculadora.somaArray(arrayNumeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
