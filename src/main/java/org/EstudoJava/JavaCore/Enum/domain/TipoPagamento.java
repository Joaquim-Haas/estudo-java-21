package org.EstudoJava.JavaCore.Enum.domain;

public enum TipoPagamento{
    DEBITO {
        @Override
        public double calcularDesconto(double Valor) {
            return Valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double Valor) {
            return Valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double Valor); //abstract foi criado somente para ser sobrescrito

}