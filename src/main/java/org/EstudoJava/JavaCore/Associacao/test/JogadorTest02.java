package org.EstudoJava.JavaCore.Associacao.test;

import org.EstudoJava.JavaCore.Associacao.domain.Jogador;
import org.EstudoJava.JavaCore.Associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("Fallen");
        Time Time = new Time("Furia");

        jogador01.setTime(Time);
        jogador01.imprime();

    }
}
