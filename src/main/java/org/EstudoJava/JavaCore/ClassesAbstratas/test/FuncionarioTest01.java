package org.EstudoJava.JavaCore.ClassesAbstratas.test;

import org.EstudoJava.JavaCore.ClassesAbstratas.domain.Desenvolvedor;
import org.EstudoJava.JavaCore.ClassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Joaquim", 3000);
        System.out.println(desenvolvedor);

        gerente.imprime(); //herança de funcionario, e funcionario herda de pessoa abstract
        desenvolvedor.imprime(); //herança de funcionario, e funcionario herda de pessoa abstract
    }
}
