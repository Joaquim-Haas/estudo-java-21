package org.EstudoJava.JavaCore.Heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco; //protect vira publico para outras subclasses

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de incialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Pessoa(String Nome){
        super(); //pode-se remover
        System.out.println("Dentro do construtor pessoa");
        this.nome = Nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
        System.out.println("-=-=-=-=-=-=-");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
