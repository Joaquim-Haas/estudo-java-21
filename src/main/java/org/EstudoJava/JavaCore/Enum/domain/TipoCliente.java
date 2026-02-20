package org.EstudoJava.JavaCore.Enum.domain;

public enum TipoCliente {
    PESSOA_FISICA( 1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;//ou public final int valor;
    private String nomeRelatorio;

    TipoCliente(int Valor, String nomeRelatorio) {
        this.valor = Valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    //pode-se criar getters para quando for private tipoVar nomeVar;

}
