package org.EstudoJava.JavaCore.OrientacaoAObjetosJava.test;

import org.EstudoJava.JavaCore.OrientacaoAObjetosJava.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corcel";
        carro1.ano = 1970;
        carro1.modelo = "GT";

        carro2.nome = "Corsa";
        carro2.ano = 2001;
        carro2.modelo = "Super";

        System.out.println("Carro 1 nome: " + carro1.nome);
        System.out.println("Carro 2 nome: " + carro2.nome);

        carro1 = carro2;

        System.out.println("Carro 1 nome: " + carro1.nome);
        System.out.println("Carro 2 nome: " + carro2.nome);

    }
}
