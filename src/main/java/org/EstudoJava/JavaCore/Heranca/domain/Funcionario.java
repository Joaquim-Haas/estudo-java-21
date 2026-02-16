package org.EstudoJava.JavaCore.Heranca.domain;

public class Funcionario extends Pessoa{
//    private String nome;
//    private String cpf;
//    private Endereco endereco;

    private double salario;

    //não é necessario setters e getters de Pessoa novamente, pois está "extendendo"
    //Funcionario e subclasse de Pessoa

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
