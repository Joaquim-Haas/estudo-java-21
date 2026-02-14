package org.EstudoJava.JavaCore.Associacao.test;

import org.EstudoJava.JavaCore.Associacao.domain.Escola;
import org.EstudoJava.JavaCore.Associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Jiraiya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] Professores = {professor1, professor2};
        Escola escola = new Escola("Konoha Class", Professores);

        escola.imprime();
    }
}
