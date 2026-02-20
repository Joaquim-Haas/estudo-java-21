package org.EstudoJava.JavaCore.Enum.domain;

public class Cliente {
    public enum TipoPagamento{
        Debito, Credito;
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.NOME +
                ", tipoClienteInt=" + tipoCliente.VALOR+
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
