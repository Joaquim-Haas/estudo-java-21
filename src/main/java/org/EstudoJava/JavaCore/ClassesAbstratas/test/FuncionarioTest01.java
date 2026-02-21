package org.EstudoJava.JavaCore.ClassesAbstratas.test;

import org.EstudoJava.JavaCore.ClassesAbstratas.domain.Desenvolvedor;
import org.EstudoJava.JavaCore.ClassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5250);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Joaquim", 2500);
        System.out.println(desenvolvedor);


    }
}
