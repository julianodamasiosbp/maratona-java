package maratonajava;

public class Aula04Operadores {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		double resultado = n1 / n2;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / (double) n2);
		System.out.println(resultado);
		System.out.println("Valor: " + n1 + n2);
		System.out.println("Valor: " + (n1 + n2));

		// Resto da divisão %

		int resto = 21 % 7;
		int resto2 = 20 % 3;
		System.out.println("Resto da divisão: " + resto);
		System.out.println("Resto da divisão: " + resto2);

		// < (menor que) > (maior que)
		// <= (menor ou igual que) >= (maior ou igual que)
		// == (igual) != (diferente)

		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualVinte = 10 == 20;
		System.out.println(isDezMaiorQueVinte);
		System.out.println(isDezMenorQueVinte);
		System.out.println(isDezIgualVinte);

		// Operadores Lógicos
		// && AND
		// || OR

		int idade = 29;
		double salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade > 30
				&& salario >= 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade < 30
				&& salario >= 3381;

		System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
		System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

		double contaCorrente = 2000;
		double contaPoupanca = 7000;
		float playstation5 = 5500;
		boolean isPlaystation5Compravel = contaCorrente > playstation5 || contaPoupanca > playstation5;
		System.out.println(isPlaystation5Compravel);

		int contador = 0;
		System.out.println(++contador);
	}

}
