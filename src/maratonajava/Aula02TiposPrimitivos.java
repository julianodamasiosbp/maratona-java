package maratonajava;

public class Aula02TiposPrimitivos {

	public static void main(String[] args) {
		int idade = 10;
		long numeroGrande = 4_000_000L;
		double salarioDouble = 2000.0D;
		float salarioFloat = 2500.0F;
		byte idadeByte = 127;
		// byte idadeByte = 128; apresenta erro, já que o tipo Byte vai até 127
		byte valorByteNegativo = -128;
		short idadeShort = 10;
		boolean verdadeiro = true;
		boolean falso = false;
		char genero = 'M';
		char asciitable = 60;
		int idadeCasting = (int) 100000000000L;
		
		System.out.println("A sua idade é: " + idade + "anos");
		System.out.println("Valor ASCII: " + asciitable);
		System.out.println(idadeCasting);

	}

}
