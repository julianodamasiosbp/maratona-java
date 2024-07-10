package src.maratonajava.introducao;

public class Aula06Exercicio02 {
	// Dado o valor de um carro, descubra em quantas parcelas é possivel obter
	// As parcelas tem que ser maior ou igual do que 1000 reais
	public static void main(String[] args) {
		double valorTotalDoCarro = 30000;

		
		for(int parcela = 1; parcela <= valorTotalDoCarro; parcela++) {
			double valorParcela = valorTotalDoCarro / parcela;
			
			if(valorParcela >= 1000) {
				System.out.printf("Parcela %d R$ %.2f \n", parcela, valorParcela);
			} else {
				break;
			}
		}
		
	}

}
