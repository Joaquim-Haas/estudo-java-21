package org.EstudoJava.JavaCore.BlocosInicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    //1 - Alocado espaco em memoria pro objeto
    //2 - cada artributo de classe e criado e inicializado com valores default ou o que for passado
    //3 - Bloco de inicializacao e executado
    //4 - Construtor e executado
    {
        System.out.println("Dentro do bloco inicializacao");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String Nome){
        this.nome = Nome;
    }

    public Anime(){
        //System.out.println(episodios);

        for(int episodio : this.episodios){
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

