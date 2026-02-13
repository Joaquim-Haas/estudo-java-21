package org.EstudoJava.JavaCore.OrientacaoAObjetosJava.test;

import org.EstudoJava.JavaCore.OrientacaoAObjetosJava.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante Estudante01 = new Estudante();

        Estudante01.nome = "Cleitu";
        Estudante01.idade = 21;
        Estudante01.sexo = 'H';

        System.out.println(Estudante01.nome);
        System.out.println(Estudante01.idade);
        System.out.println(Estudante01.sexo);
    }
}
