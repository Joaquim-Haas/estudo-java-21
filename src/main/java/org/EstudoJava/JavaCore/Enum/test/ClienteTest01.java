package org.EstudoJava.JavaCore.Enum.test;

import org.EstudoJava.JavaCore.Enum.domain.Cliente;
import org.EstudoJava.JavaCore.Enum.domain.TipoCliente;
import org.EstudoJava.JavaCore.Enum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Katakuri", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Kata", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente1);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
        TipoCliente tipoCliente3 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisicaxxxx");
        System.out.println(tipoCliente3);
    }
}
