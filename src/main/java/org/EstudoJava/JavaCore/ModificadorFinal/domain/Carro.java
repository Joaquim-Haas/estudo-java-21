package org.EstudoJava.JavaCore.ModificadorFinal.domain;

public class Carro { //public class final Carro, nao podera ser extendida
    private String nome;

    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
    //exemplos abaixo
    public static final double VELOCIDADE_LIMITE_1;
    public final double VELOCIDADE_LIMITE_2;
    public final double VELOCIDADE_LIMITE_3;

    //snake-case para variaveis final
    //final = constante, resumidamente

    static{
        VELOCIDADE_LIMITE_1 = 250; //static
    }

    {
        VELOCIDADE_LIMITE_2 = 250;//public or non-static
    }

    public Carro(){
        VELOCIDADE_LIMITE_3 = 250; //construtor para não final
    }

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
