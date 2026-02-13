package org.EstudoJava.ModificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    public static double velocidadeLimite = 250;

    public Carro(String Nome, double VelocidadeMax) {
        this.nome = Nome;
        this.velocidadeMax = VelocidadeMax;
    }

    public void imprime(){
        System.out.println("-=-=-=-=-=-=-");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade max.: " +  this.velocidadeMax);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
