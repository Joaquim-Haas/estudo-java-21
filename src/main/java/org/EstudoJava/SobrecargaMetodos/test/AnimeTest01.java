package org.EstudoJava.SobrecargaMetodos.test;

import org.EstudoJava.SobrecargaMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime01 = new Anime();

        anime01.init("Kiznaiver", "TV,Anime", 12);
        anime01.init("Kiznaiver", "TV,Anime", 12, "Aventura, Psicologico");
        //anime01.setNome("Kiznaiver");
        //anime01.setTipo("TV, Anime");
        //anime01.setEpisodios(12);

        anime01.imprimirAnimeInfo();
    }
}
