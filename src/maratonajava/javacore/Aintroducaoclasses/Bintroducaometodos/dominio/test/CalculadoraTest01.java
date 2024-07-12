package src.maratonajava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.test;

import src.maratonajava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(10,20);
        calculadora.subtraiDoisNumeros(10, 20);
        calculadora.divideDoisNumeros(10, 20);
        calculadora.multiplicaNumeros(10, 20);
    }
}
