package maratonajava;

public class Aula05Exercicio {
    public static void main(String[] args) {
        double salario = 154713;
        float taxa;
        if(salario >= 0 && salario <= 34712){
            taxa = 9.70F;
        } else if (salario > 34712 && salario <= 68507){
            taxa = 37.35F;
        } else {
           taxa = 49.50F;
        }

        System.out.printf("Seu salario é %.2f e a taxa que você vai pagar é %.2f", salario, taxa);
    }
}
