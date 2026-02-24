package org.EstudoJava.JavaCore.Polimorfismo.test;

import org.EstudoJava.JavaCore.Polimorfismo.domain.Computador;
import org.EstudoJava.JavaCore.Polimorfismo.domain.Tomate;
import org.EstudoJava.JavaCore.Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Positivo", 1920);
        Tomate tomate = new Tomate("Tomate cereja", 1.20);

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        calculadoraImposto.calcularImpostoComputador(computador);
        calculadoraImposto.calcularImpostoTomate(tomate);
    }
}
