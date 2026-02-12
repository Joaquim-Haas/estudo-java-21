package org.EstudoJava.Metodos.domain;

public class ImpressoraEstudante {
    public void imprimeEstudante(Estudante estudante){

        System.out.println("\nABAIXO É println por referência\n");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
