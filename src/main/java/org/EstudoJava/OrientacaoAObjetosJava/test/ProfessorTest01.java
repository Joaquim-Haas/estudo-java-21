package org.EstudoJava.OrientacaoAObjetosJava.test;

import org.EstudoJava.OrientacaoAObjetosJava.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args){
        Professor professor01 = new Professor();

        professor01.nome = "Giraffales";
        professor01.idade = 50;
        professor01.sexo = 'H';

        System.out.println(professor01.nome + " " + professor01.idade + " " + professor01.sexo);
    }
}
