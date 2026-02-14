package org.EstudoJava.JavaCore.Associacao.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String Nome){
        this.nome = Nome;
    }

    public Time(String Nome, Jogador[] Jogadores){
        this.nome = Nome;
        this.jogadores = Jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);

        if(jogadores == null){
            return;
        }

        for (Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setNome(String Nome){
        this.nome = Nome;
    }

    public String getNome(){
        return nome;
    }
}
