package org.EstudoJava.JavaCore.Polimorfismo.domain;

public class Computador extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String Nome, double Valor){
        super(Nome, Valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador. . .");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
