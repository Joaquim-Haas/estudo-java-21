package org.EstudoJava.JavaCore.Polimorfismo.service;

import org.EstudoJava.JavaCore.Polimorfismo.domain.Computador;
import org.EstudoJava.JavaCore.Polimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador: ");

        double impostoPc = computador.calcularImposto();

        System.out.println("Imposto do computador " + computador.getNome());
        System.out.println("Valor R$" + computador.getValor());
        System.out.printf("Imposto a ser pago R$%.2f", impostoPc);
        System.out.println("\n");
    }

    public void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do computador: ");

        double impostoTomate = tomate.calcularImposto();

        System.out.println("Imposto do computador " + tomate.getNome());
        System.out.println("Valor R$" + tomate.getValor());
        System.out.printf("Imposto a ser pago R$%.2f", impostoTomate);
        System.out.println("\n");
    }
}
