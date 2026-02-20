package org.EstudoJava.JavaCore.Enum.test;

import org.EstudoJava.JavaCore.Enum.domain.Cliente;
import org.EstudoJava.JavaCore.Enum.domain.TipoCliente;
import org.EstudoJava.JavaCore.Enum.domain.Cliente.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Katakuri", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.Debito);
        Cliente cliente2 = new Cliente("Kata", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.Credito);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
