package org.EstudoJava.ModificadorEstatico.test;

import org.EstudoJava.ModificadorEstatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro01 = new Carro("Volkswagen", 280);
        Carro carro02 = new Carro("BMW", 280);
        Carro carro03 = new Carro("Mercedes", 275);

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite);

        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}