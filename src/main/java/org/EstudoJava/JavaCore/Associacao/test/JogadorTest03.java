package org.EstudoJava.JavaCore.Associacao.test;

import org.EstudoJava.JavaCore.Associacao.domain.Jogador;
import org.EstudoJava.JavaCore.Associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Gabigol");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador 1 ---");
        jogador1.imprime();
        System.out.println("--- Jogador 2 ---");
        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();

    }
}
