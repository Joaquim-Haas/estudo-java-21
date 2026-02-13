package org.EstudoJava.JavaCore.BlocosInicializacao.test;

import org.EstudoJava.JavaCore.BlocosInicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime01 = new Anime("One piece");

        for(int episodio : anime01.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
