package src.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String DESCRICAO;

    TipoCliente(int valor, String descricao) {
        VALOR = valor;
        DESCRICAO = descricao;
    }

    public static TipoCliente obterTipoClienteNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipo : TipoCliente.values()) {
            if (tipo.DESCRICAO.equals(nomeRelatorio)) {
                return tipo;
            }
        }
        return null;
    }
}
