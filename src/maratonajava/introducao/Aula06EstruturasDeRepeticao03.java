package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {

	public static void main(String[] args) {
		double valorTotalDoCarro = 30000;
		
		for(int parcela = (int) valorTotalDoCarro; parcela >= 1; parcela--) {
			double valorParcela = valorTotalDoCarro / parcela;
			if(valorParcela < 1000) {
				continue;
			}
			System.out.printf("Parcela %d R$ %.2f \n", parcela, valorParcela);
		}

	}

}
