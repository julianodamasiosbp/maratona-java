package maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02 {

	public static void main(String[] args) {
		// Imprima os 25 numeros de uma quantidade de 50
		int qtdMaxima = 50;
		for(int i = 0; i <= 50; i++) {
			if(i > 26) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Finalizou");
	}

}
