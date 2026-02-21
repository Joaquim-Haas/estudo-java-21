package org.EstudoJava.JavaCore.ClassesAbstratas.domain;

public abstract class Funcionario { //classe template
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();
    //this.salario = this.salario + (this.salario * 0x) vira obrigação de quem extende;
    
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
