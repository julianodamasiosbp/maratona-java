package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doacao se salário maior que 5000
        double salario = 3000;
        String mensagemDoacao = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condicoes, mas vou ter";
        // (condicao) ? true : false
        String resultado = salario > 5000 ? mensagemDoacao : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
