package org.EstudoJava.JavaCore.Enum.domain;

public enum TipoCliente {
    PESSOA_FISICA( 1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;//ou private int valor;
    public final String NOME;

    TipoCliente(int Valor, String nomeRelatorio) {
        this.VALOR = Valor;
        this.NOME = nomeRelatorio;
    }

    //pode-se criar getters para quando for private tipoVar nomeVar;

}
