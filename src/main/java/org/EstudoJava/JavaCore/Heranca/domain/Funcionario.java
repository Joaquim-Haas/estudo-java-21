package org.EstudoJava.JavaCore.Heranca.domain;

public class Funcionario extends Pessoa{ //classe que extende de pessoa

    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }

    {
        System.out.println("Dentro do bloco de incialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    public Funcionario(String Nome){
        super(Nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
