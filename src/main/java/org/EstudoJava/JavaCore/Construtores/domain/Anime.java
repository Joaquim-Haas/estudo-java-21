package org.EstudoJava.JavaCore.Construtores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String Nome, String Tipo, int Episodios, String Genero){
        this();
        System.out.println("Dentro do construtor principal");
        this.nome = Nome;
        this.tipo = Tipo;
        this.episodios = Episodios;
        this.genero = Genero;
    }

    public Anime(String Nome, String Tipo, int Episodios, String Genero, String Estudio){
        this(Nome, Tipo, Episodios, Genero);
        System.out.println("Dentro do construtor com estudio");
        this.estudio = Estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprimirAnimeInfo() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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
