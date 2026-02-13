package org.EstudoJava.JavaCore.Metodos.test;

import org.EstudoJava.JavaCore.Metodos.domain.Estudante;
import org.EstudoJava.JavaCore.Metodos.domain.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Saitama";
        estudante01.idade = 25;
        estudante01.sexo = 'H';

        estudante02.nome = "Genos";
        estudante02.idade = 21;
        estudante02.sexo = 'H';

        impressora.imprimeEstudante(estudante01);
        impressora.imprimeEstudante(estudante02);

        System.out.println("\nABAIXO É println DIRETO\n");

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("\nABAIXO É println DIRETO\n");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        System.out.println("\nABAIXO é usando dentro do Objeto com uma função:\n");

        estudante01.imprimeEstudante();
        estudante02.imprimeEstudante();
    }
}
