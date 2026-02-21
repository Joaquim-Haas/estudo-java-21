package org.EstudoJava.JavaCore.ClassesAbstratas.domain;

public abstract class Funcionario { //classe template
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
