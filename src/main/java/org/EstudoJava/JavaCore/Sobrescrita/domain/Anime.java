package org.EstudoJava.JavaCore.Sobrescrita.domain;

public class Anime{
    private String nome;

    @Override //Override para mudar o retorno
    public String toString(){ //toString, uma função para ser visivel o que é/está acontecendo na classe
        return "Anime " + this.nome; //
    }

    public Anime(String Nome){
        this.nome = Nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
