package org.EstudoJava.JavaCore.Associacao.domain;

public class Jogador {
    private String nome;

    public void imprime(){
        System.out.println(this.nome);
    }

    public Jogador(String Nome){
        this.nome = Nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
