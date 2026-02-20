package org.EstudoJava.JavaCore.ModificadorFinal.test;

import org.EstudoJava.JavaCore.ModificadorFinal.domain.Carro;
import org.EstudoJava.JavaCore.ModificadorFinal.domain.Comprador;
import org.EstudoJava.JavaCore.ModificadorFinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F430");
        ferrari.imprime();
    }
}
