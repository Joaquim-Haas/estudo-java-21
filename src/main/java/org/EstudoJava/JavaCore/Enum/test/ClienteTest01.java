package org.EstudoJava.JavaCore.Enum.test;

import org.EstudoJava.JavaCore.Enum.domain.Cliente;
import org.EstudoJava.JavaCore.Enum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Katakuri", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Kata", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Toguro", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Tamandua", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
