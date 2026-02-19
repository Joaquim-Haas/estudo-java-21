package org.EstudoJava.JavaCore.Heranca.domain;

public class Funcionario extends Pessoa{ //classe que extende de pessoa
//    private String nome;
//    private String cpf;
//    private Endereco endereco;
// não é necessario setters e getters de Pessoa novamente, pois está "extendendo"
// Funcionario e subclasse de Pessoa
// ou usar @Override

    private double salario;

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
