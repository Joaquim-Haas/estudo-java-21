package org.EstudoJava.OrientacaoAObjetosJava.test;

import org.EstudoJava.OrientacaoAObjetosJava.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args){
        Estudante Estudante02 = new Estudante();

        Estudante02.nome = "Luffy";
        Estudante02.idade = 21;
        Estudante02.sexo = 'H';

        System.out.println(Estudante02.nome);
        System.out.println(Estudante02.idade);
        System.out.println(Estudante02.sexo);
    }
}
