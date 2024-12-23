package maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
	public static void main(String[] args) {
		
		String nome = "João Valentão";
		double salario = 1420;
		String endereco = "Rua das laranjeiras, 402";
		String dataRecebimentoSalario = "10/10/2025";
		
		System.out.printf("Eu %s , morando no endereço %s, "
				+ "confirmo que recebi o salário de %.2f na data %s", nome, endereco, salario, dataRecebimentoSalario);
	}

}
