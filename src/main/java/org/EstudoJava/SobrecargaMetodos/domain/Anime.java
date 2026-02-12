package org.EstudoJava.SobrecargaMetodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String Nome, String Tipo, int Episodios){
        this.nome = Nome;
        this.tipo = Tipo;
        this.episodios = Episodios;
    }

    public void init(String Nome, String Tipo, int Episodios, String Genero){ //sobrecarga de metodos
        this.init(Nome, Tipo, Episodios);
        this.genero = Genero;
    }

    public void imprimirAnimeInfo() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setGenero(String Genero){
        this.genero = Genero;
    }

    public void setNome(String Nome){
        this.nome = Nome;
    }

    public void setTipo(String Tipo){
        this.tipo = Tipo;
    }

    public void setEpisodios(int Episodios){
        this.episodios = Episodios;
    }

    public String getGenero(){
        return this.genero;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getEpisodios(){
        return this.episodios;
    }

}
