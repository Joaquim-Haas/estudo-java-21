package org.EstudoJava.JavaCore.Polimorfismo.test;

import org.EstudoJava.JavaCore.Polimorfismo.domain.Computador;
import org.EstudoJava.JavaCore.Polimorfismo.domain.Produto;
import org.EstudoJava.JavaCore.Polimorfismo.domain.Tomate;
import org.EstudoJava.JavaCore.Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Positivo R15", 2800);

        Tomate tomate = new Tomate("Tomate Caqui", 2);
        tomate.setDataValidade("17/04/2026");

        CalculadoraImposto.calcularImposto(tomate); //instanceof tomate
        CalculadoraImposto.calcularImposto(produto); // computador = computador
    }
}
