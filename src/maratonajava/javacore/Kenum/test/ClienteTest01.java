package src.maratonajava.javacore.Kenum.test;

import src.maratonajava.javacore.Kenum.dominio.Cliente;
import src.maratonajava.javacore.Kenum.dominio.TipoCliente;
import src.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("ACME", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(TipoPagamento.CREDITO.calcularDesconto(1900));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(1900));
        System.out.println(cliente);
        System.out.println(cliente2);
        TipoCliente pessoaFisica = TipoCliente.obterTipoClienteNomeRelatorio("Pessoa Física");
        System.out.println(pessoaFisica);
        TipoCliente pessoaFisica2 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(pessoaFisica2);;
    }

}
