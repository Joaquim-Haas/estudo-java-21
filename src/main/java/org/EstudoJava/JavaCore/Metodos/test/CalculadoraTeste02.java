package org.EstudoJava.JavaCore.Metodos.test;

import org.EstudoJava.JavaCore.Metodos.domain.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(new int[]{1,2,3,4,5});
        calculadora.somaVarArgs(1,2,3,4,5);

    }
}
