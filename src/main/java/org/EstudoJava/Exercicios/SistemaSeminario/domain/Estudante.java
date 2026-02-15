package org.EstudoJava.Exercicios.SistemaSeminario.domain;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String Nome, int Idade, Seminario Seminario){
        this.nome = Nome;
        this.idade = Idade;
        this.seminario = Seminario;
    }
    public Estudante(String Nome, int Idade){
        this.nome = Nome;
        this.idade = Idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int Idade) {
        this.idade = Idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario Seminario) {
        this.seminario = Seminario;
    }
}
