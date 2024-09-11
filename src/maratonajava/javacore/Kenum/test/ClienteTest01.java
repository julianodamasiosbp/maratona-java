package src.maratonajava.javacore.Kenum.test;

import src.maratonajava.javacore.Kenum.dominio.Cliente;
import src.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("ACME", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);
        System.out.println(cliente2);
    }

}
