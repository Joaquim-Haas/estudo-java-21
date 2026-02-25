package org.EstudoJava.JavaCore.Polimorfismo.service;

import org.EstudoJava.JavaCore.Polimorfismo.domain.Computador;
import org.EstudoJava.JavaCore.Polimorfismo.domain.Produto;
import org.EstudoJava.JavaCore.Polimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){ //metodo generico
        System.out.println("Relatorio de imposto: ");
        double imposto = produto.calcularImposto();

        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Valor: R$%.2f \n", produto.getValor());
        System.out.printf("Imposto a ser pago: R$%.2f \n", imposto);

        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto; //casting

            String dataValidadeTomate = ((Tomate) produto).getDataValidade();
            System.out.println("Validade do tomate: " + ((Tomate) produto).getDataValidade());

            System.out.println("Validade do tomate: " + tomate.getDataValidade());
        }

        System.out.println("\n");
    }
}
