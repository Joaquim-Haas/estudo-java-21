package org.EstudoJava.JavaCore.ModificadorEstatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - BLoco de inicialização é executado quando a JVM carregar a classe.
    //1 - Alocado espaco em memoria pro objeto
    //2 - cada artributo de classe e criado e inicializado com valores default ou o que for passado
    //3 - Bloco de inicializacao e executado
    //4 - Construtor e executado
    static {
        System.out.println("Dentro do bloco inicializacao 1 estatico");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco inicializacao 2 estatico");

    }

    static {
        System.out.println("Dentro do bloco inicializacao 3 estatico");

    }

    {
        System.out.println("Bloco de inicialização 4 não estatico");
    }

    public Anime(String Nome){
        this.nome = Nome;
    }

    public Anime(){
        //System.out.println(episodios);

        for(int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }


}

