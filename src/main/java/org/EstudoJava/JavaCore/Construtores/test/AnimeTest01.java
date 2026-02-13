package org.EstudoJava.JavaCore.Construtores.test;

import org.EstudoJava.JavaCore.Construtores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime01 = new Anime("One Piece", "TV, Anime Series", 1160, "Aventura, Acao, Drama, Shounen", "Toei Animation");
        anime01.imprimirAnimeInfo();

        System.out.println("\n");

        Anime anime02 = new Anime();
        anime02.imprimirAnimeInfo();


    }
}
